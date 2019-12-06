package com.github.seratch.jslack.api.model.event;

import lombok.Getter;
import lombok.Setter;

/**
 * The dnd_updated_user event is sent to all connections for a workspace when a user's Do Not Disturb settings have changed.
 * <p>
 * https://api.slack.com/events/dnd_updated_user
 */
@Getter
@Setter
public class DndUpdatedUserEvent implements Event {

    public static final String TYPE_NAME = "dnd_updated_user";

    private final String type = TYPE_NAME;
    private String user;
    private DndStatus dndStatus;

    @Getter
@Setter
    public static class DndStatus {
        private boolean dndEnabled;
        private Integer nextDndStartTs;
        private Integer nextDndEndTs;
    }
}