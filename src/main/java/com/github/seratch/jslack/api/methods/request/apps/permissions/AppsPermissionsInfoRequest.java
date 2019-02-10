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

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof AppsPermissionsInfoRequest))
            return false;
        final AppsPermissionsInfoRequest other = (AppsPermissionsInfoRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$token = this.getToken();
        final Object other$token = other.getToken();
        if (this$token == null ? other$token != null : !this$token.equals(other$token)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof AppsPermissionsInfoRequest;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $token = this.getToken();
        result = result * PRIME + ($token == null ? 43 : $token.hashCode());
        return result;
    }

    public String toString() {
        return "AppsPermissionsInfoRequest(token=" + this.getToken() + ")";
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