package com.github.seratch.jslack.api.methods.request.users;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class UsersSetActiveRequest implements SlackApiRequest {

    private String token;

    @java.beans.ConstructorProperties({"token"})
    UsersSetActiveRequest(String token) {
        this.token = token;
    }

    public static UsersSetActiveRequestBuilder builder() {
        return new UsersSetActiveRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof UsersSetActiveRequest)) return false;
        final UsersSetActiveRequest other = (UsersSetActiveRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$token = this.getToken();
        final Object other$token = other.getToken();
        if (this$token == null ? other$token != null : !this$token.equals(other$token)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $token = this.getToken();
        result = result * PRIME + ($token == null ? 43 : $token.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof UsersSetActiveRequest;
    }

    public String toString() {
        return "UsersSetActiveRequest(token=" + this.getToken() + ")";
    }

    public static class UsersSetActiveRequestBuilder {
        private String token;

        UsersSetActiveRequestBuilder() {
        }

        public UsersSetActiveRequest.UsersSetActiveRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public UsersSetActiveRequest build() {
            return new UsersSetActiveRequest(token);
        }

        public String toString() {
            return "UsersSetActiveRequest.UsersSetActiveRequestBuilder(token=" + this.token + ")";
        }
    }
}