package com.github.seratch.jslack.api.methods.request.conversations;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

import java.util.List;

public class ConversationsInviteRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `conversations:write`
     */
    private String token;

    /**
     * The ID of the public or private channel to invite user(s) to.
     */
    private String channel;

    /**
     * A comma separated list of user IDs. Up to 30 users may be listed.
     */
    private List<String> users;

    ConversationsInviteRequest(String token, String channel, List<String> users) {
        this.token = token;
        this.channel = channel;
        this.users = users;
    }

    public static ConversationsInviteRequestBuilder builder() {
        return new ConversationsInviteRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public String getChannel() {
        return this.channel;
    }

    public List<String> getUsers() {
        return this.users;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public void setUsers(List<String> users) {
        this.users = users;
    }

    public static class ConversationsInviteRequestBuilder {
        private String token;
        private String channel;
        private List<String> users;

        ConversationsInviteRequestBuilder() {
        }

        public ConversationsInviteRequest.ConversationsInviteRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public ConversationsInviteRequest.ConversationsInviteRequestBuilder channel(String channel) {
            this.channel = channel;
            return this;
        }

        public ConversationsInviteRequest.ConversationsInviteRequestBuilder users(List<String> users) {
            this.users = users;
            return this;
        }

        public ConversationsInviteRequest build() {
            return new ConversationsInviteRequest(token, channel, users);
        }

        public String toString() {
            return "ConversationsInviteRequest.ConversationsInviteRequestBuilder(token=" + this.token + ", channel=" + this.channel + ", users=" + this.users + ")";
        }
    }
}
