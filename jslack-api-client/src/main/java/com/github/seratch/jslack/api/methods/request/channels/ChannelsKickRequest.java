package com.github.seratch.jslack.api.methods.request.channels;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class ChannelsKickRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `channels:write`
     */
    private String token;

    /**
     * User to remove from channel.
     */
    private String channel;

    /**
     * Channel to remove user from.
     */
    private String user;

    ChannelsKickRequest(String token, String channel, String user) {
        this.token = token;
        this.channel = channel;
        this.user = user;
    }

    public static ChannelsKickRequestBuilder builder() {
        return new ChannelsKickRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public String getChannel() {
        return this.channel;
    }

    public String getUser() {
        return this.user;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public static class ChannelsKickRequestBuilder {
        private String token;
        private String channel;
        private String user;

        ChannelsKickRequestBuilder() {
        }

        public ChannelsKickRequest.ChannelsKickRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public ChannelsKickRequest.ChannelsKickRequestBuilder channel(String channel) {
            this.channel = channel;
            return this;
        }

        public ChannelsKickRequest.ChannelsKickRequestBuilder user(String user) {
            this.user = user;
            return this;
        }

        public ChannelsKickRequest build() {
            return new ChannelsKickRequest(token, channel, user);
        }

        public String toString() {
            return "ChannelsKickRequest.ChannelsKickRequestBuilder(token=" + this.token + ", channel=" + this.channel + ", user=" + this.user + ")";
        }
    }
}