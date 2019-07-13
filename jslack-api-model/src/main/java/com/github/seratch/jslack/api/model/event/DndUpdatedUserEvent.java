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

    public DndUpdatedUserEvent() {
    }

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

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof DndUpdatedUserEvent)) return false;
        final DndUpdatedUserEvent other = (DndUpdatedUserEvent) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$type = this.getType();
        final Object other$type = other.getType();
        if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
        final Object this$user = this.getUser();
        final Object other$user = other.getUser();
        if (this$user == null ? other$user != null : !this$user.equals(other$user)) return false;
        final Object this$dndStatus = this.getDndStatus();
        final Object other$dndStatus = other.getDndStatus();
        if (this$dndStatus == null ? other$dndStatus != null : !this$dndStatus.equals(other$dndStatus)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof DndUpdatedUserEvent;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $type = this.getType();
        result = result * PRIME + ($type == null ? 43 : $type.hashCode());
        final Object $user = this.getUser();
        result = result * PRIME + ($user == null ? 43 : $user.hashCode());
        final Object $dndStatus = this.getDndStatus();
        result = result * PRIME + ($dndStatus == null ? 43 : $dndStatus.hashCode());
        return result;
    }

    public String toString() {
        return "DndUpdatedUserEvent(type=" + this.getType() + ", user=" + this.getUser() + ", dndStatus=" + this.getDndStatus() + ")";
    }

    public static class DndStatus {
        private boolean dndEnabled;
        private Integer nextDndStartTs;
        private Integer nextDndEndTs;

        public DndStatus() {
        }

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

        public boolean equals(final Object o) {
            if (o == this) return true;
            if (!(o instanceof DndStatus)) return false;
            final DndStatus other = (DndStatus) o;
            if (!other.canEqual((Object) this)) return false;
            if (this.isDndEnabled() != other.isDndEnabled()) return false;
            final Object this$nextDndStartTs = this.getNextDndStartTs();
            final Object other$nextDndStartTs = other.getNextDndStartTs();
            if (this$nextDndStartTs == null ? other$nextDndStartTs != null : !this$nextDndStartTs.equals(other$nextDndStartTs))
                return false;
            final Object this$nextDndEndTs = this.getNextDndEndTs();
            final Object other$nextDndEndTs = other.getNextDndEndTs();
            if (this$nextDndEndTs == null ? other$nextDndEndTs != null : !this$nextDndEndTs.equals(other$nextDndEndTs))
                return false;
            return true;
        }

        protected boolean canEqual(final Object other) {
            return other instanceof DndStatus;
        }

        public int hashCode() {
            final int PRIME = 59;
            int result = 1;
            result = result * PRIME + (this.isDndEnabled() ? 79 : 97);
            final Object $nextDndStartTs = this.getNextDndStartTs();
            result = result * PRIME + ($nextDndStartTs == null ? 43 : $nextDndStartTs.hashCode());
            final Object $nextDndEndTs = this.getNextDndEndTs();
            result = result * PRIME + ($nextDndEndTs == null ? 43 : $nextDndEndTs.hashCode());
            return result;
        }

        public String toString() {
            return "DndUpdatedUserEvent.DndStatus(dndEnabled=" + this.isDndEnabled() + ", nextDndStartTs=" + this.getNextDndStartTs() + ", nextDndEndTs=" + this.getNextDndEndTs() + ")";
        }
    }
}