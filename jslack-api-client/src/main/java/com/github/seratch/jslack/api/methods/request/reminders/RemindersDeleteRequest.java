package com.github.seratch.jslack.api.methods.request.reminders;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class RemindersDeleteRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `reminders:write`
     */
    private String token;

    /**
     * The ID of the reminder
     */
    private String reminder;

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