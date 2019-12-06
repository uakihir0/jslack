package com.github.seratch.jslack.api.methods.request.users;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class UsersLookupByEmailRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `users:read.email`
     */
    private String token;

    /**
     * An email address belonging to a user in the workspace
     */
    private String email;

    UsersLookupByEmailRequest(String token, String email) {
        this.token = token;
        this.email = email;
    }

    public static UsersLookupByEmailRequestBuilder builder() {
        return new UsersLookupByEmailRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public String getEmail() {
        return this.email;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static class UsersLookupByEmailRequestBuilder {
        private String token;
        private String email;

        UsersLookupByEmailRequestBuilder() {
        }

        public UsersLookupByEmailRequest.UsersLookupByEmailRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public UsersLookupByEmailRequest.UsersLookupByEmailRequestBuilder email(String email) {
            this.email = email;
            return this;
        }

        public UsersLookupByEmailRequest build() {
            return new UsersLookupByEmailRequest(token, email);
        }

        public String toString() {
            return "UsersLookupByEmailRequest.UsersLookupByEmailRequestBuilder(token=" + this.token + ", email=" + this.email + ")";
        }
    }
}