package com.github.seratch.jslack.api.methods.request.im;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class ImMarkRequest implements SlackApiRequest {

    private String token;
    private String channel;
    private String ts;

    ImMarkRequest(String token, String channel, String ts) {
        this.token = token;
        this.channel = channel;
        this.ts = ts;
    }

    public static ImMarkRequestBuilder builder() {
        return new ImMarkRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public String getChannel() {
        return this.channel;
    }

    public String getTs() {
        return this.ts;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public void setTs(String ts) {
        this.ts = ts;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof ImMarkRequest)) return false;
        final ImMarkRequest other = (ImMarkRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$token = this.getToken();
        final Object other$token = other.getToken();
        if (this$token == null ? other$token != null : !this$token.equals(other$token)) return false;
        final Object this$channel = this.getChannel();
        final Object other$channel = other.getChannel();
        if (this$channel == null ? other$channel != null : !this$channel.equals(other$channel)) return false;
        final Object this$ts = this.getTs();
        final Object other$ts = other.getTs();
        if (this$ts == null ? other$ts != null : !this$ts.equals(other$ts)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $token = this.getToken();
        result = result * PRIME + ($token == null ? 43 : $token.hashCode());
        final Object $channel = this.getChannel();
        result = result * PRIME + ($channel == null ? 43 : $channel.hashCode());
        final Object $ts = this.getTs();
        result = result * PRIME + ($ts == null ? 43 : $ts.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof ImMarkRequest;
    }

    public String toString() {
        return "ImMarkRequest(token=" + this.getToken() + ", channel=" + this.getChannel() + ", ts=" + this.getTs() + ")";
    }

    public static class ImMarkRequestBuilder {
        private String token;
        private String channel;
        private String ts;

        ImMarkRequestBuilder() {
        }

        public ImMarkRequest.ImMarkRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public ImMarkRequest.ImMarkRequestBuilder channel(String channel) {
            this.channel = channel;
            return this;
        }

        public ImMarkRequest.ImMarkRequestBuilder ts(String ts) {
            this.ts = ts;
            return this;
        }

        public ImMarkRequest build() {
            return new ImMarkRequest(token, channel, ts);
        }

        public String toString() {
            return "ImMarkRequest.ImMarkRequestBuilder(token=" + this.token + ", channel=" + this.channel + ", ts=" + this.ts + ")";
        }
    }
}