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

    ConversationsInfoRequest(String token, String channel, boolean includeLocale) {
        this.token = token;
        this.channel = channel;
        this.includeLocale = includeLocale;
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

    public void setToken(String token) {
        this.token = token;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public void setIncludeLocale(boolean includeLocale) {
        this.includeLocale = includeLocale;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ConversationsInfoRequest))
            return false;
        final ConversationsInfoRequest other = (ConversationsInfoRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$token = this.getToken();
        final Object other$token = other.getToken();
        if (this$token == null ? other$token != null : !this$token.equals(other$token)) return false;
        final Object this$channel = this.getChannel();
        final Object other$channel = other.getChannel();
        if (this$channel == null ? other$channel != null : !this$channel.equals(other$channel)) return false;
        if (this.isIncludeLocale() != other.isIncludeLocale()) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ConversationsInfoRequest;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $token = this.getToken();
        result = result * PRIME + ($token == null ? 43 : $token.hashCode());
        final Object $channel = this.getChannel();
        result = result * PRIME + ($channel == null ? 43 : $channel.hashCode());
        result = result * PRIME + (this.isIncludeLocale() ? 79 : 97);
        return result;
    }

    public String toString() {
        return "ConversationsInfoRequest(token=" + this.getToken() + ", channel=" + this.getChannel() + ", includeLocale=" + this.isIncludeLocale() + ")";
    }

    public static class ConversationsInfoRequestBuilder {
        private String token;
        private String channel;
        private boolean includeLocale;

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

        public ConversationsInfoRequest build() {
            return new ConversationsInfoRequest(token, channel, includeLocale);
        }

        public String toString() {
            return "ConversationsInfoRequest.ConversationsInfoRequestBuilder(token=" + this.token + ", channel=" + this.channel + ", includeLocale=" + this.includeLocale + ")";
        }
    }
}