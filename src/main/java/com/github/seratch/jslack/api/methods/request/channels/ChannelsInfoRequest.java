package com.github.seratch.jslack.api.methods.request.channels;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class ChannelsInfoRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `channels:read`
     */
    private String token;

    /**
     * Set this to `true` to receive the locale for this channel. Defaults to `false`
     */
    private boolean includeLocale;

    /**
     * Channel to get info on
     */
    private String channel;

    ChannelsInfoRequest(String token, boolean includeLocale, String channel) {
        this.token = token;
        this.includeLocale = includeLocale;
        this.channel = channel;
    }

    public static ChannelsInfoRequestBuilder builder() {
        return new ChannelsInfoRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public boolean isIncludeLocale() {
        return this.includeLocale;
    }

    public String getChannel() {
        return this.channel;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setIncludeLocale(boolean includeLocale) {
        this.includeLocale = includeLocale;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ChannelsInfoRequest)) return false;
        final ChannelsInfoRequest other = (ChannelsInfoRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$token = this.getToken();
        final Object other$token = other.getToken();
        if (this$token == null ? other$token != null : !this$token.equals(other$token)) return false;
        if (this.isIncludeLocale() != other.isIncludeLocale()) return false;
        final Object this$channel = this.getChannel();
        final Object other$channel = other.getChannel();
        if (this$channel == null ? other$channel != null : !this$channel.equals(other$channel)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ChannelsInfoRequest;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $token = this.getToken();
        result = result * PRIME + ($token == null ? 43 : $token.hashCode());
        result = result * PRIME + (this.isIncludeLocale() ? 79 : 97);
        final Object $channel = this.getChannel();
        result = result * PRIME + ($channel == null ? 43 : $channel.hashCode());
        return result;
    }

    public String toString() {
        return "ChannelsInfoRequest(token=" + this.getToken() + ", includeLocale=" + this.isIncludeLocale() + ", channel=" + this.getChannel() + ")";
    }

    public static class ChannelsInfoRequestBuilder {
        private String token;
        private boolean includeLocale;
        private String channel;

        ChannelsInfoRequestBuilder() {
        }

        public ChannelsInfoRequest.ChannelsInfoRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public ChannelsInfoRequest.ChannelsInfoRequestBuilder includeLocale(boolean includeLocale) {
            this.includeLocale = includeLocale;
            return this;
        }

        public ChannelsInfoRequest.ChannelsInfoRequestBuilder channel(String channel) {
            this.channel = channel;
            return this;
        }

        public ChannelsInfoRequest build() {
            return new ChannelsInfoRequest(token, includeLocale, channel);
        }

        public String toString() {
            return "ChannelsInfoRequest.ChannelsInfoRequestBuilder(token=" + this.token + ", includeLocale=" + this.includeLocale + ", channel=" + this.channel + ")";
        }
    }
}