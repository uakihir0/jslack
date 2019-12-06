package com.github.seratch.jslack.api.methods.request.groups;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class GroupsCreateRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `groups:write`
     */
    private String token;

    /**
     * Name of private channel to create
     */
    private String name;

    /**
     * Whether to return errors on invalid channel name instead of modifying it to meet the specified criteria.
     */
    private boolean validate;

    GroupsCreateRequest(String token, String name, boolean validate) {
        this.token = token;
        this.name = name;
        this.validate = validate;
    }

    public static GroupsCreateRequestBuilder builder() {
        return new GroupsCreateRequestBuilder();
    }

    public String getToken() {
        return this.token;
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

    public void setName(String name) {
        this.name = name;
    }

    public void setValidate(boolean validate) {
        this.validate = validate;
    }

    public static class GroupsCreateRequestBuilder {
        private String token;
        private String name;
        private boolean validate;

        GroupsCreateRequestBuilder() {
        }

        public GroupsCreateRequest.GroupsCreateRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public GroupsCreateRequest.GroupsCreateRequestBuilder name(String name) {
            this.name = name;
            return this;
        }

        public GroupsCreateRequest.GroupsCreateRequestBuilder validate(boolean validate) {
            this.validate = validate;
            return this;
        }

        public GroupsCreateRequest build() {
            return new GroupsCreateRequest(token, name, validate);
        }

        public String toString() {
            return "GroupsCreateRequest.GroupsCreateRequestBuilder(token=" + this.token + ", name=" + this.name + ", validate=" + this.validate + ")";
        }
    }
}