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