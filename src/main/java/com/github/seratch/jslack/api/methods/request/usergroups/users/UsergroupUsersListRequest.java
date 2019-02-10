package com.github.seratch.jslack.api.methods.request.usergroups.users;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class UsergroupUsersListRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `usergroups:read`
     */
    private String token;

    /**
     * The encoded ID of the User Group to update.
     */
    private String usergroup;

    /**
     * Allow results that involve disabled User Groups.
     */
    private boolean includeDisabled;

    UsergroupUsersListRequest(String token, String usergroup, boolean includeDisabled) {
        this.token = token;
        this.usergroup = usergroup;
        this.includeDisabled = includeDisabled;
    }

    public static UsergroupUsersListRequestBuilder builder() {
        return new UsergroupUsersListRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public String getUsergroup() {
        return this.usergroup;
    }

    public boolean isIncludeDisabled() {
        return this.includeDisabled;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setUsergroup(String usergroup) {
        this.usergroup = usergroup;
    }

    public void setIncludeDisabled(boolean includeDisabled) {
        this.includeDisabled = includeDisabled;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof UsergroupUsersListRequest))
            return false;
        final UsergroupUsersListRequest other = (UsergroupUsersListRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$token = this.getToken();
        final Object other$token = other.getToken();
        if (this$token == null ? other$token != null : !this$token.equals(other$token)) return false;
        final Object this$usergroup = this.getUsergroup();
        final Object other$usergroup = other.getUsergroup();
        if (this$usergroup == null ? other$usergroup != null : !this$usergroup.equals(other$usergroup)) return false;
        if (this.isIncludeDisabled() != other.isIncludeDisabled()) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof UsergroupUsersListRequest;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $token = this.getToken();
        result = result * PRIME + ($token == null ? 43 : $token.hashCode());
        final Object $usergroup = this.getUsergroup();
        result = result * PRIME + ($usergroup == null ? 43 : $usergroup.hashCode());
        result = result * PRIME + (this.isIncludeDisabled() ? 79 : 97);
        return result;
    }

    public String toString() {
        return "UsergroupUsersListRequest(token=" + this.getToken() + ", usergroup=" + this.getUsergroup() + ", includeDisabled=" + this.isIncludeDisabled() + ")";
    }

    public static class UsergroupUsersListRequestBuilder {
        private String token;
        private String usergroup;
        private boolean includeDisabled;

        UsergroupUsersListRequestBuilder() {
        }

        public UsergroupUsersListRequest.UsergroupUsersListRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public UsergroupUsersListRequest.UsergroupUsersListRequestBuilder usergroup(String usergroup) {
            this.usergroup = usergroup;
            return this;
        }

        public UsergroupUsersListRequest.UsergroupUsersListRequestBuilder includeDisabled(boolean includeDisabled) {
            this.includeDisabled = includeDisabled;
            return this;
        }

        public UsergroupUsersListRequest build() {
            return new UsergroupUsersListRequest(token, usergroup, includeDisabled);
        }

        public String toString() {
            return "UsergroupUsersListRequest.UsergroupUsersListRequestBuilder(token=" + this.token + ", usergroup=" + this.usergroup + ", includeDisabled=" + this.includeDisabled + ")";
        }
    }
}