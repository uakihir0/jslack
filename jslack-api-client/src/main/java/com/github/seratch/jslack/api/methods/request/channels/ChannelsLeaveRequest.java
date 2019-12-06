package com.github.seratch.jslack.api.methods.request.channels;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class ChannelsLeaveRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `channels:write`
     */
    private String token;

    /**
     * Channel to leave
     */
    private String channel;

    ChannelsLeaveRequest(String token, String channel) {
        this.token = token;
        this.channel = channel;
    }

    public static ChannelsLeaveRequestBuilder builder() {
        return new ChannelsLeaveRequestBuilder();
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

    public static class ChannelsLeaveRequestBuilder {
        private String token;
        private String channel;

        ChannelsLeaveRequestBuilder() {
        }

        public ChannelsLeaveRequest.ChannelsLeaveRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public ChannelsLeaveRequest.ChannelsLeaveRequestBuilder channel(String channel) {
            this.channel = channel;
            return this;
        }

        public ChannelsLeaveRequest build() {
            return new ChannelsLeaveRequest(token, channel);
        }

        public String toString() {
            return "ChannelsLeaveRequest.ChannelsLeaveRequestBuilder(token=" + this.token + ", channel=" + this.channel + ")";
        }
    }
}