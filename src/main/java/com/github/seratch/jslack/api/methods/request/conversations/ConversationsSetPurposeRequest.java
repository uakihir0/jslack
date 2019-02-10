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

    @java.beans.ConstructorProperties({"token", "channel", "purpose"})
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

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ConversationsSetPurposeRequest))
            return false;
        final ConversationsSetPurposeRequest other = (ConversationsSetPurposeRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$token = this.getToken();
        final Object other$token = other.getToken();
        if (this$token == null ? other$token != null : !this$token.equals(other$token)) return false;
        final Object this$channel = this.getChannel();
        final Object other$channel = other.getChannel();
        if (this$channel == null ? other$channel != null : !this$channel.equals(other$channel)) return false;
        final Object this$purpose = this.getPurpose();
        final Object other$purpose = other.getPurpose();
        if (this$purpose == null ? other$purpose != null : !this$purpose.equals(other$purpose)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ConversationsSetPurposeRequest;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $token = this.getToken();
        result = result * PRIME + ($token == null ? 43 : $token.hashCode());
        final Object $channel = this.getChannel();
        result = result * PRIME + ($channel == null ? 43 : $channel.hashCode());
        final Object $purpose = this.getPurpose();
        result = result * PRIME + ($purpose == null ? 43 : $purpose.hashCode());
        return result;
    }

    public String toString() {
        return "ConversationsSetPurposeRequest(token=" + this.getToken() + ", channel=" + this.getChannel() + ", purpose=" + this.getPurpose() + ")";
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
