package com.github.seratch.jslack.api.methods.request.conversations;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class ConversationsKickRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `conversations:write`
     */
    private String token;

    /**
     * ID of conversation to remove user from.
     */
    private String channel;

    /**
     * User ID to be removed.
     */
    private String user;

    @java.beans.ConstructorProperties({"token", "channel", "user"})
    ConversationsKickRequest(String token, String channel, String user) {
        this.token = token;
        this.channel = channel;
        this.user = user;
    }

    public static ConversationsKickRequestBuilder builder() {
        return new ConversationsKickRequestBuilder();
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
        if (!(o instanceof ConversationsKickRequest))
            return false;
        final ConversationsKickRequest other = (ConversationsKickRequest) o;
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
        return other instanceof ConversationsKickRequest;
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
        return "ConversationsKickRequest(token=" + this.getToken() + ", channel=" + this.getChannel() + ", user=" + this.getUser() + ")";
    }

    public static class ConversationsKickRequestBuilder {
        private String token;
        private String channel;
        private String user;

        ConversationsKickRequestBuilder() {
        }

        public ConversationsKickRequest.ConversationsKickRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public ConversationsKickRequest.ConversationsKickRequestBuilder channel(String channel) {
            this.channel = channel;
            return this;
        }

        public ConversationsKickRequest.ConversationsKickRequestBuilder user(String user) {
            this.user = user;
            return this;
        }

        public ConversationsKickRequest build() {
            return new ConversationsKickRequest(token, channel, user);
        }

        public String toString() {
            return "ConversationsKickRequest.ConversationsKickRequestBuilder(token=" + this.token + ", channel=" + this.channel + ", user=" + this.user + ")";
        }
    }
}
