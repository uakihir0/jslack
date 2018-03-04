package com.github.seratch.jslack.api.methods.request.team;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class TeamInfoRequest implements SlackApiRequest {

    private String token;

    @java.beans.ConstructorProperties({"token"})
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

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof TeamInfoRequest)) return false;
        final TeamInfoRequest other = (TeamInfoRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$token = this.getToken();
        final Object other$token = other.getToken();
        if (this$token == null ? other$token != null : !this$token.equals(other$token)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $token = this.getToken();
        result = result * PRIME + ($token == null ? 43 : $token.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof TeamInfoRequest;
    }

    public String toString() {
        return "TeamInfoRequest(token=" + this.getToken() + ")";
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