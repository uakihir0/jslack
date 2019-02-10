package com.github.seratch.jslack.api.methods.request.usergroups.users;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

import java.util.List;

public class UsergroupUsersUpdateRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `usergroups:write`
     */
    private String token;

    /**
     * The encoded ID of the User Group to update.
     */
    private String usergroup;

    /**
     * A comma separated string of encoded user IDs that represent the entire list of users for the User Group.
     */
    private List<String> users;

    /**
     * Include the number of users in the User Group.
     */
    private boolean includeCount;

    @java.beans.ConstructorProperties({"token", "usergroup", "users", "includeCount"})
    UsergroupUsersUpdateRequest(String token, String usergroup, List<String> users, boolean includeCount) {
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

    public boolean isIncludeCount() {
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

    public void setIncludeCount(boolean includeCount) {
        this.includeCount = includeCount;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof UsergroupUsersUpdateRequest))
            return false;
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
        if (this.isIncludeCount() != other.isIncludeCount()) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof UsergroupUsersUpdateRequest;
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
        result = result * PRIME + (this.isIncludeCount() ? 79 : 97);
        return result;
    }

    public String toString() {
        return "UsergroupUsersUpdateRequest(token=" + this.getToken() + ", usergroup=" + this.getUsergroup() + ", users=" + this.getUsers() + ", includeCount=" + this.isIncludeCount() + ")";
    }

    public static class UsergroupUsersUpdateRequestBuilder {
        private String token;
        private String usergroup;
        private List<String> users;
        private boolean includeCount;

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

        public UsergroupUsersUpdateRequest.UsergroupUsersUpdateRequestBuilder includeCount(boolean includeCount) {
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