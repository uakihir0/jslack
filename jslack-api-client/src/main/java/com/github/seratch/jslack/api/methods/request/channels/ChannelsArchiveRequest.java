package com.github.seratch.jslack.api.methods.request.channels;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class ChannelsArchiveRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `channels:write`
     */
    private String token;

    /**
     * Channel to archive
     */
    private String channel;

    ChannelsArchiveRequest(String token, String channel) {
        this.token = token;
        this.channel = channel;
    }

    public static ChannelsArchiveRequestBuilder builder() {
        return new ChannelsArchiveRequestBuilder();
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

    public static class ChannelsArchiveRequestBuilder {
        private String token;
        private String channel;

        ChannelsArchiveRequestBuilder() {
        }

        public ChannelsArchiveRequest.ChannelsArchiveRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public ChannelsArchiveRequest.ChannelsArchiveRequestBuilder channel(String channel) {
            this.channel = channel;
            return this;
        }

        public ChannelsArchiveRequest build() {
            return new ChannelsArchiveRequest(token, channel);
        }

        public String toString() {
            return "ChannelsArchiveRequest.ChannelsArchiveRequestBuilder(token=" + this.token + ", channel=" + this.channel + ")";
        }
    }
}