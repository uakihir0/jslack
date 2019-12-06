package com.github.seratch.jslack.api.methods.response.chat;

import com.github.seratch.jslack.api.methods.SlackApiResponse;

public class ChatPostEphemeralResponse implements SlackApiResponse {

    private boolean ok;
    private String warning;
    private String error;
    private String needed;
    private String provided;

    private String channel;
    private String messageTs;

    public boolean isOk() {
        return this.ok;
    }

    public String getWarning() {
        return this.warning;
    }

    public String getError() {
        return this.error;
    }

    public String getNeeded() {
        return this.needed;
    }

    public String getProvided() {
        return this.provided;
    }

    public String getChannel() {
        return this.channel;
    }

    public String getMessageTs() {
        return this.messageTs;
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

    public void setNeeded(String needed) {
        this.needed = needed;
    }

    public void setProvided(String provided) {
        this.provided = provided;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public void setMessageTs(String messageTs) {
        this.messageTs = messageTs;
    }
}