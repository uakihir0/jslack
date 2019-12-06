package com.github.seratch.jslack.api.methods.request.admin.users;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

/**
 * https://api.slack.com/methods/admin.users.setOwner
 */
public class AdminUsersSetOwnerRequest implements SlackApiRequest {

    /**
     * Authentication token bearing required scopes.
     */
    private String token;

    /**
     * Workspace Id
     */
    private String teamId;

    /**
     * Id of the user to promote to owner.
     */
    private String userId;

    AdminUsersSetOwnerRequest(String token, String teamId, String userId) {
        this.token = token;
        this.teamId = teamId;
        this.userId = userId;
    }

    public static AdminUsersSetOwnerRequestBuilder builder() {
        return new AdminUsersSetOwnerRequestBuilder();
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

    public static class AdminUsersSetOwnerRequestBuilder {
        private String token;
        private String teamId;
        private String userId;

        AdminUsersSetOwnerRequestBuilder() {
        }

        public AdminUsersSetOwnerRequest.AdminUsersSetOwnerRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public AdminUsersSetOwnerRequest.AdminUsersSetOwnerRequestBuilder teamId(String teamId) {
            this.teamId = teamId;
            return this;
        }

        public AdminUsersSetOwnerRequest.AdminUsersSetOwnerRequestBuilder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public AdminUsersSetOwnerRequest build() {
            return new AdminUsersSetOwnerRequest(token, teamId, userId);
        }

        public String toString() {
            return "AdminUsersSetOwnerRequest.AdminUsersSetOwnerRequestBuilder(token=" + this.token + ", teamId=" + this.teamId + ", userId=" + this.userId + ")";
        }
    }
}
