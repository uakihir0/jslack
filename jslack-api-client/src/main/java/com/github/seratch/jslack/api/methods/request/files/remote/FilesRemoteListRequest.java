package com.github.seratch.jslack.api.methods.request.files.remote;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

/**
 * https://api.slack.com/methods/files.remote.list
 */
public class FilesRemoteListRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `remote_files:read`
     */
    private String token;

    /**
     * Filter files appearing in a specific channel, indicated by its ID.
     */
    private String channel;

    /**
     * Paginate through collections of data by setting the cursor parameter to a next_cursor attribute
     * returned by a previous request's response_metadata.
     * Default value fetches the first "page" of the collection.
     * See pagination for more detail.
     */
    private String cursor;

    /**
     * The maximum number of items to return.
     */
    private Integer limit;

    /**
     * Filter files created after this timestamp (inclusive).
     */
    private String tsFrom;

    /**
     * Filter files created before this timestamp (inclusive).
     */
    private String tsTo;

    FilesRemoteListRequest(String token, String channel, String cursor, Integer limit, String tsFrom, String tsTo) {
        this.token = token;
        this.channel = channel;
        this.cursor = cursor;
        this.limit = limit;
        this.tsFrom = tsFrom;
        this.tsTo = tsTo;
    }

    public static FilesRemoteListRequestBuilder builder() {
        return new FilesRemoteListRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public String getChannel() {
        return this.channel;
    }

    public String getCursor() {
        return this.cursor;
    }

    public Integer getLimit() {
        return this.limit;
    }

    public String getTsFrom() {
        return this.tsFrom;
    }

    public String getTsTo() {
        return this.tsTo;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public void setTsFrom(String tsFrom) {
        this.tsFrom = tsFrom;
    }

    public void setTsTo(String tsTo) {
        this.tsTo = tsTo;
    }

    public static class FilesRemoteListRequestBuilder {
        private String token;
        private String channel;
        private String cursor;
        private Integer limit;
        private String tsFrom;
        private String tsTo;

        FilesRemoteListRequestBuilder() {
        }

        public FilesRemoteListRequest.FilesRemoteListRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public FilesRemoteListRequest.FilesRemoteListRequestBuilder channel(String channel) {
            this.channel = channel;
            return this;
        }

        public FilesRemoteListRequest.FilesRemoteListRequestBuilder cursor(String cursor) {
            this.cursor = cursor;
            return this;
        }

        public FilesRemoteListRequest.FilesRemoteListRequestBuilder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        public FilesRemoteListRequest.FilesRemoteListRequestBuilder tsFrom(String tsFrom) {
            this.tsFrom = tsFrom;
            return this;
        }

        public FilesRemoteListRequest.FilesRemoteListRequestBuilder tsTo(String tsTo) {
            this.tsTo = tsTo;
            return this;
        }

        public FilesRemoteListRequest build() {
            return new FilesRemoteListRequest(token, channel, cursor, limit, tsFrom, tsTo);
        }

        public String toString() {
            return "FilesRemoteListRequest.FilesRemoteListRequestBuilder(token=" + this.token + ", channel=" + this.channel + ", cursor=" + this.cursor + ", limit=" + this.limit + ", tsFrom=" + this.tsFrom + ", tsTo=" + this.tsTo + ")";
        }
    }
}