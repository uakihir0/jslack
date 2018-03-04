package com.github.seratch.jslack.api.methods.request.conversations;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class ConversationsRepliesRequest implements SlackApiRequest {

    private String token;
    private String channel;
    private String ts;
    private String cursor;
    private String limit;

    @java.beans.ConstructorProperties({"token", "channel", "ts", "cursor", "limit"})
    ConversationsRepliesRequest(String token, String channel, String ts, String cursor, String limit) {
        this.token = token;
        this.channel = channel;
        this.ts = ts;
        this.cursor = cursor;
        this.limit = limit;
    }

    public static ConversationsRepliesRequestBuilder builder() {
        return new ConversationsRepliesRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public String getChannel() {
        return this.channel;
    }

    public String getTs() {
        return this.ts;
    }

    public String getCursor() {
        return this.cursor;
    }

    public String getLimit() {
        return this.limit;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public void setTs(String ts) {
        this.ts = ts;
    }

    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof ConversationsRepliesRequest)) return false;
        final ConversationsRepliesRequest other = (ConversationsRepliesRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$token = this.getToken();
        final Object other$token = other.getToken();
        if (this$token == null ? other$token != null : !this$token.equals(other$token)) return false;
        final Object this$channel = this.getChannel();
        final Object other$channel = other.getChannel();
        if (this$channel == null ? other$channel != null : !this$channel.equals(other$channel)) return false;
        final Object this$ts = this.getTs();
        final Object other$ts = other.getTs();
        if (this$ts == null ? other$ts != null : !this$ts.equals(other$ts)) return false;
        final Object this$cursor = this.getCursor();
        final Object other$cursor = other.getCursor();
        if (this$cursor == null ? other$cursor != null : !this$cursor.equals(other$cursor)) return false;
        final Object this$limit = this.getLimit();
        final Object other$limit = other.getLimit();
        if (this$limit == null ? other$limit != null : !this$limit.equals(other$limit)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $token = this.getToken();
        result = result * PRIME + ($token == null ? 43 : $token.hashCode());
        final Object $channel = this.getChannel();
        result = result * PRIME + ($channel == null ? 43 : $channel.hashCode());
        final Object $ts = this.getTs();
        result = result * PRIME + ($ts == null ? 43 : $ts.hashCode());
        final Object $cursor = this.getCursor();
        result = result * PRIME + ($cursor == null ? 43 : $cursor.hashCode());
        final Object $limit = this.getLimit();
        result = result * PRIME + ($limit == null ? 43 : $limit.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof ConversationsRepliesRequest;
    }

    public String toString() {
        return "ConversationsRepliesRequest(token=" + this.getToken() + ", channel=" + this.getChannel() + ", ts=" + this.getTs() + ", cursor=" + this.getCursor() + ", limit=" + this.getLimit() + ")";
    }

    public static class ConversationsRepliesRequestBuilder {
        private String token;
        private String channel;
        private String ts;
        private String cursor;
        private String limit;

        ConversationsRepliesRequestBuilder() {
        }

        public ConversationsRepliesRequest.ConversationsRepliesRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public ConversationsRepliesRequest.ConversationsRepliesRequestBuilder channel(String channel) {
            this.channel = channel;
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

        public ConversationsRepliesRequest.ConversationsRepliesRequestBuilder limit(String limit) {
            this.limit = limit;
            return this;
        }

        public ConversationsRepliesRequest build() {
            return new ConversationsRepliesRequest(token, channel, ts, cursor, limit);
        }

        public String toString() {
            return "ConversationsRepliesRequest.ConversationsRepliesRequestBuilder(token=" + this.token + ", channel=" + this.channel + ", ts=" + this.ts + ", cursor=" + this.cursor + ", limit=" + this.limit + ")";
        }
    }
}
