package com.github.seratch.jslack.api.methods.request.team;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class TeamBillableInfoRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `admin`
     */
    private String token;

    /**
     * A user to retrieve the billable information for. Defaults to all users.
     */
    private String user;

    TeamBillableInfoRequest(String token, String user) {
        this.token = token;
        this.user = user;
    }

    public static TeamBillableInfoRequestBuilder builder() {
        return new TeamBillableInfoRequestBuilder();
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

    public static class TeamBillableInfoRequestBuilder {
        private String token;
        private String user;

        TeamBillableInfoRequestBuilder() {
        }

        public TeamBillableInfoRequest.TeamBillableInfoRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public TeamBillableInfoRequest.TeamBillableInfoRequestBuilder user(String user) {
            this.user = user;
            return this;
        }

        public TeamBillableInfoRequest build() {
            return new TeamBillableInfoRequest(token, user);
        }

        public String toString() {
            return "TeamBillableInfoRequest.TeamBillableInfoRequestBuilder(token=" + this.token + ", user=" + this.user + ")";
        }
    }
}