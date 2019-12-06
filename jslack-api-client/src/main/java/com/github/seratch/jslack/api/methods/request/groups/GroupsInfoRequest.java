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