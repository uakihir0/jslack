package com.github.seratch.jslack.api.model;

public class Paging {

    private String iid; // search
    private Integer count;
    private Integer total;
    private Integer page;
    private Integer pages;
    private Integer perPage;
    private Integer spill;

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
}
