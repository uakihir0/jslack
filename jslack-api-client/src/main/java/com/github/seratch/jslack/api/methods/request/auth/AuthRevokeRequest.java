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