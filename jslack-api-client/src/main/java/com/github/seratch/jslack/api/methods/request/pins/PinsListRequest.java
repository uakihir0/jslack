package com.github.seratch.jslack.api.methods.request.pins;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class PinsListRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `pins:read`
     */
    private String token;

    /**
     * Channel to get pinned items for.
     */
    private String channel;

    PinsListRequest(String token, String channel) {
        this.token = token;
        this.channel = channel;
    }

    public static PinsListRequestBuilder builder() {
        return new PinsListRequestBuilder();
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

    public static class PinsListRequestBuilder {
        private String token;
        private String channel;

        PinsListRequestBuilder() {
        }

        public PinsListRequest.PinsListRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public PinsListRequest.PinsListRequestBuilder channel(String channel) {
            this.channel = channel;
            return this;
        }

        public PinsListRequest build() {
            return new PinsListRequest(token, channel);
        }

        public String toString() {
            return "PinsListRequest.PinsListRequestBuilder(token=" + this.token + ", channel=" + this.channel + ")";
        }
    }
}