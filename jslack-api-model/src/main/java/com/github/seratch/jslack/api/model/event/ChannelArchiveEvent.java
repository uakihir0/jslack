package com.github.seratch.jslack.api.model.event;

/**
 * The channel_archive event is sent to all connections for a workspace when a channel is archived.
 * Clients can use this to update their local list of channels.
 * <p>
 * https://api.slack.com/events/channel_archive
 */
public class ChannelArchiveEvent implements Event {

    public static final String TYPE_NAME = "channel_archive";

    private final String type = TYPE_NAME;
    private String channel;
    private String user;

    public ChannelArchiveEvent() {
    }

    public String getType() {
        return this.type;
    }

    public String getChannel() {
        return this.channel;
    }

    public String getUser() {
        return this.user;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ChannelArchiveEvent)) return false;
        final ChannelArchiveEvent other = (ChannelArchiveEvent) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$type = this.getType();
        final Object other$type = other.getType();
        if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
        final Object this$channel = this.getChannel();
        final Object other$channel = other.getChannel();
        if (this$channel == null ? other$channel != null : !this$channel.equals(other$channel)) return false;
        final Object this$user = this.getUser();
        final Object other$user = other.getUser();
        if (this$user == null ? other$user != null : !this$user.equals(other$user)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ChannelArchiveEvent;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $type = this.getType();
        result = result * PRIME + ($type == null ? 43 : $type.hashCode());
        final Object $channel = this.getChannel();
        result = result * PRIME + ($channel == null ? 43 : $channel.hashCode());
        final Object $user = this.getUser();
        result = result * PRIME + ($user == null ? 43 : $user.hashCode());
        return result;
    }

    public String toString() {
        return "ChannelArchiveEvent(type=" + this.getType() + ", channel=" + this.getChannel() + ", user=" + this.getUser() + ")";
    }
}