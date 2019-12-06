package com.github.seratch.jslack.api.methods.request.conversations;

import com.github.seratch.jslack.api.methods.SlackApiRequest;
import com.github.seratch.jslack.api.model.ConversationType;

import java.util.List;

public class ConversationsListRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `conversations:read`
     */
    private String token;

    /**
     * Paginate through collections of data by setting the `cursor` parameter to
     * a `next_cursor` attribute returned by a previous request's `response_metadata`.
     * Default value fetches the first \"page\" of the collection. See [pagination](/docs/pagination) for more detail.
     */
    private String cursor;

    /**
     * Set to `true` to exclude archived channels from the list
     */
    private boolean excludeArchived;

    /**
     * The maximum number of items to return. Fewer than the requested number of items may be returned,
     * even if the end of the list hasn't been reached. Must be an integer no larger than 1000.
     */
    private Integer limit;

    /**
     * Mix and match channel types by providing a comma-separated list of
     * any combination of `public_channel`, `private_channel`, `mpim`, `im`
     */
    private List<ConversationType> types;

    ConversationsListRequest(String token, String cursor, boolean excludeArchived, Integer limit, List<ConversationType> types) {
        this.token = token;
        this.cursor = cursor;
        this.excludeArchived = excludeArchived;
        this.limit = limit;
        this.types = types;
    }

    public static ConversationsListRequestBuilder builder() {
        return new ConversationsListRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public String getCursor() {
        return this.cursor;
    }

    public boolean isExcludeArchived() {
        return this.excludeArchived;
    }

    public Integer getLimit() {
        return this.limit;
    }

    public List<ConversationType> getTypes() {
        return this.types;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public void setExcludeArchived(boolean excludeArchived) {
        this.excludeArchived = excludeArchived;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public void setTypes(List<ConversationType> types) {
        this.types = types;
    }

    public static class ConversationsListRequestBuilder {
        private String token;
        private String cursor;
        private boolean excludeArchived;
        private Integer limit;
        private List<ConversationType> types;

        ConversationsListRequestBuilder() {
        }

        public ConversationsListRequest.ConversationsListRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public ConversationsListRequest.ConversationsListRequestBuilder cursor(String cursor) {
            this.cursor = cursor;
            return this;
        }

        public ConversationsListRequest.ConversationsListRequestBuilder excludeArchived(boolean excludeArchived) {
            this.excludeArchived = excludeArchived;
            return this;
        }

        public ConversationsListRequest.ConversationsListRequestBuilder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        public ConversationsListRequest.ConversationsListRequestBuilder types(List<ConversationType> types) {
            this.types = types;
            return this;
        }

        public ConversationsListRequest build() {
            return new ConversationsListRequest(token, cursor, excludeArchived, limit, types);
        }

        public String toString() {
            return "ConversationsListRequest.ConversationsListRequestBuilder(token=" + this.token + ", cursor=" + this.cursor + ", excludeArchived=" + this.excludeArchived + ", limit=" + this.limit + ", types=" + this.types + ")";
        }
    }
}
