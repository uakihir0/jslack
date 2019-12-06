package com.github.seratch.jslack.api.methods.request.users;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class UsersInfoRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `users:read`
     */
    private String token;

    /**
     * User to get info on
     */
    private String user;

    /**
     * Set this to `true` to receive the locale for this user. Defaults to `false`
     */
    private boolean includeLocale;

    UsersInfoRequest(String token, String user, boolean includeLocale) {
        this.token = token;
        this.user = user;
        this.includeLocale = includeLocale;
    }

    public static UsersInfoRequestBuilder builder() {
        return new UsersInfoRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public String getUser() {
        return this.user;
    }

    public boolean isIncludeLocale() {
        return this.includeLocale;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setIncludeLocale(boolean includeLocale) {
        this.includeLocale = includeLocale;
    }

    public static class UsersInfoRequestBuilder {
        private String token;
        private String user;
        private boolean includeLocale;

        UsersInfoRequestBuilder() {
        }

        public UsersInfoRequest.UsersInfoRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public UsersInfoRequest.UsersInfoRequestBuilder user(String user) {
            this.user = user;
            return this;
        }

        public UsersInfoRequest.UsersInfoRequestBuilder includeLocale(boolean includeLocale) {
            this.includeLocale = includeLocale;
            return this;
        }

        public UsersInfoRequest build() {
            return new UsersInfoRequest(token, user, includeLocale);
        }

        public String toString() {
            return "UsersInfoRequest.UsersInfoRequestBuilder(token=" + this.token + ", user=" + this.user + ", includeLocale=" + this.includeLocale + ")";
        }
    }
}