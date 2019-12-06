package com.github.seratch.jslack.api.methods.request.conversations;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class ConversationsRenameRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `conversations:write`
     */
    private String token;

    /**
     * ID of conversation to rename
     */
    private String channel;

    /**
     * New name for conversation.
     * <p>
     * Conversation names can only contain lowercase letters, numbers, hyphens, and underscores, and must
     * be 21 characters or less. We will validate the submitted channel name and modify it to meet the above
     * criteria. When calling this method, we recommend storing the channel's name value that is returned
     * in the response.
     */
    private String name;

    ConversationsRenameRequest(String token, String channel, String name) {
        this.token = token;
        this.channel = channel;
        this.name = name;
    }

    public static ConversationsRenameRequestBuilder builder() {
        return new ConversationsRenameRequestBuilder();
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

    public void setToken(String token) {
        this.token = token;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static class ConversationsRenameRequestBuilder {
        private String token;
        private String channel;
        private String name;

        ConversationsRenameRequestBuilder() {
        }

        public ConversationsRenameRequest.ConversationsRenameRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public ConversationsRenameRequest.ConversationsRenameRequestBuilder channel(String channel) {
            this.channel = channel;
            return this;
        }

        public ConversationsRenameRequest.ConversationsRenameRequestBuilder name(String name) {
            this.name = name;
            return this;
        }

        public ConversationsRenameRequest build() {
            return new ConversationsRenameRequest(token, channel, name);
        }

        public String toString() {
            return "ConversationsRenameRequest.ConversationsRenameRequestBuilder(token=" + this.token + ", channel=" + this.channel + ", name=" + this.name + ")";
        }
    }
}