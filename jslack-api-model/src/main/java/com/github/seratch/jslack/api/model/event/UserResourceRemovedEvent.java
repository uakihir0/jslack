package com.github.seratch.jslack.api.model.event;

/**
 * We send this event when a user removes an existing grant for your workspace app.
 * <p>
 * https://api.slack.com/events/user_resource_removed
 */
public class UserResourceRemovedEvent implements Event {

    public static final String TYPE_NAME = "user_resource_removed";

    private final String type = TYPE_NAME;
    private String user;
    private String triggerId;

    public UserResourceRemovedEvent() {
    }

    public String getType() {
        return this.type;
    }

    public String getUser() {
        return this.user;
    }

    public String getTriggerId() {
        return this.triggerId;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setTriggerId(String triggerId) {
        this.triggerId = triggerId;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof UserResourceRemovedEvent)) return false;
        final UserResourceRemovedEvent other = (UserResourceRemovedEvent) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$type = this.getType();
        final Object other$type = other.getType();
        if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
        final Object this$user = this.getUser();
        final Object other$user = other.getUser();
        if (this$user == null ? other$user != null : !this$user.equals(other$user)) return false;
        final Object this$triggerId = this.getTriggerId();
        final Object other$triggerId = other.getTriggerId();
        if (this$triggerId == null ? other$triggerId != null : !this$triggerId.equals(other$triggerId)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof UserResourceRemovedEvent;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $type = this.getType();
        result = result * PRIME + ($type == null ? 43 : $type.hashCode());
        final Object $user = this.getUser();
        result = result * PRIME + ($user == null ? 43 : $user.hashCode());
        final Object $triggerId = this.getTriggerId();
        result = result * PRIME + ($triggerId == null ? 43 : $triggerId.hashCode());
        return result;
    }

    public String toString() {
        return "UserResourceRemovedEvent(type=" + this.getType() + ", user=" + this.getUser() + ", triggerId=" + this.getTriggerId() + ")";
    }
}