package com.github.seratch.jslack.api.methods.request.groups;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class GroupsListRequest implements SlackApiRequest {

    private String token;
    private Integer excludeArchived;

    @java.beans.ConstructorProperties({"token", "excludeArchived"})
    GroupsListRequest(String token, Integer excludeArchived) {
        this.token = token;
        this.excludeArchived = excludeArchived;
    }

    public static GroupsListRequestBuilder builder() {
        return new GroupsListRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public Integer getExcludeArchived() {
        return this.excludeArchived;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setExcludeArchived(Integer excludeArchived) {
        this.excludeArchived = excludeArchived;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof GroupsListRequest)) return false;
        final GroupsListRequest other = (GroupsListRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$token = this.getToken();
        final Object other$token = other.getToken();
        if (this$token == null ? other$token != null : !this$token.equals(other$token)) return false;
        final Object this$excludeArchived = this.getExcludeArchived();
        final Object other$excludeArchived = other.getExcludeArchived();
        if (this$excludeArchived == null ? other$excludeArchived != null : !this$excludeArchived.equals(other$excludeArchived))
            return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $token = this.getToken();
        result = result * PRIME + ($token == null ? 43 : $token.hashCode());
        final Object $excludeArchived = this.getExcludeArchived();
        result = result * PRIME + ($excludeArchived == null ? 43 : $excludeArchived.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof GroupsListRequest;
    }

    public String toString() {
        return "GroupsListRequest(token=" + this.getToken() + ", excludeArchived=" + this.getExcludeArchived() + ")";
    }

    public static class GroupsListRequestBuilder {
        private String token;
        private Integer excludeArchived;

        GroupsListRequestBuilder() {
        }

        public GroupsListRequest.GroupsListRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public GroupsListRequest.GroupsListRequestBuilder excludeArchived(Integer excludeArchived) {
            this.excludeArchived = excludeArchived;
            return this;
        }

        public GroupsListRequest build() {
            return new GroupsListRequest(token, excludeArchived);
        }

        public String toString() {
            return "GroupsListRequest.GroupsListRequestBuilder(token=" + this.token + ", excludeArchived=" + this.excludeArchived + ")";
        }
    }
}