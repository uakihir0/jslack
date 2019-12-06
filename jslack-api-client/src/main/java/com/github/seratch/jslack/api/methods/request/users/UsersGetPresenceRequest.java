package com.github.seratch.jslack.api.methods.request.users;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class UsersGetPresenceRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `users:read`
     */
    private String token;

    /**
     * User to get presence info on. Defaults to the authed user.
     */
    private String user;

    UsersGetPresenceRequest(String token, String user) {
        this.token = token;
        this.user = user;
    }

    public static UsersGetPresenceRequestBuilder builder() {
        return new UsersGetPresenceRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public String getUser() {
        return this.user;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public static class UsersGetPresenceRequestBuilder {
        private String token;
        private String user;

        UsersGetPresenceRequestBuilder() {
        }

        public UsersGetPresenceRequest.UsersGetPresenceRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public UsersGetPresenceRequest.UsersGetPresenceRequestBuilder user(String user) {
            this.user = user;
            return this;
        }

        public UsersGetPresenceRequest build() {
            return new UsersGetPresenceRequest(token, user);
        }

        public String toString() {
            return "UsersGetPresenceRequest.UsersGetPresenceRequestBuilder(token=" + this.token + ", user=" + this.user + ")";
        }
    }
}