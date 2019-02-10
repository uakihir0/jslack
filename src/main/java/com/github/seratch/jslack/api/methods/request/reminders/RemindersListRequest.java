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

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof RemindersListRequest)) return false;
        final RemindersListRequest other = (RemindersListRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$token = this.getToken();
        final Object other$token = other.getToken();
        if (this$token == null ? other$token != null : !this$token.equals(other$token)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof RemindersListRequest;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $token = this.getToken();
        result = result * PRIME + ($token == null ? 43 : $token.hashCode());
        return result;
    }

    public String toString() {
        return "RemindersListRequest(token=" + this.getToken() + ")";
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