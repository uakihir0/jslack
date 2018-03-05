package com.github.seratch.jslack.api.methods.request.groups;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class GroupsInfoRequest implements SlackApiRequest {

    private String token;
    private String channel;

    GroupsInfoRequest(String token, String channel) {
        this.token = token;
        this.channel = channel;
    }

    public static GroupsInfoRequestBuilder builder() {
        return new GroupsInfoRequestBuilder();
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

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof GroupsInfoRequest)) return false;
        final GroupsInfoRequest other = (GroupsInfoRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$token = this.getToken();
        final Object other$token = other.getToken();
        if (this$token == null ? other$token != null : !this$token.equals(other$token)) return false;
        final Object this$channel = this.getChannel();
        final Object other$channel = other.getChannel();
        if (this$channel == null ? other$channel != null : !this$channel.equals(other$channel)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $token = this.getToken();
        result = result * PRIME + ($token == null ? 43 : $token.hashCode());
        final Object $channel = this.getChannel();
        result = result * PRIME + ($channel == null ? 43 : $channel.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof GroupsInfoRequest;
    }

    public String toString() {
        return "GroupsInfoRequest(token=" + this.getToken() + ", channel=" + this.getChannel() + ")";
    }

    public static class GroupsInfoRequestBuilder {
        private String token;
        private String channel;

        GroupsInfoRequestBuilder() {
        }

        public GroupsInfoRequest.GroupsInfoRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public GroupsInfoRequest.GroupsInfoRequestBuilder channel(String channel) {
            this.channel = channel;
            return this;
        }

        public GroupsInfoRequest build() {
            return new GroupsInfoRequest(token, channel);
        }

        public String toString() {
            return "GroupsInfoRequest.GroupsInfoRequestBuilder(token=" + this.token + ", channel=" + this.channel + ")";
        }
    }
}