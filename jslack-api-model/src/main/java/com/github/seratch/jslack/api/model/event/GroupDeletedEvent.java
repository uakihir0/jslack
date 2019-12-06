package com.github.seratch.jslack.api.model.event;

import lombok.Getter;
import lombok.Setter;

/**
 * The group_deleted event is sent to all members of a private channel when it is deleted.
 * Clients can use this to update their local list of private channels.
 * <p>
 * https://api.slack.com/events/group_deleted
 */
@Getter
@Setter
public class GroupDeletedEvent implements Event {

    public static final String TYPE_NAME = "group_deleted";

    private final String type = TYPE_NAME;
    private String channel;

}