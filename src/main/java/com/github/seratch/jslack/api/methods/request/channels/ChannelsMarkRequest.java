package com.github.seratch.jslack.api.methods.request.channels;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class ChannelsMarkRequest implements SlackApiRequest {

    private String token;
    private String channel;
    private String ts;

    @java.beans.ConstructorProperties({"token", "channel", "ts"})
    ChannelsMarkRequest(String token, String channel, String ts) {
        this.token = token;
        this.channel = channel;
        this.ts = ts;
    }

    public static ChannelsMarkRequestBuilder builder() {
        return new ChannelsMarkRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public String getChannel() {
        return this.channel;
    }

    public String getTs() {
        return this.ts;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public void setTs(String ts) {
        this.ts = ts;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof ChannelsMarkRequest)) return false;
        final ChannelsMarkRequest other = (ChannelsMarkRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$token = this.getToken();
        final Object other$token = other.getToken();
        if (this$token == null ? other$token != null : !this$token.equals(other$token)) return false;
        final Object this$channel = this.getChannel();
        final Object other$channel = other.getChannel();
        if (this$channel == null ? other$channel != null : !this$channel.equals(other$channel)) return false;
        final Object this$ts = this.getTs();
        final Object other$ts = other.getTs();
        if (this$ts == null ? other$ts != null : !this$ts.equals(other$ts)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $token = this.getToken();
        result = result * PRIME + ($token == null ? 43 : $token.hashCode());
        final Object $channel = this.getChannel();
        result = result * PRIME + ($channel == null ? 43 : $channel.hashCode());
        final Object $ts = this.getTs();
        result = result * PRIME + ($ts == null ? 43 : $ts.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof ChannelsMarkRequest;
    }

    public String toString() {
        return "ChannelsMarkRequest(token=" + this.getToken() + ", channel=" + this.getChannel() + ", ts=" + this.getTs() + ")";
    }

    public static class ChannelsMarkRequestBuilder {
        private String token;
        private String channel;
        private String ts;

        ChannelsMarkRequestBuilder() {
        }

        public ChannelsMarkRequest.ChannelsMarkRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public ChannelsMarkRequest.ChannelsMarkRequestBuilder channel(String channel) {
            this.channel = channel;
            return this;
        }

        public ChannelsMarkRequest.ChannelsMarkRequestBuilder ts(String ts) {
            this.ts = ts;
            return this;
        }

        public ChannelsMarkRequest build() {
            return new ChannelsMarkRequest(token, channel, ts);
        }

        public String toString() {
            return "ChannelsMarkRequest.ChannelsMarkRequestBuilder(token=" + this.token + ", channel=" + this.channel + ", ts=" + this.ts + ")";
        }
    }
}