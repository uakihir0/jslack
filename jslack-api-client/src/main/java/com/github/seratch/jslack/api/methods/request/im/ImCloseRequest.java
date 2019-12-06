package com.github.seratch.jslack.api.methods.request.im;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class ImCloseRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `im:write`
     */
    private String token;

    /**
     * Direct message channel to close.
     */
    private String channel;

    ImCloseRequest(String token, String channel) {
        this.token = token;
        this.channel = channel;
    }

    public static ImCloseRequestBuilder builder() {
        return new ImCloseRequestBuilder();
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

    public static class ImCloseRequestBuilder {
        private String token;
        private String channel;

        ImCloseRequestBuilder() {
        }

        public ImCloseRequest.ImCloseRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public ImCloseRequest.ImCloseRequestBuilder channel(String channel) {
            this.channel = channel;
            return this;
        }

        public ImCloseRequest build() {
            return new ImCloseRequest(token, channel);
        }

        public String toString() {
            return "ImCloseRequest.ImCloseRequestBuilder(token=" + this.token + ", channel=" + this.channel + ")";
        }
    }
}