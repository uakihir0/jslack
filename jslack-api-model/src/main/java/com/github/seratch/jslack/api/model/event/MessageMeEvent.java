package com.github.seratch.jslack.api.model.event;

import lombok.Getter;
import lombok.Setter;

/**
 * https://api.slack.com/events/message/me_message
 */
@Getter
@Setter
public class MessageMeEvent implements Event {

    public static final String TYPE_NAME = "message";
    public static final String SUBTYPE_NAME = "me_message";

    private final String type = TYPE_NAME;
    private final String subtype = SUBTYPE_NAME;
    private String channel;

    private String username;
    private String botId;

    private String text;

    private String eventTs;
    private String ts;
    private String channelType; // app_home, channel, group, im, mpim
}
