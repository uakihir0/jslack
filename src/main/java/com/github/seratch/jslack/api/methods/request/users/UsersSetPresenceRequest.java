package com.github.seratch.jslack.api.methods.request.users;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class UsersSetPresenceRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `users:write`
     */
    private String token;

    /**
     * Either `auto` or `away`
     */
    private String presence;

    @java.beans.ConstructorProperties({"token", "presence"})
    UsersSetPresenceRequest(String token, String presence) {
        this.token = token;
        this.presence = presence;
    }

    public static UsersSetPresenceRequestBuilder builder() {
        return new UsersSetPresenceRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public String getPresence() {
        return this.presence;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setPresence(String presence) {
        this.presence = presence;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof UsersSetPresenceRequest)) return false;
        final UsersSetPresenceRequest other = (UsersSetPresenceRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$token = this.getToken();
        final Object other$token = other.getToken();
        if (this$token == null ? other$token != null : !this$token.equals(other$token)) return false;
        final Object this$presence = this.getPresence();
        final Object other$presence = other.getPresence();
        if (this$presence == null ? other$presence != null : !this$presence.equals(other$presence)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof UsersSetPresenceRequest;
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

    public String toString() {
        return "UsersSetPresenceRequest(token=" + this.getToken() + ", presence=" + this.getPresence() + ")";
    }

    public static class UsersSetPresenceRequestBuilder {
        private String token;
        private String presence;

        UsersSetPresenceRequestBuilder() {
        }

        public UsersSetPresenceRequest.UsersSetPresenceRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public UsersSetPresenceRequest.UsersSetPresenceRequestBuilder presence(String presence) {
            this.presence = presence;
            return this;
        }

        public UsersSetPresenceRequest build() {
            return new UsersSetPresenceRequest(token, presence);
        }

        public String toString() {
            return "UsersSetPresenceRequest.UsersSetPresenceRequestBuilder(token=" + this.token + ", presence=" + this.presence + ")";
        }
    }
}