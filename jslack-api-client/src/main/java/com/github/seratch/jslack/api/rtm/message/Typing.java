package com.github.seratch.jslack.api.rtm.message;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

/**
 * https://api.slack.com/events/user_typing
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Typing implements RTMMessage {

    public static final String TYPE_NAME = "typing";

    private Long id;
    private final String type = TYPE_NAME;
    private String channel;
}
