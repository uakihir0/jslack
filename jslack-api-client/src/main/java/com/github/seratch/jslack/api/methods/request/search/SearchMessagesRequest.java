package com.github.seratch.jslack.api.methods.request.search;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class SearchMessagesRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `search:read`
     */
    private String token;

    /**
     * Change sort direction to ascending (`asc`) or descending (`desc`).
     */
    private String sortDir;

    /**
     * Search query. May contain booleans, etc.
     */
    private String query;

    /**
     * Return matches sorted by either `score` or `timestamp`.
     */
    private String sort;

    /**
     * Pass a value of `true` to enable query highlight markers (see below).
     */
    private boolean highlight;

    private Integer count;

    private Integer page;

    SearchMessagesRequest(String token, String sortDir, String query, String sort, boolean highlight, Integer count, Integer page) {
        this.token = token;
        this.sortDir = sortDir;
        this.query = query;
        this.sort = sort;
        this.highlight = highlight;
        this.count = count;
        this.page = page;
    }

    public static SearchMessagesRequestBuilder builder() {
        return new SearchMessagesRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public String getSortDir() {
        return this.sortDir;
    }

    public String getQuery() {
        return this.query;
    }

    public String getSort() {
        return this.sort;
    }

    public boolean isHighlight() {
        return this.highlight;
    }

    public Integer getCount() {
        return this.count;
    }

    public Integer getPage() {
        return this.page;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setSortDir(String sortDir) {
        this.sortDir = sortDir;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public void setHighlight(boolean highlight) {
        this.highlight = highlight;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public static class SearchMessagesRequestBuilder {
        private String token;
        private String sortDir;
        private String query;
        private String sort;
        private boolean highlight;
        private Integer count;
        private Integer page;

        SearchMessagesRequestBuilder() {
        }

        public SearchMessagesRequest.SearchMessagesRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public SearchMessagesRequest.SearchMessagesRequestBuilder sortDir(String sortDir) {
            this.sortDir = sortDir;
            return this;
        }

        public SearchMessagesRequest.SearchMessagesRequestBuilder query(String query) {
            this.query = query;
            return this;
        }

        public SearchMessagesRequest.SearchMessagesRequestBuilder sort(String sort) {
            this.sort = sort;
            return this;
        }

        public SearchMessagesRequest.SearchMessagesRequestBuilder highlight(boolean highlight) {
            this.highlight = highlight;
            return this;
        }

        public SearchMessagesRequest.SearchMessagesRequestBuilder count(Integer count) {
            this.count = count;
            return this;
        }

        public SearchMessagesRequest.SearchMessagesRequestBuilder page(Integer page) {
            this.page = page;
            return this;
        }

        public SearchMessagesRequest build() {
            return new SearchMessagesRequest(token, sortDir, query, sort, highlight, count, page);
        }

        public String toString() {
            return "SearchMessagesRequest.SearchMessagesRequestBuilder(token=" + this.token + ", sortDir=" + this.sortDir + ", query=" + this.query + ", sort=" + this.sort + ", highlight=" + this.highlight + ", count=" + this.count + ", page=" + this.page + ")";
        }
    }
}