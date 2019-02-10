package com.github.seratch.jslack.api.methods.request.groups;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class GroupsKickRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `groups:write`
     */
    private String token;

    /**
     * Private channel to remove user from.
     */
    private String channel;

    /**
     * User to remove from private channel.
     */
    private String user;

    GroupsKickRequest(String token, String channel, String user) {
        this.token = token;
        this.channel = channel;
        this.user = user;
    }

    public static GroupsKickRequestBuilder builder() {
        return new GroupsKickRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public String getChannel() {
        return this.channel;
    }

    public String getUser() {
        return this.user;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof GroupsKickRequest)) return false;
        final GroupsKickRequest other = (GroupsKickRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$token = this.getToken();
        final Object other$token = other.getToken();
        if (this$token == null ? other$token != null : !this$token.equals(other$token)) return false;
        final Object this$channel = this.getChannel();
        final Object other$channel = other.getChannel();
        if (this$channel == null ? other$channel != null : !this$channel.equals(other$channel)) return false;
        final Object this$user = this.getUser();
        final Object other$user = other.getUser();
        if (this$user == null ? other$user != null : !this$user.equals(other$user)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof GroupsKickRequest;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $token = this.getToken();
        result = result * PRIME + ($token == null ? 43 : $token.hashCode());
        final Object $channel = this.getChannel();
        result = result * PRIME + ($channel == null ? 43 : $channel.hashCode());
        final Object $user = this.getUser();
        result = result * PRIME + ($user == null ? 43 : $user.hashCode());
        return result;
    }

    public String toString() {
        return "GroupsKickRequest(token=" + this.getToken() + ", channel=" + this.getChannel() + ", user=" + this.getUser() + ")";
    }

    public static class GroupsKickRequestBuilder {
        private String token;
        private String channel;
        private String user;

        GroupsKickRequestBuilder() {
        }

        public GroupsKickRequest.GroupsKickRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public GroupsKickRequest.GroupsKickRequestBuilder channel(String channel) {
            this.channel = channel;
            return this;
        }

        public GroupsKickRequest.GroupsKickRequestBuilder user(String user) {
            this.user = user;
            return this;
        }

        public GroupsKickRequest build() {
            return new GroupsKickRequest(token, channel, user);
        }

        public String toString() {
            return "GroupsKickRequest.GroupsKickRequestBuilder(token=" + this.token + ", channel=" + this.channel + ", user=" + this.user + ")";
        }
    }
}