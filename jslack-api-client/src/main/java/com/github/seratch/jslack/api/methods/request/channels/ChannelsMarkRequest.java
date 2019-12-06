package com.github.seratch.jslack.api.methods.request.channels;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class ChannelsMarkRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `groups:write`
     */
    private String token;

    /**
     * Private channel to set reading cursor in.
     */
    private String channel;

    /**
     * Timestamp of the most recently seen message.
     */
    private String ts;

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