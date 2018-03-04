package com.github.seratch.jslack.api.methods.response.usergroups.users;

import com.github.seratch.jslack.api.methods.SlackApiResponse;

import java.util.List;

public class UsergroupUsersListResponse implements SlackApiResponse {

    private boolean ok;
    private String warning;
    private String error;

    private List<String> users;

    public UsergroupUsersListResponse() {
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

    public List<String> getUsers() {
        return this.users;
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

    public void setUsers(List<String> users) {
        this.users = users;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof UsergroupUsersListResponse)) return false;
        final UsergroupUsersListResponse other = (UsergroupUsersListResponse) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.isOk() != other.isOk()) return false;
        final Object this$warning = this.getWarning();
        final Object other$warning = other.getWarning();
        if (this$warning == null ? other$warning != null : !this$warning.equals(other$warning)) return false;
        final Object this$error = this.getError();
        final Object other$error = other.getError();
        if (this$error == null ? other$error != null : !this$error.equals(other$error)) return false;
        final Object this$users = this.getUsers();
        final Object other$users = other.getUsers();
        if (this$users == null ? other$users != null : !this$users.equals(other$users)) return false;
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
        final Object $users = this.getUsers();
        result = result * PRIME + ($users == null ? 43 : $users.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof UsergroupUsersListResponse;
    }

    public String toString() {
        return "UsergroupUsersListResponse(ok=" + this.isOk() + ", warning=" + this.getWarning() + ", error=" + this.getError() + ", users=" + this.getUsers() + ")";
    }
}