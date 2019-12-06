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