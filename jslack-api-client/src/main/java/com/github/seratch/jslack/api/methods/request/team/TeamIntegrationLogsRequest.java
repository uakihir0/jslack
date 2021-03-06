package com.github.seratch.jslack.api.methods.request.team;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class TeamIntegrationLogsRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `admin`
     */
    private String token;

    /**
     * Filter logs to this service. Defaults to all logs.
     */
    private String serviceId;

    /**
     * Filter logs generated by this user\u2019s actions. Defaults to all logs.
     */
    private String user;

    /**
     * Filter logs to this Slack app. Defaults to all logs.
     */
    private Integer appId;

    /**
     * Filter logs with this change type. Defaults to all logs.
     */
    private String changeType;

    private Integer count;

    private Integer page;

    TeamIntegrationLogsRequest(String token, String serviceId, String user, Integer appId, String changeType, Integer count, Integer page) {
        this.token = token;
        this.serviceId = serviceId;
        this.user = user;
        this.appId = appId;
        this.changeType = changeType;
        this.count = count;
        this.page = page;
    }

    public static TeamIntegrationLogsRequestBuilder builder() {
        return new TeamIntegrationLogsRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public String getServiceId() {
        return this.serviceId;
    }

    public String getUser() {
        return this.user;
    }

    public Integer getAppId() {
        return this.appId;
    }

    public String getChangeType() {
        return this.changeType;
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

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    public void setChangeType(String changeType) {
        this.changeType = changeType;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public static class TeamIntegrationLogsRequestBuilder {
        private String token;
        private String serviceId;
        private String user;
        private Integer appId;
        private String changeType;
        private Integer count;
        private Integer page;

        TeamIntegrationLogsRequestBuilder() {
        }

        public TeamIntegrationLogsRequest.TeamIntegrationLogsRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public TeamIntegrationLogsRequest.TeamIntegrationLogsRequestBuilder serviceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }

        public TeamIntegrationLogsRequest.TeamIntegrationLogsRequestBuilder user(String user) {
            this.user = user;
            return this;
        }

        public TeamIntegrationLogsRequest.TeamIntegrationLogsRequestBuilder appId(Integer appId) {
            this.appId = appId;
            return this;
        }

        public TeamIntegrationLogsRequest.TeamIntegrationLogsRequestBuilder changeType(String changeType) {
            this.changeType = changeType;
            return this;
        }

        public TeamIntegrationLogsRequest.TeamIntegrationLogsRequestBuilder count(Integer count) {
            this.count = count;
            return this;
        }

        public TeamIntegrationLogsRequest.TeamIntegrationLogsRequestBuilder page(Integer page) {
            this.page = page;
            return this;
        }

        public TeamIntegrationLogsRequest build() {
            return new TeamIntegrationLogsRequest(token, serviceId, user, appId, changeType, count, page);
        }

        public String toString() {
            return "TeamIntegrationLogsRequest.TeamIntegrationLogsRequestBuilder(token=" + this.token + ", serviceId=" + this.serviceId + ", user=" + this.user + ", appId=" + this.appId + ", changeType=" + this.changeType + ", count=" + this.count + ", page=" + this.page + ")";
        }
    }
}