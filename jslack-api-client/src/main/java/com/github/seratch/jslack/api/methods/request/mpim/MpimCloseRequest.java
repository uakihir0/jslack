package com.github.seratch.jslack.api.methods.request.mpim;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class MpimCloseRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `mpim:write`
     */
    private String token;

    /**
     * MPIM to close.
     */
    private String channel;

    MpimCloseRequest(String token, String channel) {
        this.token = token;
        this.channel = channel;
    }

    public static MpimCloseRequestBuilder builder() {
        return new MpimCloseRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public String getChannel() {
        return this.channel;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public static class MpimCloseRequestBuilder {
        private String token;
        private String channel;

        MpimCloseRequestBuilder() {
        }

        public MpimCloseRequest.MpimCloseRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public MpimCloseRequest.MpimCloseRequestBuilder channel(String channel) {
            this.channel = channel;
            return this;
        }

        public MpimCloseRequest build() {
            return new MpimCloseRequest(token, channel);
        }

        public String toString() {
            return "MpimCloseRequest.MpimCloseRequestBuilder(token=" + this.token + ", channel=" + this.channel + ")";
        }
    }
}