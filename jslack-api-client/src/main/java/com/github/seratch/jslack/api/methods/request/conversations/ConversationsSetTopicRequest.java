package com.github.seratch.jslack.api.methods.request.conversations;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class ConversationsSetTopicRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `conversations:write`
     */
    private String token;

    /**
     * Conversation to set the topic of
     */
    private String channel;

    /**
     * The new topic string. Does not support formatting or linkification.
     */
    private String topic;

    ConversationsSetTopicRequest(String token, String channel, String topic) {
        this.token = token;
        this.channel = channel;
        this.topic = topic;
    }

    public static ConversationsSetTopicRequestBuilder builder() {
        return new ConversationsSetTopicRequestBuilder();
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

    public static class ConversationsSetTopicRequestBuilder {
        private String token;
        private String channel;
        private String topic;

        ConversationsSetTopicRequestBuilder() {
        }

        public ConversationsSetTopicRequest.ConversationsSetTopicRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public ConversationsSetTopicRequest.ConversationsSetTopicRequestBuilder channel(String channel) {
            this.channel = channel;
            return this;
        }

        public ConversationsSetTopicRequest.ConversationsSetTopicRequestBuilder topic(String topic) {
            this.topic = topic;
            return this;
        }

        public ConversationsSetTopicRequest build() {
            return new ConversationsSetTopicRequest(token, channel, topic);
        }

        public String toString() {
            return "ConversationsSetTopicRequest.ConversationsSetTopicRequestBuilder(token=" + this.token + ", channel=" + this.channel + ", topic=" + this.topic + ")";
        }
    }
}
