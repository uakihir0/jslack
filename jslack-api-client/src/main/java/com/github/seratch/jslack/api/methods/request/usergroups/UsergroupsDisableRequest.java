package com.github.seratch.jslack.api.methods.request.usergroups;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class UsergroupsDisableRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `usergroups:write`
     */
    private String token;

    /**
     * The encoded ID of the User Group to disable.
     */
    private String usergroup;

    /**
     * Include the number of users in the User Group.
     */
    private boolean includeCount;

    UsergroupsDisableRequest(String token, String usergroup, boolean includeCount) {
        this.token = token;
        this.usergroup = usergroup;
        this.includeCount = includeCount;
    }

    public static UsergroupsDisableRequestBuilder builder() {
        return new UsergroupsDisableRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public String getUsergroup() {
        return this.usergroup;
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

    public void setIncludeCount(boolean includeCount) {
        this.includeCount = includeCount;
    }

    public static class UsergroupsDisableRequestBuilder {
        private String token;
        private String usergroup;
        private boolean includeCount;

        UsergroupsDisableRequestBuilder() {
        }

        public UsergroupsDisableRequest.UsergroupsDisableRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public UsergroupsDisableRequest.UsergroupsDisableRequestBuilder usergroup(String usergroup) {
            this.usergroup = usergroup;
            return this;
        }

        public UsergroupsDisableRequest.UsergroupsDisableRequestBuilder includeCount(boolean includeCount) {
            this.includeCount = includeCount;
            return this;
        }

        public UsergroupsDisableRequest build() {
            return new UsergroupsDisableRequest(token, usergroup, includeCount);
        }

        public String toString() {
            return "UsergroupsDisableRequest.UsergroupsDisableRequestBuilder(token=" + this.token + ", usergroup=" + this.usergroup + ", includeCount=" + this.includeCount + ")";
        }
    }
}