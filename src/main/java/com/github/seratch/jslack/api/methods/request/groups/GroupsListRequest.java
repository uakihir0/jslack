package com.github.seratch.jslack.api.methods.request.groups;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class GroupsListRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `groups:read`
     */
    private String token;

    /**
     * Exclude the `members` from each `group`
     */
    private boolean excludeMembers;

    /**
     * Don't return archived private channels.
     */
    private boolean excludeArchived;

    @java.beans.ConstructorProperties({"token", "excludeMembers", "excludeArchived"})
    GroupsListRequest(String token, boolean excludeMembers, boolean excludeArchived) {
        this.token = token;
        this.excludeMembers = excludeMembers;
        this.excludeArchived = excludeArchived;
    }

    public static GroupsListRequestBuilder builder() {
        return new GroupsListRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public boolean isExcludeMembers() {
        return this.excludeMembers;
    }

    public boolean isExcludeArchived() {
        return this.excludeArchived;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setExcludeMembers(boolean excludeMembers) {
        this.excludeMembers = excludeMembers;
    }

    public void setExcludeArchived(boolean excludeArchived) {
        this.excludeArchived = excludeArchived;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof GroupsListRequest)) return false;
        final GroupsListRequest other = (GroupsListRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$token = this.getToken();
        final Object other$token = other.getToken();
        if (this$token == null ? other$token != null : !this$token.equals(other$token)) return false;
        if (this.isExcludeMembers() != other.isExcludeMembers()) return false;
        if (this.isExcludeArchived() != other.isExcludeArchived()) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof GroupsListRequest;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $token = this.getToken();
        result = result * PRIME + ($token == null ? 43 : $token.hashCode());
        result = result * PRIME + (this.isExcludeMembers() ? 79 : 97);
        result = result * PRIME + (this.isExcludeArchived() ? 79 : 97);
        return result;
    }

    public String toString() {
        return "GroupsListRequest(token=" + this.getToken() + ", excludeMembers=" + this.isExcludeMembers() + ", excludeArchived=" + this.isExcludeArchived() + ")";
    }

    public static class GroupsListRequestBuilder {
        private String token;
        private boolean excludeMembers;
        private boolean excludeArchived;

        GroupsListRequestBuilder() {
        }

        public GroupsListRequest.GroupsListRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public GroupsListRequest.GroupsListRequestBuilder excludeMembers(boolean excludeMembers) {
            this.excludeMembers = excludeMembers;
            return this;
        }

        public GroupsListRequest.GroupsListRequestBuilder excludeArchived(boolean excludeArchived) {
            this.excludeArchived = excludeArchived;
            return this;
        }

        public GroupsListRequest build() {
            return new GroupsListRequest(token, excludeMembers, excludeArchived);
        }

        public String toString() {
            return "GroupsListRequest.GroupsListRequestBuilder(token=" + this.token + ", excludeMembers=" + this.excludeMembers + ", excludeArchived=" + this.excludeArchived + ")";
        }
    }
}