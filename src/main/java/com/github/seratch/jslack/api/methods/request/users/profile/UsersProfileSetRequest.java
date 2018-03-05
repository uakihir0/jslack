package com.github.seratch.jslack.api.methods.request.users.profile;

import com.github.seratch.jslack.api.methods.SlackApiRequest;
import com.github.seratch.jslack.api.model.User;

public class UsersProfileSetRequest implements SlackApiRequest {

    private String token;
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

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof UsersProfileSetRequest)) return false;
        final UsersProfileSetRequest other = (UsersProfileSetRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$token = this.getToken();
        final Object other$token = other.getToken();
        if (this$token == null ? other$token != null : !this$token.equals(other$token)) return false;
        final Object this$user = this.getUser();
        final Object other$user = other.getUser();
        if (this$user == null ? other$user != null : !this$user.equals(other$user)) return false;
        final Object this$profile = this.getProfile();
        final Object other$profile = other.getProfile();
        if (this$profile == null ? other$profile != null : !this$profile.equals(other$profile)) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        final Object this$value = this.getValue();
        final Object other$value = other.getValue();
        if (this$value == null ? other$value != null : !this$value.equals(other$value)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $token = this.getToken();
        result = result * PRIME + ($token == null ? 43 : $token.hashCode());
        final Object $user = this.getUser();
        result = result * PRIME + ($user == null ? 43 : $user.hashCode());
        final Object $profile = this.getProfile();
        result = result * PRIME + ($profile == null ? 43 : $profile.hashCode());
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        final Object $value = this.getValue();
        result = result * PRIME + ($value == null ? 43 : $value.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof UsersProfileSetRequest;
    }

    public String toString() {
        return "UsersProfileSetRequest(token=" + this.getToken() + ", user=" + this.getUser() + ", profile=" + this.getProfile() + ", name=" + this.getName() + ", value=" + this.getValue() + ")";
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