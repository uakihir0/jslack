package com.github.seratch.jslack.api.methods.request.conversations;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class ConversationsHistoryRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `conversations:history`
     */
    private String token;

    /**
     * Conversation ID to fetch history for.
     */
    private String channel;

    /**
     * Paginate through collections of data by setting the `cursor` parameter to a `next_cursor` attribute
     * returned by a previous request's `response_metadata`.
     * <p>
     * Default value fetches the first \"page\" of the collection. See [pagination](/docs/pagination) for more detail.
     */
    private String cursor;

    /**
     * Start of time range of messages to include in results.
     */
    private String oldest;

    /**
     * End of time range of messages to include in results.
     */
    private String latest;

    /**
     * The maximum number of items to return. Fewer than the requested number of items may be returned,
     * even if the end of the users list hasn't been reached.
     */
    private Integer limit;

    /**
     * Include messages with latest or oldest timestamp in results only when either timestamp is specified.
     */
    private boolean inclusive;

    ConversationsHistoryRequest(String token, String channel, String cursor, String oldest, String latest, Integer limit, boolean inclusive) {
        this.token = token;
        this.channel = channel;
        this.cursor = cursor;
        this.oldest = oldest;
        this.latest = latest;
        this.limit = limit;
        this.inclusive = inclusive;
    }

    public static ConversationsHistoryRequestBuilder builder() {
        return new ConversationsHistoryRequestBuilder();
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

    public String getOldest() {
        return this.oldest;
    }

    public String getLatest() {
        return this.latest;
    }

    public Integer getLimit() {
        return this.limit;
    }

    public boolean isInclusive() {
        return this.inclusive;
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

    public void setOldest(String oldest) {
        this.oldest = oldest;
    }

    public void setLatest(String latest) {
        this.latest = latest;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public void setInclusive(boolean inclusive) {
        this.inclusive = inclusive;
    }

    public static class ConversationsHistoryRequestBuilder {
        private String token;
        private String channel;
        private String cursor;
        private String oldest;
        private String latest;
        private Integer limit;
        private boolean inclusive;

        ConversationsHistoryRequestBuilder() {
        }

        public ConversationsHistoryRequest.ConversationsHistoryRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public ConversationsHistoryRequest.ConversationsHistoryRequestBuilder channel(String channel) {
            this.channel = channel;
            return this;
        }

        public ConversationsHistoryRequest.ConversationsHistoryRequestBuilder cursor(String cursor) {
            this.cursor = cursor;
            return this;
        }

        public ConversationsHistoryRequest.ConversationsHistoryRequestBuilder oldest(String oldest) {
            this.oldest = oldest;
            return this;
        }

        public ConversationsHistoryRequest.ConversationsHistoryRequestBuilder latest(String latest) {
            this.latest = latest;
            return this;
        }

        public ConversationsHistoryRequest.ConversationsHistoryRequestBuilder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        public ConversationsHistoryRequest.ConversationsHistoryRequestBuilder inclusive(boolean inclusive) {
            this.inclusive = inclusive;
            return this;
        }

        public ConversationsHistoryRequest build() {
            return new ConversationsHistoryRequest(token, channel, cursor, oldest, latest, limit, inclusive);
        }

        public String toString() {
            return "ConversationsHistoryRequest.ConversationsHistoryRequestBuilder(token=" + this.token + ", channel=" + this.channel + ", cursor=" + this.cursor + ", oldest=" + this.oldest + ", latest=" + this.latest + ", limit=" + this.limit + ", inclusive=" + this.inclusive + ")";
        }
    }
}
