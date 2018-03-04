package com.github.seratch.jslack.api.methods.request.mpim;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

import java.util.List;

public class MpimOpenRequest implements SlackApiRequest {

    private String token;
    private List<String> users;

    @java.beans.ConstructorProperties({"token", "users"})
    MpimOpenRequest(String token, List<String> users) {
        this.token = token;
        this.users = users;
    }

    public static MpimOpenRequestBuilder builder() {
        return new MpimOpenRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public List<String> getUsers() {
        return this.users;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setUsers(List<String> users) {
        this.users = users;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof MpimOpenRequest)) return false;
        final MpimOpenRequest other = (MpimOpenRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$token = this.getToken();
        final Object other$token = other.getToken();
        if (this$token == null ? other$token != null : !this$token.equals(other$token)) return false;
        final Object this$users = this.getUsers();
        final Object other$users = other.getUsers();
        if (this$users == null ? other$users != null : !this$users.equals(other$users)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $token = this.getToken();
        result = result * PRIME + ($token == null ? 43 : $token.hashCode());
        final Object $users = this.getUsers();
        result = result * PRIME + ($users == null ? 43 : $users.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof MpimOpenRequest;
    }

    public String toString() {
        return "MpimOpenRequest(token=" + this.getToken() + ", users=" + this.getUsers() + ")";
    }

    public static class MpimOpenRequestBuilder {
        private String token;
        private List<String> users;

        MpimOpenRequestBuilder() {
        }

        public MpimOpenRequest.MpimOpenRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public MpimOpenRequest.MpimOpenRequestBuilder users(List<String> users) {
            this.users = users;
            return this;
        }

        public MpimOpenRequest build() {
            return new MpimOpenRequest(token, users);
        }

        public String toString() {
            return "MpimOpenRequest.MpimOpenRequestBuilder(token=" + this.token + ", users=" + this.users + ")";
        }
    }
}