package com.github.seratch.jslack.api.methods.request.conversations;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class ConversationsCreateRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `conversations:write`
     */
    private String token;

    /**
     * Name of the public or private channel to create
     */
    private String name;

    /**
     * Create a private channel instead of a public one
     */
    private boolean isPrivate;

    @java.beans.ConstructorProperties({"token", "name", "isPrivate"})
    ConversationsCreateRequest(String token, String name, boolean isPrivate) {
        this.token = token;
        this.name = name;
        this.isPrivate = isPrivate;
    }

    public static ConversationsCreateRequestBuilder builder() {
        return new ConversationsCreateRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public String getName() {
        return this.name;
    }

    public boolean isPrivate() {
        return this.isPrivate;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrivate(boolean isPrivate) {
        this.isPrivate = isPrivate;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ConversationsCreateRequest))
            return false;
        final ConversationsCreateRequest other = (ConversationsCreateRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$token = this.getToken();
        final Object other$token = other.getToken();
        if (this$token == null ? other$token != null : !this$token.equals(other$token)) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        if (this.isPrivate() != other.isPrivate()) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ConversationsCreateRequest;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $token = this.getToken();
        result = result * PRIME + ($token == null ? 43 : $token.hashCode());
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        result = result * PRIME + (this.isPrivate() ? 79 : 97);
        return result;
    }

    public String toString() {
        return "ConversationsCreateRequest(token=" + this.getToken() + ", name=" + this.getName() + ", isPrivate=" + this.isPrivate() + ")";
    }

    public static class ConversationsCreateRequestBuilder {
        private String token;
        private String name;
        private boolean isPrivate;

        ConversationsCreateRequestBuilder() {
        }

        public ConversationsCreateRequest.ConversationsCreateRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public ConversationsCreateRequest.ConversationsCreateRequestBuilder name(String name) {
            this.name = name;
            return this;
        }

        public ConversationsCreateRequest.ConversationsCreateRequestBuilder isPrivate(boolean isPrivate) {
            this.isPrivate = isPrivate;
            return this;
        }

        public ConversationsCreateRequest build() {
            return new ConversationsCreateRequest(token, name, isPrivate);
        }

        public String toString() {
            return "ConversationsCreateRequest.ConversationsCreateRequestBuilder(token=" + this.token + ", name=" + this.name + ", isPrivate=" + this.isPrivate + ")";
        }
    }
}
