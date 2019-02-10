package com.github.seratch.jslack.api.methods.request.chat;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

/**
 * Provide custom unfurl behavior for user-posted URLs
 */
public class ChatUnfurlRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `links:write`
     */
    private String token;

    /**
     * Provide a simply-formatted string to send as an ephemeral message to the user
     * as invitation to authenticate further and enable full unfurling behavior
     */
    private String userAuthMessage;

    /**
     * Set to `true` or `1` to indicate the user must install your Slack app to trigger unfurls for this domain
     */
    private boolean userAuthRequired;

    /**
     * URL-encoded JSON map with keys set to URLs featured in the the message, pointing to their unfurl message attachments.
     */
    private String unfurls;

    /**
     * Timestamp of the message to add unfurl behavior to.
     */
    private String ts;

    /**
     * Send users to this custom URL where they will complete authentication in your app to fully trigger unfurling.
     * Value should be properly URL-encoded.
     */
    private String userAuthUrl;

    /**
     * Channel ID of the message
     */
    private String channel;

    @java.beans.ConstructorProperties({"token", "userAuthMessage", "userAuthRequired", "unfurls", "ts", "userAuthUrl", "channel"})
    ChatUnfurlRequest(String token, String userAuthMessage, boolean userAuthRequired, String unfurls, String ts, String userAuthUrl, String channel) {
        this.token = token;
        this.userAuthMessage = userAuthMessage;
        this.userAuthRequired = userAuthRequired;
        this.unfurls = unfurls;
        this.ts = ts;
        this.userAuthUrl = userAuthUrl;
        this.channel = channel;
    }

    public static ChatUnfurlRequestBuilder builder() {
        return new ChatUnfurlRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public String getUserAuthMessage() {
        return this.userAuthMessage;
    }

    public boolean isUserAuthRequired() {
        return this.userAuthRequired;
    }

    public String getUnfurls() {
        return this.unfurls;
    }

    public String getTs() {
        return this.ts;
    }

    public String getUserAuthUrl() {
        return this.userAuthUrl;
    }

    public String getChannel() {
        return this.channel;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setUserAuthMessage(String userAuthMessage) {
        this.userAuthMessage = userAuthMessage;
    }

    public void setUserAuthRequired(boolean userAuthRequired) {
        this.userAuthRequired = userAuthRequired;
    }

    public void setUnfurls(String unfurls) {
        this.unfurls = unfurls;
    }

    public void setTs(String ts) {
        this.ts = ts;
    }

    public void setUserAuthUrl(String userAuthUrl) {
        this.userAuthUrl = userAuthUrl;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ChatUnfurlRequest)) return false;
        final ChatUnfurlRequest other = (ChatUnfurlRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$token = this.getToken();
        final Object other$token = other.getToken();
        if (this$token == null ? other$token != null : !this$token.equals(other$token)) return false;
        final Object this$userAuthMessage = this.getUserAuthMessage();
        final Object other$userAuthMessage = other.getUserAuthMessage();
        if (this$userAuthMessage == null ? other$userAuthMessage != null : !this$userAuthMessage.equals(other$userAuthMessage))
            return false;
        if (this.isUserAuthRequired() != other.isUserAuthRequired()) return false;
        final Object this$unfurls = this.getUnfurls();
        final Object other$unfurls = other.getUnfurls();
        if (this$unfurls == null ? other$unfurls != null : !this$unfurls.equals(other$unfurls)) return false;
        final Object this$ts = this.getTs();
        final Object other$ts = other.getTs();
        if (this$ts == null ? other$ts != null : !this$ts.equals(other$ts)) return false;
        final Object this$userAuthUrl = this.getUserAuthUrl();
        final Object other$userAuthUrl = other.getUserAuthUrl();
        if (this$userAuthUrl == null ? other$userAuthUrl != null : !this$userAuthUrl.equals(other$userAuthUrl))
            return false;
        final Object this$channel = this.getChannel();
        final Object other$channel = other.getChannel();
        if (this$channel == null ? other$channel != null : !this$channel.equals(other$channel)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ChatUnfurlRequest;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $token = this.getToken();
        result = result * PRIME + ($token == null ? 43 : $token.hashCode());
        final Object $userAuthMessage = this.getUserAuthMessage();
        result = result * PRIME + ($userAuthMessage == null ? 43 : $userAuthMessage.hashCode());
        result = result * PRIME + (this.isUserAuthRequired() ? 79 : 97);
        final Object $unfurls = this.getUnfurls();
        result = result * PRIME + ($unfurls == null ? 43 : $unfurls.hashCode());
        final Object $ts = this.getTs();
        result = result * PRIME + ($ts == null ? 43 : $ts.hashCode());
        final Object $userAuthUrl = this.getUserAuthUrl();
        result = result * PRIME + ($userAuthUrl == null ? 43 : $userAuthUrl.hashCode());
        final Object $channel = this.getChannel();
        result = result * PRIME + ($channel == null ? 43 : $channel.hashCode());
        return result;
    }

    public String toString() {
        return "ChatUnfurlRequest(token=" + this.getToken() + ", userAuthMessage=" + this.getUserAuthMessage() + ", userAuthRequired=" + this.isUserAuthRequired() + ", unfurls=" + this.getUnfurls() + ", ts=" + this.getTs() + ", userAuthUrl=" + this.getUserAuthUrl() + ", channel=" + this.getChannel() + ")";
    }

    public static class ChatUnfurlRequestBuilder {
        private String token;
        private String userAuthMessage;
        private boolean userAuthRequired;
        private String unfurls;
        private String ts;
        private String userAuthUrl;
        private String channel;

        ChatUnfurlRequestBuilder() {
        }

        public ChatUnfurlRequest.ChatUnfurlRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public ChatUnfurlRequest.ChatUnfurlRequestBuilder userAuthMessage(String userAuthMessage) {
            this.userAuthMessage = userAuthMessage;
            return this;
        }

        public ChatUnfurlRequest.ChatUnfurlRequestBuilder userAuthRequired(boolean userAuthRequired) {
            this.userAuthRequired = userAuthRequired;
            return this;
        }

        public ChatUnfurlRequest.ChatUnfurlRequestBuilder unfurls(String unfurls) {
            this.unfurls = unfurls;
            return this;
        }

        public ChatUnfurlRequest.ChatUnfurlRequestBuilder ts(String ts) {
            this.ts = ts;
            return this;
        }

        public ChatUnfurlRequest.ChatUnfurlRequestBuilder userAuthUrl(String userAuthUrl) {
            this.userAuthUrl = userAuthUrl;
            return this;
        }

        public ChatUnfurlRequest.ChatUnfurlRequestBuilder channel(String channel) {
            this.channel = channel;
            return this;
        }

        public ChatUnfurlRequest build() {
            return new ChatUnfurlRequest(token, userAuthMessage, userAuthRequired, unfurls, ts, userAuthUrl, channel);
        }

        public String toString() {
            return "ChatUnfurlRequest.ChatUnfurlRequestBuilder(token=" + this.token + ", userAuthMessage=" + this.userAuthMessage + ", userAuthRequired=" + this.userAuthRequired + ", unfurls=" + this.unfurls + ", ts=" + this.ts + ", userAuthUrl=" + this.userAuthUrl + ", channel=" + this.channel + ")";
        }
    }
}
