package com.github.seratch.jslack.api.methods.response.dnd;

import com.github.seratch.jslack.api.methods.SlackApiResponse;

import java.util.Map;

public class DndTeamInfoResponse implements SlackApiResponse {

    private boolean ok;
    private String warning;
    private String error;

    // user.id -> info
    private Map<String, DndTeamMemberInfo> users;

    public DndTeamInfoResponse() {
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

    public Map<String, DndTeamMemberInfo> getUsers() {
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

    public void setUsers(Map<String, DndTeamMemberInfo> users) {
        this.users = users;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof DndTeamInfoResponse)) return false;
        final DndTeamInfoResponse other = (DndTeamInfoResponse) o;
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

    protected boolean canEqual(final Object other) {
        return other instanceof DndTeamInfoResponse;
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

    public String toString() {
        return "DndTeamInfoResponse(ok=" + this.isOk() + ", warning=" + this.getWarning() + ", error=" + this.getError() + ", users=" + this.getUsers() + ")";
    }

    public static class DndTeamMemberInfo {
        private boolean dndEnabled;
        private Integer nextDndStartTs;
        private Integer nextDndEndTs;

        public DndTeamMemberInfo() {
        }

        public boolean isDndEnabled() {
            return this.dndEnabled;
        }

        public Integer getNextDndStartTs() {
            return this.nextDndStartTs;
        }

        public Integer getNextDndEndTs() {
            return this.nextDndEndTs;
        }

        public void setDndEnabled(boolean dndEnabled) {
            this.dndEnabled = dndEnabled;
        }

        public void setNextDndStartTs(Integer nextDndStartTs) {
            this.nextDndStartTs = nextDndStartTs;
        }

        public void setNextDndEndTs(Integer nextDndEndTs) {
            this.nextDndEndTs = nextDndEndTs;
        }

        public boolean equals(final Object o) {
            if (o == this) return true;
            if (!(o instanceof DndTeamMemberInfo))
                return false;
            final DndTeamMemberInfo other = (DndTeamMemberInfo) o;
            if (!other.canEqual((Object) this)) return false;
            if (this.isDndEnabled() != other.isDndEnabled()) return false;
            final Object this$nextDndStartTs = this.getNextDndStartTs();
            final Object other$nextDndStartTs = other.getNextDndStartTs();
            if (this$nextDndStartTs == null ? other$nextDndStartTs != null : !this$nextDndStartTs.equals(other$nextDndStartTs))
                return false;
            final Object this$nextDndEndTs = this.getNextDndEndTs();
            final Object other$nextDndEndTs = other.getNextDndEndTs();
            if (this$nextDndEndTs == null ? other$nextDndEndTs != null : !this$nextDndEndTs.equals(other$nextDndEndTs))
                return false;
            return true;
        }

        protected boolean canEqual(final Object other) {
            return other instanceof DndTeamMemberInfo;
        }

        public int hashCode() {
            final int PRIME = 59;
            int result = 1;
            result = result * PRIME + (this.isDndEnabled() ? 79 : 97);
            final Object $nextDndStartTs = this.getNextDndStartTs();
            result = result * PRIME + ($nextDndStartTs == null ? 43 : $nextDndStartTs.hashCode());
            final Object $nextDndEndTs = this.getNextDndEndTs();
            result = result * PRIME + ($nextDndEndTs == null ? 43 : $nextDndEndTs.hashCode());
            return result;
        }

        public String toString() {
            return "DndTeamInfoResponse.DndTeamMemberInfo(dndEnabled=" + this.isDndEnabled() + ", nextDndStartTs=" + this.getNextDndStartTs() + ", nextDndEndTs=" + this.getNextDndEndTs() + ")";
        }
    }
}