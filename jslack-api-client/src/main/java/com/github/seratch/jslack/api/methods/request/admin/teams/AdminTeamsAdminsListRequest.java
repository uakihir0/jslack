package com.github.seratch.jslack.api.methods.request.admin.teams;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

/**
 * https://api.slack.com/methods/admin.teams.admins.list
 */
public class AdminTeamsAdminsListRequest implements SlackApiRequest {

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

    AdminTeamsAdminsListRequest(String token, String cursor, Integer limit, String teamId) {
        this.token = token;
        this.cursor = cursor;
        this.limit = limit;
        this.teamId = teamId;
    }

    public static AdminTeamsAdminsListRequestBuilder builder() {
        return new AdminTeamsAdminsListRequestBuilder();
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

    public static class AdminTeamsAdminsListRequestBuilder {
        private String token;
        private String cursor;
        private Integer limit;
        private String teamId;

        AdminTeamsAdminsListRequestBuilder() {
        }

        public AdminTeamsAdminsListRequest.AdminTeamsAdminsListRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public AdminTeamsAdminsListRequest.AdminTeamsAdminsListRequestBuilder cursor(String cursor) {
            this.cursor = cursor;
            return this;
        }

        public AdminTeamsAdminsListRequest.AdminTeamsAdminsListRequestBuilder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        public AdminTeamsAdminsListRequest.AdminTeamsAdminsListRequestBuilder teamId(String teamId) {
            this.teamId = teamId;
            return this;
        }

        public AdminTeamsAdminsListRequest build() {
            return new AdminTeamsAdminsListRequest(token, cursor, limit, teamId);
        }

        public String toString() {
            return "AdminTeamsAdminsListRequest.AdminTeamsAdminsListRequestBuilder(token=" + this.token + ", cursor=" + this.cursor + ", limit=" + this.limit + ", teamId=" + this.teamId + ")";
        }
    }
}
