package com.github.seratch.jslack.api.methods.request.chat;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class ChatDeleteRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `chat:write`
     */
    private String token;

    /**
     * Timestamp of the message to be deleted.
     */
    private String ts;

    /**
     * Channel containing the message to be deleted.
     */
    private String channel;

    /**
     * Pass true to delete the message as the authed user with `chat:write:user` scope.
     * [Bot users](/bot-users) in this context are considered authed users.
     * If unused or false, the message will be deleted with `chat:write:bot` scope.
     */
    private boolean asUser;

    ChatDeleteRequest(String token, String ts, String channel, boolean asUser) {
        this.token = token;
        this.ts = ts;
        this.channel = channel;
        this.asUser = asUser;
    }

    public static ChatDeleteRequestBuilder builder() {
        return new ChatDeleteRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public String getTs() {
        return this.ts;
    }

    public String getChannel() {
        return this.channel;
    }

    public boolean isAsUser() {
        return this.asUser;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setTs(String ts) {
        this.ts = ts;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public void setAsUser(boolean asUser) {
        this.asUser = asUser;
    }

    public static class ChatDeleteRequestBuilder {
        private String token;
        private String ts;
        private String channel;
        private boolean asUser;

        ChatDeleteRequestBuilder() {
        }

        public ChatDeleteRequest.ChatDeleteRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public ChatDeleteRequest.ChatDeleteRequestBuilder ts(String ts) {
            this.ts = ts;
            return this;
        }

        public ChatDeleteRequest.ChatDeleteRequestBuilder channel(String channel) {
            this.channel = channel;
            return this;
        }

        public ChatDeleteRequest.ChatDeleteRequestBuilder asUser(boolean asUser) {
            this.asUser = asUser;
            return this;
        }

        public ChatDeleteRequest build() {
            return new ChatDeleteRequest(token, ts, channel, asUser);
        }

        public String toString() {
            return "ChatDeleteRequest.ChatDeleteRequestBuilder(token=" + this.token + ", ts=" + this.ts + ", channel=" + this.channel + ", asUser=" + this.asUser + ")";
        }
    }
}