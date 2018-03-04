package com.github.seratch.jslack.api.model;

import java.util.List;

public class SearchResult {
    private Integer total;
    private Paging paging;
    private List<MatchedItem> matches;

    public SearchResult() {
    }

    public Integer getTotal() {
        return this.total;
    }

    public Paging getPaging() {
        return this.paging;
    }

    public List<MatchedItem> getMatches() {
        return this.matches;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public void setPaging(Paging paging) {
        this.paging = paging;
    }

    public void setMatches(List<MatchedItem> matches) {
        this.matches = matches;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof SearchResult)) return false;
        final SearchResult other = (SearchResult) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$total = this.getTotal();
        final Object other$total = other.getTotal();
        if (this$total == null ? other$total != null : !this$total.equals(other$total)) return false;
        final Object this$paging = this.getPaging();
        final Object other$paging = other.getPaging();
        if (this$paging == null ? other$paging != null : !this$paging.equals(other$paging)) return false;
        final Object this$matches = this.getMatches();
        final Object other$matches = other.getMatches();
        if (this$matches == null ? other$matches != null : !this$matches.equals(other$matches)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $total = this.getTotal();
        result = result * PRIME + ($total == null ? 43 : $total.hashCode());
        final Object $paging = this.getPaging();
        result = result * PRIME + ($paging == null ? 43 : $paging.hashCode());
        final Object $matches = this.getMatches();
        result = result * PRIME + ($matches == null ? 43 : $matches.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof SearchResult;
    }

    public String toString() {
        return "SearchResult(total=" + this.getTotal() + ", paging=" + this.getPaging() + ", matches=" + this.getMatches() + ")";
    }
}
