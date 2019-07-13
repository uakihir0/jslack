package com.github.seratch.jslack.api.model.event;

import com.github.seratch.jslack.api.model.User;

/**
 * The user_change event is sent to all connections for a workspace when a member updates their profile or data.
 * Clients can use this to update their local cache of members.
 * <p>
 * Use the users.profile.set method to update user profile data.
 * <p>
 * https://api.slack.com/events/user_change
 */
public class UserChangeEvent implements Event {

    public static final String TYPE_NAME = "user_change";

    private final String type = TYPE_NAME;
    private User user; // TODO: make sure the available attributes

    public UserChangeEvent() {
    }

    public String getType() {
        return this.type;
    }

    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof UserChangeEvent)) return false;
        final UserChangeEvent other = (UserChangeEvent) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$type = this.getType();
        final Object other$type = other.getType();
        if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
        final Object this$user = this.getUser();
        final Object other$user = other.getUser();
        if (this$user == null ? other$user != null : !this$user.equals(other$user)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof UserChangeEvent;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $type = this.getType();
        result = result * PRIME + ($type == null ? 43 : $type.hashCode());
        final Object $user = this.getUser();
        result = result * PRIME + ($user == null ? 43 : $user.hashCode());
        return result;
    }

    public String toString() {
        return "UserChangeEvent(type=" + this.getType() + ", user=" + this.getUser() + ")";
    }
}