package com.github.seratch.jslack.api.methods.request.chat;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class ChatMeMessageRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `chat:write:user`
     */
    private String token;

    /**
     * Channel to send message to. Can be a public channel, private group or IM channel. Can be an encoded ID, or a name.
     */
    private String channel;

    /**
     * Text of the message to send.
     */
    private String text;

    @java.beans.ConstructorProperties({"token", "channel", "text"})
    ChatMeMessageRequest(String token, String channel, String text) {
        this.token = token;
        this.channel = channel;
        this.text = text;
    }

    public static ChatMeMessageRequestBuilder builder() {
        return new ChatMeMessageRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public String getChannel() {
        return this.channel;
    }

    public String getText() {
        return this.text;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ChatMeMessageRequest)) return false;
        final ChatMeMessageRequest other = (ChatMeMessageRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$token = this.getToken();
        final Object other$token = other.getToken();
        if (this$token == null ? other$token != null : !this$token.equals(other$token)) return false;
        final Object this$channel = this.getChannel();
        final Object other$channel = other.getChannel();
        if (this$channel == null ? other$channel != null : !this$channel.equals(other$channel)) return false;
        final Object this$text = this.getText();
        final Object other$text = other.getText();
        if (this$text == null ? other$text != null : !this$text.equals(other$text)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ChatMeMessageRequest;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $token = this.getToken();
        result = result * PRIME + ($token == null ? 43 : $token.hashCode());
        final Object $channel = this.getChannel();
        result = result * PRIME + ($channel == null ? 43 : $channel.hashCode());
        final Object $text = this.getText();
        result = result * PRIME + ($text == null ? 43 : $text.hashCode());
        return result;
    }

    public String toString() {
        return "ChatMeMessageRequest(token=" + this.getToken() + ", channel=" + this.getChannel() + ", text=" + this.getText() + ")";
    }

    public static class ChatMeMessageRequestBuilder {
        private String token;
        private String channel;
        private String text;

        ChatMeMessageRequestBuilder() {
        }

        public ChatMeMessageRequest.ChatMeMessageRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public ChatMeMessageRequest.ChatMeMessageRequestBuilder channel(String channel) {
            this.channel = channel;
            return this;
        }

        public ChatMeMessageRequest.ChatMeMessageRequestBuilder text(String text) {
            this.text = text;
            return this;
        }

        public ChatMeMessageRequest build() {
            return new ChatMeMessageRequest(token, channel, text);
        }

        public String toString() {
            return "ChatMeMessageRequest.ChatMeMessageRequestBuilder(token=" + this.token + ", channel=" + this.channel + ", text=" + this.text + ")";
        }
    }
}