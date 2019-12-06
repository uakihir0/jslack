package com.github.seratch.jslack.api.model.event;

/**
 * The group_close event is sent to all connections for a user when a private channel is closed by that user.
 * <p>
 * This event is not available to bot user subscriptions in the Events API.
 * <p>
 * https://api.slack.com/events/group_close
 */
public class GroupCloseEvent implements Event {

    public static final String TYPE_NAME = "group_close";

    private final String type = TYPE_NAME;
    private String user;
    private String channel;

    public String getType() {
        return this.type;
    }

    public String getUser() {
        return this.user;
    }

    public String getChannel() {
        return this.channel;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }
}