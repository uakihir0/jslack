package com.github.seratch.jslack.api.model.event;

import lombok.Getter;
import lombok.Setter;

/**
 * The channel_deleted event is sent to all connections for a workspace when a channel is deleted.
 * Clients can use this to update their local cache of non-joined channels.
 * <p>
 * https://api.slack.com/events/channel_deleted
 */
@Getter
@Setter
public class ChannelDeletedEvent implements Event {

    public static final String TYPE_NAME = "channel_deleted";

    private final String type = TYPE_NAME;
    private String channel;
}