package com.github.seratch.jslack.api.model.event;

/**
 * The channel_deleted event is sent to all connections for a workspace when a channel is deleted.
 * Clients can use this to update their local cache of non-joined channels.
 * <p>
 * https://api.slack.com/events/channel_deleted
 */
public class ChannelDeletedEvent implements Event {

    public static final String TYPE_NAME = "channel_deleted";

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