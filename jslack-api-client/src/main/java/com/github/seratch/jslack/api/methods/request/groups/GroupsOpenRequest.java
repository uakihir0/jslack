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

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof GroupsOpenRequest)) return false;
        final GroupsOpenRequest other = (GroupsOpenRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$token = this.getToken();
        final Object other$token = other.getToken();
        if (this$token == null ? other$token != null : !this$token.equals(other$token)) return false;
        final Object this$channel = this.getChannel();
        final Object other$channel = other.getChannel();
        if (this$channel == null ? other$channel != null : !this$channel.equals(other$channel)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof GroupsOpenRequest;
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

    public String toString() {
        return "GroupsOpenRequest(token=" + this.getToken() + ", channel=" + this.getChannel() + ")";
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