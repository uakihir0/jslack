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

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof AppsPermissionsScopesListRequest))
            return false;
        final AppsPermissionsScopesListRequest other = (AppsPermissionsScopesListRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$token = this.getToken();
        final Object other$token = other.getToken();
        if (this$token == null ? other$token != null : !this$token.equals(other$token)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof AppsPermissionsScopesListRequest;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $token = this.getToken();
        result = result * PRIME + ($token == null ? 43 : $token.hashCode());
        return result;
    }

    public String toString() {
        return "AppsPermissionsScopesListRequest(token=" + this.getToken() + ")";
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