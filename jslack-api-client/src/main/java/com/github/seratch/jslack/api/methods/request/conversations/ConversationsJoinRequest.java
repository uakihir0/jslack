package com.github.seratch.jslack.api.methods.request.conversations;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class ConversationsJoinRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `channels:write`
     */
    private String token;

    /**
     * ID of conversation to join
     */
    private String channel;

    ConversationsJoinRequest(String token, String channel) {
        this.token = token;
        this.channel = channel;
    }

    public static ConversationsJoinRequestBuilder builder() {
        return new ConversationsJoinRequestBuilder();
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

    public static class ConversationsJoinRequestBuilder {
        private String token;
        private String channel;

        ConversationsJoinRequestBuilder() {
        }

        public ConversationsJoinRequest.ConversationsJoinRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public ConversationsJoinRequest.ConversationsJoinRequestBuilder channel(String channel) {
            this.channel = channel;
            return this;
        }

        public ConversationsJoinRequest build() {
            return new ConversationsJoinRequest(token, channel);
        }

        public String toString() {
            return "ConversationsJoinRequest.ConversationsJoinRequestBuilder(token=" + this.token + ", channel=" + this.channel + ")";
        }
    }
}
