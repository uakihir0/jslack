package com.github.seratch.jslack.api.methods.request.groups;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class GroupsKickRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `groups:write`
     */
    private String token;

    /**
     * Private channel to remove user from.
     */
    private String channel;

    /**
     * User to remove from private channel.
     */
    private String user;

    GroupsKickRequest(String token, String channel, String user) {
        this.token = token;
        this.channel = channel;
        this.user = user;
    }

    public static GroupsKickRequestBuilder builder() {
        return new GroupsKickRequestBuilder();
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

    public static class GroupsKickRequestBuilder {
        private String token;
        private String channel;
        private String user;

        GroupsKickRequestBuilder() {
        }

        public GroupsKickRequest.GroupsKickRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public GroupsKickRequest.GroupsKickRequestBuilder channel(String channel) {
            this.channel = channel;
            return this;
        }

        public GroupsKickRequest.GroupsKickRequestBuilder user(String user) {
            this.user = user;
            return this;
        }

        public GroupsKickRequest build() {
            return new GroupsKickRequest(token, channel, user);
        }

        public String toString() {
            return "GroupsKickRequest.GroupsKickRequestBuilder(token=" + this.token + ", channel=" + this.channel + ", user=" + this.user + ")";
        }
    }
}