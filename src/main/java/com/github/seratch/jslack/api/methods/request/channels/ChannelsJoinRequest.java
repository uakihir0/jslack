package com.github.seratch.jslack.api.methods.request.channels;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class ChannelsJoinRequest implements SlackApiRequest {

    private String token;
    private String name;

    ChannelsJoinRequest(String token, String name) {
        this.token = token;
        this.name = name;
    }

    public static ChannelsJoinRequestBuilder builder() {
        return new ChannelsJoinRequestBuilder();
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
        if (!(o instanceof ChannelsJoinRequest)) return false;
        final ChannelsJoinRequest other = (ChannelsJoinRequest) o;
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
        return other instanceof ChannelsJoinRequest;
    }

    public String toString() {
        return "ChannelsJoinRequest(token=" + this.getToken() + ", name=" + this.getName() + ")";
    }

    public static class ChannelsJoinRequestBuilder {
        private String token;
        private String name;

        ChannelsJoinRequestBuilder() {
        }

        public ChannelsJoinRequest.ChannelsJoinRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public ChannelsJoinRequest.ChannelsJoinRequestBuilder name(String name) {
            this.name = name;
            return this;
        }

        public ChannelsJoinRequest build() {
            return new ChannelsJoinRequest(token, name);
        }

        public String toString() {
            return "ChannelsJoinRequest.ChannelsJoinRequestBuilder(token=" + this.token + ", name=" + this.name + ")";
        }
    }
}