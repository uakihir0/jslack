package com.github.seratch.jslack.api.methods.request.groups;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class GroupsLeaveRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `groups:write`
     */
    private String token;

    /**
     * Private channel to leave
     */
    private String channel;

    GroupsLeaveRequest(String token, String channel) {
        this.token = token;
        this.channel = channel;
    }

    public static GroupsLeaveRequestBuilder builder() {
        return new GroupsLeaveRequestBuilder();
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

    public static class GroupsLeaveRequestBuilder {
        private String token;
        private String channel;

        GroupsLeaveRequestBuilder() {
        }

        public GroupsLeaveRequest.GroupsLeaveRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public GroupsLeaveRequest.GroupsLeaveRequestBuilder channel(String channel) {
            this.channel = channel;
            return this;
        }

        public GroupsLeaveRequest build() {
            return new GroupsLeaveRequest(token, channel);
        }

        public String toString() {
            return "GroupsLeaveRequest.GroupsLeaveRequestBuilder(token=" + this.token + ", channel=" + this.channel + ")";
        }
    }
}