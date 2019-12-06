package com.github.seratch.jslack.api.methods.request.groups;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class GroupsSetPurposeRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `groups:write`
     */
    private String token;

    /**
     * Private channel to set the purpose of
     */
    private String channel;

    /**
     * The new purpose
     */
    private String purpose;

    GroupsSetPurposeRequest(String token, String channel, String purpose) {
        this.token = token;
        this.channel = channel;
        this.purpose = purpose;
    }

    public static GroupsSetPurposeRequestBuilder builder() {
        return new GroupsSetPurposeRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public String getChannel() {
        return this.channel;
    }

    public String getPurpose() {
        return this.purpose;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public static class GroupsSetPurposeRequestBuilder {
        private String token;
        private String channel;
        private String purpose;

        GroupsSetPurposeRequestBuilder() {
        }

        public GroupsSetPurposeRequest.GroupsSetPurposeRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public GroupsSetPurposeRequest.GroupsSetPurposeRequestBuilder channel(String channel) {
            this.channel = channel;
            return this;
        }

        public GroupsSetPurposeRequest.GroupsSetPurposeRequestBuilder purpose(String purpose) {
            this.purpose = purpose;
            return this;
        }

        public GroupsSetPurposeRequest build() {
            return new GroupsSetPurposeRequest(token, channel, purpose);
        }

        public String toString() {
            return "GroupsSetPurposeRequest.GroupsSetPurposeRequestBuilder(token=" + this.token + ", channel=" + this.channel + ", purpose=" + this.purpose + ")";
        }
    }
}