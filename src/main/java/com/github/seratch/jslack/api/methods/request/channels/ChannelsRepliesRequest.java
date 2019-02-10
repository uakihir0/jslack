package com.github.seratch.jslack.api.methods.request.channels;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class ChannelsRepliesRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `channels:history`
     */
    private String token;

    /**
     * Channel to fetch thread from
     */
    private String channel;

    /**
     * Unique identifier of a thread's parent message
     */
    private String threadTs;

    @java.beans.ConstructorProperties({"token", "channel", "threadTs"})
    ChannelsRepliesRequest(String token, String channel, String threadTs) {
        this.token = token;
        this.channel = channel;
        this.threadTs = threadTs;
    }

    public static ChannelsRepliesRequestBuilder builder() {
        return new ChannelsRepliesRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public String getChannel() {
        return this.channel;
    }

    public String getThreadTs() {
        return this.threadTs;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public void setThreadTs(String threadTs) {
        this.threadTs = threadTs;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ChannelsRepliesRequest)) return false;
        final ChannelsRepliesRequest other = (ChannelsRepliesRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$token = this.getToken();
        final Object other$token = other.getToken();
        if (this$token == null ? other$token != null : !this$token.equals(other$token)) return false;
        final Object this$channel = this.getChannel();
        final Object other$channel = other.getChannel();
        if (this$channel == null ? other$channel != null : !this$channel.equals(other$channel)) return false;
        final Object this$threadTs = this.getThreadTs();
        final Object other$threadTs = other.getThreadTs();
        if (this$threadTs == null ? other$threadTs != null : !this$threadTs.equals(other$threadTs)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ChannelsRepliesRequest;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $token = this.getToken();
        result = result * PRIME + ($token == null ? 43 : $token.hashCode());
        final Object $channel = this.getChannel();
        result = result * PRIME + ($channel == null ? 43 : $channel.hashCode());
        final Object $threadTs = this.getThreadTs();
        result = result * PRIME + ($threadTs == null ? 43 : $threadTs.hashCode());
        return result;
    }

    public String toString() {
        return "ChannelsRepliesRequest(token=" + this.getToken() + ", channel=" + this.getChannel() + ", threadTs=" + this.getThreadTs() + ")";
    }

    public static class ChannelsRepliesRequestBuilder {
        private String token;
        private String channel;
        private String threadTs;

        ChannelsRepliesRequestBuilder() {
        }

        public ChannelsRepliesRequest.ChannelsRepliesRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public ChannelsRepliesRequest.ChannelsRepliesRequestBuilder channel(String channel) {
            this.channel = channel;
            return this;
        }

        public ChannelsRepliesRequest.ChannelsRepliesRequestBuilder threadTs(String threadTs) {
            this.threadTs = threadTs;
            return this;
        }

        public ChannelsRepliesRequest build() {
            return new ChannelsRepliesRequest(token, channel, threadTs);
        }

        public String toString() {
            return "ChannelsRepliesRequest.ChannelsRepliesRequestBuilder(token=" + this.token + ", channel=" + this.channel + ", threadTs=" + this.threadTs + ")";
        }
    }
}