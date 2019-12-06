package com.github.seratch.jslack.api.methods.request.reminders;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class RemindersListRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `reminders:read`
     */
    private String token;

    RemindersListRequest(String token) {
        this.token = token;
    }

    public static RemindersListRequestBuilder builder() {
        return new RemindersListRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public static class RemindersListRequestBuilder {
        private String token;

        RemindersListRequestBuilder() {
        }

        public RemindersListRequest.RemindersListRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public RemindersListRequest build() {
            return new RemindersListRequest(token);
        }

        public String toString() {
            return "RemindersListRequest.RemindersListRequestBuilder(token=" + this.token + ")";
        }
    }
}