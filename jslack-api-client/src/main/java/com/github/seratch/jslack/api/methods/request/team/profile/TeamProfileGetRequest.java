package com.github.seratch.jslack.api.methods.request.team.profile;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class TeamProfileGetRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `users.profile:read`
     */
    private String token;

    /**
     * Filter by visibility.
     */
    private String visibility;

    TeamProfileGetRequest(String token, String visibility) {
        this.token = token;
        this.visibility = visibility;
    }

    public static TeamProfileGetRequestBuilder builder() {
        return new TeamProfileGetRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public String getVisibility() {
        return this.visibility;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    public static class TeamProfileGetRequestBuilder {
        private String token;
        private String visibility;

        TeamProfileGetRequestBuilder() {
        }

        public TeamProfileGetRequest.TeamProfileGetRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public TeamProfileGetRequest.TeamProfileGetRequestBuilder visibility(String visibility) {
            this.visibility = visibility;
            return this;
        }

        public TeamProfileGetRequest build() {
            return new TeamProfileGetRequest(token, visibility);
        }

        public String toString() {
            return "TeamProfileGetRequest.TeamProfileGetRequestBuilder(token=" + this.token + ", visibility=" + this.visibility + ")";
        }
    }
}