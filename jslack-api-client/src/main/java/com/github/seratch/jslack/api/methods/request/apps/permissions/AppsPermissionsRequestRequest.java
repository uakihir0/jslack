package com.github.seratch.jslack.api.methods.request.apps.permissions;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

import java.util.List;

public class AppsPermissionsRequestRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `none`
     */
    private String token;

    /**
     * Token used to trigger the permissions API
     */
    private String triggerId;

    /**
     * A comma separated list of scopes to request for
     */
    private List<String> scopes;

    AppsPermissionsRequestRequest(String token, String triggerId, List<String> scopes) {
        this.token = token;
        this.triggerId = triggerId;
        this.scopes = scopes;
    }

    public static AppsPermissionsRequestRequestBuilder builder() {
        return new AppsPermissionsRequestRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public String getTriggerId() {
        return this.triggerId;
    }

    public List<String> getScopes() {
        return this.scopes;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setTriggerId(String triggerId) {
        this.triggerId = triggerId;
    }

    public void setScopes(List<String> scopes) {
        this.scopes = scopes;
    }

    public static class AppsPermissionsRequestRequestBuilder {
        private String token;
        private String triggerId;
        private List<String> scopes;

        AppsPermissionsRequestRequestBuilder() {
        }

        public AppsPermissionsRequestRequest.AppsPermissionsRequestRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public AppsPermissionsRequestRequest.AppsPermissionsRequestRequestBuilder triggerId(String triggerId) {
            this.triggerId = triggerId;
            return this;
        }

        public AppsPermissionsRequestRequest.AppsPermissionsRequestRequestBuilder scopes(List<String> scopes) {
            this.scopes = scopes;
            return this;
        }

        public AppsPermissionsRequestRequest build() {
            return new AppsPermissionsRequestRequest(token, triggerId, scopes);
        }

        public String toString() {
            return "AppsPermissionsRequestRequest.AppsPermissionsRequestRequestBuilder(token=" + this.token + ", triggerId=" + this.triggerId + ", scopes=" + this.scopes + ")";
        }
    }
}