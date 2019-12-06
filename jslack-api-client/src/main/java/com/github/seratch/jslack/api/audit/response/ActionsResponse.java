package com.github.seratch.jslack.api.audit.response;

import com.github.seratch.jslack.api.audit.AuditApiResponse;

import java.util.List;

public class ActionsResponse implements AuditApiResponse {
    private boolean ok;
    private String warning;
    private String error;
    private String needed;
    private String provided;

    private Actions actions;

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

    public Actions getActions() {
        return this.actions;
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

    public void setActions(Actions actions) {
        this.actions = actions;
    }

    public static class Actions {
        private List<String> workspaceOrOrg;
        private List<String> user;
        private List<String> file;
        private List<String> channel;
        private List<String> app;
        private List<String> message;

        public List<String> getWorkspaceOrOrg() {
            return this.workspaceOrOrg;
        }

        public List<String> getUser() {
            return this.user;
        }

        public List<String> getFile() {
            return this.file;
        }

        public List<String> getChannel() {
            return this.channel;
        }

        public List<String> getApp() {
            return this.app;
        }

        public List<String> getMessage() {
            return this.message;
        }

        public void setWorkspaceOrOrg(List<String> workspaceOrOrg) {
            this.workspaceOrOrg = workspaceOrOrg;
        }

        public void setUser(List<String> user) {
            this.user = user;
        }

        public void setFile(List<String> file) {
            this.file = file;
        }

        public void setChannel(List<String> channel) {
            this.channel = channel;
        }

        public void setApp(List<String> app) {
            this.app = app;
        }

        public void setMessage(List<String> message) {
            this.message = message;
        }
    }
}
