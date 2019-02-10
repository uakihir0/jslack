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

    @java.beans.ConstructorProperties({"token", "includeDisabled", "includeCount", "includeUsers"})
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

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof UsergroupsListRequest))
            return false;
        final UsergroupsListRequest other = (UsergroupsListRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$token = this.getToken();
        final Object other$token = other.getToken();
        if (this$token == null ? other$token != null : !this$token.equals(other$token)) return false;
        if (this.isIncludeDisabled() != other.isIncludeDisabled()) return false;
        if (this.isIncludeCount() != other.isIncludeCount()) return false;
        if (this.isIncludeUsers() != other.isIncludeUsers()) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof UsergroupsListRequest;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $token = this.getToken();
        result = result * PRIME + ($token == null ? 43 : $token.hashCode());
        result = result * PRIME + (this.isIncludeDisabled() ? 79 : 97);
        result = result * PRIME + (this.isIncludeCount() ? 79 : 97);
        result = result * PRIME + (this.isIncludeUsers() ? 79 : 97);
        return result;
    }

    public String toString() {
        return "UsergroupsListRequest(token=" + this.getToken() + ", includeDisabled=" + this.isIncludeDisabled() + ", includeCount=" + this.isIncludeCount() + ", includeUsers=" + this.isIncludeUsers() + ")";
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