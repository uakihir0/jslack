package com.github.seratch.jslack.api.methods.response.team;

import com.github.seratch.jslack.api.methods.SlackApiResponse;
import com.github.seratch.jslack.api.model.Login;
import com.github.seratch.jslack.api.model.Paging;

import java.util.List;

public class TeamAccessLogsResponse implements SlackApiResponse {

    private boolean ok;
    private String warning;
    private String error;
    private String needed;
    private String provided;

    private List<Login> logins;
    private Paging paging;

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

    public List<Login> getLogins() {
        return this.logins;
    }

    public Paging getPaging() {
        return this.paging;
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

    public void setLogins(List<Login> logins) {
        this.logins = logins;
    }

    public void setPaging(Paging paging) {
        this.paging = paging;
    }
}