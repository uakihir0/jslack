package com.github.seratch.jslack.api.methods.request.mpim;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class MpimHistoryRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `mpim:history`
     */
    private String token;

    /**
     * Multiparty direct message to fetch history for.
     */
    private String channel;

    /**
     * Start of time range of messages to include in results.
     */
    private String oldest;

    /**
     * End of time range of messages to include in results.
     */
    private String latest;

    /**
     * Number of messages to return, between 1 and 1000.
     */
    private Integer count;

    /**
     * Include messages with latest or oldest timestamp in results.
     */
    private boolean inclusive;

    /**
     * Include `unread_count_display` in the output?
     */
    private boolean unreads;

    MpimHistoryRequest(String token, String channel, String oldest, String latest, Integer count, boolean inclusive, boolean unreads) {
        this.token = token;
        this.channel = channel;
        this.oldest = oldest;
        this.latest = latest;
        this.count = count;
        this.inclusive = inclusive;
        this.unreads = unreads;
    }

    public static MpimHistoryRequestBuilder builder() {
        return new MpimHistoryRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public String getChannel() {
        return this.channel;
    }

    public String getOldest() {
        return this.oldest;
    }

    public String getLatest() {
        return this.latest;
    }

    public Integer getCount() {
        return this.count;
    }

    public boolean isInclusive() {
        return this.inclusive;
    }

    public boolean isUnreads() {
        return this.unreads;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public void setOldest(String oldest) {
        this.oldest = oldest;
    }

    public void setLatest(String latest) {
        this.latest = latest;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public void setInclusive(boolean inclusive) {
        this.inclusive = inclusive;
    }

    public void setUnreads(boolean unreads) {
        this.unreads = unreads;
    }

    public static class MpimHistoryRequestBuilder {
        private String token;
        private String channel;
        private String oldest;
        private String latest;
        private Integer count;
        private boolean inclusive;
        private boolean unreads;

        MpimHistoryRequestBuilder() {
        }

        public MpimHistoryRequest.MpimHistoryRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public MpimHistoryRequest.MpimHistoryRequestBuilder channel(String channel) {
            this.channel = channel;
            return this;
        }

        public MpimHistoryRequest.MpimHistoryRequestBuilder oldest(String oldest) {
            this.oldest = oldest;
            return this;
        }

        public MpimHistoryRequest.MpimHistoryRequestBuilder latest(String latest) {
            this.latest = latest;
            return this;
        }

        public MpimHistoryRequest.MpimHistoryRequestBuilder count(Integer count) {
            this.count = count;
            return this;
        }

        public MpimHistoryRequest.MpimHistoryRequestBuilder inclusive(boolean inclusive) {
            this.inclusive = inclusive;
            return this;
        }

        public MpimHistoryRequest.MpimHistoryRequestBuilder unreads(boolean unreads) {
            this.unreads = unreads;
            return this;
        }

        public MpimHistoryRequest build() {
            return new MpimHistoryRequest(token, channel, oldest, latest, count, inclusive, unreads);
        }

        public String toString() {
            return "MpimHistoryRequest.MpimHistoryRequestBuilder(token=" + this.token + ", channel=" + this.channel + ", oldest=" + this.oldest + ", latest=" + this.latest + ", count=" + this.count + ", inclusive=" + this.inclusive + ", unreads=" + this.unreads + ")";
        }
    }
}