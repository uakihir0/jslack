package com.github.seratch.jslack.api.model.event;

/**
 * The group_open event is sent to all connections for a user when a group Direct RTMMessage (or mpim) is opened by that user.
 * <p>
 * This event is not available to bot user subscriptions in the Events API.
 * <p>
 * https://api.slack.com/events/group_open
 */
public class GroupOpenEvent implements Event {

    public static final String TYPE_NAME = "group_open";

    private final String type = TYPE_NAME;
    private String channel;
    private String user;

    public String getType() {
        return this.type;
    }

    public String getChannel() {
        return this.channel;
    }

    public String getUser() {
        return this.user;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public void setUser(String user) {
        this.user = user;
    }
}