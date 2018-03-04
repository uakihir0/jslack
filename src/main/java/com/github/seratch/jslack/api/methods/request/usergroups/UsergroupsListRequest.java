package com.github.seratch.jslack.api.methods.request.usergroups;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class UsergroupsListRequest implements SlackApiRequest {

    private String token;
    private Integer includeDisabled;
    private Integer includeCount;
    private Integer includeUsers;

    @java.beans.ConstructorProperties({"token", "includeDisabled", "includeCount", "includeUsers"})
    UsergroupsListRequest(String token, Integer includeDisabled, Integer includeCount, Integer includeUsers) {
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

    public Integer getIncludeDisabled() {
        return this.includeDisabled;
    }

    public Integer getIncludeCount() {
        return this.includeCount;
    }

    public Integer getIncludeUsers() {
        return this.includeUsers;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setIncludeDisabled(Integer includeDisabled) {
        this.includeDisabled = includeDisabled;
    }

    public void setIncludeCount(Integer includeCount) {
        this.includeCount = includeCount;
    }

    public void setIncludeUsers(Integer includeUsers) {
        this.includeUsers = includeUsers;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof UsergroupsListRequest)) return false;
        final UsergroupsListRequest other = (UsergroupsListRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$token = this.getToken();
        final Object other$token = other.getToken();
        if (this$token == null ? other$token != null : !this$token.equals(other$token)) return false;
        final Object this$includeDisabled = this.getIncludeDisabled();
        final Object other$includeDisabled = other.getIncludeDisabled();
        if (this$includeDisabled == null ? other$includeDisabled != null : !this$includeDisabled.equals(other$includeDisabled))
            return false;
        final Object this$includeCount = this.getIncludeCount();
        final Object other$includeCount = other.getIncludeCount();
        if (this$includeCount == null ? other$includeCount != null : !this$includeCount.equals(other$includeCount))
            return false;
        final Object this$includeUsers = this.getIncludeUsers();
        final Object other$includeUsers = other.getIncludeUsers();
        if (this$includeUsers == null ? other$includeUsers != null : !this$includeUsers.equals(other$includeUsers))
            return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $token = this.getToken();
        result = result * PRIME + ($token == null ? 43 : $token.hashCode());
        final Object $includeDisabled = this.getIncludeDisabled();
        result = result * PRIME + ($includeDisabled == null ? 43 : $includeDisabled.hashCode());
        final Object $includeCount = this.getIncludeCount();
        result = result * PRIME + ($includeCount == null ? 43 : $includeCount.hashCode());
        final Object $includeUsers = this.getIncludeUsers();
        result = result * PRIME + ($includeUsers == null ? 43 : $includeUsers.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof UsergroupsListRequest;
    }

    public String toString() {
        return "UsergroupsListRequest(token=" + this.getToken() + ", includeDisabled=" + this.getIncludeDisabled() + ", includeCount=" + this.getIncludeCount() + ", includeUsers=" + this.getIncludeUsers() + ")";
    }

    public static class UsergroupsListRequestBuilder {
        private String token;
        private Integer includeDisabled;
        private Integer includeCount;
        private Integer includeUsers;

        UsergroupsListRequestBuilder() {
        }

        public UsergroupsListRequest.UsergroupsListRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public UsergroupsListRequest.UsergroupsListRequestBuilder includeDisabled(Integer includeDisabled) {
            this.includeDisabled = includeDisabled;
            return this;
        }

        public UsergroupsListRequest.UsergroupsListRequestBuilder includeCount(Integer includeCount) {
            this.includeCount = includeCount;
            return this;
        }

        public UsergroupsListRequest.UsergroupsListRequestBuilder includeUsers(Integer includeUsers) {
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