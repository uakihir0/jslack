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

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof UsersProfileGetRequest))
            return false;
        final UsersProfileGetRequest other = (UsersProfileGetRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$token = this.getToken();
        final Object other$token = other.getToken();
        if (this$token == null ? other$token != null : !this$token.equals(other$token)) return false;
        final Object this$user = this.getUser();
        final Object other$user = other.getUser();
        if (this$user == null ? other$user != null : !this$user.equals(other$user)) return false;
        if (this.isIncludeLabels() != other.isIncludeLabels()) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof UsersProfileGetRequest;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $token = this.getToken();
        result = result * PRIME + ($token == null ? 43 : $token.hashCode());
        final Object $user = this.getUser();
        result = result * PRIME + ($user == null ? 43 : $user.hashCode());
        result = result * PRIME + (this.isIncludeLabels() ? 79 : 97);
        return result;
    }

    public String toString() {
        return "UsersProfileGetRequest(token=" + this.getToken() + ", user=" + this.getUser() + ", includeLabels=" + this.isIncludeLabels() + ")";
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