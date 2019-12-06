package com.github.seratch.jslack.api.methods.request.channels;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class ChannelsSetPurposeRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `channels:write`
     */
    private String token;

    /**
     * Channel to set the purpose of
     */
    private String channel;

    /**
     * The new purpose
     */
    private String purpose;

    ChannelsSetPurposeRequest(String token, String channel, String purpose) {
        this.token = token;
        this.channel = channel;
        this.purpose = purpose;
    }

    public static ChannelsSetPurposeRequestBuilder builder() {
        return new ChannelsSetPurposeRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public String getChannel() {
        return this.channel;
    }

    public String getPurpose() {
        return this.purpose;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public static class ChannelsSetPurposeRequestBuilder {
        private String token;
        private String channel;
        private String purpose;

        ChannelsSetPurposeRequestBuilder() {
        }

        public ChannelsSetPurposeRequest.ChannelsSetPurposeRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public ChannelsSetPurposeRequest.ChannelsSetPurposeRequestBuilder channel(String channel) {
            this.channel = channel;
            return this;
        }

        public ChannelsSetPurposeRequest.ChannelsSetPurposeRequestBuilder purpose(String purpose) {
            this.purpose = purpose;
            return this;
        }

        public ChannelsSetPurposeRequest build() {
            return new ChannelsSetPurposeRequest(token, channel, purpose);
        }

        public String toString() {
            return "ChannelsSetPurposeRequest.ChannelsSetPurposeRequestBuilder(token=" + this.token + ", channel=" + this.channel + ", purpose=" + this.purpose + ")";
        }
    }
}