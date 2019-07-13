package com.github.seratch.jslack.api.model.event;

/**
 * The channel_left event is sometimes sent to all connections for a user when that user leaves a channel.
 * It is sometimes withheld.
 * <p>
 * Clients should respond to this message by closing the channel
 * — this means that when a channel is left from client A, it will automatically be closed in client B.
 * <p>
 * In addition to this message, all existing members of the channel will receive a channel_leave message event.
 * <p>
 * https://api.slack.com/events/channel_left
 */
public class ChannelLeftEvent implements Event {

    public static final String TYPE_NAME = "channel_left";

    private final String type = TYPE_NAME;
    private String channel;

    public ChannelLeftEvent() {
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
        if (!(o instanceof ChannelLeftEvent)) return false;
        final ChannelLeftEvent other = (ChannelLeftEvent) o;
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
        return other instanceof ChannelLeftEvent;
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
        return "ChannelLeftEvent(type=" + this.getType() + ", channel=" + this.getChannel() + ")";
    }
}