package com.github.seratch.jslack.api.methods.request.team;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class TeamInfoRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `team:read`
     */
    private String token;

    TeamInfoRequest(String token) {
        this.token = token;
    }

    public static TeamInfoRequestBuilder builder() {
        return new TeamInfoRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public static class TeamInfoRequestBuilder {
        private String token;

        TeamInfoRequestBuilder() {
        }

        public TeamInfoRequest.TeamInfoRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public TeamInfoRequest build() {
            return new TeamInfoRequest(token);
        }

        public String toString() {
            return "TeamInfoRequest.TeamInfoRequestBuilder(token=" + this.token + ")";
        }
    }
}