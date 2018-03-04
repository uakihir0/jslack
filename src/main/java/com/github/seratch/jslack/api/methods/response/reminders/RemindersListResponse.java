package com.github.seratch.jslack.api.methods.response.reminders;

import com.github.seratch.jslack.api.methods.SlackApiResponse;
import com.github.seratch.jslack.api.model.Reminder;

import java.util.List;

public class RemindersListResponse implements SlackApiResponse {

    private boolean ok;
    private String warning;
    private String error;

    private List<Reminder> reminders;

    public RemindersListResponse() {
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

    public List<Reminder> getReminders() {
        return this.reminders;
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

    public void setReminders(List<Reminder> reminders) {
        this.reminders = reminders;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof RemindersListResponse)) return false;
        final RemindersListResponse other = (RemindersListResponse) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.isOk() != other.isOk()) return false;
        final Object this$warning = this.getWarning();
        final Object other$warning = other.getWarning();
        if (this$warning == null ? other$warning != null : !this$warning.equals(other$warning)) return false;
        final Object this$error = this.getError();
        final Object other$error = other.getError();
        if (this$error == null ? other$error != null : !this$error.equals(other$error)) return false;
        final Object this$reminders = this.getReminders();
        final Object other$reminders = other.getReminders();
        if (this$reminders == null ? other$reminders != null : !this$reminders.equals(other$reminders)) return false;
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
        final Object $reminders = this.getReminders();
        result = result * PRIME + ($reminders == null ? 43 : $reminders.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof RemindersListResponse;
    }

    public String toString() {
        return "RemindersListResponse(ok=" + this.isOk() + ", warning=" + this.getWarning() + ", error=" + this.getError() + ", reminders=" + this.getReminders() + ")";
    }
}