package com.github.seratch.jslack.api.model.event;

/**
 * The group_deleted event is sent to all members of a private channel when it is deleted.
 * Clients can use this to update their local list of private channels.
 * <p>
 * https://api.slack.com/events/group_deleted
 */
public class GroupDeletedEvent implements Event {

    public static final String TYPE_NAME = "group_deleted";

    private final String type = TYPE_NAME;
    private String channel;

    public String getType() {
        return this.type;
    }

    public String getChannel() {
        return this.channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }
}