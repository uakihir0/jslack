package com.github.seratch.jslack.api.methods.response.dnd;

import com.github.seratch.jslack.api.methods.SlackApiResponse;

import java.util.Map;

public class DndTeamInfoResponse implements SlackApiResponse {

    private boolean ok;
    private String warning;
    private String error;
    private String needed;
    private String provided;

    // user.id -> info
    private Map<String, DndTeamMemberInfo> users;

    public boolean isOk() {
        return this.ok;
    }

    public String getWarning() {
        return this.warning;
    }

    public String getError() {
        return this.error;
    }

    public String getNeeded() {
        return this.needed;
    }

    public String getProvided() {
        return this.provided;
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

    public void setNeeded(String needed) {
        this.needed = needed;
    }

    public void setProvided(String provided) {
        this.provided = provided;
    }

    public void setUsers(Map<String, DndTeamMemberInfo> users) {
        this.users = users;
    }

    public static class DndTeamMemberInfo {
        private boolean dndEnabled;
        private Integer nextDndStartTs;
        private Integer nextDndEndTs;

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
    }
}