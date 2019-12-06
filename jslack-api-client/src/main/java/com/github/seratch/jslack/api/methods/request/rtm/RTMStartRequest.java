package com.github.seratch.jslack.api.methods.request.rtm;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

/**
 * @see <a href="https://api.slack.com/methods/rtm.start">rtm.start</a>
 */
public class RTMStartRequest implements SlackApiRequest {


    /**
     * Authentication token. Requires scope: `rtm:stream`
     */
    private String token;

    /**
     * Exclude latest timestamps for channels, groups, mpims, and ims. Automatically sets `no_unreads` to `1`
     */
    private boolean noLatest;

    /**
     * Return timestamp only for latest message object of each channel (improves performance).
     */
    private boolean simpleLatest;

    /**
     * Set this to `true` to receive the locale for users and channels. Defaults to `false`
     */
    private boolean includeLocale;

    /**
     * Only deliver presence events when requested by subscription.
     * See [presence subscriptions](/docs/presence-and-status#subscriptions).
     */
    private boolean presenceSub;

    /**
     * Skip unread counts for each channel (improves performance).
     */
    private boolean noUnreads;

    /**
     * Batch presence deliveries via subscription.
     * Enabling changes the shape of `presence_change` events. See [batch presence](/docs/presence-and-status#batching).
     */
    private boolean batchPresenceAware;

    /**
     * Returns MPIMs to the client in the API response.
     */
    private boolean mpimAware;

    RTMStartRequest(String token, boolean noLatest, boolean simpleLatest, boolean includeLocale, boolean presenceSub, boolean noUnreads, boolean batchPresenceAware, boolean mpimAware) {
        this.token = token;
        this.noLatest = noLatest;
        this.simpleLatest = simpleLatest;
        this.includeLocale = includeLocale;
        this.presenceSub = presenceSub;
        this.noUnreads = noUnreads;
        this.batchPresenceAware = batchPresenceAware;
        this.mpimAware = mpimAware;
    }

    public static RTMStartRequestBuilder builder() {
        return new RTMStartRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public boolean isNoLatest() {
        return this.noLatest;
    }

    public boolean isSimpleLatest() {
        return this.simpleLatest;
    }

    public boolean isIncludeLocale() {
        return this.includeLocale;
    }

    public boolean isPresenceSub() {
        return this.presenceSub;
    }

    public boolean isNoUnreads() {
        return this.noUnreads;
    }

    public boolean isBatchPresenceAware() {
        return this.batchPresenceAware;
    }

    public boolean isMpimAware() {
        return this.mpimAware;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setNoLatest(boolean noLatest) {
        this.noLatest = noLatest;
    }

    public void setSimpleLatest(boolean simpleLatest) {
        this.simpleLatest = simpleLatest;
    }

    public void setIncludeLocale(boolean includeLocale) {
        this.includeLocale = includeLocale;
    }

    public void setPresenceSub(boolean presenceSub) {
        this.presenceSub = presenceSub;
    }

    public void setNoUnreads(boolean noUnreads) {
        this.noUnreads = noUnreads;
    }

    public void setBatchPresenceAware(boolean batchPresenceAware) {
        this.batchPresenceAware = batchPresenceAware;
    }

    public void setMpimAware(boolean mpimAware) {
        this.mpimAware = mpimAware;
    }

    public static class RTMStartRequestBuilder {
        private String token;
        private boolean noLatest;
        private boolean simpleLatest;
        private boolean includeLocale;
        private boolean presenceSub;
        private boolean noUnreads;
        private boolean batchPresenceAware;
        private boolean mpimAware;

        RTMStartRequestBuilder() {
        }

        public RTMStartRequest.RTMStartRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public RTMStartRequest.RTMStartRequestBuilder noLatest(boolean noLatest) {
            this.noLatest = noLatest;
            return this;
        }

        public RTMStartRequest.RTMStartRequestBuilder simpleLatest(boolean simpleLatest) {
            this.simpleLatest = simpleLatest;
            return this;
        }

        public RTMStartRequest.RTMStartRequestBuilder includeLocale(boolean includeLocale) {
            this.includeLocale = includeLocale;
            return this;
        }

        public RTMStartRequest.RTMStartRequestBuilder presenceSub(boolean presenceSub) {
            this.presenceSub = presenceSub;
            return this;
        }

        public RTMStartRequest.RTMStartRequestBuilder noUnreads(boolean noUnreads) {
            this.noUnreads = noUnreads;
            return this;
        }

        public RTMStartRequest.RTMStartRequestBuilder batchPresenceAware(boolean batchPresenceAware) {
            this.batchPresenceAware = batchPresenceAware;
            return this;
        }

        public RTMStartRequest.RTMStartRequestBuilder mpimAware(boolean mpimAware) {
            this.mpimAware = mpimAware;
            return this;
        }

        public RTMStartRequest build() {
            return new RTMStartRequest(token, noLatest, simpleLatest, includeLocale, presenceSub, noUnreads, batchPresenceAware, mpimAware);
        }

        public String toString() {
            return "RTMStartRequest.RTMStartRequestBuilder(token=" + this.token + ", noLatest=" + this.noLatest + ", simpleLatest=" + this.simpleLatest + ", includeLocale=" + this.includeLocale + ", presenceSub=" + this.presenceSub + ", noUnreads=" + this.noUnreads + ", batchPresenceAware=" + this.batchPresenceAware + ", mpimAware=" + this.mpimAware + ")";
        }
    }
}