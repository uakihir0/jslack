package com.github.seratch.jslack.api.methods.request.users;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class UsersIdentityRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `identity.basic`
     */
    private String token;

    UsersIdentityRequest(String token) {
        this.token = token;
    }

    public static UsersIdentityRequestBuilder builder() {
        return new UsersIdentityRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof UsersIdentityRequest)) return false;
        final UsersIdentityRequest other = (UsersIdentityRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$token = this.getToken();
        final Object other$token = other.getToken();
        if (this$token == null ? other$token != null : !this$token.equals(other$token)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof UsersIdentityRequest;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $token = this.getToken();
        result = result * PRIME + ($token == null ? 43 : $token.hashCode());
        return result;
    }

    public String toString() {
        return "UsersIdentityRequest(token=" + this.getToken() + ")";
    }

    public static class UsersIdentityRequestBuilder {
        private String token;

        UsersIdentityRequestBuilder() {
        }

        public UsersIdentityRequest.UsersIdentityRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public UsersIdentityRequest build() {
            return new UsersIdentityRequest(token);
        }

        public String toString() {
            return "UsersIdentityRequest.UsersIdentityRequestBuilder(token=" + this.token + ")";
        }
    }
}