package com.github.seratch.jslack.api.methods.request.admin.users;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

/**
 * https://api.slack.com/methods/admin.users.remove
 */
public class AdminUsersRemoveRequest implements SlackApiRequest {

    /**
     * Authentication token bearing required scopes.
     */
    private String token;

    /**
     * Workspace Id
     */
    private String teamId;

    /**
     * The ID of the user to remove.
     */
    private String userId;

    AdminUsersRemoveRequest(String token, String teamId, String userId) {
        this.token = token;
        this.teamId = teamId;
        this.userId = userId;
    }

    public static AdminUsersRemoveRequestBuilder builder() {
        return new AdminUsersRemoveRequestBuilder();
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

    public static class AdminUsersRemoveRequestBuilder {
        private String token;
        private String teamId;
        private String userId;

        AdminUsersRemoveRequestBuilder() {
        }

        public AdminUsersRemoveRequest.AdminUsersRemoveRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public AdminUsersRemoveRequest.AdminUsersRemoveRequestBuilder teamId(String teamId) {
            this.teamId = teamId;
            return this;
        }

        public AdminUsersRemoveRequest.AdminUsersRemoveRequestBuilder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public AdminUsersRemoveRequest build() {
            return new AdminUsersRemoveRequest(token, teamId, userId);
        }

        public String toString() {
            return "AdminUsersRemoveRequest.AdminUsersRemoveRequestBuilder(token=" + this.token + ", teamId=" + this.teamId + ", userId=" + this.userId + ")";
        }
    }
}
