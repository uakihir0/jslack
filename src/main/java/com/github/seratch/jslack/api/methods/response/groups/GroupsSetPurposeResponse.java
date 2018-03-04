package com.github.seratch.jslack.api.methods.response.groups;

import com.github.seratch.jslack.api.methods.SlackApiResponse;

public class GroupsSetPurposeResponse implements SlackApiResponse {

    private boolean ok;
    private String warning;
    private String error;

    private String purpose;

    public GroupsSetPurposeResponse() {
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

    public String getPurpose() {
        return this.purpose;
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

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof GroupsSetPurposeResponse)) return false;
        final GroupsSetPurposeResponse other = (GroupsSetPurposeResponse) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.isOk() != other.isOk()) return false;
        final Object this$warning = this.getWarning();
        final Object other$warning = other.getWarning();
        if (this$warning == null ? other$warning != null : !this$warning.equals(other$warning)) return false;
        final Object this$error = this.getError();
        final Object other$error = other.getError();
        if (this$error == null ? other$error != null : !this$error.equals(other$error)) return false;
        final Object this$purpose = this.getPurpose();
        final Object other$purpose = other.getPurpose();
        if (this$purpose == null ? other$purpose != null : !this$purpose.equals(other$purpose)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + (this.isOk() ? 79 : 97);
        final Object $warning = this.getWarning();
        result = result * PRIME + ($warning == null ? 43 : $warning.hashCode());
        final Object $error = this.getError();
        result = result * PRIME + ($error == null ? 43 : $error.hashCode());
        final Object $purpose = this.getPurpose();
        result = result * PRIME + ($purpose == null ? 43 : $purpose.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof GroupsSetPurposeResponse;
    }

    public String toString() {
        return "GroupsSetPurposeResponse(ok=" + this.isOk() + ", warning=" + this.getWarning() + ", error=" + this.getError() + ", purpose=" + this.getPurpose() + ")";
    }
}