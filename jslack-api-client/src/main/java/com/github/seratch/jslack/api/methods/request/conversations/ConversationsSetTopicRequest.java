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

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ConversationsSetTopicRequest))
            return false;
        final ConversationsSetTopicRequest other = (ConversationsSetTopicRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$token = this.getToken();
        final Object other$token = other.getToken();
        if (this$token == null ? other$token != null : !this$token.equals(other$token)) return false;
        final Object this$channel = this.getChannel();
        final Object other$channel = other.getChannel();
        if (this$channel == null ? other$channel != null : !this$channel.equals(other$channel)) return false;
        final Object this$topic = this.getTopic();
        final Object other$topic = other.getTopic();
        if (this$topic == null ? other$topic != null : !this$topic.equals(other$topic)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ConversationsSetTopicRequest;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $token = this.getToken();
        result = result * PRIME + ($token == null ? 43 : $token.hashCode());
        final Object $channel = this.getChannel();
        result = result * PRIME + ($channel == null ? 43 : $channel.hashCode());
        final Object $topic = this.getTopic();
        result = result * PRIME + ($topic == null ? 43 : $topic.hashCode());
        return result;
    }

    public String toString() {
        return "ConversationsSetTopicRequest(token=" + this.getToken() + ", channel=" + this.getChannel() + ", topic=" + this.getTopic() + ")";
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
