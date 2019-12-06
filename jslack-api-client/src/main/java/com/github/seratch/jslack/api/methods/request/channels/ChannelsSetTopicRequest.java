package com.github.seratch.jslack.api.methods.request.channels;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class ChannelsSetTopicRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `channels:write`
     */
    private String token;

    /**
     * Channel to set the topic of
     */
    private String channel;

    /**
     * The new topic
     */
    private String topic;

    ChannelsSetTopicRequest(String token, String channel, String topic) {
        this.token = token;
        this.channel = channel;
        this.topic = topic;
    }

    public static ChannelsSetTopicRequestBuilder builder() {
        return new ChannelsSetTopicRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public String getChannel() {
        return this.channel;
    }

    public String getTopic() {
        return this.topic;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public static class ChannelsSetTopicRequestBuilder {
        private String token;
        private String channel;
        private String topic;

        ChannelsSetTopicRequestBuilder() {
        }

        public ChannelsSetTopicRequest.ChannelsSetTopicRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public ChannelsSetTopicRequest.ChannelsSetTopicRequestBuilder channel(String channel) {
            this.channel = channel;
            return this;
        }

        public ChannelsSetTopicRequest.ChannelsSetTopicRequestBuilder topic(String topic) {
            this.topic = topic;
            return this;
        }

        public ChannelsSetTopicRequest build() {
            return new ChannelsSetTopicRequest(token, channel, topic);
        }

        public String toString() {
            return "ChannelsSetTopicRequest.ChannelsSetTopicRequestBuilder(token=" + this.token + ", channel=" + this.channel + ", topic=" + this.topic + ")";
        }
    }
}