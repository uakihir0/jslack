package com.github.seratch.jslack.api.methods.request.search;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class SearchFilesRequest implements SlackApiRequest {

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

    SearchFilesRequest(String token, String sortDir, String query, String sort, boolean highlight, Integer count, Integer page) {
        this.token = token;
        this.sortDir = sortDir;
        this.query = query;
        this.sort = sort;
        this.highlight = highlight;
        this.count = count;
        this.page = page;
    }

    public static SearchFilesRequestBuilder builder() {
        return new SearchFilesRequestBuilder();
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

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof SearchFilesRequest)) return false;
        final SearchFilesRequest other = (SearchFilesRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$token = this.getToken();
        final Object other$token = other.getToken();
        if (this$token == null ? other$token != null : !this$token.equals(other$token)) return false;
        final Object this$sortDir = this.getSortDir();
        final Object other$sortDir = other.getSortDir();
        if (this$sortDir == null ? other$sortDir != null : !this$sortDir.equals(other$sortDir)) return false;
        final Object this$query = this.getQuery();
        final Object other$query = other.getQuery();
        if (this$query == null ? other$query != null : !this$query.equals(other$query)) return false;
        final Object this$sort = this.getSort();
        final Object other$sort = other.getSort();
        if (this$sort == null ? other$sort != null : !this$sort.equals(other$sort)) return false;
        if (this.isHighlight() != other.isHighlight()) return false;
        final Object this$count = this.getCount();
        final Object other$count = other.getCount();
        if (this$count == null ? other$count != null : !this$count.equals(other$count)) return false;
        final Object this$page = this.getPage();
        final Object other$page = other.getPage();
        if (this$page == null ? other$page != null : !this$page.equals(other$page)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof SearchFilesRequest;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $token = this.getToken();
        result = result * PRIME + ($token == null ? 43 : $token.hashCode());
        final Object $sortDir = this.getSortDir();
        result = result * PRIME + ($sortDir == null ? 43 : $sortDir.hashCode());
        final Object $query = this.getQuery();
        result = result * PRIME + ($query == null ? 43 : $query.hashCode());
        final Object $sort = this.getSort();
        result = result * PRIME + ($sort == null ? 43 : $sort.hashCode());
        result = result * PRIME + (this.isHighlight() ? 79 : 97);
        final Object $count = this.getCount();
        result = result * PRIME + ($count == null ? 43 : $count.hashCode());
        final Object $page = this.getPage();
        result = result * PRIME + ($page == null ? 43 : $page.hashCode());
        return result;
    }

    public String toString() {
        return "SearchFilesRequest(token=" + this.getToken() + ", sortDir=" + this.getSortDir() + ", query=" + this.getQuery() + ", sort=" + this.getSort() + ", highlight=" + this.isHighlight() + ", count=" + this.getCount() + ", page=" + this.getPage() + ")";
    }

    public static class SearchFilesRequestBuilder {
        private String token;
        private String sortDir;
        private String query;
        private String sort;
        private boolean highlight;
        private Integer count;
        private Integer page;

        SearchFilesRequestBuilder() {
        }

        public SearchFilesRequest.SearchFilesRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public SearchFilesRequest.SearchFilesRequestBuilder sortDir(String sortDir) {
            this.sortDir = sortDir;
            return this;
        }

        public SearchFilesRequest.SearchFilesRequestBuilder query(String query) {
            this.query = query;
            return this;
        }

        public SearchFilesRequest.SearchFilesRequestBuilder sort(String sort) {
            this.sort = sort;
            return this;
        }

        public SearchFilesRequest.SearchFilesRequestBuilder highlight(boolean highlight) {
            this.highlight = highlight;
            return this;
        }

        public SearchFilesRequest.SearchFilesRequestBuilder count(Integer count) {
            this.count = count;
            return this;
        }

        public SearchFilesRequest.SearchFilesRequestBuilder page(Integer page) {
            this.page = page;
            return this;
        }

        public SearchFilesRequest build() {
            return new SearchFilesRequest(token, sortDir, query, sort, highlight, count, page);
        }

        public String toString() {
            return "SearchFilesRequest.SearchFilesRequestBuilder(token=" + this.token + ", sortDir=" + this.sortDir + ", query=" + this.query + ", sort=" + this.sort + ", highlight=" + this.highlight + ", count=" + this.count + ", page=" + this.page + ")";
        }
    }
}