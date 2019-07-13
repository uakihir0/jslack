package com.github.seratch.jslack.api.methods.request.usergroups;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class UsergroupsEnableRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `usergroups:write`
     */
    private String token;

    /**
     * The encoded ID of the User Group to enable.
     */
    private String usergroup;

    /**
     * Include the number of users in the User Group.
     */
    private boolean includeCount;

    UsergroupsEnableRequest(String token, String usergroup, boolean includeCount) {
        this.token = token;
        this.usergroup = usergroup;
        this.includeCount = includeCount;
    }

    public static UsergroupsEnableRequestBuilder builder() {
        return new UsergroupsEnableRequestBuilder();
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

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof UsergroupsEnableRequest))
            return false;
        final UsergroupsEnableRequest other = (UsergroupsEnableRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$token = this.getToken();
        final Object other$token = other.getToken();
        if (this$token == null ? other$token != null : !this$token.equals(other$token)) return false;
        final Object this$usergroup = this.getUsergroup();
        final Object other$usergroup = other.getUsergroup();
        if (this$usergroup == null ? other$usergroup != null : !this$usergroup.equals(other$usergroup)) return false;
        if (this.isIncludeCount() != other.isIncludeCount()) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof UsergroupsEnableRequest;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $token = this.getToken();
        result = result * PRIME + ($token == null ? 43 : $token.hashCode());
        final Object $usergroup = this.getUsergroup();
        result = result * PRIME + ($usergroup == null ? 43 : $usergroup.hashCode());
        result = result * PRIME + (this.isIncludeCount() ? 79 : 97);
        return result;
    }

    public String toString() {
        return "UsergroupsEnableRequest(token=" + this.getToken() + ", usergroup=" + this.getUsergroup() + ", includeCount=" + this.isIncludeCount() + ")";
    }

    public static class UsergroupsEnableRequestBuilder {
        private String token;
        private String usergroup;
        private boolean includeCount;

        UsergroupsEnableRequestBuilder() {
        }

        public UsergroupsEnableRequest.UsergroupsEnableRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public UsergroupsEnableRequest.UsergroupsEnableRequestBuilder usergroup(String usergroup) {
            this.usergroup = usergroup;
            return this;
        }

        public UsergroupsEnableRequest.UsergroupsEnableRequestBuilder includeCount(boolean includeCount) {
            this.includeCount = includeCount;
            return this;
        }

        public UsergroupsEnableRequest build() {
            return new UsergroupsEnableRequest(token, usergroup, includeCount);
        }

        public String toString() {
            return "UsergroupsEnableRequest.UsergroupsEnableRequestBuilder(token=" + this.token + ", usergroup=" + this.usergroup + ", includeCount=" + this.includeCount + ")";
        }
    }
}