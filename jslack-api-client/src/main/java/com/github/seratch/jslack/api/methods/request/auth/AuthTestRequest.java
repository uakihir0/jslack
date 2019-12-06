package com.github.seratch.jslack.api.methods.request.auth;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class AuthTestRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `none`
     */
    private String token;

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