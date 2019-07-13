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

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof AppsPermissionsRequestRequest))
            return false;
        final AppsPermissionsRequestRequest other = (AppsPermissionsRequestRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$token = this.getToken();
        final Object other$token = other.getToken();
        if (this$token == null ? other$token != null : !this$token.equals(other$token)) return false;
        final Object this$triggerId = this.getTriggerId();
        final Object other$triggerId = other.getTriggerId();
        if (this$triggerId == null ? other$triggerId != null : !this$triggerId.equals(other$triggerId)) return false;
        final Object this$scopes = this.getScopes();
        final Object other$scopes = other.getScopes();
        if (this$scopes == null ? other$scopes != null : !this$scopes.equals(other$scopes)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof AppsPermissionsRequestRequest;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $token = this.getToken();
        result = result * PRIME + ($token == null ? 43 : $token.hashCode());
        final Object $triggerId = this.getTriggerId();
        result = result * PRIME + ($triggerId == null ? 43 : $triggerId.hashCode());
        final Object $scopes = this.getScopes();
        result = result * PRIME + ($scopes == null ? 43 : $scopes.hashCode());
        return result;
    }

    public String toString() {
        return "AppsPermissionsRequestRequest(token=" + this.getToken() + ", triggerId=" + this.getTriggerId() + ", scopes=" + this.getScopes() + ")";
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