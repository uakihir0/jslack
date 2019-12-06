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