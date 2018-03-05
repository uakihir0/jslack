package com.github.seratch.jslack.api.methods.request.usergroups.users;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

import java.util.List;

public class UsergroupUsersUpdateRequest implements SlackApiRequest {

    private String token;
    private String usergroup;
    private List<String> users;
    private Integer includeCount;

    UsergroupUsersUpdateRequest(String token, String usergroup, List<String> users, Integer includeCount) {
        this.token = token;
        this.usergroup = usergroup;
        this.users = users;
        this.includeCount = includeCount;
    }

    public static UsergroupUsersUpdateRequestBuilder builder() {
        return new UsergroupUsersUpdateRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public String getUsergroup() {
        return this.usergroup;
    }

    public List<String> getUsers() {
        return this.users;
    }

    public Integer getIncludeCount() {
        return this.includeCount;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setUsergroup(String usergroup) {
        this.usergroup = usergroup;
    }

    public void setUsers(List<String> users) {
        this.users = users;
    }

    public void setIncludeCount(Integer includeCount) {
        this.includeCount = includeCount;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof UsergroupUsersUpdateRequest)) return false;
        final UsergroupUsersUpdateRequest other = (UsergroupUsersUpdateRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$token = this.getToken();
        final Object other$token = other.getToken();
        if (this$token == null ? other$token != null : !this$token.equals(other$token)) return false;
        final Object this$usergroup = this.getUsergroup();
        final Object other$usergroup = other.getUsergroup();
        if (this$usergroup == null ? other$usergroup != null : !this$usergroup.equals(other$usergroup)) return false;
        final Object this$users = this.getUsers();
        final Object other$users = other.getUsers();
        if (this$users == null ? other$users != null : !this$users.equals(other$users)) return false;
        final Object this$includeCount = this.getIncludeCount();
        final Object other$includeCount = other.getIncludeCount();
        if (this$includeCount == null ? other$includeCount != null : !this$includeCount.equals(other$includeCount))
            return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $token = this.getToken();
        result = result * PRIME + ($token == null ? 43 : $token.hashCode());
        final Object $usergroup = this.getUsergroup();
        result = result * PRIME + ($usergroup == null ? 43 : $usergroup.hashCode());
        final Object $users = this.getUsers();
        result = result * PRIME + ($users == null ? 43 : $users.hashCode());
        final Object $includeCount = this.getIncludeCount();
        result = result * PRIME + ($includeCount == null ? 43 : $includeCount.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof UsergroupUsersUpdateRequest;
    }

    public String toString() {
        return "UsergroupUsersUpdateRequest(token=" + this.getToken() + ", usergroup=" + this.getUsergroup() + ", users=" + this.getUsers() + ", includeCount=" + this.getIncludeCount() + ")";
    }

    public static class UsergroupUsersUpdateRequestBuilder {
        private String token;
        private String usergroup;
        private List<String> users;
        private Integer includeCount;

        UsergroupUsersUpdateRequestBuilder() {
        }

        public UsergroupUsersUpdateRequest.UsergroupUsersUpdateRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public UsergroupUsersUpdateRequest.UsergroupUsersUpdateRequestBuilder usergroup(String usergroup) {
            this.usergroup = usergroup;
            return this;
        }

        public UsergroupUsersUpdateRequest.UsergroupUsersUpdateRequestBuilder users(List<String> users) {
            this.users = users;
            return this;
        }

        public UsergroupUsersUpdateRequest.UsergroupUsersUpdateRequestBuilder includeCount(Integer includeCount) {
            this.includeCount = includeCount;
            return this;
        }

        public UsergroupUsersUpdateRequest build() {
            return new UsergroupUsersUpdateRequest(token, usergroup, users, includeCount);
        }

        public String toString() {
            return "UsergroupUsersUpdateRequest.UsergroupUsersUpdateRequestBuilder(token=" + this.token + ", usergroup=" + this.usergroup + ", users=" + this.users + ", includeCount=" + this.includeCount + ")";
        }
    }
}