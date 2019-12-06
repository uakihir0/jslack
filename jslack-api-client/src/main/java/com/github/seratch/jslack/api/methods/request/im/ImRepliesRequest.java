package com.github.seratch.jslack.api.methods.request.im;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class ImRepliesRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `im:history`
     */
    private String token;

    /**
     * Direct message channel to fetch thread from.
     */
    private String channel;

    /**
     * Unique identifier of a thread's parent message.
     */
    private String threadTs;

    ImRepliesRequest(String token, String channel, String threadTs) {
        this.token = token;
        this.channel = channel;
        this.threadTs = threadTs;
    }

    public static ImRepliesRequestBuilder builder() {
        return new ImRepliesRequestBuilder();
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

    public static class ImRepliesRequestBuilder {
        private String token;
        private String channel;
        private String threadTs;

        ImRepliesRequestBuilder() {
        }

        public ImRepliesRequest.ImRepliesRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public ImRepliesRequest.ImRepliesRequestBuilder channel(String channel) {
            this.channel = channel;
            return this;
        }

        public ImRepliesRequest.ImRepliesRequestBuilder threadTs(String threadTs) {
            this.threadTs = threadTs;
            return this;
        }

        public ImRepliesRequest build() {
            return new ImRepliesRequest(token, channel, threadTs);
        }

        public String toString() {
            return "ImRepliesRequest.ImRepliesRequestBuilder(token=" + this.token + ", channel=" + this.channel + ", threadTs=" + this.threadTs + ")";
        }
    }
}