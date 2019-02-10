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

    @java.beans.ConstructorProperties({"token", "channel"})
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

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof GroupsCreateChildRequest)) return false;
        final GroupsCreateChildRequest other = (GroupsCreateChildRequest) o;
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
        return other instanceof GroupsCreateChildRequest;
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
        return "GroupsCreateChildRequest(token=" + this.getToken() + ", channel=" + this.getChannel() + ")";
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