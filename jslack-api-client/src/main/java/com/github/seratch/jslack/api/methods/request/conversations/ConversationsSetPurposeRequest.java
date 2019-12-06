package com.github.seratch.jslack.api.methods.request.conversations;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class ConversationsSetPurposeRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `conversations:write`
     */
    private String token;

    /**
     * Conversation to set the purpose of
     */
    private String channel;

    /**
     * A new, specialer purpose
     */
    private String purpose;

    ConversationsSetPurposeRequest(String token, String channel, String purpose) {
        this.token = token;
        this.channel = channel;
        this.purpose = purpose;
    }

    public static ConversationsSetPurposeRequestBuilder builder() {
        return new ConversationsSetPurposeRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public String getChannel() {
        return this.channel;
    }

    public String getPurpose() {
        return this.purpose;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public static class ConversationsSetPurposeRequestBuilder {
        private String token;
        private String channel;
        private String purpose;

        ConversationsSetPurposeRequestBuilder() {
        }

        public ConversationsSetPurposeRequest.ConversationsSetPurposeRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public ConversationsSetPurposeRequest.ConversationsSetPurposeRequestBuilder channel(String channel) {
            this.channel = channel;
            return this;
        }

        public ConversationsSetPurposeRequest.ConversationsSetPurposeRequestBuilder purpose(String purpose) {
            this.purpose = purpose;
            return this;
        }

        public ConversationsSetPurposeRequest build() {
            return new ConversationsSetPurposeRequest(token, channel, purpose);
        }

        public String toString() {
            return "ConversationsSetPurposeRequest.ConversationsSetPurposeRequestBuilder(token=" + this.token + ", channel=" + this.channel + ", purpose=" + this.purpose + ")";
        }
    }
}
