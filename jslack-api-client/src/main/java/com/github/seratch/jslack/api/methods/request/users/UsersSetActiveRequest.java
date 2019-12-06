package com.github.seratch.jslack.api.methods.request.users;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class UsersSetActiveRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `users:write`
     */
    private String token;

    UsersSetActiveRequest(String token) {
        this.token = token;
    }

    public static UsersSetActiveRequestBuilder builder() {
        return new UsersSetActiveRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public static class UsersSetActiveRequestBuilder {
        private String token;

        UsersSetActiveRequestBuilder() {
        }

        public UsersSetActiveRequest.UsersSetActiveRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public UsersSetActiveRequest build() {
            return new UsersSetActiveRequest(token);
        }

        public String toString() {
            return "UsersSetActiveRequest.UsersSetActiveRequestBuilder(token=" + this.token + ")";
        }
    }
}