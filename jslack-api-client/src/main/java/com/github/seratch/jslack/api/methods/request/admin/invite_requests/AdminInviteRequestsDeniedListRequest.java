package com.github.seratch.jslack.api.methods.request.admin.invite_requests;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

/**
 * https://api.slack.com/methods/admin.inviteRequests.denied.list
 */
public class AdminInviteRequestsDeniedListRequest implements SlackApiRequest {

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

    AdminInviteRequestsDeniedListRequest(String token, String cursor, Integer limit, String teamId) {
        this.token = token;
        this.cursor = cursor;
        this.limit = limit;
        this.teamId = teamId;
    }

    public static AdminInviteRequestsDeniedListRequestBuilder builder() {
        return new AdminInviteRequestsDeniedListRequestBuilder();
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

    public static class AdminInviteRequestsDeniedListRequestBuilder {
        private String token;
        private String cursor;
        private Integer limit;
        private String teamId;

        AdminInviteRequestsDeniedListRequestBuilder() {
        }

        public AdminInviteRequestsDeniedListRequest.AdminInviteRequestsDeniedListRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public AdminInviteRequestsDeniedListRequest.AdminInviteRequestsDeniedListRequestBuilder cursor(String cursor) {
            this.cursor = cursor;
            return this;
        }

        public AdminInviteRequestsDeniedListRequest.AdminInviteRequestsDeniedListRequestBuilder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        public AdminInviteRequestsDeniedListRequest.AdminInviteRequestsDeniedListRequestBuilder teamId(String teamId) {
            this.teamId = teamId;
            return this;
        }

        public AdminInviteRequestsDeniedListRequest build() {
            return new AdminInviteRequestsDeniedListRequest(token, cursor, limit, teamId);
        }

        public String toString() {
            return "AdminInviteRequestsDeniedListRequest.AdminInviteRequestsDeniedListRequestBuilder(token=" + this.token + ", cursor=" + this.cursor + ", limit=" + this.limit + ", teamId=" + this.teamId + ")";
        }
    }
}
