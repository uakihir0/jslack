package com.github.seratch.jslack.api.methods.request.usergroups;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

import java.util.List;

public class UsergroupsCreateRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `usergroups:write`
     */
    private String token;

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
     * Include the number of users in each User Group.
     */
    private boolean includeCount;

    UsergroupsCreateRequest(String token, String name, String handle, String description, List<String> channels, boolean includeCount) {
        this.token = token;
        this.name = name;
        this.handle = handle;
        this.description = description;
        this.channels = channels;
        this.includeCount = includeCount;
    }

    public static UsergroupsCreateRequestBuilder builder() {
        return new UsergroupsCreateRequestBuilder();
    }

    public String getToken() {
        return this.token;
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

    public static class UsergroupsCreateRequestBuilder {
        private String token;
        private String name;
        private String handle;
        private String description;
        private List<String> channels;
        private boolean includeCount;

        UsergroupsCreateRequestBuilder() {
        }

        public UsergroupsCreateRequest.UsergroupsCreateRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public UsergroupsCreateRequest.UsergroupsCreateRequestBuilder name(String name) {
            this.name = name;
            return this;
        }

        public UsergroupsCreateRequest.UsergroupsCreateRequestBuilder handle(String handle) {
            this.handle = handle;
            return this;
        }

        public UsergroupsCreateRequest.UsergroupsCreateRequestBuilder description(String description) {
            this.description = description;
            return this;
        }

        public UsergroupsCreateRequest.UsergroupsCreateRequestBuilder channels(List<String> channels) {
            this.channels = channels;
            return this;
        }

        public UsergroupsCreateRequest.UsergroupsCreateRequestBuilder includeCount(boolean includeCount) {
            this.includeCount = includeCount;
            return this;
        }

        public UsergroupsCreateRequest build() {
            return new UsergroupsCreateRequest(token, name, handle, description, channels, includeCount);
        }

        public String toString() {
            return "UsergroupsCreateRequest.UsergroupsCreateRequestBuilder(token=" + this.token + ", name=" + this.name + ", handle=" + this.handle + ", description=" + this.description + ", channels=" + this.channels + ", includeCount=" + this.includeCount + ")";
        }
    }
}