package com.github.seratch.jslack.api.model.event;

/**
 * This app event allows your app to subscribe to message events that directly mention your bot user.
 * <p>
 * Your Slack app must have a bot user configured and installed to utilize this event.
 * <p>
 * Instead of receiving all messages in a channel and having to filter through them for those mentioning your app,
 * as you would when subscribing to message.channels,
 * you'll receive only the messages pertinent to your app.
 * <p>
 * Messages sent via this subscription arrive as an app_mention event, not as a message as with other message.* event types.
 * However, your app can treat its contents similarly.
 * <p>
 * Messages sent to your app in direct message conversations are not dispatched via app_mention,
 * whether the app is explicitly mentioned or otherwise.
 * Subscribe to message.im events to receive messages directed to your bot user in direct message conversations.
 * <p>
 * https://api.slack.com/events/app_mention
 */
public class AppMentionEvent implements Event {

    public static final String TYPE_NAME = "app_mention";

    private final String type = TYPE_NAME;
    private String user;
    private String subtype;
    private String text;
    private String ts;
    private String channel;
    private String eventTs;

    private String threadTs;

    public String getType() {
        return this.type;
    }

    public String getUser() {
        return this.user;
    }

    public String getSubtype() {
        return this.subtype;
    }

    public String getText() {
        return this.text;
    }

    public String getTs() {
        return this.ts;
    }

    public String getChannel() {
        return this.channel;
    }

    public String getEventTs() {
        return this.eventTs;
    }

    public String getThreadTs() {
        return this.threadTs;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setTs(String ts) {
        this.ts = ts;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public void setEventTs(String eventTs) {
        this.eventTs = eventTs;
    }

    public void setThreadTs(String threadTs) {
        this.threadTs = threadTs;
    }
}