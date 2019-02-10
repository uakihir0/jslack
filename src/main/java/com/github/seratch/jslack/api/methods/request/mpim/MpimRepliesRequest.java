package com.github.seratch.jslack.api.methods.request.mpim;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class MpimRepliesRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `mpim:history`
     */
    private String token;

    /**
     * Multiparty direct message channel to fetch thread from.
     */
    private String channel;

    /**
     * Unique identifier of a thread's parent message.
     */
    private String threadTs;

    MpimRepliesRequest(String token, String channel, String threadTs) {
        this.token = token;
        this.channel = channel;
        this.threadTs = threadTs;
    }

    public static MpimRepliesRequestBuilder builder() {
        return new MpimRepliesRequestBuilder();
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
        if (!(o instanceof MpimRepliesRequest)) return false;
        final MpimRepliesRequest other = (MpimRepliesRequest) o;
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
        return other instanceof MpimRepliesRequest;
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
        return "MpimRepliesRequest(token=" + this.getToken() + ", channel=" + this.getChannel() + ", threadTs=" + this.getThreadTs() + ")";
    }

    public static class MpimRepliesRequestBuilder {
        private String token;
        private String channel;
        private String threadTs;

        MpimRepliesRequestBuilder() {
        }

        public MpimRepliesRequest.MpimRepliesRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public MpimRepliesRequest.MpimRepliesRequestBuilder channel(String channel) {
            this.channel = channel;
            return this;
        }

        public MpimRepliesRequest.MpimRepliesRequestBuilder threadTs(String threadTs) {
            this.threadTs = threadTs;
            return this;
        }

        public MpimRepliesRequest build() {
            return new MpimRepliesRequest(token, channel, threadTs);
        }

        public String toString() {
            return "MpimRepliesRequest.MpimRepliesRequestBuilder(token=" + this.token + ", channel=" + this.channel + ", threadTs=" + this.threadTs + ")";
        }
    }
}