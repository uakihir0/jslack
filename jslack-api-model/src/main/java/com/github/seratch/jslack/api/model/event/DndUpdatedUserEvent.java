package com.github.seratch.jslack.api.model.event;

/**
 * The dnd_updated_user event is sent to all connections for a workspace when a user's Do Not Disturb settings have changed.
 * <p>
 * https://api.slack.com/events/dnd_updated_user
 */
public class DndUpdatedUserEvent implements Event {

    public static final String TYPE_NAME = "dnd_updated_user";

    private final String type = TYPE_NAME;
    private String user;
    private DndStatus dndStatus;

    public String getType() {
        return this.type;
    }

    public String getUser() {
        return this.user;
    }

    public DndStatus getDndStatus() {
        return this.dndStatus;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setDndStatus(DndStatus dndStatus) {
        this.dndStatus = dndStatus;
    }

    public static class DndStatus {
        private boolean dndEnabled;
        private Integer nextDndStartTs;
        private Integer nextDndEndTs;

        public boolean isDndEnabled() {
            return this.dndEnabled;
        }

        public Integer getNextDndStartTs() {
            return this.nextDndStartTs;
        }

        public Integer getNextDndEndTs() {
            return this.nextDndEndTs;
        }

        public void setDndEnabled(boolean dndEnabled) {
            this.dndEnabled = dndEnabled;
        }

        public void setNextDndStartTs(Integer nextDndStartTs) {
            this.nextDndStartTs = nextDndStartTs;
        }

        public void setNextDndEndTs(Integer nextDndEndTs) {
            this.nextDndEndTs = nextDndEndTs;
        }
    }
}