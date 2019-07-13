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

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ChatDeleteScheduledMessageRequest))
            return false;
        final ChatDeleteScheduledMessageRequest other = (ChatDeleteScheduledMessageRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$token = this.getToken();
        final Object other$token = other.getToken();
        if (this$token == null ? other$token != null : !this$token.equals(other$token)) return false;
        final Object this$channel = this.getChannel();
        final Object other$channel = other.getChannel();
        if (this$channel == null ? other$channel != null : !this$channel.equals(other$channel)) return false;
        final Object this$scheduledMessageId = this.getScheduledMessageId();
        final Object other$scheduledMessageId = other.getScheduledMessageId();
        if (this$scheduledMessageId == null ? other$scheduledMessageId != null : !this$scheduledMessageId.equals(other$scheduledMessageId))
            return false;
        final Object this$asUser = this.isAsUser();
        final Object other$asUser = other.isAsUser();
        if (this$asUser == null ? other$asUser != null : !this$asUser.equals(other$asUser)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ChatDeleteScheduledMessageRequest;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $token = this.getToken();
        result = result * PRIME + ($token == null ? 43 : $token.hashCode());
        final Object $channel = this.getChannel();
        result = result * PRIME + ($channel == null ? 43 : $channel.hashCode());
        final Object $scheduledMessageId = this.getScheduledMessageId();
        result = result * PRIME + ($scheduledMessageId == null ? 43 : $scheduledMessageId.hashCode());
        final Object $asUser = this.isAsUser();
        result = result * PRIME + ($asUser == null ? 43 : $asUser.hashCode());
        return result;
    }

    public String toString() {
        return "ChatDeleteScheduledMessageRequest(token=" + this.getToken() + ", channel=" + this.getChannel() + ", scheduledMessageId=" + this.getScheduledMessageId() + ", asUser=" + this.isAsUser() + ")";
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