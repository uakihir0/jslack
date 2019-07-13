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

    public DndEndSnoozeResponse() {
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

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof DndEndSnoozeResponse)) return false;
        final DndEndSnoozeResponse other = (DndEndSnoozeResponse) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.isOk() != other.isOk()) return false;
        final Object this$warning = this.getWarning();
        final Object other$warning = other.getWarning();
        if (this$warning == null ? other$warning != null : !this$warning.equals(other$warning)) return false;
        final Object this$error = this.getError();
        final Object other$error = other.getError();
        if (this$error == null ? other$error != null : !this$error.equals(other$error)) return false;
        final Object this$needed = this.getNeeded();
        final Object other$needed = other.getNeeded();
        if (this$needed == null ? other$needed != null : !this$needed.equals(other$needed)) return false;
        final Object this$provided = this.getProvided();
        final Object other$provided = other.getProvided();
        if (this$provided == null ? other$provided != null : !this$provided.equals(other$provided)) return false;
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
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof DndEndSnoozeResponse;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + (this.isOk() ? 79 : 97);
        final Object $warning = this.getWarning();
        result = result * PRIME + ($warning == null ? 43 : $warning.hashCode());
        final Object $error = this.getError();
        result = result * PRIME + ($error == null ? 43 : $error.hashCode());
        final Object $needed = this.getNeeded();
        result = result * PRIME + ($needed == null ? 43 : $needed.hashCode());
        final Object $provided = this.getProvided();
        result = result * PRIME + ($provided == null ? 43 : $provided.hashCode());
        result = result * PRIME + (this.isDndEnabled() ? 79 : 97);
        final Object $nextDndStartTs = this.getNextDndStartTs();
        result = result * PRIME + ($nextDndStartTs == null ? 43 : $nextDndStartTs.hashCode());
        final Object $nextDndEndTs = this.getNextDndEndTs();
        result = result * PRIME + ($nextDndEndTs == null ? 43 : $nextDndEndTs.hashCode());
        result = result * PRIME + (this.isSnoozeEnabled() ? 79 : 97);
        return result;
    }

    public String toString() {
        return "DndEndSnoozeResponse(ok=" + this.isOk() + ", warning=" + this.getWarning() + ", error=" + this.getError() + ", needed=" + this.getNeeded() + ", provided=" + this.getProvided() + ", dndEnabled=" + this.isDndEnabled() + ", nextDndStartTs=" + this.getNextDndStartTs() + ", nextDndEndTs=" + this.getNextDndEndTs() + ", snoozeEnabled=" + this.isSnoozeEnabled() + ")";
    }
}