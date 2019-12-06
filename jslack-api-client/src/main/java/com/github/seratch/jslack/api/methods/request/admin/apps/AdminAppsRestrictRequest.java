package com.github.seratch.jslack.api.methods.request.admin.apps;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

/**
 * https://api.slack.com/methods/admin.apps.restrict
 */
public class AdminAppsRestrictRequest implements SlackApiRequest {

    /**
     * Authentication token bearing required scopes.
     */
    private String token;

    /**
     * The id of the app to approve.
     */
    private String appId;

    /**
     * The id of the request to approve.
     */
    private String requestId;

    /**
     * Workspace Id
     */
    private String teamId;

    AdminAppsRestrictRequest(String token, String appId, String requestId, String teamId) {
        this.token = token;
        this.appId = appId;
        this.requestId = requestId;
        this.teamId = teamId;
    }

    public static AdminAppsRestrictRequestBuilder builder() {
        return new AdminAppsRestrictRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public String getAppId() {
        return this.appId;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public String getTeamId() {
        return this.teamId;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    public static class AdminAppsRestrictRequestBuilder {
        private String token;
        private String appId;
        private String requestId;
        private String teamId;

        AdminAppsRestrictRequestBuilder() {
        }

        public AdminAppsRestrictRequest.AdminAppsRestrictRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public AdminAppsRestrictRequest.AdminAppsRestrictRequestBuilder appId(String appId) {
            this.appId = appId;
            return this;
        }

        public AdminAppsRestrictRequest.AdminAppsRestrictRequestBuilder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AdminAppsRestrictRequest.AdminAppsRestrictRequestBuilder teamId(String teamId) {
            this.teamId = teamId;
            return this;
        }

        public AdminAppsRestrictRequest build() {
            return new AdminAppsRestrictRequest(token, appId, requestId, teamId);
        }

        public String toString() {
            return "AdminAppsRestrictRequest.AdminAppsRestrictRequestBuilder(token=" + this.token + ", appId=" + this.appId + ", requestId=" + this.requestId + ", teamId=" + this.teamId + ")";
        }
    }
}
