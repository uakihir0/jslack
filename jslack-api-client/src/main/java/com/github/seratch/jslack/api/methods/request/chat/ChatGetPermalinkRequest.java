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
