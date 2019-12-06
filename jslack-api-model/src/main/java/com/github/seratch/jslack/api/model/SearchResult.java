package com.github.seratch.jslack.api.model;

import java.util.List;

public class SearchResult {
    private Integer total;
    private Pagination pagination;
    private Paging paging;
    private List<MatchedItem> matches;
    private List<String> refinements; // not sure the type yet

    public Integer getTotal() {
        return this.total;
    }

    public Pagination getPagination() {
        return this.pagination;
    }

    public Paging getPaging() {
        return this.paging;
    }

    public List<MatchedItem> getMatches() {
        return this.matches;
    }

    public List<String> getRefinements() {
        return this.refinements;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }

    public void setPaging(Paging paging) {
        this.paging = paging;
    }

    public void setMatches(List<MatchedItem> matches) {
        this.matches = matches;
    }

    public void setRefinements(List<String> refinements) {
        this.refinements = refinements;
    }

    public static class Pagination {
        private Integer totalCount;
        private Integer page;
        private Integer perPage;
        private Integer pageCount;
        private Integer first;
        private Integer last;

        public Integer getTotalCount() {
            return this.totalCount;
        }

        public Integer getPage() {
            return this.page;
        }

        public Integer getPerPage() {
            return this.perPage;
        }

        public Integer getPageCount() {
            return this.pageCount;
        }

        public Integer getFirst() {
            return this.first;
        }

        public Integer getLast() {
            return this.last;
        }

        public void setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
        }

        public void setPage(Integer page) {
            this.page = page;
        }

        public void setPerPage(Integer perPage) {
            this.perPage = perPage;
        }

        public void setPageCount(Integer pageCount) {
            this.pageCount = pageCount;
        }

        public void setFirst(Integer first) {
            this.first = first;
        }

        public void setLast(Integer last) {
            this.last = last;
        }
    }
}
