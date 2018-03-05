package com.github.seratch.jslack.api.methods.request.dnd;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class DndEndDndRequest implements SlackApiRequest {

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

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof DndEndDndRequest)) return false;
        final DndEndDndRequest other = (DndEndDndRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$token = this.getToken();
        final Object other$token = other.getToken();
        if (this$token == null ? other$token != null : !this$token.equals(other$token)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $token = this.getToken();
        result = result * PRIME + ($token == null ? 43 : $token.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof DndEndDndRequest;
    }

    public String toString() {
        return "DndEndDndRequest(token=" + this.getToken() + ")";
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