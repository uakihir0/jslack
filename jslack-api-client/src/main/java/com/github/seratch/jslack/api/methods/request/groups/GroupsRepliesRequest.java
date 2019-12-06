package com.github.seratch.jslack.api.methods.request.groups;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class GroupsRepliesRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `groups:history`
     */
    private String token;

    /**
     * Private channel to fetch thread from
     */
    private String channel;

    /**
     * Unique identifier of a thread's parent message
     */
    private String threadTs;

    GroupsRepliesRequest(String token, String channel, String threadTs) {
        this.token = token;
        this.channel = channel;
        this.threadTs = threadTs;
    }

    public static GroupsRepliesRequestBuilder builder() {
        return new GroupsRepliesRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public String getChannel() {
        return this.channel;
    }

    public String getThreadTs() {
        return this.threadTs;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public void setThreadTs(String threadTs) {
        this.threadTs = threadTs;
    }

    public static class GroupsRepliesRequestBuilder {
        private String token;
        private String channel;
        private String threadTs;

        GroupsRepliesRequestBuilder() {
        }

        public GroupsRepliesRequest.GroupsRepliesRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public GroupsRepliesRequest.GroupsRepliesRequestBuilder channel(String channel) {
            this.channel = channel;
            return this;
        }

        public GroupsRepliesRequest.GroupsRepliesRequestBuilder threadTs(String threadTs) {
            this.threadTs = threadTs;
            return this;
        }

        public GroupsRepliesRequest build() {
            return new GroupsRepliesRequest(token, channel, threadTs);
        }

        public String toString() {
            return "GroupsRepliesRequest.GroupsRepliesRequestBuilder(token=" + this.token + ", channel=" + this.channel + ", threadTs=" + this.threadTs + ")";
        }
    }
}