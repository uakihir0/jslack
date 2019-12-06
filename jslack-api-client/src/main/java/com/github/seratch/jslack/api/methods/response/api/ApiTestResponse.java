package com.github.seratch.jslack.api.methods.response.api;

import com.github.seratch.jslack.api.methods.SlackApiResponse;

public class ApiTestResponse implements SlackApiResponse {
    public boolean isOk() {
        return this.ok;
    }

    public Args getArgs() {
        return this.args;
    }

    public String getWarning() {
        return this.warning;
    }

    public String getError() {
        return this.error;
    }

    public String getNeeded() {
        return this.needed;
    }

    public String getProvided() {
        return this.provided;
    }

    public void setOk(boolean ok) {
        this.ok = ok;
    }

    public void setArgs(Args args) {
        this.args = args;
    }

    public void setWarning(String warning) {
        this.warning = warning;
    }

    public void setError(String error) {
        this.error = error;
    }

    public void setNeeded(String needed) {
        this.needed = needed;
    }

    public void setProvided(String provided) {
        this.provided = provided;
    }

    public static class Args {
        private String foo;
        private String error;

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
    }

    private boolean ok;
    private Args args;
    private String warning;
    private String error;
    private String needed;
    private String provided;

}