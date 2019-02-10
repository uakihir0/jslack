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

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ConversationsRepliesRequest))
            return false;
        final ConversationsRepliesRequest other = (ConversationsRepliesRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$token = this.getToken();
        final Object other$token = other.getToken();
        if (this$token == null ? other$token != null : !this$token.equals(other$token)) return false;
        if (this.isInclusive() != other.isInclusive()) return false;
        final Object this$ts = this.getTs();
        final Object other$ts = other.getTs();
        if (this$ts == null ? other$ts != null : !this$ts.equals(other$ts)) return false;
        final Object this$cursor = this.getCursor();
        final Object other$cursor = other.getCursor();
        if (this$cursor == null ? other$cursor != null : !this$cursor.equals(other$cursor)) return false;
        final Object this$limit = this.getLimit();
        final Object other$limit = other.getLimit();
        if (this$limit == null ? other$limit != null : !this$limit.equals(other$limit)) return false;
        final Object this$channel = this.getChannel();
        final Object other$channel = other.getChannel();
        if (this$channel == null ? other$channel != null : !this$channel.equals(other$channel)) return false;
        final Object this$oldest = this.getOldest();
        final Object other$oldest = other.getOldest();
        if (this$oldest == null ? other$oldest != null : !this$oldest.equals(other$oldest)) return false;
        final Object this$latest = this.getLatest();
        final Object other$latest = other.getLatest();
        if (this$latest == null ? other$latest != null : !this$latest.equals(other$latest)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ConversationsRepliesRequest;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $token = this.getToken();
        result = result * PRIME + ($token == null ? 43 : $token.hashCode());
        result = result * PRIME + (this.isInclusive() ? 79 : 97);
        final Object $ts = this.getTs();
        result = result * PRIME + ($ts == null ? 43 : $ts.hashCode());
        final Object $cursor = this.getCursor();
        result = result * PRIME + ($cursor == null ? 43 : $cursor.hashCode());
        final Object $limit = this.getLimit();
        result = result * PRIME + ($limit == null ? 43 : $limit.hashCode());
        final Object $channel = this.getChannel();
        result = result * PRIME + ($channel == null ? 43 : $channel.hashCode());
        final Object $oldest = this.getOldest();
        result = result * PRIME + ($oldest == null ? 43 : $oldest.hashCode());
        final Object $latest = this.getLatest();
        result = result * PRIME + ($latest == null ? 43 : $latest.hashCode());
        return result;
    }

    public String toString() {
        return "ConversationsRepliesRequest(token=" + this.getToken() + ", inclusive=" + this.isInclusive() + ", ts=" + this.getTs() + ", cursor=" + this.getCursor() + ", limit=" + this.getLimit() + ", channel=" + this.getChannel() + ", oldest=" + this.getOldest() + ", latest=" + this.getLatest() + ")";
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
