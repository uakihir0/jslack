package com.github.seratch.jslack.api.rtm;

import com.github.seratch.jslack.api.model.event.Event;
import com.github.seratch.jslack.common.json.GsonFactory;
import org.slf4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class RTMEventsDispatcherImpl implements RTMEventsDispatcher {

    private static final Logger log = org.slf4j.LoggerFactory.getLogger(RTMEventsDispatcherImpl.class);
    private final ConcurrentMap<String, List<RTMEventHandler<?>>> eventTypeAndHandlers = new ConcurrentHashMap<>();

    @Override
    public void register(RTMEventHandler<? extends Event> handler) {
        String eventType = handler.getEventType();
        List<RTMEventHandler<?>> handlers = eventTypeAndHandlers.get(eventType);
        if (handlers == null) handlers = new ArrayList<>();
        handlers.add(handler);
        eventTypeAndHandlers.put(eventType, handlers);
    }

    @Override
    public void deregister(RTMEventHandler<? extends Event> handler) {
        String eventType = handler.getEventType();
        List<RTMEventHandler<?>> handlers = eventTypeAndHandlers.get(eventType);
        if (handlers == null) handlers = new ArrayList<>();
        List<RTMEventHandler<?>> newHandlers = new ArrayList<>();
        for (RTMEventHandler<?> h : handlers) {
            if (!h.equals(handler)) {
                newHandlers.add(h);
            }
        }
        eventTypeAndHandlers.put(eventType, newHandlers);
    }

    @Override
    public void dispatch(String json) {
        String eventType = detectEventType(json);
        if (eventType == null) {
            log.debug("Failed to detect event type from the given JSON data: {}", json);
            return;
        }

        List<RTMEventHandler<?>> RTMEventHandlers = eventTypeAndHandlers.get(eventType);
        if (RTMEventHandlers == null || RTMEventHandlers.size() == 0) {
            log.debug("No event handler registered for type: {}", eventType);
        } else {
            Class<?> clazz = RTMEventHandlers.get(0).getEventClass();
            Event event = (Event) GsonFactory.createSnakeCase().fromJson(json, clazz);
            for (RTMEventHandler<?> handler : RTMEventHandlers) {
                handler.acceptUntypedObject(event);
            }
        }
    }

    @Override
    public RTMMessageHandler toMessageHandler() {
        final RTMEventsDispatcherImpl self = this;
        RTMMessageHandler messageHandler = new RTMMessageHandler() {
            @Override
            public void handle(String message) {
                self.dispatch(message);
            }
        };
        return messageHandler;
    }

    public static String detectEventType(String json) {
        StringBuilder sb = new StringBuilder();
        char[] chars = json.toCharArray();
        for (int idx = 0; idx < (chars.length - 6); idx++) {
            if (chars[idx] == '"'
                    && chars[idx + 1] == 't'
                    && chars[idx + 2] == 'y'
                    && chars[idx + 3] == 'p'
                    && chars[idx + 4] == 'e'
                    && chars[idx + 5] == '"'
                    && chars[idx + 6] == ':') {
                idx = idx + 7;
                int doubleQuoteCount = 0;
                boolean isPreviousCharEscape = false;
                while (doubleQuoteCount < 2 && idx < chars.length) {
                    char c = chars[idx];
                    if (c == '"' && !isPreviousCharEscape) {
                        doubleQuoteCount++;
                    } else {
                        if (doubleQuoteCount == 1) {
                            sb.append(c);
                        }
                    }
                    isPreviousCharEscape = c == '\\';
                    idx++;
                }
                break;
            }
        }
        return sb.toString();
    }

}
