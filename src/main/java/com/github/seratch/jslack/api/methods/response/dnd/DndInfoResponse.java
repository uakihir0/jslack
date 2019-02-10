package com.github.seratch.jslack.api.methods.response.dnd;

import com.github.seratch.jslack.api.methods.SlackApiResponse;

public class DndInfoResponse implements SlackApiResponse {

    private boolean ok;
    private String warning;
    private String error;

    private boolean dndEnabled;
    private Integer nextDndStartTs;
    private Integer nextDndEndTs;
    private boolean snoozeEnabled;
    private Integer snoozeEndtime;
    private Integer snoozeRemaining;

    public DndInfoResponse() {
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

    public void setSnoozeEndtime(Integer snoozeEndtime) {
        this.snoozeEndtime = snoozeEndtime;
    }

    public void setSnoozeRemaining(Integer snoozeRemaining) {
        this.snoozeRemaining = snoozeRemaining;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof DndInfoResponse)) return false;
        final DndInfoResponse other = (DndInfoResponse) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.isOk() != other.isOk()) return false;
        final Object this$warning = this.getWarning();
        final Object other$warning = other.getWarning();
        if (this$warning == null ? other$warning != null : !this$warning.equals(other$warning)) return false;
        final Object this$error = this.getError();
        final Object other$error = other.getError();
        if (this$error == null ? other$error != null : !this$error.equals(other$error)) return false;
        if (this.isDndEnabled() != other.isDndEnabled()) return false;
        final Object this$nextDndStartTs = this.getNextDndStartTs();
        final Object other$nextDndStartTs = other.getNextDndStartTs();
        if (this$nextDndStartTs == null ? other$nextDndStartTs != null : !this$nextDndStartTs.equals(other$nextDndStartTs))
            return false;
        final Object this$nextDndEndTs = this.getNextDndEndTs();
        final Object other$nextDndEndTs = other.getNextDndEndTs();
        if (this$nextDndEndTs == null ? other$nextDndEndTs != null : !this$nextDndEndTs.equals(other$nextDndEndTs))
            return false;
        if (this.isSnoozeEnabled() != other.isSnoozeEnabled()) return false;
        final Object this$snoozeEndtime = this.getSnoozeEndtime();
        final Object other$snoozeEndtime = other.getSnoozeEndtime();
        if (this$snoozeEndtime == null ? other$snoozeEndtime != null : !this$snoozeEndtime.equals(other$snoozeEndtime))
            return false;
        final Object this$snoozeRemaining = this.getSnoozeRemaining();
        final Object other$snoozeRemaining = other.getSnoozeRemaining();
        if (this$snoozeRemaining == null ? other$snoozeRemaining != null : !this$snoozeRemaining.equals(other$snoozeRemaining))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof DndInfoResponse;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + (this.isOk() ? 79 : 97);
        final Object $warning = this.getWarning();
        result = result * PRIME + ($warning == null ? 43 : $warning.hashCode());
        final Object $error = this.getError();
        result = result * PRIME + ($error == null ? 43 : $error.hashCode());
        result = result * PRIME + (this.isDndEnabled() ? 79 : 97);
        final Object $nextDndStartTs = this.getNextDndStartTs();
        result = result * PRIME + ($nextDndStartTs == null ? 43 : $nextDndStartTs.hashCode());
        final Object $nextDndEndTs = this.getNextDndEndTs();
        result = result * PRIME + ($nextDndEndTs == null ? 43 : $nextDndEndTs.hashCode());
        result = result * PRIME + (this.isSnoozeEnabled() ? 79 : 97);
        final Object $snoozeEndtime = this.getSnoozeEndtime();
        result = result * PRIME + ($snoozeEndtime == null ? 43 : $snoozeEndtime.hashCode());
        final Object $snoozeRemaining = this.getSnoozeRemaining();
        result = result * PRIME + ($snoozeRemaining == null ? 43 : $snoozeRemaining.hashCode());
        return result;
    }

    public String toString() {
        return "DndInfoResponse(ok=" + this.isOk() + ", warning=" + this.getWarning() + ", error=" + this.getError() + ", dndEnabled=" + this.isDndEnabled() + ", nextDndStartTs=" + this.getNextDndStartTs() + ", nextDndEndTs=" + this.getNextDndEndTs() + ", snoozeEnabled=" + this.isSnoozeEnabled() + ", snoozeEndtime=" + this.getSnoozeEndtime() + ", snoozeRemaining=" + this.getSnoozeRemaining() + ")";
    }
}