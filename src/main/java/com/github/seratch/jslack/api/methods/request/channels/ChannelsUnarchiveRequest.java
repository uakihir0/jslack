package com.github.seratch.jslack.api.methods.request.channels;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class ChannelsUnarchiveRequest implements SlackApiRequest {

    private String token;
    private String channel;

    ChannelsUnarchiveRequest(String token, String channel) {
        this.token = token;
        this.channel = channel;
    }

    public static ChannelsUnarchiveRequestBuilder builder() {
        return new ChannelsUnarchiveRequestBuilder();
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
        if (!(o instanceof ChannelsUnarchiveRequest)) return false;
        final ChannelsUnarchiveRequest other = (ChannelsUnarchiveRequest) o;
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
        return other instanceof ChannelsUnarchiveRequest;
    }

    public String toString() {
        return "ChannelsUnarchiveRequest(token=" + this.getToken() + ", channel=" + this.getChannel() + ")";
    }

    public static class ChannelsUnarchiveRequestBuilder {
        private String token;
        private String channel;

        ChannelsUnarchiveRequestBuilder() {
        }

        public ChannelsUnarchiveRequest.ChannelsUnarchiveRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public ChannelsUnarchiveRequest.ChannelsUnarchiveRequestBuilder channel(String channel) {
            this.channel = channel;
            return this;
        }

        public ChannelsUnarchiveRequest build() {
            return new ChannelsUnarchiveRequest(token, channel);
        }

        public String toString() {
            return "ChannelsUnarchiveRequest.ChannelsUnarchiveRequestBuilder(token=" + this.token + ", channel=" + this.channel + ")";
        }
    }
}