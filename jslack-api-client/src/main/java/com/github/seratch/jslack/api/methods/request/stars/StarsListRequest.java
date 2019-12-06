package com.github.seratch.jslack.api.methods.request.stars;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class StarsListRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `stars:read`
     */
    private String token;

    private Integer count;

    private Integer page;

    StarsListRequest(String token, Integer count, Integer page) {
        this.token = token;
        this.count = count;
        this.page = page;
    }

    public static StarsListRequestBuilder builder() {
        return new StarsListRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public Integer getCount() {
        return this.count;
    }

    public Integer getPage() {
        return this.page;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public static class StarsListRequestBuilder {
        private String token;
        private Integer count;
        private Integer page;

        StarsListRequestBuilder() {
        }

        public StarsListRequest.StarsListRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public StarsListRequest.StarsListRequestBuilder count(Integer count) {
            this.count = count;
            return this;
        }

        public StarsListRequest.StarsListRequestBuilder page(Integer page) {
            this.page = page;
            return this;
        }

        public StarsListRequest build() {
            return new StarsListRequest(token, count, page);
        }

        public String toString() {
            return "StarsListRequest.StarsListRequestBuilder(token=" + this.token + ", count=" + this.count + ", page=" + this.page + ")";
        }
    }
}