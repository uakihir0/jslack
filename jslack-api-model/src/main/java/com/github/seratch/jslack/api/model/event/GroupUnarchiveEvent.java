package com.github.seratch.jslack.api.model.event;

/**
 * The group_unarchive event is sent to all connections for members of a private channel when that private channel is unarchived.
 * Clients can use this to update their local list of private channels.
 * <p>
 * https://api.slack.com/events/group_unarchive
 */
public class GroupUnarchiveEvent implements Event {

    public static final String TYPE_NAME = "group_unarchive";

    private final String type = TYPE_NAME;
    private String channel;

    public GroupUnarchiveEvent() {
    }

    public String getType() {
        return this.type;
    }

    public String getChannel() {
        return this.channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof GroupUnarchiveEvent)) return false;
        final GroupUnarchiveEvent other = (GroupUnarchiveEvent) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$type = this.getType();
        final Object other$type = other.getType();
        if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
        final Object this$channel = this.getChannel();
        final Object other$channel = other.getChannel();
        if (this$channel == null ? other$channel != null : !this$channel.equals(other$channel)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof GroupUnarchiveEvent;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $type = this.getType();
        result = result * PRIME + ($type == null ? 43 : $type.hashCode());
        final Object $channel = this.getChannel();
        result = result * PRIME + ($channel == null ? 43 : $channel.hashCode());
        return result;
    }

    public String toString() {
        return "GroupUnarchiveEvent(type=" + this.getType() + ", channel=" + this.getChannel() + ")";
    }
}