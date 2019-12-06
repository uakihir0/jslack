package com.github.seratch.jslack.api.methods.response.conversations;

import com.github.seratch.jslack.api.methods.SlackApiResponse;
import com.github.seratch.jslack.api.model.Conversation;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ConversationsInviteResponse implements SlackApiResponse {

    private boolean ok;
    private String warning;
    private String error;
    private List<Error> errors;
    private String needed;
    private String provided;

    private Conversation channel;

    @Getter
@Setter
    public static class Error {
        private boolean ok;
        private String error;
    }
}
