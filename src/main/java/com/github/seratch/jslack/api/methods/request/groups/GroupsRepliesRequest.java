package com.github.seratch.jslack.api.methods.request.groups;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class GroupsRepliesRequest implements SlackApiRequest {

    private String token;
    private String channel;
    private String threadTs;

    @java.beans.ConstructorProperties({"token", "channel", "threadTs"})
    GroupsRepliesRequest(String token, String channel, String threadTs) {
        this.token = token;
        this.channel = channel;
        this.threadTs = threadTs;
    }

    public static GroupsRepliesRequestBuilder builder() {
        return new GroupsRepliesRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public String getChannel() {
        return this.channel;
    }

    public String getThreadTs() {
        return this.threadTs;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public void setThreadTs(String threadTs) {
        this.threadTs = threadTs;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof GroupsRepliesRequest)) return false;
        final GroupsRepliesRequest other = (GroupsRepliesRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$token = this.getToken();
        final Object other$token = other.getToken();
        if (this$token == null ? other$token != null : !this$token.equals(other$token)) return false;
        final Object this$channel = this.getChannel();
        final Object other$channel = other.getChannel();
        if (this$channel == null ? other$channel != null : !this$channel.equals(other$channel)) return false;
        final Object this$threadTs = this.getThreadTs();
        final Object other$threadTs = other.getThreadTs();
        if (this$threadTs == null ? other$threadTs != null : !this$threadTs.equals(other$threadTs)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $token = this.getToken();
        result = result * PRIME + ($token == null ? 43 : $token.hashCode());
        final Object $channel = this.getChannel();
        result = result * PRIME + ($channel == null ? 43 : $channel.hashCode());
        final Object $threadTs = this.getThreadTs();
        result = result * PRIME + ($threadTs == null ? 43 : $threadTs.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof GroupsRepliesRequest;
    }

    public String toString() {
        return "GroupsRepliesRequest(token=" + this.getToken() + ", channel=" + this.getChannel() + ", threadTs=" + this.getThreadTs() + ")";
    }

    public static class GroupsRepliesRequestBuilder {
        private String token;
        private String channel;
        private String threadTs;

        GroupsRepliesRequestBuilder() {
        }

        public GroupsRepliesRequest.GroupsRepliesRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public GroupsRepliesRequest.GroupsRepliesRequestBuilder channel(String channel) {
            this.channel = channel;
            return this;
        }

        public GroupsRepliesRequest.GroupsRepliesRequestBuilder threadTs(String threadTs) {
            this.threadTs = threadTs;
            return this;
        }

        public GroupsRepliesRequest build() {
            return new GroupsRepliesRequest(token, channel, threadTs);
        }

        public String toString() {
            return "GroupsRepliesRequest.GroupsRepliesRequestBuilder(token=" + this.token + ", channel=" + this.channel + ", threadTs=" + this.threadTs + ")";
        }
    }
}