package com.github.seratch.jslack.api.model;

public class BillableInfo {

    private boolean billingActive;

    public BillableInfo() {
    }

    public boolean isBillingActive() {
        return this.billingActive;
    }

    public void setBillingActive(boolean billingActive) {
        this.billingActive = billingActive;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof BillableInfo)) return false;
        final BillableInfo other = (BillableInfo) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.isBillingActive() != other.isBillingActive()) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + (this.isBillingActive() ? 79 : 97);
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof BillableInfo;
    }

    public String toString() {
        return "BillableInfo(billingActive=" + this.isBillingActive() + ")";
    }
}
