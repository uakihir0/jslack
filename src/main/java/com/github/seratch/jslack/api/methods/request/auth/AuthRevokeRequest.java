package com.github.seratch.jslack.api.methods.request.auth;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class AuthRevokeRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `none`
     */
    private String token;

    /**
     * Setting this parameter to `1` triggers a _testing mode_ where the specified token will not actually be revoked.
     */
    private boolean test;

    @java.beans.ConstructorProperties({"token", "test"})
    AuthRevokeRequest(String token, boolean test) {
        this.token = token;
        this.test = test;
    }

    public static AuthRevokeRequestBuilder builder() {
        return new AuthRevokeRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public boolean isTest() {
        return this.test;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setTest(boolean test) {
        this.test = test;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof AuthRevokeRequest)) return false;
        final AuthRevokeRequest other = (AuthRevokeRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$token = this.getToken();
        final Object other$token = other.getToken();
        if (this$token == null ? other$token != null : !this$token.equals(other$token)) return false;
        if (this.isTest() != other.isTest()) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof AuthRevokeRequest;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $token = this.getToken();
        result = result * PRIME + ($token == null ? 43 : $token.hashCode());
        result = result * PRIME + (this.isTest() ? 79 : 97);
        return result;
    }

    public String toString() {
        return "AuthRevokeRequest(token=" + this.getToken() + ", test=" + this.isTest() + ")";
    }

    public static class AuthRevokeRequestBuilder {
        private String token;
        private boolean test;

        AuthRevokeRequestBuilder() {
        }

        public AuthRevokeRequest.AuthRevokeRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public AuthRevokeRequest.AuthRevokeRequestBuilder test(boolean test) {
            this.test = test;
            return this;
        }

        public AuthRevokeRequest build() {
            return new AuthRevokeRequest(token, test);
        }

        public String toString() {
            return "AuthRevokeRequest.AuthRevokeRequestBuilder(token=" + this.token + ", test=" + this.test + ")";
        }
    }
}