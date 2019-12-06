package com.github.seratch.jslack.api.model;

public class ThreadInfo {

    private boolean complete;
    private Integer count;

    public boolean isComplete() {
        return this.complete;
    }

    public Integer getCount() {
        return this.count;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
