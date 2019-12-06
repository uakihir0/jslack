package com.github.seratch.jslack.api.methods.request.conversations;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class ConversationsMembersRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `conversations:read`
     */
    private String token;

    /**
     * ID of the conversation to retrieve members for
     */
    private String channel;

    /**
     * Paginate through collections of data by setting the `cursor` parameter to a `next_cursor` attribute
     * returned by a previous request's `response_metadata`.
     * Default value fetches the first \"page\" of the collection.
     * See [pagination](/docs/pagination) for more detail.
     */
    private String cursor;

    /**
     * The maximum number of items to return.
     * Fewer than the requested number of items may be returned, even if the end of the users list hasn't been reached.
     */
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
