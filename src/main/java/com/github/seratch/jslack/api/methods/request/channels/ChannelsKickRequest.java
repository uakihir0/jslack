package com.github.seratch.jslack.api.methods.request.channels;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class ChannelsKickRequest implements SlackApiRequest {

    private String token;
    private String channel;
    private String user;

    ChannelsKickRequest(String token, String channel, String user) {
        this.token = token;
        this.channel = channel;
        this.user = user;
    }

    public static ChannelsKickRequestBuilder builder() {
        return new ChannelsKickRequestBuilder();
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

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof ChannelsKickRequest)) return false;
        final ChannelsKickRequest other = (ChannelsKickRequest) o;
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

    protected boolean canEqual(Object other) {
        return other instanceof ChannelsKickRequest;
    }

    public String toString() {
        return "ChannelsKickRequest(token=" + this.getToken() + ", channel=" + this.getChannel() + ", user=" + this.getUser() + ")";
    }

    public static class ChannelsKickRequestBuilder {
        private String token;
        private String channel;
        private String user;

        ChannelsKickRequestBuilder() {
        }

        public ChannelsKickRequest.ChannelsKickRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public ChannelsKickRequest.ChannelsKickRequestBuilder channel(String channel) {
            this.channel = channel;
            return this;
        }

        public ChannelsKickRequest.ChannelsKickRequestBuilder user(String user) {
            this.user = user;
            return this;
        }

        public ChannelsKickRequest build() {
            return new ChannelsKickRequest(token, channel, user);
        }

        public String toString() {
            return "ChannelsKickRequest.ChannelsKickRequestBuilder(token=" + this.token + ", channel=" + this.channel + ", user=" + this.user + ")";
        }
    }
}