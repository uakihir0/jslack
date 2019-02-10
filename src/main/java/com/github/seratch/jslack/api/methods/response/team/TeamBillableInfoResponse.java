package com.github.seratch.jslack.api.methods.response.team;

import com.github.seratch.jslack.api.methods.SlackApiResponse;
import com.github.seratch.jslack.api.model.BillableInfo;

import java.util.Map;

public class TeamBillableInfoResponse implements SlackApiResponse {

    private boolean ok;
    private String warning;
    private String error;

    private Map<String, BillableInfo> billableInfo;

    public TeamBillableInfoResponse() {
    }

    public boolean isOk() {
        return this.ok;
    }

    public String getWarning() {
        return this.warning;
    }

    public String getError() {
        return this.error;
    }

    public Map<String, BillableInfo> getBillableInfo() {
        return this.billableInfo;
    }

    public void setOk(boolean ok) {
        this.ok = ok;
    }

    public void setWarning(String warning) {
        this.warning = warning;
    }

    public void setError(String error) {
        this.error = error;
    }

    public void setBillableInfo(Map<String, BillableInfo> billableInfo) {
        this.billableInfo = billableInfo;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof TeamBillableInfoResponse)) return false;
        final TeamBillableInfoResponse other = (TeamBillableInfoResponse) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.isOk() != other.isOk()) return false;
        final Object this$warning = this.getWarning();
        final Object other$warning = other.getWarning();
        if (this$warning == null ? other$warning != null : !this$warning.equals(other$warning)) return false;
        final Object this$error = this.getError();
        final Object other$error = other.getError();
        if (this$error == null ? other$error != null : !this$error.equals(other$error)) return false;
        final Object this$billableInfo = this.getBillableInfo();
        final Object other$billableInfo = other.getBillableInfo();
        if (this$billableInfo == null ? other$billableInfo != null : !this$billableInfo.equals(other$billableInfo))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof TeamBillableInfoResponse;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + (this.isOk() ? 79 : 97);
        final Object $warning = this.getWarning();
        result = result * PRIME + ($warning == null ? 43 : $warning.hashCode());
        final Object $error = this.getError();
        result = result * PRIME + ($error == null ? 43 : $error.hashCode());
        final Object $billableInfo = this.getBillableInfo();
        result = result * PRIME + ($billableInfo == null ? 43 : $billableInfo.hashCode());
        return result;
    }

    public String toString() {
        return "TeamBillableInfoResponse(ok=" + this.isOk() + ", warning=" + this.getWarning() + ", error=" + this.getError() + ", billableInfo=" + this.getBillableInfo() + ")";
    }
}