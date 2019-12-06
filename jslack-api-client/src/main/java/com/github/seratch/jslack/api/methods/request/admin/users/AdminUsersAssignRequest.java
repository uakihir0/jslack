package com.github.seratch.jslack.api.methods.request.admin.users;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

/**
 * https://api.slack.com/methods/admin.users.assign
 */
public class AdminUsersAssignRequest implements SlackApiRequest {

    /**
     * Authentication token bearing required scopes.
     */
    private String token;

    /**
     * Workspace Id.
     */
    private String teamId;

    /**
     * The ID of the user to add to the workspace.
     */
    private String userId;

    /**
     * True if user should be added to the workspace as a guest.
     */
    private boolean isRestricted;

    /**
     * True if user should be added to the workspace as a single-channel guest.
     */
    private boolean isUltraRestricted;

    AdminUsersAssignRequest(String token, String teamId, String userId, boolean isRestricted, boolean isUltraRestricted) {
        this.token = token;
        this.teamId = teamId;
        this.userId = userId;
        this.isRestricted = isRestricted;
        this.isUltraRestricted = isUltraRestricted;
    }

    public static AdminUsersAssignRequestBuilder builder() {
        return new AdminUsersAssignRequestBuilder();
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

    public boolean isRestricted() {
        return this.isRestricted;
    }

    public boolean isUltraRestricted() {
        return this.isUltraRestricted;
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

    public void setRestricted(boolean isRestricted) {
        this.isRestricted = isRestricted;
    }

    public void setUltraRestricted(boolean isUltraRestricted) {
        this.isUltraRestricted = isUltraRestricted;
    }

    public static class AdminUsersAssignRequestBuilder {
        private String token;
        private String teamId;
        private String userId;
        private boolean isRestricted;
        private boolean isUltraRestricted;

        AdminUsersAssignRequestBuilder() {
        }

        public AdminUsersAssignRequest.AdminUsersAssignRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public AdminUsersAssignRequest.AdminUsersAssignRequestBuilder teamId(String teamId) {
            this.teamId = teamId;
            return this;
        }

        public AdminUsersAssignRequest.AdminUsersAssignRequestBuilder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public AdminUsersAssignRequest.AdminUsersAssignRequestBuilder isRestricted(boolean isRestricted) {
            this.isRestricted = isRestricted;
            return this;
        }

        public AdminUsersAssignRequest.AdminUsersAssignRequestBuilder isUltraRestricted(boolean isUltraRestricted) {
            this.isUltraRestricted = isUltraRestricted;
            return this;
        }

        public AdminUsersAssignRequest build() {
            return new AdminUsersAssignRequest(token, teamId, userId, isRestricted, isUltraRestricted);
        }

        public String toString() {
            return "AdminUsersAssignRequest.AdminUsersAssignRequestBuilder(token=" + this.token + ", teamId=" + this.teamId + ", userId=" + this.userId + ", isRestricted=" + this.isRestricted + ", isUltraRestricted=" + this.isUltraRestricted + ")";
        }
    }
}
