package com.github.seratch.jslack.api.methods.request.auth;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class AuthRevokeRequest implements SlackApiRequest {

    private String token;
    private String test;

    @java.beans.ConstructorProperties({"token", "test"})
    AuthRevokeRequest(String token, String test) {
        this.token = token;
        this.test = test;
    }

    public static AuthRevokeRequestBuilder builder() {
        return new AuthRevokeRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public String getTest() {
        return this.test;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setTest(String test) {
        this.test = test;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof AuthRevokeRequest)) return false;
        final AuthRevokeRequest other = (AuthRevokeRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$token = this.getToken();
        final Object other$token = other.getToken();
        if (this$token == null ? other$token != null : !this$token.equals(other$token)) return false;
        final Object this$test = this.getTest();
        final Object other$test = other.getTest();
        if (this$test == null ? other$test != null : !this$test.equals(other$test)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $token = this.getToken();
        result = result * PRIME + ($token == null ? 43 : $token.hashCode());
        final Object $test = this.getTest();
        result = result * PRIME + ($test == null ? 43 : $test.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof AuthRevokeRequest;
    }

    public String toString() {
        return "AuthRevokeRequest(token=" + this.getToken() + ", test=" + this.getTest() + ")";
    }

    public static class AuthRevokeRequestBuilder {
        private String token;
        private String test;

        AuthRevokeRequestBuilder() {
        }

        public AuthRevokeRequest.AuthRevokeRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public AuthRevokeRequest.AuthRevokeRequestBuilder test(String test) {
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