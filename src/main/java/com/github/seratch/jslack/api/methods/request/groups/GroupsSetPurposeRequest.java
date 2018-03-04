package com.github.seratch.jslack.api.methods.request.groups;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class GroupsSetPurposeRequest implements SlackApiRequest {

    private String token;
    private String channel;
    private String purpose;

    @java.beans.ConstructorProperties({"token", "channel", "purpose"})
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

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof GroupsSetPurposeRequest)) return false;
        final GroupsSetPurposeRequest other = (GroupsSetPurposeRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$token = this.getToken();
        final Object other$token = other.getToken();
        if (this$token == null ? other$token != null : !this$token.equals(other$token)) return false;
        final Object this$channel = this.getChannel();
        final Object other$channel = other.getChannel();
        if (this$channel == null ? other$channel != null : !this$channel.equals(other$channel)) return false;
        final Object this$purpose = this.getPurpose();
        final Object other$purpose = other.getPurpose();
        if (this$purpose == null ? other$purpose != null : !this$purpose.equals(other$purpose)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $token = this.getToken();
        result = result * PRIME + ($token == null ? 43 : $token.hashCode());
        final Object $channel = this.getChannel();
        result = result * PRIME + ($channel == null ? 43 : $channel.hashCode());
        final Object $purpose = this.getPurpose();
        result = result * PRIME + ($purpose == null ? 43 : $purpose.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof GroupsSetPurposeRequest;
    }

    public String toString() {
        return "GroupsSetPurposeRequest(token=" + this.getToken() + ", channel=" + this.getChannel() + ", purpose=" + this.getPurpose() + ")";
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