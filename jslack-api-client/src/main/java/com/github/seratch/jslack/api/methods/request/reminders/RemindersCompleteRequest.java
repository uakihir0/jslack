package com.github.seratch.jslack.api.methods.request.reminders;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class RemindersCompleteRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `reminders:write`
     */
    private String token;

    /**
     * The ID of the reminder to be marked as complete
     */
    private String reminder;

    RemindersCompleteRequest(String token, String reminder) {
        this.token = token;
        this.reminder = reminder;
    }

    public static RemindersCompleteRequestBuilder builder() {
        return new RemindersCompleteRequestBuilder();
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

    public static class RemindersCompleteRequestBuilder {
        private String token;
        private String reminder;

        RemindersCompleteRequestBuilder() {
        }

        public RemindersCompleteRequest.RemindersCompleteRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public RemindersCompleteRequest.RemindersCompleteRequestBuilder reminder(String reminder) {
            this.reminder = reminder;
            return this;
        }

        public RemindersCompleteRequest build() {
            return new RemindersCompleteRequest(token, reminder);
        }

        public String toString() {
            return "RemindersCompleteRequest.RemindersCompleteRequestBuilder(token=" + this.token + ", reminder=" + this.reminder + ")";
        }
    }
}