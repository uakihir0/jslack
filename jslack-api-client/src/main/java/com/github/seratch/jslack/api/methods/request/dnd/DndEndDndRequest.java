package com.github.seratch.jslack.api.methods.request.dnd;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class DndEndDndRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `dnd:write`
     */
    private String token;

    DndEndDndRequest(String token) {
        this.token = token;
    }

    public static DndEndDndRequestBuilder builder() {
        return new DndEndDndRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public static class DndEndDndRequestBuilder {
        private String token;

        DndEndDndRequestBuilder() {
        }

        public DndEndDndRequest.DndEndDndRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public DndEndDndRequest build() {
            return new DndEndDndRequest(token);
        }

        public String toString() {
            return "DndEndDndRequest.DndEndDndRequestBuilder(token=" + this.token + ")";
        }
    }
}