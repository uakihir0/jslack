package com.github.seratch.jslack.api.methods.request.groups;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class GroupsSetTopicRequest implements SlackApiRequest {

    private String token;
    private String channel;
    private String topic;

    @java.beans.ConstructorProperties({"token", "channel", "topic"})
    GroupsSetTopicRequest(String token, String channel, String topic) {
        this.token = token;
        this.channel = channel;
        this.topic = topic;
    }

    public static GroupsSetTopicRequestBuilder builder() {
        return new GroupsSetTopicRequestBuilder();
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

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof GroupsSetTopicRequest)) return false;
        final GroupsSetTopicRequest other = (GroupsSetTopicRequest) o;
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

    protected boolean canEqual(Object other) {
        return other instanceof GroupsSetTopicRequest;
    }

    public String toString() {
        return "GroupsSetTopicRequest(token=" + this.getToken() + ", channel=" + this.getChannel() + ", topic=" + this.getTopic() + ")";
    }

    public static class GroupsSetTopicRequestBuilder {
        private String token;
        private String channel;
        private String topic;

        GroupsSetTopicRequestBuilder() {
        }

        public GroupsSetTopicRequest.GroupsSetTopicRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public GroupsSetTopicRequest.GroupsSetTopicRequestBuilder channel(String channel) {
            this.channel = channel;
            return this;
        }

        public GroupsSetTopicRequest.GroupsSetTopicRequestBuilder topic(String topic) {
            this.topic = topic;
            return this;
        }

        public GroupsSetTopicRequest build() {
            return new GroupsSetTopicRequest(token, channel, topic);
        }

        public String toString() {
            return "GroupsSetTopicRequest.GroupsSetTopicRequestBuilder(token=" + this.token + ", channel=" + this.channel + ", topic=" + this.topic + ")";
        }
    }
}