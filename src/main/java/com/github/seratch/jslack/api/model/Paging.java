package com.github.seratch.jslack.api.model;

public class Paging {

    private Integer count;
    private Integer total;
    private Integer page;
    private Integer pages;

    public Paging() {
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

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Paging)) return false;
        final Paging other = (Paging) o;
        if (!other.canEqual((Object) this)) return false;
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
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Paging;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $count = this.getCount();
        result = result * PRIME + ($count == null ? 43 : $count.hashCode());
        final Object $total = this.getTotal();
        result = result * PRIME + ($total == null ? 43 : $total.hashCode());
        final Object $page = this.getPage();
        result = result * PRIME + ($page == null ? 43 : $page.hashCode());
        final Object $pages = this.getPages();
        result = result * PRIME + ($pages == null ? 43 : $pages.hashCode());
        return result;
    }

    public String toString() {
        return "Paging(count=" + this.getCount() + ", total=" + this.getTotal() + ", page=" + this.getPage() + ", pages=" + this.getPages() + ")";
    }
}
