package com.github.seratch.jslack.api.methods.request.users.profile;

import com.github.seratch.jslack.api.methods.SlackApiRequest;
import com.github.seratch.jslack.api.model.User;

public class UsersProfileSetRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `users.profile:write`
     */
    private String token;

    /**
     * ID of user to change. This argument may only be specified by team admins on paid teams.
     */
    private String user;

    /**
     * Collection of key:value pairs presented as a URL-encoded JSON hash.
     */
    private User.Profile profile;

    /**
     * Name of a single key to set. Usable only if profile is not passed.
     */
    private String name;

    /**
     * Value to set a single key to. Usable only if profile is not passed.
     */
    private String value;

    UsersProfileSetRequest(String token, String user, User.Profile profile, String name, String value) {
        this.token = token;
        this.user = user;
        this.profile = profile;
        this.name = name;
        this.value = value;
    }

    public static UsersProfileSetRequestBuilder builder() {
        return new UsersProfileSetRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public String getUser() {
        return this.user;
    }

    public User.Profile getProfile() {
        return this.profile;
    }

    public String getName() {
        return this.name;
    }

    public String getValue() {
        return this.value;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setProfile(User.Profile profile) {
        this.profile = profile;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public static class UsersProfileSetRequestBuilder {
        private String token;
        private String user;
        private User.Profile profile;
        private String name;
        private String value;

        UsersProfileSetRequestBuilder() {
        }

        public UsersProfileSetRequest.UsersProfileSetRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public UsersProfileSetRequest.UsersProfileSetRequestBuilder user(String user) {
            this.user = user;
            return this;
        }

        public UsersProfileSetRequest.UsersProfileSetRequestBuilder profile(User.Profile profile) {
            this.profile = profile;
            return this;
        }

        public UsersProfileSetRequest.UsersProfileSetRequestBuilder name(String name) {
            this.name = name;
            return this;
        }

        public UsersProfileSetRequest.UsersProfileSetRequestBuilder value(String value) {
            this.value = value;
            return this;
        }

        public UsersProfileSetRequest build() {
            return new UsersProfileSetRequest(token, user, profile, name, value);
        }

        public String toString() {
            return "UsersProfileSetRequest.UsersProfileSetRequestBuilder(token=" + this.token + ", user=" + this.user + ", profile=" + this.profile + ", name=" + this.name + ", value=" + this.value + ")";
        }
    }
}