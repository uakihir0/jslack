package com.github.seratch.jslack.api.methods.request.groups;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class GroupsCreateChildRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `groups:write`
     */
    private String token;

    /**
     * Private channel to clone and archive.
     */
    private String channel;

    GroupsCreateChildRequest(String token, String channel) {
        this.token = token;
        this.channel = channel;
    }

    public static GroupsCreateChildRequestBuilder builder() {
        return new GroupsCreateChildRequestBuilder();
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

    public static class GroupsCreateChildRequestBuilder {
        private String token;
        private String channel;

        GroupsCreateChildRequestBuilder() {
        }

        public GroupsCreateChildRequest.GroupsCreateChildRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public GroupsCreateChildRequest.GroupsCreateChildRequestBuilder channel(String channel) {
            this.channel = channel;
            return this;
        }

        public GroupsCreateChildRequest build() {
            return new GroupsCreateChildRequest(token, channel);
        }

        public String toString() {
            return "GroupsCreateChildRequest.GroupsCreateChildRequestBuilder(token=" + this.token + ", channel=" + this.channel + ")";
        }
    }
}