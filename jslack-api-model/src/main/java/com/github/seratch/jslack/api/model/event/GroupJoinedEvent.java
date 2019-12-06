package com.github.seratch.jslack.api.model.event;

import lombok.Getter;
import lombok.Setter;

/**
 * The group_joined event is sent to all connections for a user when that user joins a private channel.
 * <p>
 * The channel value is the string identifier for the private channel.
 * <p>
 * https://api.slack.com/events/group_joined
 */
@Getter
@Setter
public class GroupJoinedEvent implements Event {

    public static final String TYPE_NAME = "group_joined";

    private final String type = TYPE_NAME;
    private Channel channel;

    @Getter
@Setter
    public static class Channel {
        // TODO
    }

}