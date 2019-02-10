package com.github.seratch.jslack.api.methods.request.dnd;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class DndSetSnoozeRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `dnd:write`
     */
    private String token;

    /**
     * Number of minutes, from now, to snooze until.
     */
    private Integer numMinutes;

    @java.beans.ConstructorProperties({"token", "numMinutes"})
    DndSetSnoozeRequest(String token, Integer numMinutes) {
        this.token = token;
        this.numMinutes = numMinutes;
    }

    public static DndSetSnoozeRequestBuilder builder() {
        return new DndSetSnoozeRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public Integer getNumMinutes() {
        return this.numMinutes;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setNumMinutes(Integer numMinutes) {
        this.numMinutes = numMinutes;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof DndSetSnoozeRequest)) return false;
        final DndSetSnoozeRequest other = (DndSetSnoozeRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$token = this.getToken();
        final Object other$token = other.getToken();
        if (this$token == null ? other$token != null : !this$token.equals(other$token)) return false;
        final Object this$numMinutes = this.getNumMinutes();
        final Object other$numMinutes = other.getNumMinutes();
        if (this$numMinutes == null ? other$numMinutes != null : !this$numMinutes.equals(other$numMinutes))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof DndSetSnoozeRequest;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $token = this.getToken();
        result = result * PRIME + ($token == null ? 43 : $token.hashCode());
        final Object $numMinutes = this.getNumMinutes();
        result = result * PRIME + ($numMinutes == null ? 43 : $numMinutes.hashCode());
        return result;
    }

    public String toString() {
        return "DndSetSnoozeRequest(token=" + this.getToken() + ", numMinutes=" + this.getNumMinutes() + ")";
    }

    public static class DndSetSnoozeRequestBuilder {
        private String token;
        private Integer numMinutes;

        DndSetSnoozeRequestBuilder() {
        }

        public DndSetSnoozeRequest.DndSetSnoozeRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public DndSetSnoozeRequest.DndSetSnoozeRequestBuilder numMinutes(Integer numMinutes) {
            this.numMinutes = numMinutes;
            return this;
        }

        public DndSetSnoozeRequest build() {
            return new DndSetSnoozeRequest(token, numMinutes);
        }

        public String toString() {
            return "DndSetSnoozeRequest.DndSetSnoozeRequestBuilder(token=" + this.token + ", numMinutes=" + this.numMinutes + ")";
        }
    }
}