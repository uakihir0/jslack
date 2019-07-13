package com.github.seratch.jslack.api.model.event;

import java.util.List;

/**
 *
 */
public class ScopeGrantedEvent implements Event {

    public static final String TYPE_NAME = "scope_granted";

    private final String type = TYPE_NAME;
    private List<String> scopes;
    private String triggerId;

    public ScopeGrantedEvent() {
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
        if (!(o instanceof ScopeGrantedEvent)) return false;
        final ScopeGrantedEvent other = (ScopeGrantedEvent) o;
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
        return other instanceof ScopeGrantedEvent;
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
        return "ScopeGrantedEvent(type=" + this.getType() + ", scopes=" + this.getScopes() + ", triggerId=" + this.getTriggerId() + ")";
    }
}