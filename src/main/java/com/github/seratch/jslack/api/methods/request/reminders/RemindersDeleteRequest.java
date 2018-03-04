package com.github.seratch.jslack.api.methods.request.reminders;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class RemindersDeleteRequest implements SlackApiRequest {

    private String token;
    private String reminder;

    @java.beans.ConstructorProperties({"token", "reminder"})
    RemindersDeleteRequest(String token, String reminder) {
        this.token = token;
        this.reminder = reminder;
    }

    public static RemindersDeleteRequestBuilder builder() {
        return new RemindersDeleteRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public String getReminder() {
        return this.reminder;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setReminder(String reminder) {
        this.reminder = reminder;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof RemindersDeleteRequest)) return false;
        final RemindersDeleteRequest other = (RemindersDeleteRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$token = this.getToken();
        final Object other$token = other.getToken();
        if (this$token == null ? other$token != null : !this$token.equals(other$token)) return false;
        final Object this$reminder = this.getReminder();
        final Object other$reminder = other.getReminder();
        if (this$reminder == null ? other$reminder != null : !this$reminder.equals(other$reminder)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $token = this.getToken();
        result = result * PRIME + ($token == null ? 43 : $token.hashCode());
        final Object $reminder = this.getReminder();
        result = result * PRIME + ($reminder == null ? 43 : $reminder.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof RemindersDeleteRequest;
    }

    public String toString() {
        return "RemindersDeleteRequest(token=" + this.getToken() + ", reminder=" + this.getReminder() + ")";
    }

    public static class RemindersDeleteRequestBuilder {
        private String token;
        private String reminder;

        RemindersDeleteRequestBuilder() {
        }

        public RemindersDeleteRequest.RemindersDeleteRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public RemindersDeleteRequest.RemindersDeleteRequestBuilder reminder(String reminder) {
            this.reminder = reminder;
            return this;
        }

        public RemindersDeleteRequest build() {
            return new RemindersDeleteRequest(token, reminder);
        }

        public String toString() {
            return "RemindersDeleteRequest.RemindersDeleteRequestBuilder(token=" + this.token + ", reminder=" + this.reminder + ")";
        }
    }
}