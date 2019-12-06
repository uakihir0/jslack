package com.github.seratch.jslack.api.methods.response.chat;

import com.github.seratch.jslack.api.methods.SlackApiResponse;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ChatDeleteResponse implements SlackApiResponse {

    private boolean ok;
    private String warning;
    private String error;
    private String needed;
    private String provided;

    private String channel;
    private String ts;
}