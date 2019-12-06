package com.github.seratch.jslack.api.methods.request.reminders;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class RemindersAddRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `reminders:write`
     */
    private String token;

    /**
     * The content of the reminder
     */
    private String text;

    /**
     * When this reminder should happen: the Unix timestamp (up to five years from now),
     * the number of seconds until the reminder (if within 24 hours), or a natural language description
     * (Ex. \"in 15 minutes,\" or \"every Thursday\")
     */
    private String time;

    /**
     * The user who will receive the reminder. If no user is specified, the reminder will go to user who created it.
     */
    private String user;

    RemindersAddRequest(String token, String text, String time, String user) {
        this.token = token;
        this.text = text;
        this.time = time;
        this.user = user;
    }

    public static RemindersAddRequestBuilder builder() {
        return new RemindersAddRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public String getText() {
        return this.text;
    }

    public String getTime() {
        return this.time;
    }

    public String getUser() {
        return this.user;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public static class RemindersAddRequestBuilder {
        private String token;
        private String text;
        private String time;
        private String user;

        RemindersAddRequestBuilder() {
        }

        public RemindersAddRequest.RemindersAddRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public RemindersAddRequest.RemindersAddRequestBuilder text(String text) {
            this.text = text;
            return this;
        }

        public RemindersAddRequest.RemindersAddRequestBuilder time(String time) {
            this.time = time;
            return this;
        }

        public RemindersAddRequest.RemindersAddRequestBuilder user(String user) {
            this.user = user;
            return this;
        }

        public RemindersAddRequest build() {
            return new RemindersAddRequest(token, text, time, user);
        }

        public String toString() {
            return "RemindersAddRequest.RemindersAddRequestBuilder(token=" + this.token + ", text=" + this.text + ", time=" + this.time + ", user=" + this.user + ")";
        }
    }
}