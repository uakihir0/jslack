package com.github.seratch.jslack.api.methods.request.groups;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class GroupsRenameRequest implements SlackApiRequest {

    private String token;
    private String channel;
    private String name;

    @java.beans.ConstructorProperties({"token", "channel", "name"})
    GroupsRenameRequest(String token, String channel, String name) {
        this.token = token;
        this.channel = channel;
        this.name = name;
    }

    public static GroupsRenameRequestBuilder builder() {
        return new GroupsRenameRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public String getChannel() {
        return this.channel;
    }

    public String getName() {
        return this.name;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof GroupsRenameRequest)) return false;
        final GroupsRenameRequest other = (GroupsRenameRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$token = this.getToken();
        final Object other$token = other.getToken();
        if (this$token == null ? other$token != null : !this$token.equals(other$token)) return false;
        final Object this$channel = this.getChannel();
        final Object other$channel = other.getChannel();
        if (this$channel == null ? other$channel != null : !this$channel.equals(other$channel)) return false;
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
        final Object $channel = this.getChannel();
        result = result * PRIME + ($channel == null ? 43 : $channel.hashCode());
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof GroupsRenameRequest;
    }

    public String toString() {
        return "GroupsRenameRequest(token=" + this.getToken() + ", channel=" + this.getChannel() + ", name=" + this.getName() + ")";
    }

    public static class GroupsRenameRequestBuilder {
        private String token;
        private String channel;
        private String name;

        GroupsRenameRequestBuilder() {
        }

        public GroupsRenameRequest.GroupsRenameRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public GroupsRenameRequest.GroupsRenameRequestBuilder channel(String channel) {
            this.channel = channel;
            return this;
        }

        public GroupsRenameRequest.GroupsRenameRequestBuilder name(String name) {
            this.name = name;
            return this;
        }

        public GroupsRenameRequest build() {
            return new GroupsRenameRequest(token, channel, name);
        }

        public String toString() {
            return "GroupsRenameRequest.GroupsRenameRequestBuilder(token=" + this.token + ", channel=" + this.channel + ", name=" + this.name + ")";
        }
    }
}