package com.github.seratch.jslack.api.methods.request.admin.users;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

/**
 * https://api.slack.com/methods/admin.users.setAdmin
 */
public class AdminUsersSetAdminRequest implements SlackApiRequest {

    /**
     * Authentication token bearing required scopes.
     */
    private String token;

    /**
     * Workspace Id
     */
    private String teamId;

    /**
     * The ID of the user to designate as an admin.
     */
    private String userId;

    AdminUsersSetAdminRequest(String token, String teamId, String userId) {
        this.token = token;
        this.teamId = teamId;
        this.userId = userId;
    }

    public static AdminUsersSetAdminRequestBuilder builder() {
        return new AdminUsersSetAdminRequestBuilder();
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

    public static class AdminUsersSetAdminRequestBuilder {
        private String token;
        private String teamId;
        private String userId;

        AdminUsersSetAdminRequestBuilder() {
        }

        public AdminUsersSetAdminRequest.AdminUsersSetAdminRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public AdminUsersSetAdminRequest.AdminUsersSetAdminRequestBuilder teamId(String teamId) {
            this.teamId = teamId;
            return this;
        }

        public AdminUsersSetAdminRequest.AdminUsersSetAdminRequestBuilder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public AdminUsersSetAdminRequest build() {
            return new AdminUsersSetAdminRequest(token, teamId, userId);
        }

        public String toString() {
            return "AdminUsersSetAdminRequest.AdminUsersSetAdminRequestBuilder(token=" + this.token + ", teamId=" + this.teamId + ", userId=" + this.userId + ")";
        }
    }
}
