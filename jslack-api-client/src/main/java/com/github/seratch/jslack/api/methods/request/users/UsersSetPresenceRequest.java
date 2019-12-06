package com.github.seratch.jslack.api.methods.request.users;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class UsersSetPresenceRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `users:write`
     */
    private String token;

    /**
     * Either `auto` or `away`
     */
    private String presence;

    UsersSetPresenceRequest(String token, String presence) {
        this.token = token;
        this.presence = presence;
    }

    public static UsersSetPresenceRequestBuilder builder() {
        return new UsersSetPresenceRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public String getPresence() {
        return this.presence;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setPresence(String presence) {
        this.presence = presence;
    }

    public static class UsersSetPresenceRequestBuilder {
        private String token;
        private String presence;

        UsersSetPresenceRequestBuilder() {
        }

        public UsersSetPresenceRequest.UsersSetPresenceRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public UsersSetPresenceRequest.UsersSetPresenceRequestBuilder presence(String presence) {
            this.presence = presence;
            return this;
        }

        public UsersSetPresenceRequest build() {
            return new UsersSetPresenceRequest(token, presence);
        }

        public String toString() {
            return "UsersSetPresenceRequest.UsersSetPresenceRequestBuilder(token=" + this.token + ", presence=" + this.presence + ")";
        }
    }
}