package com.github.seratch.jslack.api.methods.request.chat.scheduled_messages;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class ChatScheduleMessagesListRequest implements SlackApiRequest {

    private String token;

    /**
     * The channel of the scheduled messages
     */
    private String channel;

    /**
     * For pagination purposes, this is the cursor value returned from a previous call to chat.scheduledmessages.list
     * indicating where you want to start this call from.
     */
    private String cursor;

    /**
     * A UNIX timestamp of the latest value in the time range
     */
    private String latest;

    /**
     * Maximum number of original entries to return.
     */
    private Integer limit;

    /**
     * A UNIX timestamp of the oldest value in the time range
     */
    private String oldest;

    ChatScheduleMessagesListRequest(String token, String channel, String cursor, String latest, Integer limit, String oldest) {
        this.token = token;
        this.channel = channel;
        this.cursor = cursor;
        this.latest = latest;
        this.limit = limit;
        this.oldest = oldest;
    }

    public static ChatScheduleMessagesListRequestBuilder builder() {
        return new ChatScheduleMessagesListRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public String getChannel() {
        return this.channel;
    }

    public String getCursor() {
        return this.cursor;
    }

    public String getLatest() {
        return this.latest;
    }

    public Integer getLimit() {
        return this.limit;
    }

    public String getOldest() {
        return this.oldest;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public void setLatest(String latest) {
        this.latest = latest;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public void setOldest(String oldest) {
        this.oldest = oldest;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ChatScheduleMessagesListRequest))
            return false;
        final ChatScheduleMessagesListRequest other = (ChatScheduleMessagesListRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$token = this.getToken();
        final Object other$token = other.getToken();
        if (this$token == null ? other$token != null : !this$token.equals(other$token)) return false;
        final Object this$channel = this.getChannel();
        final Object other$channel = other.getChannel();
        if (this$channel == null ? other$channel != null : !this$channel.equals(other$channel)) return false;
        final Object this$cursor = this.getCursor();
        final Object other$cursor = other.getCursor();
        if (this$cursor == null ? other$cursor != null : !this$cursor.equals(other$cursor)) return false;
        final Object this$latest = this.getLatest();
        final Object other$latest = other.getLatest();
        if (this$latest == null ? other$latest != null : !this$latest.equals(other$latest)) return false;
        final Object this$limit = this.getLimit();
        final Object other$limit = other.getLimit();
        if (this$limit == null ? other$limit != null : !this$limit.equals(other$limit)) return false;
        final Object this$oldest = this.getOldest();
        final Object other$oldest = other.getOldest();
        if (this$oldest == null ? other$oldest != null : !this$oldest.equals(other$oldest)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ChatScheduleMessagesListRequest;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $token = this.getToken();
        result = result * PRIME + ($token == null ? 43 : $token.hashCode());
        final Object $channel = this.getChannel();
        result = result * PRIME + ($channel == null ? 43 : $channel.hashCode());
        final Object $cursor = this.getCursor();
        result = result * PRIME + ($cursor == null ? 43 : $cursor.hashCode());
        final Object $latest = this.getLatest();
        result = result * PRIME + ($latest == null ? 43 : $latest.hashCode());
        final Object $limit = this.getLimit();
        result = result * PRIME + ($limit == null ? 43 : $limit.hashCode());
        final Object $oldest = this.getOldest();
        result = result * PRIME + ($oldest == null ? 43 : $oldest.hashCode());
        return result;
    }

    public String toString() {
        return "ChatScheduleMessagesListRequest(token=" + this.getToken() + ", channel=" + this.getChannel() + ", cursor=" + this.getCursor() + ", latest=" + this.getLatest() + ", limit=" + this.getLimit() + ", oldest=" + this.getOldest() + ")";
    }

    public static class ChatScheduleMessagesListRequestBuilder {
        private String token;
        private String channel;
        private String cursor;
        private String latest;
        private Integer limit;
        private String oldest;

        ChatScheduleMessagesListRequestBuilder() {
        }

        public ChatScheduleMessagesListRequest.ChatScheduleMessagesListRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public ChatScheduleMessagesListRequest.ChatScheduleMessagesListRequestBuilder channel(String channel) {
            this.channel = channel;
            return this;
        }

        public ChatScheduleMessagesListRequest.ChatScheduleMessagesListRequestBuilder cursor(String cursor) {
            this.cursor = cursor;
            return this;
        }

        public ChatScheduleMessagesListRequest.ChatScheduleMessagesListRequestBuilder latest(String latest) {
            this.latest = latest;
            return this;
        }

        public ChatScheduleMessagesListRequest.ChatScheduleMessagesListRequestBuilder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        public ChatScheduleMessagesListRequest.ChatScheduleMessagesListRequestBuilder oldest(String oldest) {
            this.oldest = oldest;
            return this;
        }

        public ChatScheduleMessagesListRequest build() {
            return new ChatScheduleMessagesListRequest(token, channel, cursor, latest, limit, oldest);
        }

        public String toString() {
            return "ChatScheduleMessagesListRequest.ChatScheduleMessagesListRequestBuilder(token=" + this.token + ", channel=" + this.channel + ", cursor=" + this.cursor + ", latest=" + this.latest + ", limit=" + this.limit + ", oldest=" + this.oldest + ")";
        }
    }
}