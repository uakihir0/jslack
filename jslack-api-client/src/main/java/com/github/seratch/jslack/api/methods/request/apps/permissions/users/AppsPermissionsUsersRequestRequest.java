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

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof AppsPermissionsUsersRequestRequest))
            return false;
        final AppsPermissionsUsersRequestRequest other = (AppsPermissionsUsersRequestRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$token = this.getToken();
        final Object other$token = other.getToken();
        if (this$token == null ? other$token != null : !this$token.equals(other$token)) return false;
        final Object this$scopes = this.getScopes();
        final Object other$scopes = other.getScopes();
        if (this$scopes == null ? other$scopes != null : !this$scopes.equals(other$scopes)) return false;
        final Object this$triggerId = this.getTriggerId();
        final Object other$triggerId = other.getTriggerId();
        if (this$triggerId == null ? other$triggerId != null : !this$triggerId.equals(other$triggerId)) return false;
        final Object this$user = this.getUser();
        final Object other$user = other.getUser();
        if (this$user == null ? other$user != null : !this$user.equals(other$user)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof AppsPermissionsUsersRequestRequest;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $token = this.getToken();
        result = result * PRIME + ($token == null ? 43 : $token.hashCode());
        final Object $scopes = this.getScopes();
        result = result * PRIME + ($scopes == null ? 43 : $scopes.hashCode());
        final Object $triggerId = this.getTriggerId();
        result = result * PRIME + ($triggerId == null ? 43 : $triggerId.hashCode());
        final Object $user = this.getUser();
        result = result * PRIME + ($user == null ? 43 : $user.hashCode());
        return result;
    }

    public String toString() {
        return "AppsPermissionsUsersRequestRequest(token=" + this.getToken() + ", scopes=" + this.getScopes() + ", triggerId=" + this.getTriggerId() + ", user=" + this.getUser() + ")";
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