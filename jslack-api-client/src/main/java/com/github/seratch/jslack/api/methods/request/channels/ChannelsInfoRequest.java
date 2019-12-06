package com.github.seratch.jslack.api.methods.request.channels;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class ChannelsInfoRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `channels:read`
     */
    private String token;

    /**
     * Set this to `true` to receive the locale for this channel. Defaults to `false`
     */
    private boolean includeLocale;

    /**
     * Channel to get info on
     */
    private String channel;

    ChannelsInfoRequest(String token, boolean includeLocale, String channel) {
        this.token = token;
        this.includeLocale = includeLocale;
        this.channel = channel;
    }

    public static ChannelsInfoRequestBuilder builder() {
        return new ChannelsInfoRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public boolean isIncludeLocale() {
        return this.includeLocale;
    }

    public String getChannel() {
        return this.channel;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setIncludeLocale(boolean includeLocale) {
        this.includeLocale = includeLocale;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public static class ChannelsInfoRequestBuilder {
        private String token;
        private boolean includeLocale;
        private String channel;

        ChannelsInfoRequestBuilder() {
        }

        public ChannelsInfoRequest.ChannelsInfoRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public ChannelsInfoRequest.ChannelsInfoRequestBuilder includeLocale(boolean includeLocale) {
            this.includeLocale = includeLocale;
            return this;
        }

        public ChannelsInfoRequest.ChannelsInfoRequestBuilder channel(String channel) {
            this.channel = channel;
            return this;
        }

        public ChannelsInfoRequest build() {
            return new ChannelsInfoRequest(token, includeLocale, channel);
        }

        public String toString() {
            return "ChannelsInfoRequest.ChannelsInfoRequestBuilder(token=" + this.token + ", includeLocale=" + this.includeLocale + ", channel=" + this.channel + ")";
        }
    }
}