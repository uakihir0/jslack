package com.github.seratch.jslack.api.methods.request.users;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class UsersListRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `users:read`
     */
    private String token;

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
     * Set this to `true` to receive the locale for users. Defaults to `false`
     */
    private boolean includeLocale;

    /**
     * Deprecated. Whether to include presence data in the output.
     * Defaults to `false`. Setting this to `true` reduces performance, especially with large teams.
     */
    @Deprecated
    private boolean presence;

    UsersListRequest(String token, String cursor, Integer limit, boolean includeLocale, boolean presence) {
        this.token = token;
        this.cursor = cursor;
        this.limit = limit;
        this.includeLocale = includeLocale;
        this.presence = presence;
    }

    public static UsersListRequestBuilder builder() {
        return new UsersListRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public String getCursor() {
        return this.cursor;
    }

    public Integer getLimit() {
        return this.limit;
    }

    public boolean isIncludeLocale() {
        return this.includeLocale;
    }

    @Deprecated
    public boolean isPresence() {
        return this.presence;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public void setIncludeLocale(boolean includeLocale) {
        this.includeLocale = includeLocale;
    }

    @Deprecated
    public void setPresence(boolean presence) {
        this.presence = presence;
    }

    public static class UsersListRequestBuilder {
        private String token;
        private String cursor;
        private Integer limit;
        private boolean includeLocale;
        private boolean presence;

        UsersListRequestBuilder() {
        }

        public UsersListRequest.UsersListRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public UsersListRequest.UsersListRequestBuilder cursor(String cursor) {
            this.cursor = cursor;
            return this;
        }

        public UsersListRequest.UsersListRequestBuilder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        public UsersListRequest.UsersListRequestBuilder includeLocale(boolean includeLocale) {
            this.includeLocale = includeLocale;
            return this;
        }

        @Deprecated
        public UsersListRequest.UsersListRequestBuilder presence(boolean presence) {
            this.presence = presence;
            return this;
        }

        public UsersListRequest build() {
            return new UsersListRequest(token, cursor, limit, includeLocale, presence);
        }

        public String toString() {
            return "UsersListRequest.UsersListRequestBuilder(token=" + this.token + ", cursor=" + this.cursor + ", limit=" + this.limit + ", includeLocale=" + this.includeLocale + ", presence=" + this.presence + ")";
        }
    }
}