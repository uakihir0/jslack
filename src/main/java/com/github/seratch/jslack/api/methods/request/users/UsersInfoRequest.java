package com.github.seratch.jslack.api.methods.request.users;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class UsersInfoRequest implements SlackApiRequest {

    private String token;
    private String user;

    UsersInfoRequest(String token, String user) {
        this.token = token;
        this.user = user;
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

    public void setToken(String token) {
        this.token = token;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public boolean equals(Object o) {
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
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $token = this.getToken();
        result = result * PRIME + ($token == null ? 43 : $token.hashCode());
        final Object $user = this.getUser();
        result = result * PRIME + ($user == null ? 43 : $user.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof UsersInfoRequest;
    }

    public String toString() {
        return "UsersInfoRequest(token=" + this.getToken() + ", user=" + this.getUser() + ")";
    }

    public static class UsersInfoRequestBuilder {
        private String token;
        private String user;

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

        public UsersInfoRequest build() {
            return new UsersInfoRequest(token, user);
        }

        public String toString() {
            return "UsersInfoRequest.UsersInfoRequestBuilder(token=" + this.token + ", user=" + this.user + ")";
        }
    }
}