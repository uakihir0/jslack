package com.github.seratch.jslack.api.methods.request.groups;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class GroupsInfoRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `groups:read`
     */
    private String token;

    /**
     * Private channel to get info on
     */
    private String channel;

    /**
     * Set this to `true` to receive the locale for this group. Defaults to `false`
     */
    private boolean includeLocale;

    GroupsInfoRequest(String token, String channel, boolean includeLocale) {
        this.token = token;
        this.channel = channel;
        this.includeLocale = includeLocale;
    }

    public static GroupsInfoRequestBuilder builder() {
        return new GroupsInfoRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public String getChannel() {
        return this.channel;
    }

    public boolean isIncludeLocale() {
        return this.includeLocale;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public void setIncludeLocale(boolean includeLocale) {
        this.includeLocale = includeLocale;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof GroupsInfoRequest)) return false;
        final GroupsInfoRequest other = (GroupsInfoRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$token = this.getToken();
        final Object other$token = other.getToken();
        if (this$token == null ? other$token != null : !this$token.equals(other$token)) return false;
        final Object this$channel = this.getChannel();
        final Object other$channel = other.getChannel();
        if (this$channel == null ? other$channel != null : !this$channel.equals(other$channel)) return false;
        if (this.isIncludeLocale() != other.isIncludeLocale()) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof GroupsInfoRequest;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $token = this.getToken();
        result = result * PRIME + ($token == null ? 43 : $token.hashCode());
        final Object $channel = this.getChannel();
        result = result * PRIME + ($channel == null ? 43 : $channel.hashCode());
        result = result * PRIME + (this.isIncludeLocale() ? 79 : 97);
        return result;
    }

    public String toString() {
        return "GroupsInfoRequest(token=" + this.getToken() + ", channel=" + this.getChannel() + ", includeLocale=" + this.isIncludeLocale() + ")";
    }

    public static class GroupsInfoRequestBuilder {
        private String token;
        private String channel;
        private boolean includeLocale;

        GroupsInfoRequestBuilder() {
        }

        public GroupsInfoRequest.GroupsInfoRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public GroupsInfoRequest.GroupsInfoRequestBuilder channel(String channel) {
            this.channel = channel;
            return this;
        }

        public GroupsInfoRequest.GroupsInfoRequestBuilder includeLocale(boolean includeLocale) {
            this.includeLocale = includeLocale;
            return this;
        }

        public GroupsInfoRequest build() {
            return new GroupsInfoRequest(token, channel, includeLocale);
        }

        public String toString() {
            return "GroupsInfoRequest.GroupsInfoRequestBuilder(token=" + this.token + ", channel=" + this.channel + ", includeLocale=" + this.includeLocale + ")";
        }
    }
}