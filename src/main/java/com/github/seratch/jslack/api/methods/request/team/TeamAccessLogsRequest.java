package com.github.seratch.jslack.api.methods.request.team;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class TeamAccessLogsRequest implements SlackApiRequest {

    private String token;
    private Integer count;
    private Integer page;

    TeamAccessLogsRequest(String token, Integer count, Integer page) {
        this.token = token;
        this.count = count;
        this.page = page;
    }

    public static TeamAccessLogsRequestBuilder builder() {
        return new TeamAccessLogsRequestBuilder();
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

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof TeamAccessLogsRequest)) return false;
        final TeamAccessLogsRequest other = (TeamAccessLogsRequest) o;
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

    protected boolean canEqual(Object other) {
        return other instanceof TeamAccessLogsRequest;
    }

    public String toString() {
        return "TeamAccessLogsRequest(token=" + this.getToken() + ", count=" + this.getCount() + ", page=" + this.getPage() + ")";
    }

    public static class TeamAccessLogsRequestBuilder {
        private String token;
        private Integer count;
        private Integer page;

        TeamAccessLogsRequestBuilder() {
        }

        public TeamAccessLogsRequest.TeamAccessLogsRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public TeamAccessLogsRequest.TeamAccessLogsRequestBuilder count(Integer count) {
            this.count = count;
            return this;
        }

        public TeamAccessLogsRequest.TeamAccessLogsRequestBuilder page(Integer page) {
            this.page = page;
            return this;
        }

        public TeamAccessLogsRequest build() {
            return new TeamAccessLogsRequest(token, count, page);
        }

        public String toString() {
            return "TeamAccessLogsRequest.TeamAccessLogsRequestBuilder(token=" + this.token + ", count=" + this.count + ", page=" + this.page + ")";
        }
    }
}