package com.github.seratch.jslack.api.methods.request.channels;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class ChannelsListRequest implements SlackApiRequest {

    private String token;
    // 1: true
    private Integer excludeArchived;

    ChannelsListRequest(String token, Integer excludeArchived) {
        this.token = token;
        this.excludeArchived = excludeArchived;
    }

    public static ChannelsListRequestBuilder builder() {
        return new ChannelsListRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public Integer getExcludeArchived() {
        return this.excludeArchived;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setExcludeArchived(Integer excludeArchived) {
        this.excludeArchived = excludeArchived;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof ChannelsListRequest)) return false;
        final ChannelsListRequest other = (ChannelsListRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$token = this.getToken();
        final Object other$token = other.getToken();
        if (this$token == null ? other$token != null : !this$token.equals(other$token)) return false;
        final Object this$excludeArchived = this.getExcludeArchived();
        final Object other$excludeArchived = other.getExcludeArchived();
        if (this$excludeArchived == null ? other$excludeArchived != null : !this$excludeArchived.equals(other$excludeArchived))
            return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $token = this.getToken();
        result = result * PRIME + ($token == null ? 43 : $token.hashCode());
        final Object $excludeArchived = this.getExcludeArchived();
        result = result * PRIME + ($excludeArchived == null ? 43 : $excludeArchived.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof ChannelsListRequest;
    }

    public String toString() {
        return "ChannelsListRequest(token=" + this.getToken() + ", excludeArchived=" + this.getExcludeArchived() + ")";
    }

    public static class ChannelsListRequestBuilder {
        private String token;
        private Integer excludeArchived;

        ChannelsListRequestBuilder() {
        }

        public ChannelsListRequest.ChannelsListRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public ChannelsListRequest.ChannelsListRequestBuilder excludeArchived(Integer excludeArchived) {
            this.excludeArchived = excludeArchived;
            return this;
        }

        public ChannelsListRequest build() {
            return new ChannelsListRequest(token, excludeArchived);
        }

        public String toString() {
            return "ChannelsListRequest.ChannelsListRequestBuilder(token=" + this.token + ", excludeArchived=" + this.excludeArchived + ")";
        }
    }
}