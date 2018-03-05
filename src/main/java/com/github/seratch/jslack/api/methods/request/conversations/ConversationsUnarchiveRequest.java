package com.github.seratch.jslack.api.methods.request.conversations;

public class ConversationsUnarchiveRequest {

    private String token;
    private String channel;

    ConversationsUnarchiveRequest(String token, String channel) {
        this.token = token;
        this.channel = channel;
    }

    public static ConversationsUnarchiveRequestBuilder builder() {
        return new ConversationsUnarchiveRequestBuilder();
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

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof ConversationsUnarchiveRequest)) return false;
        final ConversationsUnarchiveRequest other = (ConversationsUnarchiveRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$token = this.getToken();
        final Object other$token = other.getToken();
        if (this$token == null ? other$token != null : !this$token.equals(other$token)) return false;
        final Object this$channel = this.getChannel();
        final Object other$channel = other.getChannel();
        if (this$channel == null ? other$channel != null : !this$channel.equals(other$channel)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $token = this.getToken();
        result = result * PRIME + ($token == null ? 43 : $token.hashCode());
        final Object $channel = this.getChannel();
        result = result * PRIME + ($channel == null ? 43 : $channel.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof ConversationsUnarchiveRequest;
    }

    public String toString() {
        return "ConversationsUnarchiveRequest(token=" + this.getToken() + ", channel=" + this.getChannel() + ")";
    }

    public static class ConversationsUnarchiveRequestBuilder {
        private String token;
        private String channel;

        ConversationsUnarchiveRequestBuilder() {
        }

        public ConversationsUnarchiveRequest.ConversationsUnarchiveRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public ConversationsUnarchiveRequest.ConversationsUnarchiveRequestBuilder channel(String channel) {
            this.channel = channel;
            return this;
        }

        public ConversationsUnarchiveRequest build() {
            return new ConversationsUnarchiveRequest(token, channel);
        }

        public String toString() {
            return "ConversationsUnarchiveRequest.ConversationsUnarchiveRequestBuilder(token=" + this.token + ", channel=" + this.channel + ")";
        }
    }
}
