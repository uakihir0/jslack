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

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof GroupsCreateRequest)) return false;
        final GroupsCreateRequest other = (GroupsCreateRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$token = this.getToken();
        final Object other$token = other.getToken();
        if (this$token == null ? other$token != null : !this$token.equals(other$token)) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        if (this.isValidate() != other.isValidate()) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof GroupsCreateRequest;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $token = this.getToken();
        result = result * PRIME + ($token == null ? 43 : $token.hashCode());
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        result = result * PRIME + (this.isValidate() ? 79 : 97);
        return result;
    }

    public String toString() {
        return "GroupsCreateRequest(token=" + this.getToken() + ", name=" + this.getName() + ", validate=" + this.isValidate() + ")";
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