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