package com.github.seratch.jslack.api.methods.request.users;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class UsersListRequest implements SlackApiRequest {

    private String token;
    private Integer presence;

    @java.beans.ConstructorProperties({"token", "presence"})
    UsersListRequest(String token, Integer presence) {
        this.token = token;
        this.presence = presence;
    }

    public static UsersListRequestBuilder builder() {
        return new UsersListRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public Integer getPresence() {
        return this.presence;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setPresence(Integer presence) {
        this.presence = presence;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof UsersListRequest)) return false;
        final UsersListRequest other = (UsersListRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$token = this.getToken();
        final Object other$token = other.getToken();
        if (this$token == null ? other$token != null : !this$token.equals(other$token)) return false;
        final Object this$presence = this.getPresence();
        final Object other$presence = other.getPresence();
        if (this$presence == null ? other$presence != null : !this$presence.equals(other$presence)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $token = this.getToken();
        result = result * PRIME + ($token == null ? 43 : $token.hashCode());
        final Object $presence = this.getPresence();
        result = result * PRIME + ($presence == null ? 43 : $presence.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof UsersListRequest;
    }

    public String toString() {
        return "UsersListRequest(token=" + this.getToken() + ", presence=" + this.getPresence() + ")";
    }

    public static class UsersListRequestBuilder {
        private String token;
        private Integer presence;

        UsersListRequestBuilder() {
        }

        public UsersListRequest.UsersListRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public UsersListRequest.UsersListRequestBuilder presence(Integer presence) {
            this.presence = presence;
            return this;
        }

        public UsersListRequest build() {
            return new UsersListRequest(token, presence);
        }

        public String toString() {
            return "UsersListRequest.UsersListRequestBuilder(token=" + this.token + ", presence=" + this.presence + ")";
        }
    }
}