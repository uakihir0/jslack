package com.github.seratch.jslack.api.methods.request.conversations;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class ConversationsInfoRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `conversations:read`
     */
    private String token;

    /**
     * Conversation ID to learn more about
     */
    private String channel;

    /**
     * Set this to `true` to receive the locale for this conversation. Defaults to `false`
     */
    private boolean includeLocale;

    /**
     * Set to true to include the member count for the specified conversation. Defaults to false
     */
    private boolean includeNumMembers;

    ConversationsInfoRequest(String token, String channel, boolean includeLocale, boolean includeNumMembers) {
        this.token = token;
        this.channel = channel;
        this.includeLocale = includeLocale;
        this.includeNumMembers = includeNumMembers;
    }

    public static ConversationsInfoRequestBuilder builder() {
        return new ConversationsInfoRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public String getChannel() {
        return this.channel;
    }

    public boolean isIncludeLocale() {
        return this.includeLocale;
    }

    public boolean isIncludeNumMembers() {
        return this.includeNumMembers;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public void setIncludeLocale(boolean includeLocale) {
        this.includeLocale = includeLocale;
    }

    public void setIncludeNumMembers(boolean includeNumMembers) {
        this.includeNumMembers = includeNumMembers;
    }

    public static class ConversationsInfoRequestBuilder {
        private String token;
        private String channel;
        private boolean includeLocale;
        private boolean includeNumMembers;

        ConversationsInfoRequestBuilder() {
        }

        public ConversationsInfoRequest.ConversationsInfoRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public ConversationsInfoRequest.ConversationsInfoRequestBuilder channel(String channel) {
            this.channel = channel;
            return this;
        }

        public ConversationsInfoRequest.ConversationsInfoRequestBuilder includeLocale(boolean includeLocale) {
            this.includeLocale = includeLocale;
            return this;
        }

        public ConversationsInfoRequest.ConversationsInfoRequestBuilder includeNumMembers(boolean includeNumMembers) {
            this.includeNumMembers = includeNumMembers;
            return this;
        }

        public ConversationsInfoRequest build() {
            return new ConversationsInfoRequest(token, channel, includeLocale, includeNumMembers);
        }

        public String toString() {
            return "ConversationsInfoRequest.ConversationsInfoRequestBuilder(token=" + this.token + ", channel=" + this.channel + ", includeLocale=" + this.includeLocale + ", includeNumMembers=" + this.includeNumMembers + ")";
        }
    }
}