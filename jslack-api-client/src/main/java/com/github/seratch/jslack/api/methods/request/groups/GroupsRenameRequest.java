package com.github.seratch.jslack.api.methods.request.groups;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class GroupsRenameRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `groups:write`
     */
    private String token;

    /**
     * Private channel to rename
     */
    private String channel;

    /**
     * New name for private channel.
     */
    private String name;

    /**
     * Whether to return errors on invalid channel name instead of modifying it to meet the specified criteria.
     */
    private boolean validate;

    GroupsRenameRequest(String token, String channel, String name, boolean validate) {
        this.token = token;
        this.channel = channel;
        this.name = name;
        this.validate = validate;
    }

    public static GroupsRenameRequestBuilder builder() {
        return new GroupsRenameRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public String getChannel() {
        return this.channel;
    }

    public String getName() {
        return this.name;
    }

    public boolean isValidate() {
        return this.validate;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setValidate(boolean validate) {
        this.validate = validate;
    }

    public static class GroupsRenameRequestBuilder {
        private String token;
        private String channel;
        private String name;
        private boolean validate;

        GroupsRenameRequestBuilder() {
        }

        public GroupsRenameRequest.GroupsRenameRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public GroupsRenameRequest.GroupsRenameRequestBuilder channel(String channel) {
            this.channel = channel;
            return this;
        }

        public GroupsRenameRequest.GroupsRenameRequestBuilder name(String name) {
            this.name = name;
            return this;
        }

        public GroupsRenameRequest.GroupsRenameRequestBuilder validate(boolean validate) {
            this.validate = validate;
            return this;
        }

        public GroupsRenameRequest build() {
            return new GroupsRenameRequest(token, channel, name, validate);
        }

        public String toString() {
            return "GroupsRenameRequest.GroupsRenameRequestBuilder(token=" + this.token + ", channel=" + this.channel + ", name=" + this.name + ", validate=" + this.validate + ")";
        }
    }
}