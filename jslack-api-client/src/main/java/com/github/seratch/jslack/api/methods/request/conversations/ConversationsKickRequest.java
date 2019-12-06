package com.github.seratch.jslack.api.methods.request.conversations;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class ConversationsKickRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `conversations:write`
     */
    private String token;

    /**
     * ID of conversation to remove user from.
     */
    private String channel;

    /**
     * User ID to be removed.
     */
    private String user;

    ConversationsKickRequest(String token, String channel, String user) {
        this.token = token;
        this.channel = channel;
        this.user = user;
    }

    public static ConversationsKickRequestBuilder builder() {
        return new ConversationsKickRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public String getChannel() {
        return this.channel;
    }

    public String getUser() {
        return this.user;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public static class ConversationsKickRequestBuilder {
        private String token;
        private String channel;
        private String user;

        ConversationsKickRequestBuilder() {
        }

        public ConversationsKickRequest.ConversationsKickRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public ConversationsKickRequest.ConversationsKickRequestBuilder channel(String channel) {
            this.channel = channel;
            return this;
        }

        public ConversationsKickRequest.ConversationsKickRequestBuilder user(String user) {
            this.user = user;
            return this;
        }

        public ConversationsKickRequest build() {
            return new ConversationsKickRequest(token, channel, user);
        }

        public String toString() {
            return "ConversationsKickRequest.ConversationsKickRequestBuilder(token=" + this.token + ", channel=" + this.channel + ", user=" + this.user + ")";
        }
    }
}
