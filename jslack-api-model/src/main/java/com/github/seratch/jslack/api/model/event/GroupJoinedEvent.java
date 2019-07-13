package com.github.seratch.jslack.api.model.event;

/**
 * The group_joined event is sent to all connections for a user when that user joins a private channel.
 * <p>
 * The channel value is the string identifier for the private channel.
 * <p>
 * https://api.slack.com/events/group_joined
 */
public class GroupJoinedEvent implements Event {

    public static final String TYPE_NAME = "group_joined";

    private final String type = TYPE_NAME;
    private Channel channel;

    public GroupJoinedEvent() {
    }

    public String getType() {
        return this.type;
    }

    public Channel getChannel() {
        return this.channel;
    }

    public void setChannel(Channel channel) {
        this.channel = channel;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof GroupJoinedEvent)) return false;
        final GroupJoinedEvent other = (GroupJoinedEvent) o;
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
        return other instanceof GroupJoinedEvent;
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
        return "GroupJoinedEvent(type=" + this.getType() + ", channel=" + this.getChannel() + ")";
    }

    public static class Channel {
        public Channel() {
        }

        public boolean equals(final Object o) {
            if (o == this) return true;
            if (!(o instanceof Channel)) return false;
            final Channel other = (Channel) o;
            if (!other.canEqual((Object) this)) return false;
            return true;
        }

        protected boolean canEqual(final Object other) {
            return other instanceof Channel;
        }

        public int hashCode() {
            int result = 1;
            return result;
        }

        public String toString() {
            return "GroupJoinedEvent.Channel()";
        }
        // TODO
    }

}