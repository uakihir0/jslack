package com.github.seratch.jslack.api.methods.request.apps.permissions.users;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class AppsPermissionsUsersListRequest implements SlackApiRequest {

    private String token;

    /**
     * Paginate through collections of data by setting the cursor parameter to
     * a next_cursor attribute returned by a previous request's response_metadata.
     * Default value fetches the first "page" of the collection. See pagination for more detail.
     */
    private String cursor;

    /**
     * The maximum number of items to return.
     */
    private Integer limit;

    AppsPermissionsUsersListRequest(String token, String cursor, Integer limit) {
        this.token = token;
        this.cursor = cursor;
        this.limit = limit;
    }

    public static AppsPermissionsUsersListRequestBuilder builder() {
        return new AppsPermissionsUsersListRequestBuilder();
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

    public void setToken(String token) {
        this.token = token;
    }

    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public static class AppsPermissionsUsersListRequestBuilder {
        private String token;
        private String cursor;
        private Integer limit;

        AppsPermissionsUsersListRequestBuilder() {
        }

        public AppsPermissionsUsersListRequest.AppsPermissionsUsersListRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public AppsPermissionsUsersListRequest.AppsPermissionsUsersListRequestBuilder cursor(String cursor) {
            this.cursor = cursor;
            return this;
        }

        public AppsPermissionsUsersListRequest.AppsPermissionsUsersListRequestBuilder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        public AppsPermissionsUsersListRequest build() {
            return new AppsPermissionsUsersListRequest(token, cursor, limit);
        }

        public String toString() {
            return "AppsPermissionsUsersListRequest.AppsPermissionsUsersListRequestBuilder(token=" + this.token + ", cursor=" + this.cursor + ", limit=" + this.limit + ")";
        }
    }
}