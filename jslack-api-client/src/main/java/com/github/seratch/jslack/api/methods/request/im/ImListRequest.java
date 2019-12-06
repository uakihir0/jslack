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

    private Boolean getLatest;

    ImListRequest(String token, String cursor, Integer limit, Boolean getLatest) {
        this.token = token;
        this.cursor = cursor;
        this.limit = limit;
        this.getLatest = getLatest;
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

    public Boolean getGetLatest() {
        return this.getLatest;
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

    public void setGetLatest(Boolean getLatest) {
        this.getLatest = getLatest;
    }

    public static class ImListRequestBuilder {
        private String token;
        private String cursor;
        private Integer limit;
        private Boolean getLatest;

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

        public ImListRequest.ImListRequestBuilder getLatest(Boolean getLatest) {
            this.getLatest = getLatest;
            return this;
        }

        public ImListRequest build() {
            return new ImListRequest(token, cursor, limit, getLatest);
        }

        public String toString() {
            return "ImListRequest.ImListRequestBuilder(token=" + this.token + ", cursor=" + this.cursor + ", limit=" + this.limit + ", getLatest=" + this.getLatest + ")";
        }
    }
}