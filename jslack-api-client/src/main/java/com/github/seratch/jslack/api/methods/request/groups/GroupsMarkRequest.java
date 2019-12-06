package com.github.seratch.jslack.api.methods.request.groups;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class GroupsMarkRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `groups:write`
     */
    private String token;

    /**
     * Private channel to set reading cursor in.
     */
    private String channel;

    /**
     * Timestamp of the most recently seen message.
     */
    private String ts;

    GroupsMarkRequest(String token, String channel, String ts) {
        this.token = token;
        this.channel = channel;
        this.ts = ts;
    }

    public static GroupsMarkRequestBuilder builder() {
        return new GroupsMarkRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public String getChannel() {
        return this.channel;
    }

    public String getTs() {
        return this.ts;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public void setTs(String ts) {
        this.ts = ts;
    }

    public static class GroupsMarkRequestBuilder {
        private String token;
        private String channel;
        private String ts;

        GroupsMarkRequestBuilder() {
        }

        public GroupsMarkRequest.GroupsMarkRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public GroupsMarkRequest.GroupsMarkRequestBuilder channel(String channel) {
            this.channel = channel;
            return this;
        }

        public GroupsMarkRequest.GroupsMarkRequestBuilder ts(String ts) {
            this.ts = ts;
            return this;
        }

        public GroupsMarkRequest build() {
            return new GroupsMarkRequest(token, channel, ts);
        }

        public String toString() {
            return "GroupsMarkRequest.GroupsMarkRequestBuilder(token=" + this.token + ", channel=" + this.channel + ", ts=" + this.ts + ")";
        }
    }
}