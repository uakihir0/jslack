package com.github.seratch.jslack.api.methods.response.users;

import com.github.seratch.jslack.api.methods.SlackApiResponse;
import com.github.seratch.jslack.api.model.User;

import java.util.List;

public class UsersListResponse implements SlackApiResponse {

    private boolean ok;
    private String warning;
    private String error;

    private List<User> members;

    public UsersListResponse() {
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

    public List<User> getMembers() {
        return this.members;
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

    public void setMembers(List<User> members) {
        this.members = members;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof UsersListResponse)) return false;
        final UsersListResponse other = (UsersListResponse) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.isOk() != other.isOk()) return false;
        final Object this$warning = this.getWarning();
        final Object other$warning = other.getWarning();
        if (this$warning == null ? other$warning != null : !this$warning.equals(other$warning)) return false;
        final Object this$error = this.getError();
        final Object other$error = other.getError();
        if (this$error == null ? other$error != null : !this$error.equals(other$error)) return false;
        final Object this$members = this.getMembers();
        final Object other$members = other.getMembers();
        if (this$members == null ? other$members != null : !this$members.equals(other$members)) return false;
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
        final Object $members = this.getMembers();
        result = result * PRIME + ($members == null ? 43 : $members.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof UsersListResponse;
    }

    public String toString() {
        return "UsersListResponse(ok=" + this.isOk() + ", warning=" + this.getWarning() + ", error=" + this.getError() + ", members=" + this.getMembers() + ")";
    }
}