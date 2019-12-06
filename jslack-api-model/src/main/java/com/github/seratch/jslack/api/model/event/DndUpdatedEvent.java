package com.github.seratch.jslack.api.model.event;

/**
 * The dnd_updated event is sent to the current user when their Do Not Disturb settings have changed.
 * <p>
 * This event is not available to bot user subscriptions in the Events API.
 * <p>
 * https://api.slack.com/events/dnd_updated
 */
public class DndUpdatedEvent implements Event {

    public static final String TYPE_NAME = "dnd_updated";

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
        private boolean snoozeEnabled;
        private Integer snoozeEndtime;

        public boolean isDndEnabled() {
            return this.dndEnabled;
        }

        public Integer getNextDndStartTs() {
            return this.nextDndStartTs;
        }

        public Integer getNextDndEndTs() {
            return this.nextDndEndTs;
        }

        public boolean isSnoozeEnabled() {
            return this.snoozeEnabled;
        }

        public Integer getSnoozeEndtime() {
            return this.snoozeEndtime;
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

        public void setSnoozeEnabled(boolean snoozeEnabled) {
            this.snoozeEnabled = snoozeEnabled;
        }

        public void setSnoozeEndtime(Integer snoozeEndtime) {
            this.snoozeEndtime = snoozeEndtime;
        }
    }
}