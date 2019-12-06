package com.github.seratch.jslack.api.methods.response.auth;

import com.github.seratch.jslack.api.methods.SlackApiResponse;

public class AuthTestResponse implements SlackApiResponse {

    private boolean ok;
    private String warning;
    private String error;
    private String needed;
    private String provided;

    private String url;
    private String team;
    private String user;
    private String teamId;
    private String userId;
    private String enterpriseId;

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

    public String getUrl() {
        return this.url;
    }

    public String getTeam() {
        return this.team;
    }

    public String getUser() {
        return this.user;
    }

    public String getTeamId() {
        return this.teamId;
    }

    public String getUserId() {
        return this.userId;
    }

    public String getEnterpriseId() {
        return this.enterpriseId;
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

    public void setUrl(String url) {
        this.url = url;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setEnterpriseId(String enterpriseId) {
        this.enterpriseId = enterpriseId;
    }
}