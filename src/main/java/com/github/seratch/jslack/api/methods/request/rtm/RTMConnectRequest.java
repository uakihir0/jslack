package com.github.seratch.jslack.api.methods.request.rtm;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

/**
 * @see <a href="https://api.slack.com/methods/rtm.connect">rtm.connect</a>
 */
public class RTMConnectRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `rtm:stream`
     */
    private String token;

    /**
     * Only deliver presence events when requested by subscription.
     * See [presence subscriptions](/docs/presence-and-status#subscriptions).
     */
    private boolean presenceSub;

    /**
     * Batch presence deliveries via subscription.
     * Enabling changes the shape of `presence_change` events. See [batch presence](/docs/presence-and-status#batching).
     */
    private boolean batchPresenceAware;

    @java.beans.ConstructorProperties({"token", "presenceSub", "batchPresenceAware"})
    RTMConnectRequest(String token, boolean presenceSub, boolean batchPresenceAware) {
        this.token = token;
        this.presenceSub = presenceSub;
        this.batchPresenceAware = batchPresenceAware;
    }

    public static RTMConnectRequestBuilder builder() {
        return new RTMConnectRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public boolean isPresenceSub() {
        return this.presenceSub;
    }

    public boolean isBatchPresenceAware() {
        return this.batchPresenceAware;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setPresenceSub(boolean presenceSub) {
        this.presenceSub = presenceSub;
    }

    public void setBatchPresenceAware(boolean batchPresenceAware) {
        this.batchPresenceAware = batchPresenceAware;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof RTMConnectRequest)) return false;
        final RTMConnectRequest other = (RTMConnectRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$token = this.getToken();
        final Object other$token = other.getToken();
        if (this$token == null ? other$token != null : !this$token.equals(other$token)) return false;
        if (this.isPresenceSub() != other.isPresenceSub()) return false;
        if (this.isBatchPresenceAware() != other.isBatchPresenceAware()) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof RTMConnectRequest;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $token = this.getToken();
        result = result * PRIME + ($token == null ? 43 : $token.hashCode());
        result = result * PRIME + (this.isPresenceSub() ? 79 : 97);
        result = result * PRIME + (this.isBatchPresenceAware() ? 79 : 97);
        return result;
    }

    public String toString() {
        return "RTMConnectRequest(token=" + this.getToken() + ", presenceSub=" + this.isPresenceSub() + ", batchPresenceAware=" + this.isBatchPresenceAware() + ")";
    }

    public static class RTMConnectRequestBuilder {
        private String token;
        private boolean presenceSub;
        private boolean batchPresenceAware;

        RTMConnectRequestBuilder() {
        }

        public RTMConnectRequest.RTMConnectRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public RTMConnectRequest.RTMConnectRequestBuilder presenceSub(boolean presenceSub) {
            this.presenceSub = presenceSub;
            return this;
        }

        public RTMConnectRequest.RTMConnectRequestBuilder batchPresenceAware(boolean batchPresenceAware) {
            this.batchPresenceAware = batchPresenceAware;
            return this;
        }

        public RTMConnectRequest build() {
            return new RTMConnectRequest(token, presenceSub, batchPresenceAware);
        }

        public String toString() {
            return "RTMConnectRequest.RTMConnectRequestBuilder(token=" + this.token + ", presenceSub=" + this.presenceSub + ", batchPresenceAware=" + this.batchPresenceAware + ")";
        }
    }
}