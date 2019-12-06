package com.github.seratch.jslack.api.rtm.message;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * https://api.slack.com/events/presence_sub
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PresenceSub implements RTMMessage {

    public static final String TYPE_NAME = "presence_sub";

    private final String type = TYPE_NAME;
    private List<String> ids;
}
