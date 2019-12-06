package com.github.seratch.jslack.api.methods.response.conversations;

import com.github.seratch.jslack.api.methods.SlackApiResponse;
import com.github.seratch.jslack.api.model.Message;
import com.github.seratch.jslack.api.model.ResponseMetadata;

import java.util.List;

public class ConversationsRepliesResponse implements SlackApiResponse {
    private boolean ok;
    private String warning;
    private String error;
    private String needed;
    private String provided;

    private List<Message> messages;
    private boolean hasMore;
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

    public List<Message> getMessages() {
        return this.messages;
    }

    public boolean isHasMore() {
        return this.hasMore;
    }

    public ResponseMetadata getResponseMetadata() {
        return this.responseMetadata;
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

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    public void setHasMore(boolean hasMore) {
        this.hasMore = hasMore;
    }

    public void setResponseMetadata(ResponseMetadata responseMetadata) {
        this.responseMetadata = responseMetadata;
    }
}
