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

    @java.beans.ConstructorProperties({"token", "usergroup", "name", "handle", "description", "channels", "includeCount"})
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

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof UsergroupsUpdateRequest))
            return false;
        final UsergroupsUpdateRequest other = (UsergroupsUpdateRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$token = this.getToken();
        final Object other$token = other.getToken();
        if (this$token == null ? other$token != null : !this$token.equals(other$token)) return false;
        final Object this$usergroup = this.getUsergroup();
        final Object other$usergroup = other.getUsergroup();
        if (this$usergroup == null ? other$usergroup != null : !this$usergroup.equals(other$usergroup)) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        final Object this$handle = this.getHandle();
        final Object other$handle = other.getHandle();
        if (this$handle == null ? other$handle != null : !this$handle.equals(other$handle)) return false;
        final Object this$description = this.getDescription();
        final Object other$description = other.getDescription();
        if (this$description == null ? other$description != null : !this$description.equals(other$description))
            return false;
        final Object this$channels = this.getChannels();
        final Object other$channels = other.getChannels();
        if (this$channels == null ? other$channels != null : !this$channels.equals(other$channels)) return false;
        if (this.isIncludeCount() != other.isIncludeCount()) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof UsergroupsUpdateRequest;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $token = this.getToken();
        result = result * PRIME + ($token == null ? 43 : $token.hashCode());
        final Object $usergroup = this.getUsergroup();
        result = result * PRIME + ($usergroup == null ? 43 : $usergroup.hashCode());
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        final Object $handle = this.getHandle();
        result = result * PRIME + ($handle == null ? 43 : $handle.hashCode());
        final Object $description = this.getDescription();
        result = result * PRIME + ($description == null ? 43 : $description.hashCode());
        final Object $channels = this.getChannels();
        result = result * PRIME + ($channels == null ? 43 : $channels.hashCode());
        result = result * PRIME + (this.isIncludeCount() ? 79 : 97);
        return result;
    }

    public String toString() {
        return "UsergroupsUpdateRequest(token=" + this.getToken() + ", usergroup=" + this.getUsergroup() + ", name=" + this.getName() + ", handle=" + this.getHandle() + ", description=" + this.getDescription() + ", channels=" + this.getChannels() + ", includeCount=" + this.isIncludeCount() + ")";
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