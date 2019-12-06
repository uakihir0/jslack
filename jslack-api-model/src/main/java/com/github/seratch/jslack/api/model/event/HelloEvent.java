package com.github.seratch.jslack.api.model.event;

import lombok.Getter;
import lombok.Setter;

/**
 * The hello event is sent when a connection is opened to the message server.
 * This allows a client to confirm the connection has been correctly opened.
 * <p>
 * https://api.slack.com/events/hello
 */
@Getter
@Setter
public class HelloEvent implements Event {

    public static final String TYPE_NAME = "hello";

    private final String type = TYPE_NAME;

}