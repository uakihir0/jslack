package com.github.seratch.jslack.api.methods.response.dnd;

import com.github.seratch.jslack.api.methods.SlackApiResponse;

public class DndEndSnoozeResponse implements SlackApiResponse {

    private boolean ok;
    private String warning;
    private String error;
    private String needed;
    private String provided;

    private boolean dndEnabled;
    private Integer nextDndStartTs;
    private Integer nextDndEndTs;
    private boolean snoozeEnabled;

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

    public boolean isDndEnabled() {
        return this.dndEnabled;
    }

    public Integer getNextDndStartTs() {
        return this.nextDndStartTs;
    }

    public Integer getNextDndEndTs() {
        return this.nextDndEndTs;
    }

    public boolean isSnoozeEnabled() {
        return this.snoozeEnabled;
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

    public void setDndEnabled(boolean dndEnabled) {
        this.dndEnabled = dndEnabled;
    }

    public void setNextDndStartTs(Integer nextDndStartTs) {
        this.nextDndStartTs = nextDndStartTs;
    }

    public void setNextDndEndTs(Integer nextDndEndTs) {
        this.nextDndEndTs = nextDndEndTs;
    }

    public void setSnoozeEnabled(boolean snoozeEnabled) {
        this.snoozeEnabled = snoozeEnabled;
    }
}