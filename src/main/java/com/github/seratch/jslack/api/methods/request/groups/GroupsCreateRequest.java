package com.github.seratch.jslack.api.methods.request.groups;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class GroupsCreateRequest implements SlackApiRequest {

    private String token;
    private String name;

    GroupsCreateRequest(String token, String name) {
        this.token = token;
        this.name = name;
    }

    public static GroupsCreateRequestBuilder builder() {
        return new GroupsCreateRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public String getName() {
        return this.name;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof GroupsCreateRequest)) return false;
        final GroupsCreateRequest other = (GroupsCreateRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$token = this.getToken();
        final Object other$token = other.getToken();
        if (this$token == null ? other$token != null : !this$token.equals(other$token)) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $token = this.getToken();
        result = result * PRIME + ($token == null ? 43 : $token.hashCode());
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof GroupsCreateRequest;
    }

    public String toString() {
        return "GroupsCreateRequest(token=" + this.getToken() + ", name=" + this.getName() + ")";
    }

    public static class GroupsCreateRequestBuilder {
        private String token;
        private String name;

        GroupsCreateRequestBuilder() {
        }

        public GroupsCreateRequest.GroupsCreateRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public GroupsCreateRequest.GroupsCreateRequestBuilder name(String name) {
            this.name = name;
            return this;
        }

        public GroupsCreateRequest build() {
            return new GroupsCreateRequest(token, name);
        }

        public String toString() {
            return "GroupsCreateRequest.GroupsCreateRequestBuilder(token=" + this.token + ", name=" + this.name + ")";
        }
    }
}