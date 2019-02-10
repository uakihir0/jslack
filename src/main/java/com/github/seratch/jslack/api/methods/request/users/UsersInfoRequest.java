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

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof UsersInfoRequest)) return false;
        final UsersInfoRequest other = (UsersInfoRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$token = this.getToken();
        final Object other$token = other.getToken();
        if (this$token == null ? other$token != null : !this$token.equals(other$token)) return false;
        final Object this$user = this.getUser();
        final Object other$user = other.getUser();
        if (this$user == null ? other$user != null : !this$user.equals(other$user)) return false;
        if (this.isIncludeLocale() != other.isIncludeLocale()) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof UsersInfoRequest;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $token = this.getToken();
        result = result * PRIME + ($token == null ? 43 : $token.hashCode());
        final Object $user = this.getUser();
        result = result * PRIME + ($user == null ? 43 : $user.hashCode());
        result = result * PRIME + (this.isIncludeLocale() ? 79 : 97);
        return result;
    }

    public String toString() {
        return "UsersInfoRequest(token=" + this.getToken() + ", user=" + this.getUser() + ", includeLocale=" + this.isIncludeLocale() + ")";
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