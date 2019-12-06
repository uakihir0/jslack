package com.github.seratch.jslack.api.methods.request.admin.teams;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

/**
 * https://api.slack.com/methods/admin.teams.owners.list
 */
public class AdminTeamsOwnersListRequest implements SlackApiRequest {

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

    AdminTeamsOwnersListRequest(String token, String cursor, Integer limit, String teamId) {
        this.token = token;
        this.cursor = cursor;
        this.limit = limit;
        this.teamId = teamId;
    }

    public static AdminTeamsOwnersListRequestBuilder builder() {
        return new AdminTeamsOwnersListRequestBuilder();
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

    public static class AdminTeamsOwnersListRequestBuilder {
        private String token;
        private String cursor;
        private Integer limit;
        private String teamId;

        AdminTeamsOwnersListRequestBuilder() {
        }

        public AdminTeamsOwnersListRequest.AdminTeamsOwnersListRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public AdminTeamsOwnersListRequest.AdminTeamsOwnersListRequestBuilder cursor(String cursor) {
            this.cursor = cursor;
            return this;
        }

        public AdminTeamsOwnersListRequest.AdminTeamsOwnersListRequestBuilder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        public AdminTeamsOwnersListRequest.AdminTeamsOwnersListRequestBuilder teamId(String teamId) {
            this.teamId = teamId;
            return this;
        }

        public AdminTeamsOwnersListRequest build() {
            return new AdminTeamsOwnersListRequest(token, cursor, limit, teamId);
        }

        public String toString() {
            return "AdminTeamsOwnersListRequest.AdminTeamsOwnersListRequestBuilder(token=" + this.token + ", cursor=" + this.cursor + ", limit=" + this.limit + ", teamId=" + this.teamId + ")";
        }
    }
}
