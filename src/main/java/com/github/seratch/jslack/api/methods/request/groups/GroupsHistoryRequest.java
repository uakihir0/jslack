package com.github.seratch.jslack.api.methods.request.groups;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class GroupsHistoryRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `groups:history`
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

    @java.beans.ConstructorProperties({"token", "channel", "oldest", "latest", "inclusive", "count", "unreads"})
    GroupsHistoryRequest(String token, String channel, String oldest, String latest, boolean inclusive, Integer count, boolean unreads) {
        this.token = token;
        this.channel = channel;
        this.oldest = oldest;
        this.latest = latest;
        this.inclusive = inclusive;
        this.count = count;
        this.unreads = unreads;
    }

    public static GroupsHistoryRequestBuilder builder() {
        return new GroupsHistoryRequestBuilder();
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

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof GroupsHistoryRequest)) return false;
        final GroupsHistoryRequest other = (GroupsHistoryRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$token = this.getToken();
        final Object other$token = other.getToken();
        if (this$token == null ? other$token != null : !this$token.equals(other$token)) return false;
        final Object this$channel = this.getChannel();
        final Object other$channel = other.getChannel();
        if (this$channel == null ? other$channel != null : !this$channel.equals(other$channel)) return false;
        final Object this$oldest = this.getOldest();
        final Object other$oldest = other.getOldest();
        if (this$oldest == null ? other$oldest != null : !this$oldest.equals(other$oldest)) return false;
        final Object this$latest = this.getLatest();
        final Object other$latest = other.getLatest();
        if (this$latest == null ? other$latest != null : !this$latest.equals(other$latest)) return false;
        if (this.isInclusive() != other.isInclusive()) return false;
        final Object this$count = this.getCount();
        final Object other$count = other.getCount();
        if (this$count == null ? other$count != null : !this$count.equals(other$count)) return false;
        if (this.isUnreads() != other.isUnreads()) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof GroupsHistoryRequest;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $token = this.getToken();
        result = result * PRIME + ($token == null ? 43 : $token.hashCode());
        final Object $channel = this.getChannel();
        result = result * PRIME + ($channel == null ? 43 : $channel.hashCode());
        final Object $oldest = this.getOldest();
        result = result * PRIME + ($oldest == null ? 43 : $oldest.hashCode());
        final Object $latest = this.getLatest();
        result = result * PRIME + ($latest == null ? 43 : $latest.hashCode());
        result = result * PRIME + (this.isInclusive() ? 79 : 97);
        final Object $count = this.getCount();
        result = result * PRIME + ($count == null ? 43 : $count.hashCode());
        result = result * PRIME + (this.isUnreads() ? 79 : 97);
        return result;
    }

    public String toString() {
        return "GroupsHistoryRequest(token=" + this.getToken() + ", channel=" + this.getChannel() + ", oldest=" + this.getOldest() + ", latest=" + this.getLatest() + ", inclusive=" + this.isInclusive() + ", count=" + this.getCount() + ", unreads=" + this.isUnreads() + ")";
    }

    public static class GroupsHistoryRequestBuilder {
        private String token;
        private String channel;
        private String oldest;
        private String latest;
        private boolean inclusive;
        private Integer count;
        private boolean unreads;

        GroupsHistoryRequestBuilder() {
        }

        public GroupsHistoryRequest.GroupsHistoryRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public GroupsHistoryRequest.GroupsHistoryRequestBuilder channel(String channel) {
            this.channel = channel;
            return this;
        }

        public GroupsHistoryRequest.GroupsHistoryRequestBuilder oldest(String oldest) {
            this.oldest = oldest;
            return this;
        }

        public GroupsHistoryRequest.GroupsHistoryRequestBuilder latest(String latest) {
            this.latest = latest;
            return this;
        }

        public GroupsHistoryRequest.GroupsHistoryRequestBuilder inclusive(boolean inclusive) {
            this.inclusive = inclusive;
            return this;
        }

        public GroupsHistoryRequest.GroupsHistoryRequestBuilder count(Integer count) {
            this.count = count;
            return this;
        }

        public GroupsHistoryRequest.GroupsHistoryRequestBuilder unreads(boolean unreads) {
            this.unreads = unreads;
            return this;
        }

        public GroupsHistoryRequest build() {
            return new GroupsHistoryRequest(token, channel, oldest, latest, inclusive, count, unreads);
        }

        public String toString() {
            return "GroupsHistoryRequest.GroupsHistoryRequestBuilder(token=" + this.token + ", channel=" + this.channel + ", oldest=" + this.oldest + ", latest=" + this.latest + ", inclusive=" + this.inclusive + ", count=" + this.count + ", unreads=" + this.unreads + ")";
        }
    }
}