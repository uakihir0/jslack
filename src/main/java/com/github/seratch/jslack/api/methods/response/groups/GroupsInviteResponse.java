package com.github.seratch.jslack.api.methods.response.groups;

import com.github.seratch.jslack.api.methods.SlackApiResponse;
import com.github.seratch.jslack.api.model.Group;

public class GroupsInviteResponse implements SlackApiResponse {

    private boolean ok;
    private String warning;
    private String error;

    private Group group;

    public GroupsInviteResponse() {
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

    public Group getGroup() {
        return this.group;
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

    public void setGroup(Group group) {
        this.group = group;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof GroupsInviteResponse)) return false;
        final GroupsInviteResponse other = (GroupsInviteResponse) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.isOk() != other.isOk()) return false;
        final Object this$warning = this.getWarning();
        final Object other$warning = other.getWarning();
        if (this$warning == null ? other$warning != null : !this$warning.equals(other$warning)) return false;
        final Object this$error = this.getError();
        final Object other$error = other.getError();
        if (this$error == null ? other$error != null : !this$error.equals(other$error)) return false;
        final Object this$group = this.getGroup();
        final Object other$group = other.getGroup();
        if (this$group == null ? other$group != null : !this$group.equals(other$group)) return false;
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
        final Object $group = this.getGroup();
        result = result * PRIME + ($group == null ? 43 : $group.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof GroupsInviteResponse;
    }

    public String toString() {
        return "GroupsInviteResponse(ok=" + this.isOk() + ", warning=" + this.getWarning() + ", error=" + this.getError() + ", group=" + this.getGroup() + ")";
    }
}