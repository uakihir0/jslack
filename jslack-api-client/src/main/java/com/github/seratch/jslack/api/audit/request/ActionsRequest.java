package com.github.seratch.jslack.api.audit.request;

import com.github.seratch.jslack.api.audit.AuditApiRequest;

public class ActionsRequest implements AuditApiRequest {
    private String token;

    ActionsRequest(String token) {
        this.token = token;
    }

    public static ActionsRequestBuilder builder() {
        return new ActionsRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public static class ActionsRequestBuilder {
        private String token;

        ActionsRequestBuilder() {
        }

        public ActionsRequest.ActionsRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public ActionsRequest build() {
            return new ActionsRequest(token);
        }

        public String toString() {
            return "ActionsRequest.ActionsRequestBuilder(token=" + this.token + ")";
        }
    }
}
