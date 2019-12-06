package com.github.seratch.jslack.api.methods.response.usergroups;

import com.github.seratch.jslack.api.methods.SlackApiResponse;
import com.github.seratch.jslack.api.model.Usergroup;

public class UsergroupsCreateResponse implements SlackApiResponse {

    private boolean ok;
    private String warning;
    private String error;
    private String needed; // "usergroups:write"
    private String provided; // some permissions

    private Usergroup usergroup;

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

    public Usergroup getUsergroup() {
        return this.usergroup;
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

    public void setUsergroup(Usergroup usergroup) {
        this.usergroup = usergroup;
    }
}