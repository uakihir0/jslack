package com.github.seratch.jslack.api.methods.request.channels;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class ChannelsCreateRequest implements SlackApiRequest {

    private String token;
    private String name;

    ChannelsCreateRequest(String token, String name) {
        this.token = token;
        this.name = name;
    }

    public static ChannelsCreateRequestBuilder builder() {
        return new ChannelsCreateRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public String getName() {
        return this.name;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof ChannelsCreateRequest)) return false;
        final ChannelsCreateRequest other = (ChannelsCreateRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$token = this.getToken();
        final Object other$token = other.getToken();
        if (this$token == null ? other$token != null : !this$token.equals(other$token)) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $token = this.getToken();
        result = result * PRIME + ($token == null ? 43 : $token.hashCode());
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof ChannelsCreateRequest;
    }

    public String toString() {
        return "ChannelsCreateRequest(token=" + this.getToken() + ", name=" + this.getName() + ")";
    }

    public static class ChannelsCreateRequestBuilder {
        private String token;
        private String name;

        ChannelsCreateRequestBuilder() {
        }

        public ChannelsCreateRequest.ChannelsCreateRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public ChannelsCreateRequest.ChannelsCreateRequestBuilder name(String name) {
            this.name = name;
            return this;
        }

        public ChannelsCreateRequest build() {
            return new ChannelsCreateRequest(token, name);
        }

        public String toString() {
            return "ChannelsCreateRequest.ChannelsCreateRequestBuilder(token=" + this.token + ", name=" + this.name + ")";
        }
    }
}