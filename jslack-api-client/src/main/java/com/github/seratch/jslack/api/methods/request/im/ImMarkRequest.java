package com.github.seratch.jslack.api.methods.request.im;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class ImMarkRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `im:write`
     */
    private String token;

    /**
     * Direct message channel to set reading cursor in.
     */
    private String channel;

    /**
     * Timestamp of the most recently seen message.
     */
    private String ts;

    ImMarkRequest(String token, String channel, String ts) {
        this.token = token;
        this.channel = channel;
        this.ts = ts;
    }

    public static ImMarkRequestBuilder builder() {
        return new ImMarkRequestBuilder();
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

    public static class ImMarkRequestBuilder {
        private String token;
        private String channel;
        private String ts;

        ImMarkRequestBuilder() {
        }

        public ImMarkRequest.ImMarkRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public ImMarkRequest.ImMarkRequestBuilder channel(String channel) {
            this.channel = channel;
            return this;
        }

        public ImMarkRequest.ImMarkRequestBuilder ts(String ts) {
            this.ts = ts;
            return this;
        }

        public ImMarkRequest build() {
            return new ImMarkRequest(token, channel, ts);
        }

        public String toString() {
            return "ImMarkRequest.ImMarkRequestBuilder(token=" + this.token + ", channel=" + this.channel + ", ts=" + this.ts + ")";
        }
    }
}