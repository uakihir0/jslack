package com.github.seratch.jslack.api.methods.request.groups;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class GroupsInviteRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `groups:write`
     */
    private String token;

    /**
     * Private channel to invite user to.
     */
    private String channel;

    /**
     * User to invite.
     */
    private String user;

    GroupsInviteRequest(String token, String channel, String user) {
        this.token = token;
        this.channel = channel;
        this.user = user;
    }

    public static GroupsInviteRequestBuilder builder() {
        return new GroupsInviteRequestBuilder();
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

    public static class GroupsInviteRequestBuilder {
        private String token;
        private String channel;
        private String user;

        GroupsInviteRequestBuilder() {
        }

        public GroupsInviteRequest.GroupsInviteRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public GroupsInviteRequest.GroupsInviteRequestBuilder channel(String channel) {
            this.channel = channel;
            return this;
        }

        public GroupsInviteRequest.GroupsInviteRequestBuilder user(String user) {
            this.user = user;
            return this;
        }

        public GroupsInviteRequest build() {
            return new GroupsInviteRequest(token, channel, user);
        }

        public String toString() {
            return "GroupsInviteRequest.GroupsInviteRequestBuilder(token=" + this.token + ", channel=" + this.channel + ", user=" + this.user + ")";
        }
    }
}