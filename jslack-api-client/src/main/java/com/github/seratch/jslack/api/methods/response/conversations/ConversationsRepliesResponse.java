package com.github.seratch.jslack.api.methods.response.conversations;

import com.github.seratch.jslack.api.methods.SlackApiResponse;
import com.github.seratch.jslack.api.model.Message;
import com.github.seratch.jslack.api.model.ResponseMetadata;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ConversationsRepliesResponse implements SlackApiResponse {
    private boolean ok;
    private String warning;
    private String error;
    private String needed;
    private String provided;

    private List<Message> messages;
    private boolean hasMore;
    private ResponseMetadata responseMetadata;
}
