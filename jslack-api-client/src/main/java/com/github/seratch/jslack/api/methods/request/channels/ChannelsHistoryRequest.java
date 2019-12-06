package com.github.seratch.jslack.api.methods.request.channels;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class ChannelsHistoryRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `channels:history`
     */
    private String token;

    /**
     * Channel to fetch history for.
     */
    private String channel;

    /**
     * End of time range of messages to include in results.
     */
    private String latest;

    /**
     * Start of time range of messages to include in results.
     */
    private String oldest;

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

    ChannelsHistoryRequest(String token, String channel, String latest, String oldest, boolean inclusive, Integer count, boolean unreads) {
        this.token = token;
        this.channel = channel;
        this.latest = latest;
        this.oldest = oldest;
        this.inclusive = inclusive;
        this.count = count;
        this.unreads = unreads;
    }

    public static ChannelsHistoryRequestBuilder builder() {
        return new ChannelsHistoryRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public String getChannel() {
        return this.channel;
    }

    public String getLatest() {
        return this.latest;
    }

    public String getOldest() {
        return this.oldest;
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

    public void setLatest(String latest) {
        this.latest = latest;
    }

    public void setOldest(String oldest) {
        this.oldest = oldest;
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

    public static class ChannelsHistoryRequestBuilder {
        private String token;
        private String channel;
        private String latest;
        private String oldest;
        private boolean inclusive;
        private Integer count;
        private boolean unreads;

        ChannelsHistoryRequestBuilder() {
        }

        public ChannelsHistoryRequest.ChannelsHistoryRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public ChannelsHistoryRequest.ChannelsHistoryRequestBuilder channel(String channel) {
            this.channel = channel;
            return this;
        }

        public ChannelsHistoryRequest.ChannelsHistoryRequestBuilder latest(String latest) {
            this.latest = latest;
            return this;
        }

        public ChannelsHistoryRequest.ChannelsHistoryRequestBuilder oldest(String oldest) {
            this.oldest = oldest;
            return this;
        }

        public ChannelsHistoryRequest.ChannelsHistoryRequestBuilder inclusive(boolean inclusive) {
            this.inclusive = inclusive;
            return this;
        }

        public ChannelsHistoryRequest.ChannelsHistoryRequestBuilder count(Integer count) {
            this.count = count;
            return this;
        }

        public ChannelsHistoryRequest.ChannelsHistoryRequestBuilder unreads(boolean unreads) {
            this.unreads = unreads;
            return this;
        }

        public ChannelsHistoryRequest build() {
            return new ChannelsHistoryRequest(token, channel, latest, oldest, inclusive, count, unreads);
        }

        public String toString() {
            return "ChannelsHistoryRequest.ChannelsHistoryRequestBuilder(token=" + this.token + ", channel=" + this.channel + ", latest=" + this.latest + ", oldest=" + this.oldest + ", inclusive=" + this.inclusive + ", count=" + this.count + ", unreads=" + this.unreads + ")";
        }
    }
}