package com.github.seratch.jslack.api.methods.request.im;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class ImListRequest implements SlackApiRequest {

    private String token;

    @java.beans.ConstructorProperties({"token"})
    ImListRequest(String token) {
        this.token = token;
    }

    public static ImListRequestBuilder builder() {
        return new ImListRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof ImListRequest)) return false;
        final ImListRequest other = (ImListRequest) o;
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
        return other instanceof ImListRequest;
    }

    public String toString() {
        return "ImListRequest(token=" + this.getToken() + ")";
    }

    public static class ImListRequestBuilder {
        private String token;

        ImListRequestBuilder() {
        }

        public ImListRequest.ImListRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public ImListRequest build() {
            return new ImListRequest(token);
        }

        public String toString() {
            return "ImListRequest.ImListRequestBuilder(token=" + this.token + ")";
        }
    }
}