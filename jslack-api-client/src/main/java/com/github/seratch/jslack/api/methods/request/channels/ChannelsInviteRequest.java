package com.github.seratch.jslack.api.methods.request.channels;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class ChannelsInviteRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `channels:write`
     */
    private String token;

    /**
     * Channel to invite user to.
     */
    private String channel;

    /**
     * User to invite to channel.
     */
    private String user;

    ChannelsInviteRequest(String token, String channel, String user) {
        this.token = token;
        this.channel = channel;
        this.user = user;
    }

    public static ChannelsInviteRequestBuilder builder() {
        return new ChannelsInviteRequestBuilder();
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

    public static class ChannelsInviteRequestBuilder {
        private String token;
        private String channel;
        private String user;

        ChannelsInviteRequestBuilder() {
        }

        public ChannelsInviteRequest.ChannelsInviteRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public ChannelsInviteRequest.ChannelsInviteRequestBuilder channel(String channel) {
            this.channel = channel;
            return this;
        }

        public ChannelsInviteRequest.ChannelsInviteRequestBuilder user(String user) {
            this.user = user;
            return this;
        }

        public ChannelsInviteRequest build() {
            return new ChannelsInviteRequest(token, channel, user);
        }

        public String toString() {
            return "ChannelsInviteRequest.ChannelsInviteRequestBuilder(token=" + this.token + ", channel=" + this.channel + ", user=" + this.user + ")";
        }
    }
}