package com.github.seratch.jslack.api.methods.request.auth;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class AuthTestRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `none`
     */
    private String token;

    @java.beans.ConstructorProperties({"token"})
    AuthTestRequest(String token) {
        this.token = token;
    }

    public static AuthTestRequestBuilder builder() {
        return new AuthTestRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof AuthTestRequest)) return false;
        final AuthTestRequest other = (AuthTestRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$token = this.getToken();
        final Object other$token = other.getToken();
        if (this$token == null ? other$token != null : !this$token.equals(other$token)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof AuthTestRequest;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $token = this.getToken();
        result = result * PRIME + ($token == null ? 43 : $token.hashCode());
        return result;
    }

    public String toString() {
        return "AuthTestRequest(token=" + this.getToken() + ")";
    }

    public static class AuthTestRequestBuilder {
        private String token;

        AuthTestRequestBuilder() {
        }

        public AuthTestRequest.AuthTestRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public AuthTestRequest build() {
            return new AuthTestRequest(token);
        }

        public String toString() {
            return "AuthTestRequest.AuthTestRequestBuilder(token=" + this.token + ")";
        }
    }
}