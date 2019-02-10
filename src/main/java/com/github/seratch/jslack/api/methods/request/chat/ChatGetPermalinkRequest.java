package com.github.seratch.jslack.api.methods.request.chat;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

/**
 * A request to retrieve a permalink URL for a specific extant message
 *
 * @see <a href="https://api.slack.com/methods/chat.getPermalink">Slack chat.getPermalink API</a>
 */
public class ChatGetPermalinkRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `none`
     */
    private String token;

    /**
     * The ID of the conversation or channel containing the message
     */
    private String channel;

    /**
     * A message's `ts` value, uniquely identifying it within a channel
     */
    private String messageTs;

    @java.beans.ConstructorProperties({"token", "channel", "messageTs"})
    ChatGetPermalinkRequest(String token, String channel, String messageTs) {
        this.token = token;
        this.channel = channel;
        this.messageTs = messageTs;
    }

    public static ChatGetPermalinkRequestBuilder builder() {
        return new ChatGetPermalinkRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public String getChannel() {
        return this.channel;
    }

    public String getMessageTs() {
        return this.messageTs;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public void setMessageTs(String messageTs) {
        this.messageTs = messageTs;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ChatGetPermalinkRequest)) return false;
        final ChatGetPermalinkRequest other = (ChatGetPermalinkRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$token = this.getToken();
        final Object other$token = other.getToken();
        if (this$token == null ? other$token != null : !this$token.equals(other$token)) return false;
        final Object this$channel = this.getChannel();
        final Object other$channel = other.getChannel();
        if (this$channel == null ? other$channel != null : !this$channel.equals(other$channel)) return false;
        final Object this$messageTs = this.getMessageTs();
        final Object other$messageTs = other.getMessageTs();
        if (this$messageTs == null ? other$messageTs != null : !this$messageTs.equals(other$messageTs)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ChatGetPermalinkRequest;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $token = this.getToken();
        result = result * PRIME + ($token == null ? 43 : $token.hashCode());
        final Object $channel = this.getChannel();
        result = result * PRIME + ($channel == null ? 43 : $channel.hashCode());
        final Object $messageTs = this.getMessageTs();
        result = result * PRIME + ($messageTs == null ? 43 : $messageTs.hashCode());
        return result;
    }

    public String toString() {
        return "ChatGetPermalinkRequest(token=" + this.getToken() + ", channel=" + this.getChannel() + ", messageTs=" + this.getMessageTs() + ")";
    }

    public static class ChatGetPermalinkRequestBuilder {
        private String token;
        private String channel;
        private String messageTs;

        ChatGetPermalinkRequestBuilder() {
        }

        public ChatGetPermalinkRequest.ChatGetPermalinkRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public ChatGetPermalinkRequest.ChatGetPermalinkRequestBuilder channel(String channel) {
            this.channel = channel;
            return this;
        }

        public ChatGetPermalinkRequest.ChatGetPermalinkRequestBuilder messageTs(String messageTs) {
            this.messageTs = messageTs;
            return this;
        }

        public ChatGetPermalinkRequest build() {
            return new ChatGetPermalinkRequest(token, channel, messageTs);
        }

        public String toString() {
            return "ChatGetPermalinkRequest.ChatGetPermalinkRequestBuilder(token=" + this.token + ", channel=" + this.channel + ", messageTs=" + this.messageTs + ")";
        }
    }
}
