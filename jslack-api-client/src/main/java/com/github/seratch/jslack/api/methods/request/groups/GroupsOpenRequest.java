package com.github.seratch.jslack.api.methods.request.groups;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class GroupsOpenRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `groups:write`
     */
    private String token;

    /**
     * Private channel to open.
     */
    private String channel;

    GroupsOpenRequest(String token, String channel) {
        this.token = token;
        this.channel = channel;
    }

    public static GroupsOpenRequestBuilder builder() {
        return new GroupsOpenRequestBuilder();
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

    public static class GroupsOpenRequestBuilder {
        private String token;
        private String channel;

        GroupsOpenRequestBuilder() {
        }

        public GroupsOpenRequest.GroupsOpenRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public GroupsOpenRequest.GroupsOpenRequestBuilder channel(String channel) {
            this.channel = channel;
            return this;
        }

        public GroupsOpenRequest build() {
            return new GroupsOpenRequest(token, channel);
        }

        public String toString() {
            return "GroupsOpenRequest.GroupsOpenRequestBuilder(token=" + this.token + ", channel=" + this.channel + ")";
        }
    }
}