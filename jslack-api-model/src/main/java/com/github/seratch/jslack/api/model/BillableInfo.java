package com.github.seratch.jslack.api.model;

public class BillableInfo {

    private boolean billingActive;

    public boolean isBillingActive() {
        return this.billingActive;
    }

    public void setBillingActive(boolean billingActive) {
        this.billingActive = billingActive;
    }
}
