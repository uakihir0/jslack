package com.github.seratch.jslack.api.methods.request.groups;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class GroupsArchiveRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `groups:write`
     */
    private String token;

    /**
     * Private channel to archive
     */
    private String channel;

    GroupsArchiveRequest(String token, String channel) {
        this.token = token;
        this.channel = channel;
    }

    public static GroupsArchiveRequestBuilder builder() {
        return new GroupsArchiveRequestBuilder();
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

    public static class GroupsArchiveRequestBuilder {
        private String token;
        private String channel;

        GroupsArchiveRequestBuilder() {
        }

        public GroupsArchiveRequest.GroupsArchiveRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public GroupsArchiveRequest.GroupsArchiveRequestBuilder channel(String channel) {
            this.channel = channel;
            return this;
        }

        public GroupsArchiveRequest build() {
            return new GroupsArchiveRequest(token, channel);
        }

        public String toString() {
            return "GroupsArchiveRequest.GroupsArchiveRequestBuilder(token=" + this.token + ", channel=" + this.channel + ")";
        }
    }
}