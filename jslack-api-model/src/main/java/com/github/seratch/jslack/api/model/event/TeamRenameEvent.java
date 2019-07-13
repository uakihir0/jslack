package com.github.seratch.jslack.api.model.event;

/**
 * The team_rename event is sent to all connections for a workspace when an admin changes the workspace name.
 * <p>
 * Clients can use this to update the display of the workspace name as soon as it changes.
 * If they don't the client will receive the new name the next time it calls rtm.start.
 * <p>
 * https://api.slack.com/events/team_rename
 */
public class TeamRenameEvent implements Event {

    public static final String TYPE_NAME = "team_rename";

    private final String type = TYPE_NAME;
    private String name;

    public TeamRenameEvent() {
    }

    public String getType() {
        return this.type;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof TeamRenameEvent)) return false;
        final TeamRenameEvent other = (TeamRenameEvent) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$type = this.getType();
        final Object other$type = other.getType();
        if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof TeamRenameEvent;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $type = this.getType();
        result = result * PRIME + ($type == null ? 43 : $type.hashCode());
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        return result;
    }

    public String toString() {
        return "TeamRenameEvent(type=" + this.getType() + ", name=" + this.getName() + ")";
    }
}