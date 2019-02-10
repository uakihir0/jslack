package com.github.seratch.jslack.api.methods.response.reminders;

import com.github.seratch.jslack.api.methods.SlackApiResponse;
import com.github.seratch.jslack.api.model.Reminder;

public class RemindersInfoResponse implements SlackApiResponse {

    private boolean ok;
    private String warning;
    private String error;

    private Reminder reminder;

    public RemindersInfoResponse() {
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

    public Reminder getReminder() {
        return this.reminder;
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

    public void setReminder(Reminder reminder) {
        this.reminder = reminder;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof RemindersInfoResponse))
            return false;
        final RemindersInfoResponse other = (RemindersInfoResponse) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.isOk() != other.isOk()) return false;
        final Object this$warning = this.getWarning();
        final Object other$warning = other.getWarning();
        if (this$warning == null ? other$warning != null : !this$warning.equals(other$warning)) return false;
        final Object this$error = this.getError();
        final Object other$error = other.getError();
        if (this$error == null ? other$error != null : !this$error.equals(other$error)) return false;
        final Object this$reminder = this.getReminder();
        final Object other$reminder = other.getReminder();
        if (this$reminder == null ? other$reminder != null : !this$reminder.equals(other$reminder)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof RemindersInfoResponse;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + (this.isOk() ? 79 : 97);
        final Object $warning = this.getWarning();
        result = result * PRIME + ($warning == null ? 43 : $warning.hashCode());
        final Object $error = this.getError();
        result = result * PRIME + ($error == null ? 43 : $error.hashCode());
        final Object $reminder = this.getReminder();
        result = result * PRIME + ($reminder == null ? 43 : $reminder.hashCode());
        return result;
    }

    public String toString() {
        return "RemindersInfoResponse(ok=" + this.isOk() + ", warning=" + this.getWarning() + ", error=" + this.getError() + ", reminder=" + this.getReminder() + ")";
    }
}