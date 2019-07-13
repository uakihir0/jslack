package com.github.seratch.jslack.api.model;

public class ThreadInfo {

    private boolean complete;
    private Integer count;

    public ThreadInfo() {
    }

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

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ThreadInfo)) return false;
        final ThreadInfo other = (ThreadInfo) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.isComplete() != other.isComplete()) return false;
        final Object this$count = this.getCount();
        final Object other$count = other.getCount();
        if (this$count == null ? other$count != null : !this$count.equals(other$count)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ThreadInfo;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + (this.isComplete() ? 79 : 97);
        final Object $count = this.getCount();
        result = result * PRIME + ($count == null ? 43 : $count.hashCode());
        return result;
    }

    public String toString() {
        return "ThreadInfo(complete=" + this.isComplete() + ", count=" + this.getCount() + ")";
    }
}
