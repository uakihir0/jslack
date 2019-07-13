package com.github.seratch.jslack.api.methods.request.users;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

/**
 * Delete the user profile photo
 */
public class UsersDeletePhotoRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `users.profile:write`
     */
    private String token;

    UsersDeletePhotoRequest(String token) {
        this.token = token;
    }

    public static UsersDeletePhotoRequestBuilder builder() {
        return new UsersDeletePhotoRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof UsersDeletePhotoRequest)) return false;
        final UsersDeletePhotoRequest other = (UsersDeletePhotoRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$token = this.getToken();
        final Object other$token = other.getToken();
        if (this$token == null ? other$token != null : !this$token.equals(other$token)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof UsersDeletePhotoRequest;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $token = this.getToken();
        result = result * PRIME + ($token == null ? 43 : $token.hashCode());
        return result;
    }

    public String toString() {
        return "UsersDeletePhotoRequest(token=" + this.getToken() + ")";
    }

    public static class UsersDeletePhotoRequestBuilder {
        private String token;

        UsersDeletePhotoRequestBuilder() {
        }

        public UsersDeletePhotoRequest.UsersDeletePhotoRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public UsersDeletePhotoRequest build() {
            return new UsersDeletePhotoRequest(token);
        }

        public String toString() {
            return "UsersDeletePhotoRequest.UsersDeletePhotoRequestBuilder(token=" + this.token + ")";
        }
    }
}
