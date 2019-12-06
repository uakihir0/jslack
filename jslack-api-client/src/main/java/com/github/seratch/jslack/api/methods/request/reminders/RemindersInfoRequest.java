package com.github.seratch.jslack.api.methods.request.reminders;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class RemindersInfoRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `reminders:read`
     */
    private String token;

    /**
     * The ID of the reminder
     */
    private String reminder;

    RemindersInfoRequest(String token, String reminder) {
        this.token = token;
        this.reminder = reminder;
    }

    public static RemindersInfoRequestBuilder builder() {
        return new RemindersInfoRequestBuilder();
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

    public static class RemindersInfoRequestBuilder {
        private String token;
        private String reminder;

        RemindersInfoRequestBuilder() {
        }

        public RemindersInfoRequest.RemindersInfoRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public RemindersInfoRequest.RemindersInfoRequestBuilder reminder(String reminder) {
            this.reminder = reminder;
            return this;
        }

        public RemindersInfoRequest build() {
            return new RemindersInfoRequest(token, reminder);
        }

        public String toString() {
            return "RemindersInfoRequest.RemindersInfoRequestBuilder(token=" + this.token + ", reminder=" + this.reminder + ")";
        }
    }
}