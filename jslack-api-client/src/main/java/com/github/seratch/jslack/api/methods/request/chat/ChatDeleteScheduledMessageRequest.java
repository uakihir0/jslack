package com.github.seratch.jslack.api.methods.request.chat;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class ChatDeleteScheduledMessageRequest implements SlackApiRequest {

    private String token;

    /**
     * The channel the scheduled_message is posting to
     */
    private String channel;

    /**
     * scheduled_message_id returned from call to chat.scheduleMessage
     */
    private String scheduledMessageId;

    /**
     * Pass true to delete the message as the authed user with chat:write:user scope.
     * Bot users in this context are considered authed users.
     * If unused or false, the message will be deleted with chat:write:bot scope.
     */
    private Boolean asUser;

    ChatDeleteScheduledMessageRequest(String token, String channel, String scheduledMessageId, Boolean asUser) {
        this.token = token;
        this.channel = channel;
        this.scheduledMessageId = scheduledMessageId;
        this.asUser = asUser;
    }

    public static ChatDeleteScheduledMessageRequestBuilder builder() {
        return new ChatDeleteScheduledMessageRequestBuilder();
    }

    // NOTE: The default value is intentionally null to support workplace apps.
    public Boolean isAsUser() {
        return this.asUser;
    }

    // NOTE: The default value is intentionally null to support workplace apps.
    public void setAsUser(Boolean asUser) {
        this.asUser = asUser;
    }

    public String getToken() {
        return this.token;
    }

    public String getChannel() {
        return this.channel;
    }

    public String getScheduledMessageId() {
        return this.scheduledMessageId;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public void setScheduledMessageId(String scheduledMessageId) {
        this.scheduledMessageId = scheduledMessageId;
    }

    public static class ChatDeleteScheduledMessageRequestBuilder {
        private String token;
        private String channel;
        private String scheduledMessageId;
        private Boolean asUser;

        ChatDeleteScheduledMessageRequestBuilder() {
        }

        public ChatDeleteScheduledMessageRequest.ChatDeleteScheduledMessageRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public ChatDeleteScheduledMessageRequest.ChatDeleteScheduledMessageRequestBuilder channel(String channel) {
            this.channel = channel;
            return this;
        }

        public ChatDeleteScheduledMessageRequest.ChatDeleteScheduledMessageRequestBuilder scheduledMessageId(String scheduledMessageId) {
            this.scheduledMessageId = scheduledMessageId;
            return this;
        }

        public ChatDeleteScheduledMessageRequest.ChatDeleteScheduledMessageRequestBuilder asUser(Boolean asUser) {
            this.asUser = asUser;
            return this;
        }

        public ChatDeleteScheduledMessageRequest build() {
            return new ChatDeleteScheduledMessageRequest(token, channel, scheduledMessageId, asUser);
        }

        public String toString() {
            return "ChatDeleteScheduledMessageRequest.ChatDeleteScheduledMessageRequestBuilder(token=" + this.token + ", channel=" + this.channel + ", scheduledMessageId=" + this.scheduledMessageId + ", asUser=" + this.asUser + ")";
        }
    }
}