package com.github.seratch.jslack.api.methods.request.conversations;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class ConversationsJoinRequest implements SlackApiRequest {

    private String token;
    private String channel;

    ConversationsJoinRequest(String token, String channel) {
        this.token = token;
        this.channel = channel;
    }

    public static ConversationsJoinRequestBuilder builder() {
        return new ConversationsJoinRequestBuilder();
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
        if (!(o instanceof ConversationsJoinRequest)) return false;
        final ConversationsJoinRequest other = (ConversationsJoinRequest) o;
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
        return other instanceof ConversationsJoinRequest;
    }

    public String toString() {
        return "ConversationsJoinRequest(token=" + this.getToken() + ", channel=" + this.getChannel() + ")";
    }

    public static class ConversationsJoinRequestBuilder {
        private String token;
        private String channel;

        ConversationsJoinRequestBuilder() {
        }

        public ConversationsJoinRequest.ConversationsJoinRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public ConversationsJoinRequest.ConversationsJoinRequestBuilder channel(String channel) {
            this.channel = channel;
            return this;
        }

        public ConversationsJoinRequest build() {
            return new ConversationsJoinRequest(token, channel);
        }

        public String toString() {
            return "ConversationsJoinRequest.ConversationsJoinRequestBuilder(token=" + this.token + ", channel=" + this.channel + ")";
        }
    }
}
