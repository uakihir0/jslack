package com.github.seratch.jslack.api.model.event;

import lombok.Getter;
import lombok.Setter;

/**
 * The channel_left event is sometimes sent to all connections for a user when that user leaves a channel.
 * It is sometimes withheld.
 * <p>
 * Clients should respond to this message by closing the channel
 * — this means that when a channel is left from client A, it will automatically be closed in client B.
 * <p>
 * In addition to this message, all existing members of the channel will receive a channel_leave message event.
 * <p>
 * https://api.slack.com/events/channel_left
 */
@Getter
@Setter
public class ChannelLeftEvent implements Event {

    public static final String TYPE_NAME = "channel_left";

    private final String type = TYPE_NAME;
    private String channel;

}