package com.github.seratch.jslack.api.methods.request.dnd;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

import java.util.List;

public class DndTeamInfoRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `dnd:read`
     */
    private String token;

    /**
     * Comma-separated list of users to fetch Do Not Disturb status for
     */
    private List<String> users;

    DndTeamInfoRequest(String token, List<String> users) {
        this.token = token;
        this.users = users;
    }

    public static DndTeamInfoRequestBuilder builder() {
        return new DndTeamInfoRequestBuilder();
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

    public static class DndTeamInfoRequestBuilder {
        private String token;
        private List<String> users;

        DndTeamInfoRequestBuilder() {
        }

        public DndTeamInfoRequest.DndTeamInfoRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public DndTeamInfoRequest.DndTeamInfoRequestBuilder users(List<String> users) {
            this.users = users;
            return this;
        }

        public DndTeamInfoRequest build() {
            return new DndTeamInfoRequest(token, users);
        }

        public String toString() {
            return "DndTeamInfoRequest.DndTeamInfoRequestBuilder(token=" + this.token + ", users=" + this.users + ")";
        }
    }
}