package com.github.seratch.jslack.api.methods.response.im;

import com.github.seratch.jslack.api.methods.SlackApiResponse;
import com.github.seratch.jslack.api.model.Message;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ImRepliesResponse implements SlackApiResponse {

    private boolean ok;
    private String warning;
    private String error;
    private String needed;
    private String provided;

    private List<Message.MessageRoot> messages;
    private boolean hasMore;
}