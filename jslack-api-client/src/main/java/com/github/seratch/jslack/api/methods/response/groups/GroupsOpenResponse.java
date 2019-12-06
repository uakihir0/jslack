package com.github.seratch.jslack.api.methods.response.groups;

import com.github.seratch.jslack.api.methods.SlackApiResponse;

public class GroupsOpenResponse implements SlackApiResponse {

    private boolean ok;
    private String warning;
    private String error;
    private String needed;
    private String provided;

    private boolean noOp;
    private boolean alreadyOpen;

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

    public boolean isNoOp() {
        return this.noOp;
    }

    public boolean isAlreadyOpen() {
        return this.alreadyOpen;
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

    public void setNoOp(boolean noOp) {
        this.noOp = noOp;
    }

    public void setAlreadyOpen(boolean alreadyOpen) {
        this.alreadyOpen = alreadyOpen;
    }
}