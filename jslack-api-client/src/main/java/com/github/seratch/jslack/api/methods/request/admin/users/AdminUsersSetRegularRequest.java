package com.github.seratch.jslack.api.methods.request.admin.users;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

/**
 * https://api.slack.com/methods/admin.users.setRegular
 */
public class AdminUsersSetRegularRequest implements SlackApiRequest {

    /**
     * Authentication token bearing required scopes.
     */
    private String token;

    /**
     * Workspace Id
     */
    private String teamId;

    /**
     * The ID of the user to designate as a regular user.
     */
    private String userId;

    AdminUsersSetRegularRequest(String token, String teamId, String userId) {
        this.token = token;
        this.teamId = teamId;
        this.userId = userId;
    }

    public static AdminUsersSetRegularRequestBuilder builder() {
        return new AdminUsersSetRegularRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public String getTeamId() {
        return this.teamId;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public static class AdminUsersSetRegularRequestBuilder {
        private String token;
        private String teamId;
        private String userId;

        AdminUsersSetRegularRequestBuilder() {
        }

        public AdminUsersSetRegularRequest.AdminUsersSetRegularRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public AdminUsersSetRegularRequest.AdminUsersSetRegularRequestBuilder teamId(String teamId) {
            this.teamId = teamId;
            return this;
        }

        public AdminUsersSetRegularRequest.AdminUsersSetRegularRequestBuilder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public AdminUsersSetRegularRequest build() {
            return new AdminUsersSetRegularRequest(token, teamId, userId);
        }

        public String toString() {
            return "AdminUsersSetRegularRequest.AdminUsersSetRegularRequestBuilder(token=" + this.token + ", teamId=" + this.teamId + ", userId=" + this.userId + ")";
        }
    }
}
