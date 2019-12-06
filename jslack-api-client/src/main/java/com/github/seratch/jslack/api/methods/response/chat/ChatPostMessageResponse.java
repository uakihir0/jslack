package com.github.seratch.jslack.api.methods.response.chat;

import com.github.seratch.jslack.api.methods.SlackApiResponse;
import com.github.seratch.jslack.api.model.Message;

import java.util.List;

public class ChatPostMessageResponse implements SlackApiResponse {

    private boolean ok;
    private String warning;
    private String error;
    private String needed;
    private String provided;

    private ResponseMetadata responseMetadata;

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

    public ResponseMetadata getResponseMetadata() {
        return this.responseMetadata;
    }

    public String getChannel() {
        return this.channel;
    }

    public String getTs() {
        return this.ts;
    }

    public Message getMessage() {
        return this.message;
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

    public void setResponseMetadata(ResponseMetadata responseMetadata) {
        this.responseMetadata = responseMetadata;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public void setTs(String ts) {
        this.ts = ts;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public static class ResponseMetadata {
        private List<String> messages;

        public List<String> getMessages() {
            return this.messages;
        }

        public void setMessages(List<String> messages) {
            this.messages = messages;
        }
    }

    private String channel;
    private String ts;
    private Message message;
}