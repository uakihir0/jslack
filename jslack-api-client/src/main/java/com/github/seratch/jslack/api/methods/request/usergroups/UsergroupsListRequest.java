package com.github.seratch.jslack.api.methods.request.usergroups;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class UsergroupsListRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `usergroups:read
     */
    private String token;

    /**
     * Include disabled User Groups.
     */
    private boolean includeDisabled;

    /**
     * Include the number of users in each User Group
     */
    private boolean includeCount;

    /**
     * Include the list of users for each User Group.
     */
    private boolean includeUsers;

    UsergroupsListRequest(String token, boolean includeDisabled, boolean includeCount, boolean includeUsers) {
        this.token = token;
        this.includeDisabled = includeDisabled;
        this.includeCount = includeCount;
        this.includeUsers = includeUsers;
    }

    public static UsergroupsListRequestBuilder builder() {
        return new UsergroupsListRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public boolean isIncludeDisabled() {
        return this.includeDisabled;
    }

    public boolean isIncludeCount() {
        return this.includeCount;
    }

    public boolean isIncludeUsers() {
        return this.includeUsers;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setIncludeDisabled(boolean includeDisabled) {
        this.includeDisabled = includeDisabled;
    }

    public void setIncludeCount(boolean includeCount) {
        this.includeCount = includeCount;
    }

    public void setIncludeUsers(boolean includeUsers) {
        this.includeUsers = includeUsers;
    }

    public static class UsergroupsListRequestBuilder {
        private String token;
        private boolean includeDisabled;
        private boolean includeCount;
        private boolean includeUsers;

        UsergroupsListRequestBuilder() {
        }

        public UsergroupsListRequest.UsergroupsListRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public UsergroupsListRequest.UsergroupsListRequestBuilder includeDisabled(boolean includeDisabled) {
            this.includeDisabled = includeDisabled;
            return this;
        }

        public UsergroupsListRequest.UsergroupsListRequestBuilder includeCount(boolean includeCount) {
            this.includeCount = includeCount;
            return this;
        }

        public UsergroupsListRequest.UsergroupsListRequestBuilder includeUsers(boolean includeUsers) {
            this.includeUsers = includeUsers;
            return this;
        }

        public UsergroupsListRequest build() {
            return new UsergroupsListRequest(token, includeDisabled, includeCount, includeUsers);
        }

        public String toString() {
            return "UsergroupsListRequest.UsergroupsListRequestBuilder(token=" + this.token + ", includeDisabled=" + this.includeDisabled + ", includeCount=" + this.includeCount + ", includeUsers=" + this.includeUsers + ")";
        }
    }
}