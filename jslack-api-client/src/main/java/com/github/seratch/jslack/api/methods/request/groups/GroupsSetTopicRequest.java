package com.github.seratch.jslack.api.methods.request.groups;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class GroupsSetTopicRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `groups:write`
     */
    private String token;

    /**
     * The new topic
     */
    private String channel;

    /**
     * Private channel to set the topic of
     */
    private String topic;

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