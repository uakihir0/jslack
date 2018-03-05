package com.github.seratch.jslack.api.methods.request.reactions;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class ReactionsListRequest implements SlackApiRequest {

    private String token;
    private String user;
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

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof ReactionsListRequest)) return false;
        final ReactionsListRequest other = (ReactionsListRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$token = this.getToken();
        final Object other$token = other.getToken();
        if (this$token == null ? other$token != null : !this$token.equals(other$token)) return false;
        final Object this$user = this.getUser();
        final Object other$user = other.getUser();
        if (this$user == null ? other$user != null : !this$user.equals(other$user)) return false;
        if (this.isFull() != other.isFull()) return false;
        final Object this$count = this.getCount();
        final Object other$count = other.getCount();
        if (this$count == null ? other$count != null : !this$count.equals(other$count)) return false;
        final Object this$page = this.getPage();
        final Object other$page = other.getPage();
        if (this$page == null ? other$page != null : !this$page.equals(other$page)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $token = this.getToken();
        result = result * PRIME + ($token == null ? 43 : $token.hashCode());
        final Object $user = this.getUser();
        result = result * PRIME + ($user == null ? 43 : $user.hashCode());
        result = result * PRIME + (this.isFull() ? 79 : 97);
        final Object $count = this.getCount();
        result = result * PRIME + ($count == null ? 43 : $count.hashCode());
        final Object $page = this.getPage();
        result = result * PRIME + ($page == null ? 43 : $page.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof ReactionsListRequest;
    }

    public String toString() {
        return "ReactionsListRequest(token=" + this.getToken() + ", user=" + this.getUser() + ", full=" + this.isFull() + ", count=" + this.getCount() + ", page=" + this.getPage() + ")";
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