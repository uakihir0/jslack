package com.github.seratch.jslack.api.methods.request.groups;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class GroupsMarkRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `groups:write`
     */
    private String token;

    /**
     * Private channel to set reading cursor in.
     */
    private String channel;

    /**
     * Timestamp of the most recently seen message.
     */
    private String ts;

    GroupsMarkRequest(String token, String channel, String ts) {
        this.token = token;
        this.channel = channel;
        this.ts = ts;
    }

    public static GroupsMarkRequestBuilder builder() {
        return new GroupsMarkRequestBuilder();
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

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof GroupsMarkRequest)) return false;
        final GroupsMarkRequest other = (GroupsMarkRequest) o;
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

    protected boolean canEqual(final Object other) {
        return other instanceof GroupsMarkRequest;
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

    public String toString() {
        return "GroupsMarkRequest(token=" + this.getToken() + ", channel=" + this.getChannel() + ", ts=" + this.getTs() + ")";
    }

    public static class GroupsMarkRequestBuilder {
        private String token;
        private String channel;
        private String ts;

        GroupsMarkRequestBuilder() {
        }

        public GroupsMarkRequest.GroupsMarkRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public GroupsMarkRequest.GroupsMarkRequestBuilder channel(String channel) {
            this.channel = channel;
            return this;
        }

        public GroupsMarkRequest.GroupsMarkRequestBuilder ts(String ts) {
            this.ts = ts;
            return this;
        }

        public GroupsMarkRequest build() {
            return new GroupsMarkRequest(token, channel, ts);
        }

        public String toString() {
            return "GroupsMarkRequest.GroupsMarkRequestBuilder(token=" + this.token + ", channel=" + this.channel + ", ts=" + this.ts + ")";
        }
    }
}