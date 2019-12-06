package com.github.seratch.jslack.api.methods.request.channels;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class ChannelsUnarchiveRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `channels:write`
     */
    private String token;

    /**
     * Channel to unarchive
     */
    private String channel;

    ChannelsUnarchiveRequest(String token, String channel) {
        this.token = token;
        this.channel = channel;
    }

    public static ChannelsUnarchiveRequestBuilder builder() {
        return new ChannelsUnarchiveRequestBuilder();
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

    public static class ChannelsUnarchiveRequestBuilder {
        private String token;
        private String channel;

        ChannelsUnarchiveRequestBuilder() {
        }

        public ChannelsUnarchiveRequest.ChannelsUnarchiveRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public ChannelsUnarchiveRequest.ChannelsUnarchiveRequestBuilder channel(String channel) {
            this.channel = channel;
            return this;
        }

        public ChannelsUnarchiveRequest build() {
            return new ChannelsUnarchiveRequest(token, channel);
        }

        public String toString() {
            return "ChannelsUnarchiveRequest.ChannelsUnarchiveRequestBuilder(token=" + this.token + ", channel=" + this.channel + ")";
        }
    }
}