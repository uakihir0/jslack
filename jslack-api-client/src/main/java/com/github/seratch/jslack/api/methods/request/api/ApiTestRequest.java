package com.github.seratch.jslack.api.methods.request.api;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class ApiTestRequest implements SlackApiRequest {

    /**
     * example property to return
     */
    private String foo;

    /**
     * Error response to return
     */
    private String error;

    ApiTestRequest(String foo, String error) {
        this.foo = foo;
        this.error = error;
    }

    public static ApiTestRequestBuilder builder() {
        return new ApiTestRequestBuilder();
    }

    @Override
    public String getToken() {
        return null;
    }

    public String getFoo() {
        return this.foo;
    }

    public String getError() {
        return this.error;
    }

    public void setFoo(String foo) {
        this.foo = foo;
    }

    public void setError(String error) {
        this.error = error;
    }

    public static class ApiTestRequestBuilder {
        private String foo;
        private String error;

        ApiTestRequestBuilder() {
        }

        public ApiTestRequest.ApiTestRequestBuilder foo(String foo) {
            this.foo = foo;
            return this;
        }

        public ApiTestRequest.ApiTestRequestBuilder error(String error) {
            this.error = error;
            return this;
        }

        public ApiTestRequest build() {
            return new ApiTestRequest(foo, error);
        }

        public String toString() {
            return "ApiTestRequest.ApiTestRequestBuilder(foo=" + this.foo + ", error=" + this.error + ")";
        }
    }
}