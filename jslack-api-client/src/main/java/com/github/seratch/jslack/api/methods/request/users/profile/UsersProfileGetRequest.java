package com.github.seratch.jslack.api.methods.request.users.profile;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class UsersProfileGetRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `users.profile:read`
     */
    private String token;

    /**
     * User to retrieve profile info for
     */
    private String user;

    /**
     * Include labels for each ID in custom profile fields
     */
    private boolean includeLabels;

    UsersProfileGetRequest(String token, String user, boolean includeLabels) {
        this.token = token;
        this.user = user;
        this.includeLabels = includeLabels;
    }

    public static UsersProfileGetRequestBuilder builder() {
        return new UsersProfileGetRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public String getUser() {
        return this.user;
    }

    public boolean isIncludeLabels() {
        return this.includeLabels;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setIncludeLabels(boolean includeLabels) {
        this.includeLabels = includeLabels;
    }

    public static class UsersProfileGetRequestBuilder {
        private String token;
        private String user;
        private boolean includeLabels;

        UsersProfileGetRequestBuilder() {
        }

        public UsersProfileGetRequest.UsersProfileGetRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public UsersProfileGetRequest.UsersProfileGetRequestBuilder user(String user) {
            this.user = user;
            return this;
        }

        public UsersProfileGetRequest.UsersProfileGetRequestBuilder includeLabels(boolean includeLabels) {
            this.includeLabels = includeLabels;
            return this;
        }

        public UsersProfileGetRequest build() {
            return new UsersProfileGetRequest(token, user, includeLabels);
        }

        public String toString() {
            return "UsersProfileGetRequest.UsersProfileGetRequestBuilder(token=" + this.token + ", user=" + this.user + ", includeLabels=" + this.includeLabels + ")";
        }
    }
}