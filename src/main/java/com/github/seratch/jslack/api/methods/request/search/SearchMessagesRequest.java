package com.github.seratch.jslack.api.methods.request.search;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class SearchMessagesRequest implements SlackApiRequest {

    private String token;
    private String query;
    private String sort;
    private String sortDir;
    private Integer highlight;
    private Integer count;
    private Integer page;

    @java.beans.ConstructorProperties({"token", "query", "sort", "sortDir", "highlight", "count", "page"})
    SearchMessagesRequest(String token, String query, String sort, String sortDir, Integer highlight, Integer count, Integer page) {
        this.token = token;
        this.query = query;
        this.sort = sort;
        this.sortDir = sortDir;
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

    public String getQuery() {
        return this.query;
    }

    public String getSort() {
        return this.sort;
    }

    public String getSortDir() {
        return this.sortDir;
    }

    public Integer getHighlight() {
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

    public void setHighlight(Integer highlight) {
        this.highlight = highlight;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof SearchMessagesRequest)) return false;
        final SearchMessagesRequest other = (SearchMessagesRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$token = this.getToken();
        final Object other$token = other.getToken();
        if (this$token == null ? other$token != null : !this$token.equals(other$token)) return false;
        final Object this$query = this.getQuery();
        final Object other$query = other.getQuery();
        if (this$query == null ? other$query != null : !this$query.equals(other$query)) return false;
        final Object this$sort = this.getSort();
        final Object other$sort = other.getSort();
        if (this$sort == null ? other$sort != null : !this$sort.equals(other$sort)) return false;
        final Object this$sortDir = this.getSortDir();
        final Object other$sortDir = other.getSortDir();
        if (this$sortDir == null ? other$sortDir != null : !this$sortDir.equals(other$sortDir)) return false;
        final Object this$highlight = this.getHighlight();
        final Object other$highlight = other.getHighlight();
        if (this$highlight == null ? other$highlight != null : !this$highlight.equals(other$highlight)) return false;
        final Object this$count = this.getCount();
        final Object other$count = other.getCount();
        if (this$count == null ? other$count != null : !this$count.equals(other$count)) return false;
        final Object this$page = this.getPage();
        final Object other$page = other.getPage();
        if (this$page == null ? other$page != null : !this$page.equals(other$page)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $token = this.getToken();
        result = result * PRIME + ($token == null ? 43 : $token.hashCode());
        final Object $query = this.getQuery();
        result = result * PRIME + ($query == null ? 43 : $query.hashCode());
        final Object $sort = this.getSort();
        result = result * PRIME + ($sort == null ? 43 : $sort.hashCode());
        final Object $sortDir = this.getSortDir();
        result = result * PRIME + ($sortDir == null ? 43 : $sortDir.hashCode());
        final Object $highlight = this.getHighlight();
        result = result * PRIME + ($highlight == null ? 43 : $highlight.hashCode());
        final Object $count = this.getCount();
        result = result * PRIME + ($count == null ? 43 : $count.hashCode());
        final Object $page = this.getPage();
        result = result * PRIME + ($page == null ? 43 : $page.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof SearchMessagesRequest;
    }

    public String toString() {
        return "SearchMessagesRequest(token=" + this.getToken() + ", query=" + this.getQuery() + ", sort=" + this.getSort() + ", sortDir=" + this.getSortDir() + ", highlight=" + this.getHighlight() + ", count=" + this.getCount() + ", page=" + this.getPage() + ")";
    }

    public static class SearchMessagesRequestBuilder {
        private String token;
        private String query;
        private String sort;
        private String sortDir;
        private Integer highlight;
        private Integer count;
        private Integer page;

        SearchMessagesRequestBuilder() {
        }

        public SearchMessagesRequest.SearchMessagesRequestBuilder token(String token) {
            this.token = token;
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

        public SearchMessagesRequest.SearchMessagesRequestBuilder sortDir(String sortDir) {
            this.sortDir = sortDir;
            return this;
        }

        public SearchMessagesRequest.SearchMessagesRequestBuilder highlight(Integer highlight) {
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
            return new SearchMessagesRequest(token, query, sort, sortDir, highlight, count, page);
        }

        public String toString() {
            return "SearchMessagesRequest.SearchMessagesRequestBuilder(token=" + this.token + ", query=" + this.query + ", sort=" + this.sort + ", sortDir=" + this.sortDir + ", highlight=" + this.highlight + ", count=" + this.count + ", page=" + this.page + ")";
        }
    }
}