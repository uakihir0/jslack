package com.github.seratch.jslack.api.methods.request.conversations;

public class ConversationsMembersRequest {

    private String token;
    private String channel;
    private String cursor;
    private Integer limit;

    ConversationsMembersRequest(String token, String channel, String cursor, Integer limit) {
        this.token = token;
        this.channel = channel;
        this.cursor = cursor;
        this.limit = limit;
    }

    public static ConversationsMembersRequestBuilder builder() {
        return new ConversationsMembersRequestBuilder();
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

    public Integer getLimit() {
        return this.limit;
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof ConversationsMembersRequest)) return false;
        final ConversationsMembersRequest other = (ConversationsMembersRequest) o;
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
        final Object $cursor = this.getCursor();
        result = result * PRIME + ($cursor == null ? 43 : $cursor.hashCode());
        final Object $limit = this.getLimit();
        result = result * PRIME + ($limit == null ? 43 : $limit.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof ConversationsMembersRequest;
    }

    public String toString() {
        return "ConversationsMembersRequest(token=" + this.getToken() + ", channel=" + this.getChannel() + ", cursor=" + this.getCursor() + ", limit=" + this.getLimit() + ")";
    }

    public static class ConversationsMembersRequestBuilder {
        private String token;
        private String channel;
        private String cursor;
        private Integer limit;

        ConversationsMembersRequestBuilder() {
        }

        public ConversationsMembersRequest.ConversationsMembersRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public ConversationsMembersRequest.ConversationsMembersRequestBuilder channel(String channel) {
            this.channel = channel;
            return this;
        }

        public ConversationsMembersRequest.ConversationsMembersRequestBuilder cursor(String cursor) {
            this.cursor = cursor;
            return this;
        }

        public ConversationsMembersRequest.ConversationsMembersRequestBuilder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        public ConversationsMembersRequest build() {
            return new ConversationsMembersRequest(token, channel, cursor, limit);
        }

        public String toString() {
            return "ConversationsMembersRequest.ConversationsMembersRequestBuilder(token=" + this.token + ", channel=" + this.channel + ", cursor=" + this.cursor + ", limit=" + this.limit + ")";
        }
    }
}
