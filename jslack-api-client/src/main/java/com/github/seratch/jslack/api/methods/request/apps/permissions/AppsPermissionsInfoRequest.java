package com.github.seratch.jslack.api.methods.request.apps.permissions;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class AppsPermissionsInfoRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `none`
     */
    private String token;

    AppsPermissionsInfoRequest(String token) {
        this.token = token;
    }

    public static AppsPermissionsInfoRequestBuilder builder() {
        return new AppsPermissionsInfoRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public static class AppsPermissionsInfoRequestBuilder {
        private String token;

        AppsPermissionsInfoRequestBuilder() {
        }

        public AppsPermissionsInfoRequest.AppsPermissionsInfoRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public AppsPermissionsInfoRequest build() {
            return new AppsPermissionsInfoRequest(token);
        }

        public String toString() {
            return "AppsPermissionsInfoRequest.AppsPermissionsInfoRequestBuilder(token=" + this.token + ")";
        }
    }
}