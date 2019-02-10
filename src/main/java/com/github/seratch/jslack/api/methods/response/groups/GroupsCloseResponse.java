package com.github.seratch.jslack.api.methods.response.groups;

import com.github.seratch.jslack.api.methods.SlackApiResponse;

public class GroupsCloseResponse implements SlackApiResponse {

    private boolean ok;
    private String warning;
    private String error;

    private boolean noOp;
    private boolean alreadyClosed;

    public GroupsCloseResponse() {
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

    public boolean isAlreadyClosed() {
        return this.alreadyClosed;
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

    public void setAlreadyClosed(boolean alreadyClosed) {
        this.alreadyClosed = alreadyClosed;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof GroupsCloseResponse)) return false;
        final GroupsCloseResponse other = (GroupsCloseResponse) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.isOk() != other.isOk()) return false;
        final Object this$warning = this.getWarning();
        final Object other$warning = other.getWarning();
        if (this$warning == null ? other$warning != null : !this$warning.equals(other$warning)) return false;
        final Object this$error = this.getError();
        final Object other$error = other.getError();
        if (this$error == null ? other$error != null : !this$error.equals(other$error)) return false;
        if (this.isNoOp() != other.isNoOp()) return false;
        if (this.isAlreadyClosed() != other.isAlreadyClosed()) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof GroupsCloseResponse;
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
        result = result * PRIME + (this.isAlreadyClosed() ? 79 : 97);
        return result;
    }

    public String toString() {
        return "GroupsCloseResponse(ok=" + this.isOk() + ", warning=" + this.getWarning() + ", error=" + this.getError() + ", noOp=" + this.isNoOp() + ", alreadyClosed=" + this.isAlreadyClosed() + ")";
    }
}