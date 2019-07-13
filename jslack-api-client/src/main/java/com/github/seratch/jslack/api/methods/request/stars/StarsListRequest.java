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

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof StarsListRequest)) return false;
        final StarsListRequest other = (StarsListRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$token = this.getToken();
        final Object other$token = other.getToken();
        if (this$token == null ? other$token != null : !this$token.equals(other$token)) return false;
        final Object this$count = this.getCount();
        final Object other$count = other.getCount();
        if (this$count == null ? other$count != null : !this$count.equals(other$count)) return false;
        final Object this$page = this.getPage();
        final Object other$page = other.getPage();
        if (this$page == null ? other$page != null : !this$page.equals(other$page)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof StarsListRequest;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $token = this.getToken();
        result = result * PRIME + ($token == null ? 43 : $token.hashCode());
        final Object $count = this.getCount();
        result = result * PRIME + ($count == null ? 43 : $count.hashCode());
        final Object $page = this.getPage();
        result = result * PRIME + ($page == null ? 43 : $page.hashCode());
        return result;
    }

    public String toString() {
        return "StarsListRequest(token=" + this.getToken() + ", count=" + this.getCount() + ", page=" + this.getPage() + ")";
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