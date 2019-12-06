package com.github.seratch.jslack.api.methods.request.mpim;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

import java.util.List;

public class MpimOpenRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `mpim:write`
     */
    private String token;

    /**
     * Comma separated lists of users.
     * The ordering of the users is preserved whenever a MPIM group is returned.
     */
    private List<String> users;

    MpimOpenRequest(String token, List<String> users) {
        this.token = token;
        this.users = users;
    }

    public static MpimOpenRequestBuilder builder() {
        return new MpimOpenRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public List<String> getUsers() {
        return this.users;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setUsers(List<String> users) {
        this.users = users;
    }

    public static class MpimOpenRequestBuilder {
        private String token;
        private List<String> users;

        MpimOpenRequestBuilder() {
        }

        public MpimOpenRequest.MpimOpenRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public MpimOpenRequest.MpimOpenRequestBuilder users(List<String> users) {
            this.users = users;
            return this;
        }

        public MpimOpenRequest build() {
            return new MpimOpenRequest(token, users);
        }

        public String toString() {
            return "MpimOpenRequest.MpimOpenRequestBuilder(token=" + this.token + ", users=" + this.users + ")";
        }
    }
}