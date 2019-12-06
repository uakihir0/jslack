package com.github.seratch.jslack.api.methods.request.groups;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class GroupsCloseRequest implements SlackApiRequest {

    private String token;
    private String channel;

    GroupsCloseRequest(String token, String channel) {
        this.token = token;
        this.channel = channel;
    }

    public static GroupsCloseRequestBuilder builder() {
        return new GroupsCloseRequestBuilder();
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

    public static class GroupsCloseRequestBuilder {
        private String token;
        private String channel;

        GroupsCloseRequestBuilder() {
        }

        public GroupsCloseRequest.GroupsCloseRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public GroupsCloseRequest.GroupsCloseRequestBuilder channel(String channel) {
            this.channel = channel;
            return this;
        }

        public GroupsCloseRequest build() {
            return new GroupsCloseRequest(token, channel);
        }

        public String toString() {
            return "GroupsCloseRequest.GroupsCloseRequestBuilder(token=" + this.token + ", channel=" + this.channel + ")";
        }
    }
}