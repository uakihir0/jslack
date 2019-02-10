package com.github.seratch.jslack.api.methods.request.channels;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class ChannelsListRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `channels:read`
     */
    private String token;

    /**
     * Exclude the `members` collection from each `channel`
     */
    private boolean excludeMembers;

    /**
     * Paginate through collections of data by setting the `cursor` parameter to a `next_cursor` attribute
     * returned by a previous request's `response_metadata`.
     * Default value fetches the first \"page\" of the collection. See [pagination](/docs/pagination) for more detail.
     */
    private String cursor;

    /**
     * The maximum number of items to return.
     * Fewer than the requested number of items may be returned, even if the end of the users list hasn't been reached.
     */
    private Integer limit;

    /**
     * Exclude archived channels from the list
     */
    private boolean excludeArchived;

    @java.beans.ConstructorProperties({"token", "excludeMembers", "cursor", "limit", "excludeArchived"})
    ChannelsListRequest(String token, boolean excludeMembers, String cursor, Integer limit, boolean excludeArchived) {
        this.token = token;
        this.excludeMembers = excludeMembers;
        this.cursor = cursor;
        this.limit = limit;
        this.excludeArchived = excludeArchived;
    }

    public static ChannelsListRequestBuilder builder() {
        return new ChannelsListRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public boolean isExcludeMembers() {
        return this.excludeMembers;
    }

    public String getCursor() {
        return this.cursor;
    }

    public Integer getLimit() {
        return this.limit;
    }

    public boolean isExcludeArchived() {
        return this.excludeArchived;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setExcludeMembers(boolean excludeMembers) {
        this.excludeMembers = excludeMembers;
    }

    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public void setExcludeArchived(boolean excludeArchived) {
        this.excludeArchived = excludeArchived;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ChannelsListRequest)) return false;
        final ChannelsListRequest other = (ChannelsListRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$token = this.getToken();
        final Object other$token = other.getToken();
        if (this$token == null ? other$token != null : !this$token.equals(other$token)) return false;
        if (this.isExcludeMembers() != other.isExcludeMembers()) return false;
        final Object this$cursor = this.getCursor();
        final Object other$cursor = other.getCursor();
        if (this$cursor == null ? other$cursor != null : !this$cursor.equals(other$cursor)) return false;
        final Object this$limit = this.getLimit();
        final Object other$limit = other.getLimit();
        if (this$limit == null ? other$limit != null : !this$limit.equals(other$limit)) return false;
        if (this.isExcludeArchived() != other.isExcludeArchived()) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ChannelsListRequest;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $token = this.getToken();
        result = result * PRIME + ($token == null ? 43 : $token.hashCode());
        result = result * PRIME + (this.isExcludeMembers() ? 79 : 97);
        final Object $cursor = this.getCursor();
        result = result * PRIME + ($cursor == null ? 43 : $cursor.hashCode());
        final Object $limit = this.getLimit();
        result = result * PRIME + ($limit == null ? 43 : $limit.hashCode());
        result = result * PRIME + (this.isExcludeArchived() ? 79 : 97);
        return result;
    }

    public String toString() {
        return "ChannelsListRequest(token=" + this.getToken() + ", excludeMembers=" + this.isExcludeMembers() + ", cursor=" + this.getCursor() + ", limit=" + this.getLimit() + ", excludeArchived=" + this.isExcludeArchived() + ")";
    }

    public static class ChannelsListRequestBuilder {
        private String token;
        private boolean excludeMembers;
        private String cursor;
        private Integer limit;
        private boolean excludeArchived;

        ChannelsListRequestBuilder() {
        }

        public ChannelsListRequest.ChannelsListRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public ChannelsListRequest.ChannelsListRequestBuilder excludeMembers(boolean excludeMembers) {
            this.excludeMembers = excludeMembers;
            return this;
        }

        public ChannelsListRequest.ChannelsListRequestBuilder cursor(String cursor) {
            this.cursor = cursor;
            return this;
        }

        public ChannelsListRequest.ChannelsListRequestBuilder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        public ChannelsListRequest.ChannelsListRequestBuilder excludeArchived(boolean excludeArchived) {
            this.excludeArchived = excludeArchived;
            return this;
        }

        public ChannelsListRequest build() {
            return new ChannelsListRequest(token, excludeMembers, cursor, limit, excludeArchived);
        }

        public String toString() {
            return "ChannelsListRequest.ChannelsListRequestBuilder(token=" + this.token + ", excludeMembers=" + this.excludeMembers + ", cursor=" + this.cursor + ", limit=" + this.limit + ", excludeArchived=" + this.excludeArchived + ")";
        }
    }
}