package com.github.seratch.jslack.api.methods.request.apps.permissions.users;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

import java.util.List;

public class AppsPermissionsUsersRequestRequest implements SlackApiRequest {

    private String token;

    /**
     * A comma separated list of user scopes to request for
     */
    private List<String> scopes;

    /**
     * Token used to trigger the request
     */
    private String triggerId;

    /**
     * The user this scope is being requested for
     */
    private String user;

    AppsPermissionsUsersRequestRequest(String token, List<String> scopes, String triggerId, String user) {
        this.token = token;
        this.scopes = scopes;
        this.triggerId = triggerId;
        this.user = user;
    }

    public static AppsPermissionsUsersRequestRequestBuilder builder() {
        return new AppsPermissionsUsersRequestRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public List<String> getScopes() {
        return this.scopes;
    }

    public String getTriggerId() {
        return this.triggerId;
    }

    public String getUser() {
        return this.user;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setScopes(List<String> scopes) {
        this.scopes = scopes;
    }

    public void setTriggerId(String triggerId) {
        this.triggerId = triggerId;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public static class AppsPermissionsUsersRequestRequestBuilder {
        private String token;
        private List<String> scopes;
        private String triggerId;
        private String user;

        AppsPermissionsUsersRequestRequestBuilder() {
        }

        public AppsPermissionsUsersRequestRequest.AppsPermissionsUsersRequestRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public AppsPermissionsUsersRequestRequest.AppsPermissionsUsersRequestRequestBuilder scopes(List<String> scopes) {
            this.scopes = scopes;
            return this;
        }

        public AppsPermissionsUsersRequestRequest.AppsPermissionsUsersRequestRequestBuilder triggerId(String triggerId) {
            this.triggerId = triggerId;
            return this;
        }

        public AppsPermissionsUsersRequestRequest.AppsPermissionsUsersRequestRequestBuilder user(String user) {
            this.user = user;
            return this;
        }

        public AppsPermissionsUsersRequestRequest build() {
            return new AppsPermissionsUsersRequestRequest(token, scopes, triggerId, user);
        }

        public String toString() {
            return "AppsPermissionsUsersRequestRequest.AppsPermissionsUsersRequestRequestBuilder(token=" + this.token + ", scopes=" + this.scopes + ", triggerId=" + this.triggerId + ", user=" + this.user + ")";
        }
    }
}