package com.github.seratch.jslack.api.methods.request.search;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class SearchAllRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `search:read`
     */
    private String token;

    /**
     * Search query. May contains booleans, etc.
     */
    private String query;

    /**
     * Return matches sorted by either `score` or `timestamp`.
     */
    private String sort;

    /**
     * Change sort direction to ascending (`asc`) or descending (`desc`).
     */
    private String sortDir;

    /**
     * Pass a value of `true` to enable query highlight markers (see below).
     */
    private boolean highlight;

    private Integer count;

    private Integer page;

    SearchAllRequest(String token, String query, String sort, String sortDir, boolean highlight, Integer count, Integer page) {
        this.token = token;
        this.query = query;
        this.sort = sort;
        this.sortDir = sortDir;
        this.highlight = highlight;
        this.count = count;
        this.page = page;
    }

    public static SearchAllRequestBuilder builder() {
        return new SearchAllRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public String getQuery() {
        return this.query;
    }

    public String getSort() {
        return this.sort;
    }

    public String getSortDir() {
        return this.sortDir;
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

    public void setQuery(String query) {
        this.query = query;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public void setSortDir(String sortDir) {
        this.sortDir = sortDir;
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

    public static class SearchAllRequestBuilder {
        private String token;
        private String query;
        private String sort;
        private String sortDir;
        private boolean highlight;
        private Integer count;
        private Integer page;

        SearchAllRequestBuilder() {
        }

        public SearchAllRequest.SearchAllRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public SearchAllRequest.SearchAllRequestBuilder query(String query) {
            this.query = query;
            return this;
        }

        public SearchAllRequest.SearchAllRequestBuilder sort(String sort) {
            this.sort = sort;
            return this;
        }

        public SearchAllRequest.SearchAllRequestBuilder sortDir(String sortDir) {
            this.sortDir = sortDir;
            return this;
        }

        public SearchAllRequest.SearchAllRequestBuilder highlight(boolean highlight) {
            this.highlight = highlight;
            return this;
        }

        public SearchAllRequest.SearchAllRequestBuilder count(Integer count) {
            this.count = count;
            return this;
        }

        public SearchAllRequest.SearchAllRequestBuilder page(Integer page) {
            this.page = page;
            return this;
        }

        public SearchAllRequest build() {
            return new SearchAllRequest(token, query, sort, sortDir, highlight, count, page);
        }

        public String toString() {
            return "SearchAllRequest.SearchAllRequestBuilder(token=" + this.token + ", query=" + this.query + ", sort=" + this.sort + ", sortDir=" + this.sortDir + ", highlight=" + this.highlight + ", count=" + this.count + ", page=" + this.page + ")";
        }
    }
}