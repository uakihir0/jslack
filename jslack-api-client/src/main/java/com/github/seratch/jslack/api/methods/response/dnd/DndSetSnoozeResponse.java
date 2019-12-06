package com.github.seratch.jslack.api.methods.response.dnd;

import com.github.seratch.jslack.api.methods.SlackApiResponse;

public class DndSetSnoozeResponse implements SlackApiResponse {

    private boolean ok;
    private String warning;
    private String error;
    private String needed;
    private String provided;

    private boolean snoozeEnabled;
    private Integer snoozeEndtime;
    private Integer snoozeRemaining;

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

    public boolean isSnoozeEnabled() {
        return this.snoozeEnabled;
    }

    public Integer getSnoozeEndtime() {
        return this.snoozeEndtime;
    }

    public Integer getSnoozeRemaining() {
        return this.snoozeRemaining;
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

    public void setSnoozeEnabled(boolean snoozeEnabled) {
        this.snoozeEnabled = snoozeEnabled;
    }

    public void setSnoozeEndtime(Integer snoozeEndtime) {
        this.snoozeEndtime = snoozeEndtime;
    }

    public void setSnoozeRemaining(Integer snoozeRemaining) {
        this.snoozeRemaining = snoozeRemaining;
    }
}