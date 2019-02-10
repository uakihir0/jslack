package com.github.seratch.jslack.api.methods.request.channels;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class ChannelsArchiveRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `channels:write`
     */
    private String token;

    /**
     * Channel to archive
     */
    private String channel;

    @java.beans.ConstructorProperties({"token", "channel"})
    ChannelsArchiveRequest(String token, String channel) {
        this.token = token;
        this.channel = channel;
    }

    public static ChannelsArchiveRequestBuilder builder() {
        return new ChannelsArchiveRequestBuilder();
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
        if (!(o instanceof ChannelsArchiveRequest)) return false;
        final ChannelsArchiveRequest other = (ChannelsArchiveRequest) o;
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
        return other instanceof ChannelsArchiveRequest;
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
        return "ChannelsArchiveRequest(token=" + this.getToken() + ", channel=" + this.getChannel() + ")";
    }

    public static class ChannelsArchiveRequestBuilder {
        private String token;
        private String channel;

        ChannelsArchiveRequestBuilder() {
        }

        public ChannelsArchiveRequest.ChannelsArchiveRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public ChannelsArchiveRequest.ChannelsArchiveRequestBuilder channel(String channel) {
            this.channel = channel;
            return this;
        }

        public ChannelsArchiveRequest build() {
            return new ChannelsArchiveRequest(token, channel);
        }

        public String toString() {
            return "ChannelsArchiveRequest.ChannelsArchiveRequestBuilder(token=" + this.token + ", channel=" + this.channel + ")";
        }
    }
}