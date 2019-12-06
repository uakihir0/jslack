package com.github.seratch.jslack.api.model.event;

import lombok.Getter;
import lombok.Setter;

/**
 * The channel_created event is sent to all connections for a workspace when a new channel is created.
 * Clients can use this to update their local cache of non-joined channels.
 * <p>
 * https://api.slack.com/events/channel_created
 */
@Getter
@Setter
public class ChannelCreatedEvent implements Event {

    public static final String TYPE_NAME = "channel_created";

    private final String type = TYPE_NAME;
    private Channel channel;

    @Getter
@Setter
    public static class Channel {
        private String id;
        private String name;
        private Integer created;
        private String creator;
    }
}