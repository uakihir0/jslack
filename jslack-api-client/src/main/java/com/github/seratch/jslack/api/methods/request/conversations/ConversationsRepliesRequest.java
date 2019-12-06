package com.github.seratch.jslack.api.methods.request.conversations;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class ConversationsRepliesRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `conversations:history`
     */
    private String token;

    /**
     * Include messages with latest or oldest timestamp in results only when either timestamp is specified.
     */
    private boolean inclusive;

    /**
     * Unique identifier of a thread's parent message.
     */
    private String ts;

    /**
     * Paginate through collections of data by setting the `cursor` parameter to a `next_cursor` attribute
     * returned by a previous request's `response_metadata`.
     * Default value fetches the first \"page\" of the collection. See [pagination](/docs/pagination) for more detail.
     */
    private String cursor;

    /**
     * The maximum number of items to return.
     * Fewer than the requested number of items may be returned, even if the end of the users list hasn't been reached.
     */
    private Integer limit;

    /**
     * Conversation ID to fetch thread from.
     */
    private String channel;

    /**
     * Start of time range of messages to include in results.
     */
    private String oldest;

    /**
     * End of time range of messages to include in results.
     */
    private String latest;

    ConversationsRepliesRequest(String token, boolean inclusive, String ts, String cursor, Integer limit, String channel, String oldest, String latest) {
        this.token = token;
        this.inclusive = inclusive;
        this.ts = ts;
        this.cursor = cursor;
        this.limit = limit;
        this.channel = channel;
        this.oldest = oldest;
        this.latest = latest;
    }

    public static ConversationsRepliesRequestBuilder builder() {
        return new ConversationsRepliesRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public boolean isInclusive() {
        return this.inclusive;
    }

    public String getTs() {
        return this.ts;
    }

    public String getCursor() {
        return this.cursor;
    }

    public Integer getLimit() {
        return this.limit;
    }

    public String getChannel() {
        return this.channel;
    }

    public String getOldest() {
        return this.oldest;
    }

    public String getLatest() {
        return this.latest;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setInclusive(boolean inclusive) {
        this.inclusive = inclusive;
    }

    public void setTs(String ts) {
        this.ts = ts;
    }

    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public void setOldest(String oldest) {
        this.oldest = oldest;
    }

    public void setLatest(String latest) {
        this.latest = latest;
    }

    public static class ConversationsRepliesRequestBuilder {
        private String token;
        private boolean inclusive;
        private String ts;
        private String cursor;
        private Integer limit;
        private String channel;
        private String oldest;
        private String latest;

        ConversationsRepliesRequestBuilder() {
        }

        public ConversationsRepliesRequest.ConversationsRepliesRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public ConversationsRepliesRequest.ConversationsRepliesRequestBuilder inclusive(boolean inclusive) {
            this.inclusive = inclusive;
            return this;
        }

        public ConversationsRepliesRequest.ConversationsRepliesRequestBuilder ts(String ts) {
            this.ts = ts;
            return this;
        }

        public ConversationsRepliesRequest.ConversationsRepliesRequestBuilder cursor(String cursor) {
            this.cursor = cursor;
            return this;
        }

        public ConversationsRepliesRequest.ConversationsRepliesRequestBuilder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        public ConversationsRepliesRequest.ConversationsRepliesRequestBuilder channel(String channel) {
            this.channel = channel;
            return this;
        }

        public ConversationsRepliesRequest.ConversationsRepliesRequestBuilder oldest(String oldest) {
            this.oldest = oldest;
            return this;
        }

        public ConversationsRepliesRequest.ConversationsRepliesRequestBuilder latest(String latest) {
            this.latest = latest;
            return this;
        }

        public ConversationsRepliesRequest build() {
            return new ConversationsRepliesRequest(token, inclusive, ts, cursor, limit, channel, oldest, latest);
        }

        public String toString() {
            return "ConversationsRepliesRequest.ConversationsRepliesRequestBuilder(token=" + this.token + ", inclusive=" + this.inclusive + ", ts=" + this.ts + ", cursor=" + this.cursor + ", limit=" + this.limit + ", channel=" + this.channel + ", oldest=" + this.oldest + ", latest=" + this.latest + ")";
        }
    }
}
