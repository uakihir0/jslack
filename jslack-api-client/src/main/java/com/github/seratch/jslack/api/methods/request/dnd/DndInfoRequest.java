package com.github.seratch.jslack.api.methods.request.dnd;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class DndInfoRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `dnd:read`
     */
    private String token;

    /**
     * User to fetch status for (defaults to current user)
     */
    private String user;

    DndInfoRequest(String token, String user) {
        this.token = token;
        this.user = user;
    }

    public static DndInfoRequestBuilder builder() {
        return new DndInfoRequestBuilder();
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

    public static class DndInfoRequestBuilder {
        private String token;
        private String user;

        DndInfoRequestBuilder() {
        }

        public DndInfoRequest.DndInfoRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public DndInfoRequest.DndInfoRequestBuilder user(String user) {
            this.user = user;
            return this;
        }

        public DndInfoRequest build() {
            return new DndInfoRequest(token, user);
        }

        public String toString() {
            return "DndInfoRequest.DndInfoRequestBuilder(token=" + this.token + ", user=" + this.user + ")";
        }
    }
}