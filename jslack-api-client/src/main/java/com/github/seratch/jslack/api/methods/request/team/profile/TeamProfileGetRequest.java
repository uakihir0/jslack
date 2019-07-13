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

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof TeamProfileGetRequest))
            return false;
        final TeamProfileGetRequest other = (TeamProfileGetRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$token = this.getToken();
        final Object other$token = other.getToken();
        if (this$token == null ? other$token != null : !this$token.equals(other$token)) return false;
        final Object this$visibility = this.getVisibility();
        final Object other$visibility = other.getVisibility();
        if (this$visibility == null ? other$visibility != null : !this$visibility.equals(other$visibility))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof TeamProfileGetRequest;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $token = this.getToken();
        result = result * PRIME + ($token == null ? 43 : $token.hashCode());
        final Object $visibility = this.getVisibility();
        result = result * PRIME + ($visibility == null ? 43 : $visibility.hashCode());
        return result;
    }

    public String toString() {
        return "TeamProfileGetRequest(token=" + this.getToken() + ", visibility=" + this.getVisibility() + ")";
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