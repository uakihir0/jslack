package com.github.seratch.jslack.api.audit.request;

import com.github.seratch.jslack.api.audit.AuditApiRequest;

public class SchemasRequest implements AuditApiRequest {
    private String token;

    SchemasRequest(String token) {
        this.token = token;
    }

    public static SchemasRequestBuilder builder() {
        return new SchemasRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public static class SchemasRequestBuilder {
        private String token;

        SchemasRequestBuilder() {
        }

        public SchemasRequest.SchemasRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public SchemasRequest build() {
            return new SchemasRequest(token);
        }

        public String toString() {
            return "SchemasRequest.SchemasRequestBuilder(token=" + this.token + ")";
        }
    }
}
