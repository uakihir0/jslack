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
