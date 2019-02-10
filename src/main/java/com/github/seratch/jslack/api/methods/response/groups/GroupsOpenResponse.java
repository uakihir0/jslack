package com.github.seratch.jslack.api.methods.response.groups;

import com.github.seratch.jslack.api.methods.SlackApiResponse;

public class GroupsOpenResponse implements SlackApiResponse {

    private boolean ok;
    private String warning;
    private String error;

    private boolean noOp;
    private boolean alreadyOpen;

    public GroupsOpenResponse() {
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

    public boolean isNoOp() {
        return this.noOp;
    }

    public boolean isAlreadyOpen() {
        return this.alreadyOpen;
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

    public void setNoOp(boolean noOp) {
        this.noOp = noOp;
    }

    public void setAlreadyOpen(boolean alreadyOpen) {
        this.alreadyOpen = alreadyOpen;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof GroupsOpenResponse)) return false;
        final GroupsOpenResponse other = (GroupsOpenResponse) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.isOk() != other.isOk()) return false;
        final Object this$warning = this.getWarning();
        final Object other$warning = other.getWarning();
        if (this$warning == null ? other$warning != null : !this$warning.equals(other$warning)) return false;
        final Object this$error = this.getError();
        final Object other$error = other.getError();
        if (this$error == null ? other$error != null : !this$error.equals(other$error)) return false;
        if (this.isNoOp() != other.isNoOp()) return false;
        if (this.isAlreadyOpen() != other.isAlreadyOpen()) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof GroupsOpenResponse;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + (this.isOk() ? 79 : 97);
        final Object $warning = this.getWarning();
        result = result * PRIME + ($warning == null ? 43 : $warning.hashCode());
        final Object $error = this.getError();
        result = result * PRIME + ($error == null ? 43 : $error.hashCode());
        result = result * PRIME + (this.isNoOp() ? 79 : 97);
        result = result * PRIME + (this.isAlreadyOpen() ? 79 : 97);
        return result;
    }

    public String toString() {
        return "GroupsOpenResponse(ok=" + this.isOk() + ", warning=" + this.getWarning() + ", error=" + this.getError() + ", noOp=" + this.isNoOp() + ", alreadyOpen=" + this.isAlreadyOpen() + ")";
    }
}