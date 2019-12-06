package com.github.seratch.jslack.api.methods.request.admin.apps;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

/**
 * https://api.slack.com/methods/admin.apps.requests.list
 */
public class AdminAppsRequestsListRequest implements SlackApiRequest {

    /**
     * Authentication token bearing required scopes.
     */
    private String token;

    /**
     * Set cursor to next_cursor returned by the previous call to list items in the next page
     */
    private String cursor;

    /**
     * The maximum number of items to return. Must be between 1 - 1000 both inclusive.
     */
    private Integer limit;

    /**
     * Workspace Id.
     */
    private String teamId;

    AdminAppsRequestsListRequest(String token, String cursor, Integer limit, String teamId) {
        this.token = token;
        this.cursor = cursor;
        this.limit = limit;
        this.teamId = teamId;
    }

    public static AdminAppsRequestsListRequestBuilder builder() {
        return new AdminAppsRequestsListRequestBuilder();
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

    public String getTeamId() {
        return this.teamId;
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

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    public static class AdminAppsRequestsListRequestBuilder {
        private String token;
        private String cursor;
        private Integer limit;
        private String teamId;

        AdminAppsRequestsListRequestBuilder() {
        }

        public AdminAppsRequestsListRequest.AdminAppsRequestsListRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public AdminAppsRequestsListRequest.AdminAppsRequestsListRequestBuilder cursor(String cursor) {
            this.cursor = cursor;
            return this;
        }

        public AdminAppsRequestsListRequest.AdminAppsRequestsListRequestBuilder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        public AdminAppsRequestsListRequest.AdminAppsRequestsListRequestBuilder teamId(String teamId) {
            this.teamId = teamId;
            return this;
        }

        public AdminAppsRequestsListRequest build() {
            return new AdminAppsRequestsListRequest(token, cursor, limit, teamId);
        }

        public String toString() {
            return "AdminAppsRequestsListRequest.AdminAppsRequestsListRequestBuilder(token=" + this.token + ", cursor=" + this.cursor + ", limit=" + this.limit + ", teamId=" + this.teamId + ")";
        }
    }
}
