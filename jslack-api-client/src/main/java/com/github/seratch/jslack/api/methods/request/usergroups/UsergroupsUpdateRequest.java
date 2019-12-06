package com.github.seratch.jslack.api.methods.request.usergroups;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

import java.util.List;

public class UsergroupsUpdateRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `usergroups:write`
     */
    private String token;

    /**
     * The encoded ID of the User Group to update.
     */
    private String usergroup;

    /**
     * A name for the User Group. Must be unique among User Groups.
     */
    private String name;

    /**
     * A mention handle. Must be unique among channels, users and User Groups.
     */
    private String handle;

    /**
     * A short description of the User Group.
     */
    private String description;

    /**
     * A comma separated string of encoded channel IDs for which the User Group uses as a default.
     */
    private List<String> channels;

    /**
     * Include the number of users in the User Group.
     */
    private boolean includeCount;

    UsergroupsUpdateRequest(String token, String usergroup, String name, String handle, String description, List<String> channels, boolean includeCount) {
        this.token = token;
        this.usergroup = usergroup;
        this.name = name;
        this.handle = handle;
        this.description = description;
        this.channels = channels;
        this.includeCount = includeCount;
    }

    public static UsergroupsUpdateRequestBuilder builder() {
        return new UsergroupsUpdateRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public String getUsergroup() {
        return this.usergroup;
    }

    public String getName() {
        return this.name;
    }

    public String getHandle() {
        return this.handle;
    }

    public String getDescription() {
        return this.description;
    }

    public List<String> getChannels() {
        return this.channels;
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

    public void setName(String name) {
        this.name = name;
    }

    public void setHandle(String handle) {
        this.handle = handle;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setChannels(List<String> channels) {
        this.channels = channels;
    }

    public void setIncludeCount(boolean includeCount) {
        this.includeCount = includeCount;
    }

    public static class UsergroupsUpdateRequestBuilder {
        private String token;
        private String usergroup;
        private String name;
        private String handle;
        private String description;
        private List<String> channels;
        private boolean includeCount;

        UsergroupsUpdateRequestBuilder() {
        }

        public UsergroupsUpdateRequest.UsergroupsUpdateRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public UsergroupsUpdateRequest.UsergroupsUpdateRequestBuilder usergroup(String usergroup) {
            this.usergroup = usergroup;
            return this;
        }

        public UsergroupsUpdateRequest.UsergroupsUpdateRequestBuilder name(String name) {
            this.name = name;
            return this;
        }

        public UsergroupsUpdateRequest.UsergroupsUpdateRequestBuilder handle(String handle) {
            this.handle = handle;
            return this;
        }

        public UsergroupsUpdateRequest.UsergroupsUpdateRequestBuilder description(String description) {
            this.description = description;
            return this;
        }

        public UsergroupsUpdateRequest.UsergroupsUpdateRequestBuilder channels(List<String> channels) {
            this.channels = channels;
            return this;
        }

        public UsergroupsUpdateRequest.UsergroupsUpdateRequestBuilder includeCount(boolean includeCount) {
            this.includeCount = includeCount;
            return this;
        }

        public UsergroupsUpdateRequest build() {
            return new UsergroupsUpdateRequest(token, usergroup, name, handle, description, channels, includeCount);
        }

        public String toString() {
            return "UsergroupsUpdateRequest.UsergroupsUpdateRequestBuilder(token=" + this.token + ", usergroup=" + this.usergroup + ", name=" + this.name + ", handle=" + this.handle + ", description=" + this.description + ", channels=" + this.channels + ", includeCount=" + this.includeCount + ")";
        }
    }
}