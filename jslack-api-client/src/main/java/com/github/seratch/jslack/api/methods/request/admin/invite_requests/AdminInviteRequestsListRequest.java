package com.github.seratch.jslack.api.methods.request.admin.invite_requests;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

/**
 * https://api.slack.com/methods/admin.inviteRequests.list
 */
public class AdminInviteRequestsListRequest implements SlackApiRequest {

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

    AdminInviteRequestsListRequest(String token, String cursor, Integer limit, String teamId) {
        this.token = token;
        this.cursor = cursor;
        this.limit = limit;
        this.teamId = teamId;
    }

    public static AdminInviteRequestsListRequestBuilder builder() {
        return new AdminInviteRequestsListRequestBuilder();
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

    public static class AdminInviteRequestsListRequestBuilder {
        private String token;
        private String cursor;
        private Integer limit;
        private String teamId;

        AdminInviteRequestsListRequestBuilder() {
        }

        public AdminInviteRequestsListRequest.AdminInviteRequestsListRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public AdminInviteRequestsListRequest.AdminInviteRequestsListRequestBuilder cursor(String cursor) {
            this.cursor = cursor;
            return this;
        }

        public AdminInviteRequestsListRequest.AdminInviteRequestsListRequestBuilder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        public AdminInviteRequestsListRequest.AdminInviteRequestsListRequestBuilder teamId(String teamId) {
            this.teamId = teamId;
            return this;
        }

        public AdminInviteRequestsListRequest build() {
            return new AdminInviteRequestsListRequest(token, cursor, limit, teamId);
        }

        public String toString() {
            return "AdminInviteRequestsListRequest.AdminInviteRequestsListRequestBuilder(token=" + this.token + ", cursor=" + this.cursor + ", limit=" + this.limit + ", teamId=" + this.teamId + ")";
        }
    }
}
