package com.github.seratch.jslack.api.methods.request.im;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class ImListRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `im:read`
     */
    private String token;

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

    ImListRequest(String token, String cursor, Integer limit) {
        this.token = token;
        this.cursor = cursor;
        this.limit = limit;
    }

    public static ImListRequestBuilder builder() {
        return new ImListRequestBuilder();
    }

    public String getToken() {
        return this.token;
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

    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ImListRequest)) return false;
        final ImListRequest other = (ImListRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$token = this.getToken();
        final Object other$token = other.getToken();
        if (this$token == null ? other$token != null : !this$token.equals(other$token)) return false;
        final Object this$cursor = this.getCursor();
        final Object other$cursor = other.getCursor();
        if (this$cursor == null ? other$cursor != null : !this$cursor.equals(other$cursor)) return false;
        final Object this$limit = this.getLimit();
        final Object other$limit = other.getLimit();
        if (this$limit == null ? other$limit != null : !this$limit.equals(other$limit)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ImListRequest;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $token = this.getToken();
        result = result * PRIME + ($token == null ? 43 : $token.hashCode());
        final Object $cursor = this.getCursor();
        result = result * PRIME + ($cursor == null ? 43 : $cursor.hashCode());
        final Object $limit = this.getLimit();
        result = result * PRIME + ($limit == null ? 43 : $limit.hashCode());
        return result;
    }

    public String toString() {
        return "ImListRequest(token=" + this.getToken() + ", cursor=" + this.getCursor() + ", limit=" + this.getLimit() + ")";
    }

    public static class ImListRequestBuilder {
        private String token;
        private String cursor;
        private Integer limit;

        ImListRequestBuilder() {
        }

        public ImListRequest.ImListRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public ImListRequest.ImListRequestBuilder cursor(String cursor) {
            this.cursor = cursor;
            return this;
        }

        public ImListRequest.ImListRequestBuilder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        public ImListRequest build() {
            return new ImListRequest(token, cursor, limit);
        }

        public String toString() {
            return "ImListRequest.ImListRequestBuilder(token=" + this.token + ", cursor=" + this.cursor + ", limit=" + this.limit + ")";
        }
    }
}