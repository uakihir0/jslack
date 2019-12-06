package com.github.seratch.jslack.api.methods.response.conversations;

import com.github.seratch.jslack.api.methods.SlackApiResponse;
import com.github.seratch.jslack.api.model.Conversation;

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

    public boolean isOk() {
        return this.ok;
    }

    public String getWarning() {
        return this.warning;
    }

    public String getError() {
        return this.error;
    }

    public String getDetail() {
        return this.detail;
    }

    public String getNeeded() {
        return this.needed;
    }

    public String getProvided() {
        return this.provided;
    }

    public Conversation getChannel() {
        return this.channel;
    }

    public void setOk(boolean ok) {
        this.ok = ok;
    }

    public void setWarning(String warning) {
        this.warning = warning;
    }

    public void setError(String error) {
        this.error = error;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public void setNeeded(String needed) {
        this.needed = needed;
    }

    public void setProvided(String provided) {
        this.provided = provided;
    }

    public void setChannel(Conversation channel) {
        this.channel = channel;
    }
}
