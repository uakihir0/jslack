package com.github.seratch.jslack.api.model.event;

import lombok.Getter;
import lombok.Setter;

/**
 * The dnd_updated event is sent to the current user when their Do Not Disturb settings have changed.
 * <p>
 * This event is not available to bot user subscriptions in the Events API.
 * <p>
 * https://api.slack.com/events/dnd_updated
 */
@Getter
@Setter
public class DndUpdatedEvent implements Event {

    public static final String TYPE_NAME = "dnd_updated";

    private final String type = TYPE_NAME;
    private String user;
    private DndStatus dndStatus;

    @Getter
@Setter
    public static class DndStatus {
        private boolean dndEnabled;
        private Integer nextDndStartTs;
        private Integer nextDndEndTs;
        private boolean snoozeEnabled;
        private Integer snoozeEndtime;
    }
}