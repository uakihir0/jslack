package com.github.seratch.jslack.api.methods.request.reactions;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class ReactionsListRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `reactions:read`
     */
    private String token;

    /**
     * Show reactions made by this user. Defaults to the authed user.
     */
    private String user;

    /**
     * If true always return the complete reaction list.
     */
    private boolean full;

    private Integer count;

    private Integer page;

    ReactionsListRequest(String token, String user, boolean full, Integer count, Integer page) {
        this.token = token;
        this.user = user;
        this.full = full;
        this.count = count;
        this.page = page;
    }

    public static ReactionsListRequestBuilder builder() {
        return new ReactionsListRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public String getUser() {
        return this.user;
    }

    public boolean isFull() {
        return this.full;
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

    public void setUser(String user) {
        this.user = user;
    }

    public void setFull(boolean full) {
        this.full = full;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public static class ReactionsListRequestBuilder {
        private String token;
        private String user;
        private boolean full;
        private Integer count;
        private Integer page;

        ReactionsListRequestBuilder() {
        }

        public ReactionsListRequest.ReactionsListRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public ReactionsListRequest.ReactionsListRequestBuilder user(String user) {
            this.user = user;
            return this;
        }

        public ReactionsListRequest.ReactionsListRequestBuilder full(boolean full) {
            this.full = full;
            return this;
        }

        public ReactionsListRequest.ReactionsListRequestBuilder count(Integer count) {
            this.count = count;
            return this;
        }

        public ReactionsListRequest.ReactionsListRequestBuilder page(Integer page) {
            this.page = page;
            return this;
        }

        public ReactionsListRequest build() {
            return new ReactionsListRequest(token, user, full, count, page);
        }

        public String toString() {
            return "ReactionsListRequest.ReactionsListRequestBuilder(token=" + this.token + ", user=" + this.user + ", full=" + this.full + ", count=" + this.count + ", page=" + this.page + ")";
        }
    }
}