package com.github.seratch.jslack.api.methods.request.dnd;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class DndEndSnoozeRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `dnd:write`
     */
    private String token;

    DndEndSnoozeRequest(String token) {
        this.token = token;
    }

    public static DndEndSnoozeRequestBuilder builder() {
        return new DndEndSnoozeRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof DndEndSnoozeRequest)) return false;
        final DndEndSnoozeRequest other = (DndEndSnoozeRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$token = this.getToken();
        final Object other$token = other.getToken();
        if (this$token == null ? other$token != null : !this$token.equals(other$token)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof DndEndSnoozeRequest;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $token = this.getToken();
        result = result * PRIME + ($token == null ? 43 : $token.hashCode());
        return result;
    }

    public String toString() {
        return "DndEndSnoozeRequest(token=" + this.getToken() + ")";
    }

    public static class DndEndSnoozeRequestBuilder {
        private String token;

        DndEndSnoozeRequestBuilder() {
        }

        public DndEndSnoozeRequest.DndEndSnoozeRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public DndEndSnoozeRequest build() {
            return new DndEndSnoozeRequest(token);
        }

        public String toString() {
            return "DndEndSnoozeRequest.DndEndSnoozeRequestBuilder(token=" + this.token + ")";
        }
    }
}