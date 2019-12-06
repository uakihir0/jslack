package com.github.seratch.jslack.api.methods.request.apps.permissions.scopes;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class AppsPermissionsScopesListRequest implements SlackApiRequest {

    private String token;

    AppsPermissionsScopesListRequest(String token) {
        this.token = token;
    }

    public static AppsPermissionsScopesListRequestBuilder builder() {
        return new AppsPermissionsScopesListRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public static class AppsPermissionsScopesListRequestBuilder {
        private String token;

        AppsPermissionsScopesListRequestBuilder() {
        }

        public AppsPermissionsScopesListRequest.AppsPermissionsScopesListRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public AppsPermissionsScopesListRequest build() {
            return new AppsPermissionsScopesListRequest(token);
        }

        public String toString() {
            return "AppsPermissionsScopesListRequest.AppsPermissionsScopesListRequestBuilder(token=" + this.token + ")";
        }
    }
}