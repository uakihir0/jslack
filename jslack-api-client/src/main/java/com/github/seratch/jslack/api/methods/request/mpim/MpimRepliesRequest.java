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