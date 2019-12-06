package com.github.seratch.jslack.api.methods.request.team;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class TeamAccessLogsRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `admin`
     */
    private String token;

    /**
     * End of time range of logs to include in results (inclusive).
     */
    private Integer before;

    private Integer count;

    private Integer page;

    TeamAccessLogsRequest(String token, Integer before, Integer count, Integer page) {
        this.token = token;
        this.before = before;
        this.count = count;
        this.page = page;
    }

    public static TeamAccessLogsRequestBuilder builder() {
        return new TeamAccessLogsRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public Integer getBefore() {
        return this.before;
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

    public void setBefore(Integer before) {
        this.before = before;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public static class TeamAccessLogsRequestBuilder {
        private String token;
        private Integer before;
        private Integer count;
        private Integer page;

        TeamAccessLogsRequestBuilder() {
        }

        public TeamAccessLogsRequest.TeamAccessLogsRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public TeamAccessLogsRequest.TeamAccessLogsRequestBuilder before(Integer before) {
            this.before = before;
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
            return new TeamAccessLogsRequest(token, before, count, page);
        }

        public String toString() {
            return "TeamAccessLogsRequest.TeamAccessLogsRequestBuilder(token=" + this.token + ", before=" + this.before + ", count=" + this.count + ", page=" + this.page + ")";
        }
    }
}