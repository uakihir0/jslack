package com.github.seratch.jslack.api.methods.request.conversations;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class ConversationsArchiveRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `conversations:write`
     */
    private String token;

    /**
     * ID of conversation to archive
     */
    private String channel;

    ConversationsArchiveRequest(String token, String channel) {
        this.token = token;
        this.channel = channel;
    }

    public static ConversationsArchiveRequestBuilder builder() {
        return new ConversationsArchiveRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public String getChannel() {
        return this.channel;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public static class ConversationsArchiveRequestBuilder {
        private String token;
        private String channel;

        ConversationsArchiveRequestBuilder() {
        }

        public ConversationsArchiveRequest.ConversationsArchiveRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public ConversationsArchiveRequest.ConversationsArchiveRequestBuilder channel(String channel) {
            this.channel = channel;
            return this;
        }

        public ConversationsArchiveRequest build() {
            return new ConversationsArchiveRequest(token, channel);
        }

        public String toString() {
            return "ConversationsArchiveRequest.ConversationsArchiveRequestBuilder(token=" + this.token + ", channel=" + this.channel + ")";
        }
    }
}
