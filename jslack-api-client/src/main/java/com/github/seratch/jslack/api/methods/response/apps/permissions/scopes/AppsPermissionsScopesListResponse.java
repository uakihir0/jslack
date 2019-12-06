package com.github.seratch.jslack.api.methods.response.apps.permissions.scopes;

import com.github.seratch.jslack.api.methods.SlackApiResponse;

import java.util.List;

public class AppsPermissionsScopesListResponse implements SlackApiResponse {

    private boolean ok;
    private String warning;
    private String error;
    private String needed;
    private String provided;

    private List<Scope> scopes;

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

    public List<Scope> getScopes() {
        return this.scopes;
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

    public void setScopes(List<Scope> scopes) {
        this.scopes = scopes;
    }

    public static class Scope {
        private List<String> appHome;
        private List<String> team;
        private List<String> channel;
        private List<String> group;
        private List<String> mpim;
        private List<String> im;
        private List<String> user;

        public List<String> getAppHome() {
            return this.appHome;
        }

        public List<String> getTeam() {
            return this.team;
        }

        public List<String> getChannel() {
            return this.channel;
        }

        public List<String> getGroup() {
            return this.group;
        }

        public List<String> getMpim() {
            return this.mpim;
        }

        public List<String> getIm() {
            return this.im;
        }

        public List<String> getUser() {
            return this.user;
        }

        public void setAppHome(List<String> appHome) {
            this.appHome = appHome;
        }

        public void setTeam(List<String> team) {
            this.team = team;
        }

        public void setChannel(List<String> channel) {
            this.channel = channel;
        }

        public void setGroup(List<String> group) {
            this.group = group;
        }

        public void setMpim(List<String> mpim) {
            this.mpim = mpim;
        }

        public void setIm(List<String> im) {
            this.im = im;
        }

        public void setUser(List<String> user) {
            this.user = user;
        }
    }

}