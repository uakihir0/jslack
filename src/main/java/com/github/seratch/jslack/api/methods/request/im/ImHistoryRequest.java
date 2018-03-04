package com.github.seratch.jslack.api.methods.request.im;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class ImHistoryRequest implements SlackApiRequest {

    private String token;
    private String channel;
    private String latest;
    private String oldest;
    private Integer inclusive;
    private Integer count;
    private Integer unreads;

    @java.beans.ConstructorProperties({"token", "channel", "latest", "oldest", "inclusive", "count", "unreads"})
    ImHistoryRequest(String token, String channel, String latest, String oldest, Integer inclusive, Integer count, Integer unreads) {
        this.token = token;
        this.channel = channel;
        this.latest = latest;
        this.oldest = oldest;
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

    public String getLatest() {
        return this.latest;
    }

    public String getOldest() {
        return this.oldest;
    }

    public Integer getInclusive() {
        return this.inclusive;
    }

    public Integer getCount() {
        return this.count;
    }

    public Integer getUnreads() {
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

    public void setInclusive(Integer inclusive) {
        this.inclusive = inclusive;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public void setUnreads(Integer unreads) {
        this.unreads = unreads;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof ImHistoryRequest)) return false;
        final ImHistoryRequest other = (ImHistoryRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$token = this.getToken();
        final Object other$token = other.getToken();
        if (this$token == null ? other$token != null : !this$token.equals(other$token)) return false;
        final Object this$channel = this.getChannel();
        final Object other$channel = other.getChannel();
        if (this$channel == null ? other$channel != null : !this$channel.equals(other$channel)) return false;
        final Object this$latest = this.getLatest();
        final Object other$latest = other.getLatest();
        if (this$latest == null ? other$latest != null : !this$latest.equals(other$latest)) return false;
        final Object this$oldest = this.getOldest();
        final Object other$oldest = other.getOldest();
        if (this$oldest == null ? other$oldest != null : !this$oldest.equals(other$oldest)) return false;
        final Object this$inclusive = this.getInclusive();
        final Object other$inclusive = other.getInclusive();
        if (this$inclusive == null ? other$inclusive != null : !this$inclusive.equals(other$inclusive)) return false;
        final Object this$count = this.getCount();
        final Object other$count = other.getCount();
        if (this$count == null ? other$count != null : !this$count.equals(other$count)) return false;
        final Object this$unreads = this.getUnreads();
        final Object other$unreads = other.getUnreads();
        if (this$unreads == null ? other$unreads != null : !this$unreads.equals(other$unreads)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $token = this.getToken();
        result = result * PRIME + ($token == null ? 43 : $token.hashCode());
        final Object $channel = this.getChannel();
        result = result * PRIME + ($channel == null ? 43 : $channel.hashCode());
        final Object $latest = this.getLatest();
        result = result * PRIME + ($latest == null ? 43 : $latest.hashCode());
        final Object $oldest = this.getOldest();
        result = result * PRIME + ($oldest == null ? 43 : $oldest.hashCode());
        final Object $inclusive = this.getInclusive();
        result = result * PRIME + ($inclusive == null ? 43 : $inclusive.hashCode());
        final Object $count = this.getCount();
        result = result * PRIME + ($count == null ? 43 : $count.hashCode());
        final Object $unreads = this.getUnreads();
        result = result * PRIME + ($unreads == null ? 43 : $unreads.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof ImHistoryRequest;
    }

    public String toString() {
        return "ImHistoryRequest(token=" + this.getToken() + ", channel=" + this.getChannel() + ", latest=" + this.getLatest() + ", oldest=" + this.getOldest() + ", inclusive=" + this.getInclusive() + ", count=" + this.getCount() + ", unreads=" + this.getUnreads() + ")";
    }

    public static class ImHistoryRequestBuilder {
        private String token;
        private String channel;
        private String latest;
        private String oldest;
        private Integer inclusive;
        private Integer count;
        private Integer unreads;

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

        public ImHistoryRequest.ImHistoryRequestBuilder latest(String latest) {
            this.latest = latest;
            return this;
        }

        public ImHistoryRequest.ImHistoryRequestBuilder oldest(String oldest) {
            this.oldest = oldest;
            return this;
        }

        public ImHistoryRequest.ImHistoryRequestBuilder inclusive(Integer inclusive) {
            this.inclusive = inclusive;
            return this;
        }

        public ImHistoryRequest.ImHistoryRequestBuilder count(Integer count) {
            this.count = count;
            return this;
        }

        public ImHistoryRequest.ImHistoryRequestBuilder unreads(Integer unreads) {
            this.unreads = unreads;
            return this;
        }

        public ImHistoryRequest build() {
            return new ImHistoryRequest(token, channel, latest, oldest, inclusive, count, unreads);
        }

        public String toString() {
            return "ImHistoryRequest.ImHistoryRequestBuilder(token=" + this.token + ", channel=" + this.channel + ", latest=" + this.latest + ", oldest=" + this.oldest + ", inclusive=" + this.inclusive + ", count=" + this.count + ", unreads=" + this.unreads + ")";
        }
    }
}