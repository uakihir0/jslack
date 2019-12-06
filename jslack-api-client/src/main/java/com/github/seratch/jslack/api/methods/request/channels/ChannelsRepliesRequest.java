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