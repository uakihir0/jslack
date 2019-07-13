package com.github.seratch.jslack.api.model;

public class Paging {

    private String iid; // search
    private Integer count;
    private Integer total;
    private Integer page;
    private Integer pages;
    private Integer perPage;
    private Integer spill;

    public Paging() {
    }

    public String getIid() {
        return this.iid;
    }

    public Integer getCount() {
        return this.count;
    }

    public Integer getTotal() {
        return this.total;
    }

    public Integer getPage() {
        return this.page;
    }

    public Integer getPages() {
        return this.pages;
    }

    public Integer getPerPage() {
        return this.perPage;
    }

    public Integer getSpill() {
        return this.spill;
    }

    public void setIid(String iid) {
        this.iid = iid;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public void setPerPage(Integer perPage) {
        this.perPage = perPage;
    }

    public void setSpill(Integer spill) {
        this.spill = spill;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Paging)) return false;
        final Paging other = (Paging) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$iid = this.getIid();
        final Object other$iid = other.getIid();
        if (this$iid == null ? other$iid != null : !this$iid.equals(other$iid)) return false;
        final Object this$count = this.getCount();
        final Object other$count = other.getCount();
        if (this$count == null ? other$count != null : !this$count.equals(other$count)) return false;
        final Object this$total = this.getTotal();
        final Object other$total = other.getTotal();
        if (this$total == null ? other$total != null : !this$total.equals(other$total)) return false;
        final Object this$page = this.getPage();
        final Object other$page = other.getPage();
        if (this$page == null ? other$page != null : !this$page.equals(other$page)) return false;
        final Object this$pages = this.getPages();
        final Object other$pages = other.getPages();
        if (this$pages == null ? other$pages != null : !this$pages.equals(other$pages)) return false;
        final Object this$perPage = this.getPerPage();
        final Object other$perPage = other.getPerPage();
        if (this$perPage == null ? other$perPage != null : !this$perPage.equals(other$perPage)) return false;
        final Object this$spill = this.getSpill();
        final Object other$spill = other.getSpill();
        if (this$spill == null ? other$spill != null : !this$spill.equals(other$spill)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Paging;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $iid = this.getIid();
        result = result * PRIME + ($iid == null ? 43 : $iid.hashCode());
        final Object $count = this.getCount();
        result = result * PRIME + ($count == null ? 43 : $count.hashCode());
        final Object $total = this.getTotal();
        result = result * PRIME + ($total == null ? 43 : $total.hashCode());
        final Object $page = this.getPage();
        result = result * PRIME + ($page == null ? 43 : $page.hashCode());
        final Object $pages = this.getPages();
        result = result * PRIME + ($pages == null ? 43 : $pages.hashCode());
        final Object $perPage = this.getPerPage();
        result = result * PRIME + ($perPage == null ? 43 : $perPage.hashCode());
        final Object $spill = this.getSpill();
        result = result * PRIME + ($spill == null ? 43 : $spill.hashCode());
        return result;
    }

    public String toString() {
        return "Paging(iid=" + this.getIid() + ", count=" + this.getCount() + ", total=" + this.getTotal() + ", page=" + this.getPage() + ", pages=" + this.getPages() + ", perPage=" + this.getPerPage() + ", spill=" + this.getSpill() + ")";
    }
}
