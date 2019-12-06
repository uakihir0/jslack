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
}