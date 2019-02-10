package com.github.seratch.jslack.api.scim.request;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class UsersDeleteRequest implements SlackApiRequest {
    private String token;
    private String id;

    @java.beans.ConstructorProperties({"token", "id"})
    UsersDeleteRequest(String token, String id) {
        this.token = token;
        this.id = id;
    }

    public static UsersDeleteRequestBuilder builder() {
        return new UsersDeleteRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public String getId() {
        return this.id;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof UsersDeleteRequest)) return false;
        final UsersDeleteRequest other = (UsersDeleteRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$token = this.getToken();
        final Object other$token = other.getToken();
        if (this$token == null ? other$token != null : !this$token.equals(other$token)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof UsersDeleteRequest;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $token = this.getToken();
        result = result * PRIME + ($token == null ? 43 : $token.hashCode());
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        return result;
    }

    public String toString() {
        return "UsersDeleteRequest(token=" + this.getToken() + ", id=" + this.getId() + ")";
    }

    public static class UsersDeleteRequestBuilder {
        private String token;
        private String id;

        UsersDeleteRequestBuilder() {
        }

        public UsersDeleteRequest.UsersDeleteRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public UsersDeleteRequest.UsersDeleteRequestBuilder id(String id) {
            this.id = id;
            return this;
        }

        public UsersDeleteRequest build() {
            return new UsersDeleteRequest(token, id);
        }

        public String toString() {
            return "UsersDeleteRequest.UsersDeleteRequestBuilder(token=" + this.token + ", id=" + this.id + ")";
        }
    }
}
