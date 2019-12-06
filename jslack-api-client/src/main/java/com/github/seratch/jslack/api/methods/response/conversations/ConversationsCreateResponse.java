package com.github.seratch.jslack.api.methods.response.conversations;

import com.github.seratch.jslack.api.methods.SlackApiResponse;
import com.github.seratch.jslack.api.model.Conversation;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ConversationsCreateResponse implements SlackApiResponse {

    private boolean ok;
    private String warning;
    private String error;

    // {
    //   "ok": false,
    //   "error": "invalid_name_maxlength",
    //   "detail": "Value passed for `name` exceeded max length."
    // }
    private String detail;

    private String needed;
    private String provided;

    private Conversation channel;
}
