package com.github.seratch.jslack.api.methods.request.team;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class TeamBillableInfoRequest implements SlackApiRequest {

    private String token;
    private String user;

    @java.beans.ConstructorProperties({"token", "user"})
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

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof TeamBillableInfoRequest)) return false;
        final TeamBillableInfoRequest other = (TeamBillableInfoRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$token = this.getToken();
        final Object other$token = other.getToken();
        if (this$token == null ? other$token != null : !this$token.equals(other$token)) return false;
        final Object this$user = this.getUser();
        final Object other$user = other.getUser();
        if (this$user == null ? other$user != null : !this$user.equals(other$user)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $token = this.getToken();
        result = result * PRIME + ($token == null ? 43 : $token.hashCode());
        final Object $user = this.getUser();
        result = result * PRIME + ($user == null ? 43 : $user.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof TeamBillableInfoRequest;
    }

    public String toString() {
        return "TeamBillableInfoRequest(token=" + this.getToken() + ", user=" + this.getUser() + ")";
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