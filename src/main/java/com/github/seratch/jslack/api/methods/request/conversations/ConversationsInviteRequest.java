package com.github.seratch.jslack.api.methods.request.conversations;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

import java.util.List;

public class ConversationsInviteRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `conversations:write`
     */
    private String token;

    /**
     * The ID of the public or private channel to invite user(s) to.
     */
    private String channel;

    /**
     * A comma separated list of user IDs. Up to 30 users may be listed.
     */
    private List<String> users;

    @java.beans.ConstructorProperties({"token", "channel", "users"})
    ConversationsInviteRequest(String token, String channel, List<String> users) {
        this.token = token;
        this.channel = channel;
        this.users = users;
    }

    public static ConversationsInviteRequestBuilder builder() {
        return new ConversationsInviteRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public String getChannel() {
        return this.channel;
    }

    public List<String> getUsers() {
        return this.users;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public void setUsers(List<String> users) {
        this.users = users;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ConversationsInviteRequest))
            return false;
        final ConversationsInviteRequest other = (ConversationsInviteRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$token = this.getToken();
        final Object other$token = other.getToken();
        if (this$token == null ? other$token != null : !this$token.equals(other$token)) return false;
        final Object this$channel = this.getChannel();
        final Object other$channel = other.getChannel();
        if (this$channel == null ? other$channel != null : !this$channel.equals(other$channel)) return false;
        final Object this$users = this.getUsers();
        final Object other$users = other.getUsers();
        if (this$users == null ? other$users != null : !this$users.equals(other$users)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ConversationsInviteRequest;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $token = this.getToken();
        result = result * PRIME + ($token == null ? 43 : $token.hashCode());
        final Object $channel = this.getChannel();
        result = result * PRIME + ($channel == null ? 43 : $channel.hashCode());
        final Object $users = this.getUsers();
        result = result * PRIME + ($users == null ? 43 : $users.hashCode());
        return result;
    }

    public String toString() {
        return "ConversationsInviteRequest(token=" + this.getToken() + ", channel=" + this.getChannel() + ", users=" + this.getUsers() + ")";
    }

    public static class ConversationsInviteRequestBuilder {
        private String token;
        private String channel;
        private List<String> users;

        ConversationsInviteRequestBuilder() {
        }

        public ConversationsInviteRequest.ConversationsInviteRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public ConversationsInviteRequest.ConversationsInviteRequestBuilder channel(String channel) {
            this.channel = channel;
            return this;
        }

        public ConversationsInviteRequest.ConversationsInviteRequestBuilder users(List<String> users) {
            this.users = users;
            return this;
        }

        public ConversationsInviteRequest build() {
            return new ConversationsInviteRequest(token, channel, users);
        }

        public String toString() {
            return "ConversationsInviteRequest.ConversationsInviteRequestBuilder(token=" + this.token + ", channel=" + this.channel + ", users=" + this.users + ")";
        }
    }
}
