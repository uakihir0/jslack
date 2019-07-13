package com.github.seratch.jslack.api.methods.request.groups;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class GroupsInviteRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `groups:write`
     */
    private String token;

    /**
     * Private channel to invite user to.
     */
    private String channel;

    /**
     * User to invite.
     */
    private String user;

    GroupsInviteRequest(String token, String channel, String user) {
        this.token = token;
        this.channel = channel;
        this.user = user;
    }

    public static GroupsInviteRequestBuilder builder() {
        return new GroupsInviteRequestBuilder();
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
        if (!(o instanceof GroupsInviteRequest)) return false;
        final GroupsInviteRequest other = (GroupsInviteRequest) o;
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
        return other instanceof GroupsInviteRequest;
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
        return "GroupsInviteRequest(token=" + this.getToken() + ", channel=" + this.getChannel() + ", user=" + this.getUser() + ")";
    }

    public static class GroupsInviteRequestBuilder {
        private String token;
        private String channel;
        private String user;

        GroupsInviteRequestBuilder() {
        }

        public GroupsInviteRequest.GroupsInviteRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public GroupsInviteRequest.GroupsInviteRequestBuilder channel(String channel) {
            this.channel = channel;
            return this;
        }

        public GroupsInviteRequest.GroupsInviteRequestBuilder user(String user) {
            this.user = user;
            return this;
        }

        public GroupsInviteRequest build() {
            return new GroupsInviteRequest(token, channel, user);
        }

        public String toString() {
            return "GroupsInviteRequest.GroupsInviteRequestBuilder(token=" + this.token + ", channel=" + this.channel + ", user=" + this.user + ")";
        }
    }
}