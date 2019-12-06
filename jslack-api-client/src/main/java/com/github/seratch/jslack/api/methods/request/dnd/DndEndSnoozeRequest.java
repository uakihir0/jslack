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