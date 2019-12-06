package com.github.seratch.jslack.api.methods.request.conversations;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class ConversationsCloseRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `conversations:write`
     */
    private String token;

    /**
     * Conversation to close.
     */
    private String channel;

    ConversationsCloseRequest(String token, String channel) {
        this.token = token;
        this.channel = channel;
    }

    public static ConversationsCloseRequestBuilder builder() {
        return new ConversationsCloseRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public String getChannel() {
        return this.channel;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public static class ConversationsCloseRequestBuilder {
        private String token;
        private String channel;

        ConversationsCloseRequestBuilder() {
        }

        public ConversationsCloseRequest.ConversationsCloseRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public ConversationsCloseRequest.ConversationsCloseRequestBuilder channel(String channel) {
            this.channel = channel;
            return this;
        }

        public ConversationsCloseRequest build() {
            return new ConversationsCloseRequest(token, channel);
        }

        public String toString() {
            return "ConversationsCloseRequest.ConversationsCloseRequestBuilder(token=" + this.token + ", channel=" + this.channel + ")";
        }
    }
}
