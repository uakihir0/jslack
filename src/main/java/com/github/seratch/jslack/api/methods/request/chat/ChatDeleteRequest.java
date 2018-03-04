package com.github.seratch.jslack.api.methods.request.chat;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class ChatDeleteRequest implements SlackApiRequest {

    private String token;
    private String ts;
    private String channel;
    private boolean asUser;

    @java.beans.ConstructorProperties({"token", "ts", "channel", "asUser"})
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

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof ChatDeleteRequest)) return false;
        final ChatDeleteRequest other = (ChatDeleteRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$token = this.getToken();
        final Object other$token = other.getToken();
        if (this$token == null ? other$token != null : !this$token.equals(other$token)) return false;
        final Object this$ts = this.getTs();
        final Object other$ts = other.getTs();
        if (this$ts == null ? other$ts != null : !this$ts.equals(other$ts)) return false;
        final Object this$channel = this.getChannel();
        final Object other$channel = other.getChannel();
        if (this$channel == null ? other$channel != null : !this$channel.equals(other$channel)) return false;
        if (this.isAsUser() != other.isAsUser()) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $token = this.getToken();
        result = result * PRIME + ($token == null ? 43 : $token.hashCode());
        final Object $ts = this.getTs();
        result = result * PRIME + ($ts == null ? 43 : $ts.hashCode());
        final Object $channel = this.getChannel();
        result = result * PRIME + ($channel == null ? 43 : $channel.hashCode());
        result = result * PRIME + (this.isAsUser() ? 79 : 97);
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof ChatDeleteRequest;
    }

    public String toString() {
        return "ChatDeleteRequest(token=" + this.getToken() + ", ts=" + this.getTs() + ", channel=" + this.getChannel() + ", asUser=" + this.isAsUser() + ")";
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