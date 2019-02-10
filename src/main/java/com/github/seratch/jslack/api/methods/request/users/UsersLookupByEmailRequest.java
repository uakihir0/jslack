package com.github.seratch.jslack.api.methods.request.users;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class UsersLookupByEmailRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `users:read.email`
     */
    private String token;

    /**
     * An email address belonging to a user in the workspace
     */
    private String email;

    @java.beans.ConstructorProperties({"token", "email"})
    UsersLookupByEmailRequest(String token, String email) {
        this.token = token;
        this.email = email;
    }

    public static UsersLookupByEmailRequestBuilder builder() {
        return new UsersLookupByEmailRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public String getEmail() {
        return this.email;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof UsersLookupByEmailRequest)) return false;
        final UsersLookupByEmailRequest other = (UsersLookupByEmailRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$token = this.getToken();
        final Object other$token = other.getToken();
        if (this$token == null ? other$token != null : !this$token.equals(other$token)) return false;
        final Object this$email = this.getEmail();
        final Object other$email = other.getEmail();
        if (this$email == null ? other$email != null : !this$email.equals(other$email)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof UsersLookupByEmailRequest;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $token = this.getToken();
        result = result * PRIME + ($token == null ? 43 : $token.hashCode());
        final Object $email = this.getEmail();
        result = result * PRIME + ($email == null ? 43 : $email.hashCode());
        return result;
    }

    public String toString() {
        return "UsersLookupByEmailRequest(token=" + this.getToken() + ", email=" + this.getEmail() + ")";
    }

    public static class UsersLookupByEmailRequestBuilder {
        private String token;
        private String email;

        UsersLookupByEmailRequestBuilder() {
        }

        public UsersLookupByEmailRequest.UsersLookupByEmailRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public UsersLookupByEmailRequest.UsersLookupByEmailRequestBuilder email(String email) {
            this.email = email;
            return this;
        }

        public UsersLookupByEmailRequest build() {
            return new UsersLookupByEmailRequest(token, email);
        }

        public String toString() {
            return "UsersLookupByEmailRequest.UsersLookupByEmailRequestBuilder(token=" + this.token + ", email=" + this.email + ")";
        }
    }
}