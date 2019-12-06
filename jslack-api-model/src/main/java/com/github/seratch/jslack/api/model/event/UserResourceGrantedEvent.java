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
}