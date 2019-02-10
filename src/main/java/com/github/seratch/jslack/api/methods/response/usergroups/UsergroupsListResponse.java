package com.github.seratch.jslack.api.methods.response.usergroups;

import com.github.seratch.jslack.api.methods.SlackApiResponse;
import com.github.seratch.jslack.api.model.Usergroup;

import java.util.List;

public class UsergroupsListResponse implements SlackApiResponse {

    private boolean ok;
    private String warning;
    private String error;

    private List<Usergroup> usergroups;

    public UsergroupsListResponse() {
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

    public List<Usergroup> getUsergroups() {
        return this.usergroups;
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

    public void setUsergroups(List<Usergroup> usergroups) {
        this.usergroups = usergroups;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof UsergroupsListResponse))
            return false;
        final UsergroupsListResponse other = (UsergroupsListResponse) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.isOk() != other.isOk()) return false;
        final Object this$warning = this.getWarning();
        final Object other$warning = other.getWarning();
        if (this$warning == null ? other$warning != null : !this$warning.equals(other$warning)) return false;
        final Object this$error = this.getError();
        final Object other$error = other.getError();
        if (this$error == null ? other$error != null : !this$error.equals(other$error)) return false;
        final Object this$usergroups = this.getUsergroups();
        final Object other$usergroups = other.getUsergroups();
        if (this$usergroups == null ? other$usergroups != null : !this$usergroups.equals(other$usergroups))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof UsergroupsListResponse;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + (this.isOk() ? 79 : 97);
        final Object $warning = this.getWarning();
        result = result * PRIME + ($warning == null ? 43 : $warning.hashCode());
        final Object $error = this.getError();
        result = result * PRIME + ($error == null ? 43 : $error.hashCode());
        final Object $usergroups = this.getUsergroups();
        result = result * PRIME + ($usergroups == null ? 43 : $usergroups.hashCode());
        return result;
    }

    public String toString() {
        return "UsergroupsListResponse(ok=" + this.isOk() + ", warning=" + this.getWarning() + ", error=" + this.getError() + ", usergroups=" + this.getUsergroups() + ")";
    }
}