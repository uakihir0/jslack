package com.github.seratch.jslack.api.methods.response.users;

import com.github.seratch.jslack.api.methods.SlackApiResponse;

public class UsersGetPresenceResponse implements SlackApiResponse {

    private boolean ok;
    private String warning;
    private String error;

    private String presence;
    private boolean online;
    private boolean autoAway;
    private boolean manualAway;
    private Integer connectionCount;
    private Integer lastActivity;

    public UsersGetPresenceResponse() {
    }

    public boolean isOk() {
        return this.ok;
    }

    public String getWarning() {
        return this.warning;
    }

    public String getError() {
        return this.error;
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

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof UsersGetPresenceResponse)) return false;
        final UsersGetPresenceResponse other = (UsersGetPresenceResponse) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.isOk() != other.isOk()) return false;
        final Object this$warning = this.getWarning();
        final Object other$warning = other.getWarning();
        if (this$warning == null ? other$warning != null : !this$warning.equals(other$warning)) return false;
        final Object this$error = this.getError();
        final Object other$error = other.getError();
        if (this$error == null ? other$error != null : !this$error.equals(other$error)) return false;
        final Object this$presence = this.getPresence();
        final Object other$presence = other.getPresence();
        if (this$presence == null ? other$presence != null : !this$presence.equals(other$presence)) return false;
        if (this.isOnline() != other.isOnline()) return false;
        if (this.isAutoAway() != other.isAutoAway()) return false;
        if (this.isManualAway() != other.isManualAway()) return false;
        final Object this$connectionCount = this.getConnectionCount();
        final Object other$connectionCount = other.getConnectionCount();
        if (this$connectionCount == null ? other$connectionCount != null : !this$connectionCount.equals(other$connectionCount))
            return false;
        final Object this$lastActivity = this.getLastActivity();
        final Object other$lastActivity = other.getLastActivity();
        if (this$lastActivity == null ? other$lastActivity != null : !this$lastActivity.equals(other$lastActivity))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof UsersGetPresenceResponse;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + (this.isOk() ? 79 : 97);
        final Object $warning = this.getWarning();
        result = result * PRIME + ($warning == null ? 43 : $warning.hashCode());
        final Object $error = this.getError();
        result = result * PRIME + ($error == null ? 43 : $error.hashCode());
        final Object $presence = this.getPresence();
        result = result * PRIME + ($presence == null ? 43 : $presence.hashCode());
        result = result * PRIME + (this.isOnline() ? 79 : 97);
        result = result * PRIME + (this.isAutoAway() ? 79 : 97);
        result = result * PRIME + (this.isManualAway() ? 79 : 97);
        final Object $connectionCount = this.getConnectionCount();
        result = result * PRIME + ($connectionCount == null ? 43 : $connectionCount.hashCode());
        final Object $lastActivity = this.getLastActivity();
        result = result * PRIME + ($lastActivity == null ? 43 : $lastActivity.hashCode());
        return result;
    }

    public String toString() {
        return "UsersGetPresenceResponse(ok=" + this.isOk() + ", warning=" + this.getWarning() + ", error=" + this.getError() + ", presence=" + this.getPresence() + ", online=" + this.isOnline() + ", autoAway=" + this.isAutoAway() + ", manualAway=" + this.isManualAway() + ", connectionCount=" + this.getConnectionCount() + ", lastActivity=" + this.getLastActivity() + ")";
    }
}