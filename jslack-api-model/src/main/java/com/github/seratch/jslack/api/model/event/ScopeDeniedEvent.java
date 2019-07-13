package com.github.seratch.jslack.api.model.event;

import java.util.List;

/**
 * The inner event describes an array of scopes you requested but were denied access to.
 * It includes a trigger_id you may use with dialog.open or Permissions API requests.
 * <p>
 * https://api.slack.com/events/scope_denied
 */
public class ScopeDeniedEvent implements Event {

    public static final String TYPE_NAME = "scope_denied";

    private final String type = TYPE_NAME;
    private List<String> scopes;
    private String triggerId;

    public ScopeDeniedEvent() {
    }

    public String getType() {
        return this.type;
    }

    public List<String> getScopes() {
        return this.scopes;
    }

    public String getTriggerId() {
        return this.triggerId;
    }

    public void setScopes(List<String> scopes) {
        this.scopes = scopes;
    }

    public void setTriggerId(String triggerId) {
        this.triggerId = triggerId;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ScopeDeniedEvent)) return false;
        final ScopeDeniedEvent other = (ScopeDeniedEvent) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$type = this.getType();
        final Object other$type = other.getType();
        if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
        final Object this$scopes = this.getScopes();
        final Object other$scopes = other.getScopes();
        if (this$scopes == null ? other$scopes != null : !this$scopes.equals(other$scopes)) return false;
        final Object this$triggerId = this.getTriggerId();
        final Object other$triggerId = other.getTriggerId();
        if (this$triggerId == null ? other$triggerId != null : !this$triggerId.equals(other$triggerId)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ScopeDeniedEvent;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $type = this.getType();
        result = result * PRIME + ($type == null ? 43 : $type.hashCode());
        final Object $scopes = this.getScopes();
        result = result * PRIME + ($scopes == null ? 43 : $scopes.hashCode());
        final Object $triggerId = this.getTriggerId();
        result = result * PRIME + ($triggerId == null ? 43 : $triggerId.hashCode());
        return result;
    }

    public String toString() {
        return "ScopeDeniedEvent(type=" + this.getType() + ", scopes=" + this.getScopes() + ", triggerId=" + this.getTriggerId() + ")";
    }
}