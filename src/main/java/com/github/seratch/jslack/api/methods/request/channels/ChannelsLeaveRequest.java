package com.github.seratch.jslack.api.methods.request.channels;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class ChannelsLeaveRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `channels:write`
     */
    private String token;

    /**
     * Channel to leave
     */
    private String channel;

    @java.beans.ConstructorProperties({"token", "channel"})
    ChannelsLeaveRequest(String token, String channel) {
        this.token = token;
        this.channel = channel;
    }

    public static ChannelsLeaveRequestBuilder builder() {
        return new ChannelsLeaveRequestBuilder();
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
        if (!(o instanceof ChannelsLeaveRequest)) return false;
        final ChannelsLeaveRequest other = (ChannelsLeaveRequest) o;
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
        return other instanceof ChannelsLeaveRequest;
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
        return "ChannelsLeaveRequest(token=" + this.getToken() + ", channel=" + this.getChannel() + ")";
    }

    public static class ChannelsLeaveRequestBuilder {
        private String token;
        private String channel;

        ChannelsLeaveRequestBuilder() {
        }

        public ChannelsLeaveRequest.ChannelsLeaveRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public ChannelsLeaveRequest.ChannelsLeaveRequestBuilder channel(String channel) {
            this.channel = channel;
            return this;
        }

        public ChannelsLeaveRequest build() {
            return new ChannelsLeaveRequest(token, channel);
        }

        public String toString() {
            return "ChannelsLeaveRequest.ChannelsLeaveRequestBuilder(token=" + this.token + ", channel=" + this.channel + ")";
        }
    }
}