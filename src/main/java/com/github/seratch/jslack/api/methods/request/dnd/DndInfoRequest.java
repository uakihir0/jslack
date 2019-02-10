package com.github.seratch.jslack.api.methods.request.dnd;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class DndInfoRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `dnd:read`
     */
    private String token;

    /**
     * User to fetch status for (defaults to current user)
     */
    private String user;

    @java.beans.ConstructorProperties({"token", "user"})
    DndInfoRequest(String token, String user) {
        this.token = token;
        this.user = user;
    }

    public static DndInfoRequestBuilder builder() {
        return new DndInfoRequestBuilder();
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

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof DndInfoRequest)) return false;
        final DndInfoRequest other = (DndInfoRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$token = this.getToken();
        final Object other$token = other.getToken();
        if (this$token == null ? other$token != null : !this$token.equals(other$token)) return false;
        final Object this$user = this.getUser();
        final Object other$user = other.getUser();
        if (this$user == null ? other$user != null : !this$user.equals(other$user)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof DndInfoRequest;
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

    public String toString() {
        return "DndInfoRequest(token=" + this.getToken() + ", user=" + this.getUser() + ")";
    }

    public static class DndInfoRequestBuilder {
        private String token;
        private String user;

        DndInfoRequestBuilder() {
        }

        public DndInfoRequest.DndInfoRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public DndInfoRequest.DndInfoRequestBuilder user(String user) {
            this.user = user;
            return this;
        }

        public DndInfoRequest build() {
            return new DndInfoRequest(token, user);
        }

        public String toString() {
            return "DndInfoRequest.DndInfoRequestBuilder(token=" + this.token + ", user=" + this.user + ")";
        }
    }
}