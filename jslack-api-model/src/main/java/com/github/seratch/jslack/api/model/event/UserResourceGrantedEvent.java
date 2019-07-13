package com.github.seratch.jslack.api.model.event;

import java.util.List;

/**
 * We send this event when a user grants your workspace app
 * the permissions you recently requested with apps.permissions.users.request.
 * Now you can work on their behalf!
 * <p>
 * https://api.slack.com/events/user_resource_granted
 */
public class UserResourceGrantedEvent implements Event {

    public static final String TYPE_NAME = "user_resource_granted";

    private final String type = TYPE_NAME;
    private String user;
    private List<String> scopes;
    private String triggerId;

    public UserResourceGrantedEvent() {
    }

    public String getType() {
        return this.type;
    }

    public String getUser() {
        return this.user;
    }

    public List<String> getScopes() {
        return this.scopes;
    }

    public String getTriggerId() {
        return this.triggerId;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setScopes(List<String> scopes) {
        this.scopes = scopes;
    }

    public void setTriggerId(String triggerId) {
        this.triggerId = triggerId;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof UserResourceGrantedEvent)) return false;
        final UserResourceGrantedEvent other = (UserResourceGrantedEvent) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$type = this.getType();
        final Object other$type = other.getType();
        if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
        final Object this$user = this.getUser();
        final Object other$user = other.getUser();
        if (this$user == null ? other$user != null : !this$user.equals(other$user)) return false;
        final Object this$scopes = this.getScopes();
        final Object other$scopes = other.getScopes();
        if (this$scopes == null ? other$scopes != null : !this$scopes.equals(other$scopes)) return false;
        final Object this$triggerId = this.getTriggerId();
        final Object other$triggerId = other.getTriggerId();
        if (this$triggerId == null ? other$triggerId != null : !this$triggerId.equals(other$triggerId)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof UserResourceGrantedEvent;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $type = this.getType();
        result = result * PRIME + ($type == null ? 43 : $type.hashCode());
        final Object $user = this.getUser();
        result = result * PRIME + ($user == null ? 43 : $user.hashCode());
        final Object $scopes = this.getScopes();
        result = result * PRIME + ($scopes == null ? 43 : $scopes.hashCode());
        final Object $triggerId = this.getTriggerId();
        result = result * PRIME + ($triggerId == null ? 43 : $triggerId.hashCode());
        return result;
    }

    public String toString() {
        return "UserResourceGrantedEvent(type=" + this.getType() + ", user=" + this.getUser() + ", scopes=" + this.getScopes() + ", triggerId=" + this.getTriggerId() + ")";
    }
}