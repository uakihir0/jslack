package com.github.seratch.jslack.api.methods.request.dnd;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

import java.util.List;

public class DndTeamInfoRequest implements SlackApiRequest {

    private String token;
    private List<String> users;

    @java.beans.ConstructorProperties({"token", "users"})
    DndTeamInfoRequest(String token, List<String> users) {
        this.token = token;
        this.users = users;
    }

    public static DndTeamInfoRequestBuilder builder() {
        return new DndTeamInfoRequestBuilder();
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
        if (!(o instanceof DndTeamInfoRequest)) return false;
        final DndTeamInfoRequest other = (DndTeamInfoRequest) o;
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
        return other instanceof DndTeamInfoRequest;
    }

    public String toString() {
        return "DndTeamInfoRequest(token=" + this.getToken() + ", users=" + this.getUsers() + ")";
    }

    public static class DndTeamInfoRequestBuilder {
        private String token;
        private List<String> users;

        DndTeamInfoRequestBuilder() {
        }

        public DndTeamInfoRequest.DndTeamInfoRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public DndTeamInfoRequest.DndTeamInfoRequestBuilder users(List<String> users) {
            this.users = users;
            return this;
        }

        public DndTeamInfoRequest build() {
            return new DndTeamInfoRequest(token, users);
        }

        public String toString() {
            return "DndTeamInfoRequest.DndTeamInfoRequestBuilder(token=" + this.token + ", users=" + this.users + ")";
        }
    }
}