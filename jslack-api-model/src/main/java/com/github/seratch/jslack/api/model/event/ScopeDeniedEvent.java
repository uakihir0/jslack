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