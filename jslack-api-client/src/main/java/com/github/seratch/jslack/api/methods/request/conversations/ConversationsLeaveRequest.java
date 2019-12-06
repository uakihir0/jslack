package com.github.seratch.jslack.api.methods.request.conversations;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class ConversationsLeaveRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `conversations:write`
     */
    private String token;

    /**
     * Conversation to leave
     */
    private String channel;

    ConversationsLeaveRequest(String token, String channel) {
        this.token = token;
        this.channel = channel;
    }

    public static ConversationsLeaveRequestBuilder builder() {
        return new ConversationsLeaveRequestBuilder();
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

    public static class ConversationsLeaveRequestBuilder {
        private String token;
        private String channel;

        ConversationsLeaveRequestBuilder() {
        }

        public ConversationsLeaveRequest.ConversationsLeaveRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public ConversationsLeaveRequest.ConversationsLeaveRequestBuilder channel(String channel) {
            this.channel = channel;
            return this;
        }

        public ConversationsLeaveRequest build() {
            return new ConversationsLeaveRequest(token, channel);
        }

        public String toString() {
            return "ConversationsLeaveRequest.ConversationsLeaveRequestBuilder(token=" + this.token + ", channel=" + this.channel + ")";
        }
    }
}
