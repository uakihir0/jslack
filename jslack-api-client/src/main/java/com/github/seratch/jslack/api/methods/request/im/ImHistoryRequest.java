package com.github.seratch.jslack.api.methods.request.im;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class ImHistoryRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `im:history`
     */
    private String token;

    /**
     * Direct message channel to fetch history for.
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
     * Include messages with latest or oldest timestamp in results.
     */
    private boolean inclusive;

    /**
     * Number of messages to return, between 1 and 1000.
     */
    private Integer count;

    /**
     * Include `unread_count_display` in the output?
     */
    private boolean unreads;

    ImHistoryRequest(String token, String channel, String oldest, String latest, boolean inclusive, Integer count, boolean unreads) {
        this.token = token;
        this.channel = channel;
        this.oldest = oldest;
        this.latest = latest;
        this.inclusive = inclusive;
        this.count = count;
        this.unreads = unreads;
    }

    public static ImHistoryRequestBuilder builder() {
        return new ImHistoryRequestBuilder();
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

    public boolean isInclusive() {
        return this.inclusive;
    }

    public Integer getCount() {
        return this.count;
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

    public void setInclusive(boolean inclusive) {
        this.inclusive = inclusive;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public void setUnreads(boolean unreads) {
        this.unreads = unreads;
    }

    public static class ImHistoryRequestBuilder {
        private String token;
        private String channel;
        private String oldest;
        private String latest;
        private boolean inclusive;
        private Integer count;
        private boolean unreads;

        ImHistoryRequestBuilder() {
        }

        public ImHistoryRequest.ImHistoryRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public ImHistoryRequest.ImHistoryRequestBuilder channel(String channel) {
            this.channel = channel;
            return this;
        }

        public ImHistoryRequest.ImHistoryRequestBuilder oldest(String oldest) {
            this.oldest = oldest;
            return this;
        }

        public ImHistoryRequest.ImHistoryRequestBuilder latest(String latest) {
            this.latest = latest;
            return this;
        }

        public ImHistoryRequest.ImHistoryRequestBuilder inclusive(boolean inclusive) {
            this.inclusive = inclusive;
            return this;
        }

        public ImHistoryRequest.ImHistoryRequestBuilder count(Integer count) {
            this.count = count;
            return this;
        }

        public ImHistoryRequest.ImHistoryRequestBuilder unreads(boolean unreads) {
            this.unreads = unreads;
            return this;
        }

        public ImHistoryRequest build() {
            return new ImHistoryRequest(token, channel, oldest, latest, inclusive, count, unreads);
        }

        public String toString() {
            return "ImHistoryRequest.ImHistoryRequestBuilder(token=" + this.token + ", channel=" + this.channel + ", oldest=" + this.oldest + ", latest=" + this.latest + ", inclusive=" + this.inclusive + ", count=" + this.count + ", unreads=" + this.unreads + ")";
        }
    }
}