package com.github.seratch.jslack.api.methods.request.groups;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class GroupsUnarchiveRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `groups:write`
     */
    private String token;

    /**
     * Private channel to unarchive
     */
    private String channel;

    GroupsUnarchiveRequest(String token, String channel) {
        this.token = token;
        this.channel = channel;
    }

    public static GroupsUnarchiveRequestBuilder builder() {
        return new GroupsUnarchiveRequestBuilder();
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

    public static class GroupsUnarchiveRequestBuilder {
        private String token;
        private String channel;

        GroupsUnarchiveRequestBuilder() {
        }

        public GroupsUnarchiveRequest.GroupsUnarchiveRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public GroupsUnarchiveRequest.GroupsUnarchiveRequestBuilder channel(String channel) {
            this.channel = channel;
            return this;
        }

        public GroupsUnarchiveRequest build() {
            return new GroupsUnarchiveRequest(token, channel);
        }

        public String toString() {
            return "GroupsUnarchiveRequest.GroupsUnarchiveRequestBuilder(token=" + this.token + ", channel=" + this.channel + ")";
        }
    }
}