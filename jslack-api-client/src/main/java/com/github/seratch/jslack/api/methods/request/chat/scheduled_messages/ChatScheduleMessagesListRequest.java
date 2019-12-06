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