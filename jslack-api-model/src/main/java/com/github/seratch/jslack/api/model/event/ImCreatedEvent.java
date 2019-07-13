package com.github.seratch.jslack.api.model.event;

/**
 * The im_created event is sent to all connections for a user when a new direct message channel is created that they are a member of.
 * <p>
 * This message lets the client know that a channel has been created,
 * but the client should show no changes based on this, just update its internal list of IM channels.
 * Usually this event is followed by an im_open event.
 * <p>
 * https://api.slack.com/events/im_created
 */
public class ImCreatedEvent implements Event {

    public static final String TYPE_NAME = "im_created";

    private final String type = TYPE_NAME;
    private String user;
    private Channel channel;

    public ImCreatedEvent() {
    }

    public String getType() {
        return this.type;
    }

    public String getUser() {
        return this.user;
    }

    public Channel getChannel() {
        return this.channel;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setChannel(Channel channel) {
        this.channel = channel;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ImCreatedEvent)) return false;
        final ImCreatedEvent other = (ImCreatedEvent) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$type = this.getType();
        final Object other$type = other.getType();
        if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
        final Object this$user = this.getUser();
        final Object other$user = other.getUser();
        if (this$user == null ? other$user != null : !this$user.equals(other$user)) return false;
        final Object this$channel = this.getChannel();
        final Object other$channel = other.getChannel();
        if (this$channel == null ? other$channel != null : !this$channel.equals(other$channel)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ImCreatedEvent;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $type = this.getType();
        result = result * PRIME + ($type == null ? 43 : $type.hashCode());
        final Object $user = this.getUser();
        result = result * PRIME + ($user == null ? 43 : $user.hashCode());
        final Object $channel = this.getChannel();
        result = result * PRIME + ($channel == null ? 43 : $channel.hashCode());
        return result;
    }

    public String toString() {
        return "ImCreatedEvent(type=" + this.getType() + ", user=" + this.getUser() + ", channel=" + this.getChannel() + ")";
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
            return "ImCreatedEvent.Channel()";
        }
        // TODO
    }

}