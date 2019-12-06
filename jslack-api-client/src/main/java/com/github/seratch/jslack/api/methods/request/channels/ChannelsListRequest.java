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