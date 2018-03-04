package com.github.seratch.jslack.api.methods.response.dnd;

import com.github.seratch.jslack.api.methods.SlackApiResponse;

public class DndSetSnoozeResponse implements SlackApiResponse {

    private boolean ok;
    private String warning;
    private String error;

    private boolean snoozeEnabled;
    private Integer snoozeEndtime;
    private Integer snoozeRemaining;

    public DndSetSnoozeResponse() {
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

    public void setSnoozeEnabled(boolean snoozeEnabled) {
        this.snoozeEnabled = snoozeEnabled;
    }

    public void setSnoozeEndtime(Integer snoozeEndtime) {
        this.snoozeEndtime = snoozeEndtime;
    }

    public void setSnoozeRemaining(Integer snoozeRemaining) {
        this.snoozeRemaining = snoozeRemaining;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof DndSetSnoozeResponse)) return false;
        final DndSetSnoozeResponse other = (DndSetSnoozeResponse) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.isOk() != other.isOk()) return false;
        final Object this$warning = this.getWarning();
        final Object other$warning = other.getWarning();
        if (this$warning == null ? other$warning != null : !this$warning.equals(other$warning)) return false;
        final Object this$error = this.getError();
        final Object other$error = other.getError();
        if (this$error == null ? other$error != null : !this$error.equals(other$error)) return false;
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

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + (this.isOk() ? 79 : 97);
        final Object $warning = this.getWarning();
        result = result * PRIME + ($warning == null ? 43 : $warning.hashCode());
        final Object $error = this.getError();
        result = result * PRIME + ($error == null ? 43 : $error.hashCode());
        result = result * PRIME + (this.isSnoozeEnabled() ? 79 : 97);
        final Object $snoozeEndtime = this.getSnoozeEndtime();
        result = result * PRIME + ($snoozeEndtime == null ? 43 : $snoozeEndtime.hashCode());
        final Object $snoozeRemaining = this.getSnoozeRemaining();
        result = result * PRIME + ($snoozeRemaining == null ? 43 : $snoozeRemaining.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof DndSetSnoozeResponse;
    }

    public String toString() {
        return "DndSetSnoozeResponse(ok=" + this.isOk() + ", warning=" + this.getWarning() + ", error=" + this.getError() + ", snoozeEnabled=" + this.isSnoozeEnabled() + ", snoozeEndtime=" + this.getSnoozeEndtime() + ", snoozeRemaining=" + this.getSnoozeRemaining() + ")";
    }
}