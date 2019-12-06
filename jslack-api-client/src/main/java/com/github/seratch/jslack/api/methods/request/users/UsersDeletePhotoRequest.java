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
