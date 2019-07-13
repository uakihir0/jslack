package com.github.seratch.jslack.api.model;

import java.util.List;

public class SearchResult {
    private Integer total;
    private Pagination pagination;
    private Paging paging;
    private List<MatchedItem> matches;
    private List<String> refinements; // not sure the type yet

    public SearchResult() {
    }

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

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof SearchResult)) return false;
        final SearchResult other = (SearchResult) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$total = this.getTotal();
        final Object other$total = other.getTotal();
        if (this$total == null ? other$total != null : !this$total.equals(other$total)) return false;
        final Object this$pagination = this.getPagination();
        final Object other$pagination = other.getPagination();
        if (this$pagination == null ? other$pagination != null : !this$pagination.equals(other$pagination))
            return false;
        final Object this$paging = this.getPaging();
        final Object other$paging = other.getPaging();
        if (this$paging == null ? other$paging != null : !this$paging.equals(other$paging)) return false;
        final Object this$matches = this.getMatches();
        final Object other$matches = other.getMatches();
        if (this$matches == null ? other$matches != null : !this$matches.equals(other$matches)) return false;
        final Object this$refinements = this.getRefinements();
        final Object other$refinements = other.getRefinements();
        if (this$refinements == null ? other$refinements != null : !this$refinements.equals(other$refinements))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof SearchResult;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $total = this.getTotal();
        result = result * PRIME + ($total == null ? 43 : $total.hashCode());
        final Object $pagination = this.getPagination();
        result = result * PRIME + ($pagination == null ? 43 : $pagination.hashCode());
        final Object $paging = this.getPaging();
        result = result * PRIME + ($paging == null ? 43 : $paging.hashCode());
        final Object $matches = this.getMatches();
        result = result * PRIME + ($matches == null ? 43 : $matches.hashCode());
        final Object $refinements = this.getRefinements();
        result = result * PRIME + ($refinements == null ? 43 : $refinements.hashCode());
        return result;
    }

    public String toString() {
        return "SearchResult(total=" + this.getTotal() + ", pagination=" + this.getPagination() + ", paging=" + this.getPaging() + ", matches=" + this.getMatches() + ", refinements=" + this.getRefinements() + ")";
    }

    public static class Pagination {
        private Integer totalCount;
        private Integer page;
        private Integer perPage;
        private Integer pageCount;
        private Integer first;
        private Integer last;

        public Pagination() {
        }

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

        public boolean equals(final Object o) {
            if (o == this) return true;
            if (!(o instanceof Pagination)) return false;
            final Pagination other = (Pagination) o;
            if (!other.canEqual((Object) this)) return false;
            final Object this$totalCount = this.getTotalCount();
            final Object other$totalCount = other.getTotalCount();
            if (this$totalCount == null ? other$totalCount != null : !this$totalCount.equals(other$totalCount))
                return false;
            final Object this$page = this.getPage();
            final Object other$page = other.getPage();
            if (this$page == null ? other$page != null : !this$page.equals(other$page)) return false;
            final Object this$perPage = this.getPerPage();
            final Object other$perPage = other.getPerPage();
            if (this$perPage == null ? other$perPage != null : !this$perPage.equals(other$perPage)) return false;
            final Object this$pageCount = this.getPageCount();
            final Object other$pageCount = other.getPageCount();
            if (this$pageCount == null ? other$pageCount != null : !this$pageCount.equals(other$pageCount))
                return false;
            final Object this$first = this.getFirst();
            final Object other$first = other.getFirst();
            if (this$first == null ? other$first != null : !this$first.equals(other$first)) return false;
            final Object this$last = this.getLast();
            final Object other$last = other.getLast();
            if (this$last == null ? other$last != null : !this$last.equals(other$last)) return false;
            return true;
        }

        protected boolean canEqual(final Object other) {
            return other instanceof Pagination;
        }

        public int hashCode() {
            final int PRIME = 59;
            int result = 1;
            final Object $totalCount = this.getTotalCount();
            result = result * PRIME + ($totalCount == null ? 43 : $totalCount.hashCode());
            final Object $page = this.getPage();
            result = result * PRIME + ($page == null ? 43 : $page.hashCode());
            final Object $perPage = this.getPerPage();
            result = result * PRIME + ($perPage == null ? 43 : $perPage.hashCode());
            final Object $pageCount = this.getPageCount();
            result = result * PRIME + ($pageCount == null ? 43 : $pageCount.hashCode());
            final Object $first = this.getFirst();
            result = result * PRIME + ($first == null ? 43 : $first.hashCode());
            final Object $last = this.getLast();
            result = result * PRIME + ($last == null ? 43 : $last.hashCode());
            return result;
        }

        public String toString() {
            return "SearchResult.Pagination(totalCount=" + this.getTotalCount() + ", page=" + this.getPage() + ", perPage=" + this.getPerPage() + ", pageCount=" + this.getPageCount() + ", first=" + this.getFirst() + ", last=" + this.getLast() + ")";
        }
    }
}
