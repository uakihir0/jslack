package com.github.seratch.jslack.api.model.event;

import lombok.Getter;
import lombok.Setter;

/**
 * The group_marked event is sent to all open connections for a user
 * when that user moves the read cursor in a private channel by calling the groups.mark API method.
 * <p>
 * https://api.slack.com/events/group_marked
 */
@Getter
@Setter
public class GroupMarkedEvent implements Event {

    public static final String TYPE_NAME = "group_marked";

    private final String type = TYPE_NAME;
    private String channel;
    private String ts;

}