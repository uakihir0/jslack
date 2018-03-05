package com.github.seratch.jslack.api.methods.request.api;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class ApiTestRequest implements SlackApiRequest {

    private String foo;
    private String error;

    ApiTestRequest(String foo, String error) {
        this.foo = foo;
        this.error = error;
    }

    public static ApiTestRequestBuilder builder() {
        return new ApiTestRequestBuilder();
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

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof ApiTestRequest)) return false;
        final ApiTestRequest other = (ApiTestRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$foo = this.getFoo();
        final Object other$foo = other.getFoo();
        if (this$foo == null ? other$foo != null : !this$foo.equals(other$foo)) return false;
        final Object this$error = this.getError();
        final Object other$error = other.getError();
        if (this$error == null ? other$error != null : !this$error.equals(other$error)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $foo = this.getFoo();
        result = result * PRIME + ($foo == null ? 43 : $foo.hashCode());
        final Object $error = this.getError();
        result = result * PRIME + ($error == null ? 43 : $error.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof ApiTestRequest;
    }

    public String toString() {
        return "ApiTestRequest(foo=" + this.getFoo() + ", error=" + this.getError() + ")";
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