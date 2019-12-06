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