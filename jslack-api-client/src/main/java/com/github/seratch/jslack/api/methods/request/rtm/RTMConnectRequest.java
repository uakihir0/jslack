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