package com.github.seratch.jslack.api.model.event;

import lombok.Getter;
import lombok.Setter;

/**
 * The reconnect_url event is currently unsupported and experimental.
 * <p>
 * https://api.slack.com/events/reconnect_url
 */
@Getter
@Setter
public class ReconnectUrlEvent implements Event {

    public static final String TYPE_NAME = "reconnect_url";

    private final String type = TYPE_NAME;

}