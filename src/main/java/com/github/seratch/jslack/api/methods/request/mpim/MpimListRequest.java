package com.github.seratch.jslack.api.methods.request.mpim;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class MpimListRequest implements SlackApiRequest {

    private String token;

    @java.beans.ConstructorProperties({"token"})
    MpimListRequest(String token) {
        this.token = token;
    }

    public static MpimListRequestBuilder builder() {
        return new MpimListRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof MpimListRequest)) return false;
        final MpimListRequest other = (MpimListRequest) o;
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
        return other instanceof MpimListRequest;
    }

    public String toString() {
        return "MpimListRequest(token=" + this.getToken() + ")";
    }

    public static class MpimListRequestBuilder {
        private String token;

        MpimListRequestBuilder() {
        }

        public MpimListRequest.MpimListRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public MpimListRequest build() {
            return new MpimListRequest(token);
        }

        public String toString() {
            return "MpimListRequest.MpimListRequestBuilder(token=" + this.token + ")";
        }
    }
}