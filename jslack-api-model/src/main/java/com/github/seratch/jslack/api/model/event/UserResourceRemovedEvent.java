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
}