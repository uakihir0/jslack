package com.github.seratch.jslack.api.model.event;

/**
 * The group_unarchive event is sent to all connections for members of a private channel when that private channel is unarchived.
 * Clients can use this to update their local list of private channels.
 * <p>
 * https://api.slack.com/events/group_unarchive
 */
public class GroupUnarchiveEvent implements Event {

    public static final String TYPE_NAME = "group_unarchive";

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