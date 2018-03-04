package com.github.seratch.jslack.api.methods.request.mpim;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class MpimCloseRequest implements SlackApiRequest {

    private String token;
    private String channel;

    @java.beans.ConstructorProperties({"token", "channel"})
    MpimCloseRequest(String token, String channel) {
        this.token = token;
        this.channel = channel;
    }

    public static MpimCloseRequestBuilder builder() {
        return new MpimCloseRequestBuilder();
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
        if (!(o instanceof MpimCloseRequest)) return false;
        final MpimCloseRequest other = (MpimCloseRequest) o;
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
        return other instanceof MpimCloseRequest;
    }

    public String toString() {
        return "MpimCloseRequest(token=" + this.getToken() + ", channel=" + this.getChannel() + ")";
    }

    public static class MpimCloseRequestBuilder {
        private String token;
        private String channel;

        MpimCloseRequestBuilder() {
        }

        public MpimCloseRequest.MpimCloseRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public MpimCloseRequest.MpimCloseRequestBuilder channel(String channel) {
            this.channel = channel;
            return this;
        }

        public MpimCloseRequest build() {
            return new MpimCloseRequest(token, channel);
        }

        public String toString() {
            return "MpimCloseRequest.MpimCloseRequestBuilder(token=" + this.token + ", channel=" + this.channel + ")";
        }
    }
}