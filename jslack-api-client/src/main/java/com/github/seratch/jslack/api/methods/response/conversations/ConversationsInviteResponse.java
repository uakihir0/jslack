package com.github.seratch.jslack.api.methods.response.conversations;

import com.github.seratch.jslack.api.methods.SlackApiResponse;
import com.github.seratch.jslack.api.model.Conversation;

import java.util.List;

public class ConversationsInviteResponse implements SlackApiResponse {

    private boolean ok;
    private String warning;
    private String error;
    private List<Error> errors;
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

    public List<Error> getErrors() {
        return this.errors;
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

    public void setErrors(List<Error> errors) {
        this.errors = errors;
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

    public static class Error {
        private boolean ok;
        private String error;

        public boolean isOk() {
            return this.ok;
        }

        public String getError() {
            return this.error;
        }

        public void setOk(boolean ok) {
            this.ok = ok;
        }

        public void setError(String error) {
            this.error = error;
        }
    }
}
