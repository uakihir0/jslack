package com.github.seratch.jslack.api.model.event;

/**
 * The group_close event is sent to all connections for a user when a private channel is closed by that user.
 * <p>
 * This event is not available to bot user subscriptions in the Events API.
 * <p>
 * https://api.slack.com/events/group_close
 */
public class GroupCloseEvent implements Event {

    public static final String TYPE_NAME = "group_close";

    private final String type = TYPE_NAME;
    private String user;
    private String channel;

    public GroupCloseEvent() {
    }

    public String getType() {
        return this.type;
    }

    public String getUser() {
        return this.user;
    }

    public String getChannel() {
        return this.channel;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof GroupCloseEvent)) return false;
        final GroupCloseEvent other = (GroupCloseEvent) o;
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
        return other instanceof GroupCloseEvent;
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
        return "GroupCloseEvent(type=" + this.getType() + ", user=" + this.getUser() + ", channel=" + this.getChannel() + ")";
    }
}