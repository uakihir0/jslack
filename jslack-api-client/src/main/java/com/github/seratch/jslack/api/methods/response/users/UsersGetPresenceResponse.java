package com.github.seratch.jslack.api.methods.response.users;

import com.github.seratch.jslack.api.methods.SlackApiResponse;

public class UsersGetPresenceResponse implements SlackApiResponse {

    private boolean ok;
    private String warning;
    private String error;
    private String needed;
    private String provided;

    private String presence;
    private boolean online;
    private boolean autoAway;
    private boolean manualAway;
    private Integer connectionCount;
    private Integer lastActivity;

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

    public String getPresence() {
        return this.presence;
    }

    public boolean isOnline() {
        return this.online;
    }

    public boolean isAutoAway() {
        return this.autoAway;
    }

    public boolean isManualAway() {
        return this.manualAway;
    }

    public Integer getConnectionCount() {
        return this.connectionCount;
    }

    public Integer getLastActivity() {
        return this.lastActivity;
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

    public void setPresence(String presence) {
        this.presence = presence;
    }

    public void setOnline(boolean online) {
        this.online = online;
    }

    public void setAutoAway(boolean autoAway) {
        this.autoAway = autoAway;
    }

    public void setManualAway(boolean manualAway) {
        this.manualAway = manualAway;
    }

    public void setConnectionCount(Integer connectionCount) {
        this.connectionCount = connectionCount;
    }

    public void setLastActivity(Integer lastActivity) {
        this.lastActivity = lastActivity;
    }
}