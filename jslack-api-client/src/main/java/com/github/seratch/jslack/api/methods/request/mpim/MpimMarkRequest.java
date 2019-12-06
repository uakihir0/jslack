package com.github.seratch.jslack.api.methods.request.mpim;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class MpimMarkRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `mpim:write`
     */
    private String token;

    /**
     * multiparty direct message channel to set reading cursor in.
     */
    private String channel;

    /**
     * Timestamp of the most recently seen message.
     */
    private String ts;

    MpimMarkRequest(String token, String channel, String ts) {
        this.token = token;
        this.channel = channel;
        this.ts = ts;
    }

    public static MpimMarkRequestBuilder builder() {
        return new MpimMarkRequestBuilder();
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

    public static class MpimMarkRequestBuilder {
        private String token;
        private String channel;
        private String ts;

        MpimMarkRequestBuilder() {
        }

        public MpimMarkRequest.MpimMarkRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public MpimMarkRequest.MpimMarkRequestBuilder channel(String channel) {
            this.channel = channel;
            return this;
        }

        public MpimMarkRequest.MpimMarkRequestBuilder ts(String ts) {
            this.ts = ts;
            return this;
        }

        public MpimMarkRequest build() {
            return new MpimMarkRequest(token, channel, ts);
        }

        public String toString() {
            return "MpimMarkRequest.MpimMarkRequestBuilder(token=" + this.token + ", channel=" + this.channel + ", ts=" + this.ts + ")";
        }
    }
}