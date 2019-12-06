package com.github.seratch.jslack.api.methods.request.conversations;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class ConversationsUnarchiveRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `conversations:write`
     */
    private String token;

    /**
     * ID of conversation to unarchive
     */
    private String channel;

    ConversationsUnarchiveRequest(String token, String channel) {
        this.token = token;
        this.channel = channel;
    }

    public static ConversationsUnarchiveRequestBuilder builder() {
        return new ConversationsUnarchiveRequestBuilder();
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

    public static class ConversationsUnarchiveRequestBuilder {
        private String token;
        private String channel;

        ConversationsUnarchiveRequestBuilder() {
        }

        public ConversationsUnarchiveRequest.ConversationsUnarchiveRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public ConversationsUnarchiveRequest.ConversationsUnarchiveRequestBuilder channel(String channel) {
            this.channel = channel;
            return this;
        }

        public ConversationsUnarchiveRequest build() {
            return new ConversationsUnarchiveRequest(token, channel);
        }

        public String toString() {
            return "ConversationsUnarchiveRequest.ConversationsUnarchiveRequestBuilder(token=" + this.token + ", channel=" + this.channel + ")";
        }
    }
}
