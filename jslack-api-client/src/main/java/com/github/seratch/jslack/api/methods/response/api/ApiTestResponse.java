package com.github.seratch.jslack.api.methods.response.api;

import com.github.seratch.jslack.api.methods.SlackApiResponse;

public class ApiTestResponse implements SlackApiResponse {
    public ApiTestResponse() {
    }

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

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ApiTestResponse)) return false;
        final ApiTestResponse other = (ApiTestResponse) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.isOk() != other.isOk()) return false;
        final Object this$args = this.getArgs();
        final Object other$args = other.getArgs();
        if (this$args == null ? other$args != null : !this$args.equals(other$args)) return false;
        final Object this$warning = this.getWarning();
        final Object other$warning = other.getWarning();
        if (this$warning == null ? other$warning != null : !this$warning.equals(other$warning)) return false;
        final Object this$error = this.getError();
        final Object other$error = other.getError();
        if (this$error == null ? other$error != null : !this$error.equals(other$error)) return false;
        final Object this$needed = this.getNeeded();
        final Object other$needed = other.getNeeded();
        if (this$needed == null ? other$needed != null : !this$needed.equals(other$needed)) return false;
        final Object this$provided = this.getProvided();
        final Object other$provided = other.getProvided();
        if (this$provided == null ? other$provided != null : !this$provided.equals(other$provided)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ApiTestResponse;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + (this.isOk() ? 79 : 97);
        final Object $args = this.getArgs();
        result = result * PRIME + ($args == null ? 43 : $args.hashCode());
        final Object $warning = this.getWarning();
        result = result * PRIME + ($warning == null ? 43 : $warning.hashCode());
        final Object $error = this.getError();
        result = result * PRIME + ($error == null ? 43 : $error.hashCode());
        final Object $needed = this.getNeeded();
        result = result * PRIME + ($needed == null ? 43 : $needed.hashCode());
        final Object $provided = this.getProvided();
        result = result * PRIME + ($provided == null ? 43 : $provided.hashCode());
        return result;
    }

    public String toString() {
        return "ApiTestResponse(ok=" + this.isOk() + ", args=" + this.getArgs() + ", warning=" + this.getWarning() + ", error=" + this.getError() + ", needed=" + this.getNeeded() + ", provided=" + this.getProvided() + ")";
    }

    public static class Args {
        private String foo;
        private String error;

        public Args() {
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

        public boolean equals(final Object o) {
            if (o == this) return true;
            if (!(o instanceof Args)) return false;
            final Args other = (Args) o;
            if (!other.canEqual((Object) this)) return false;
            final Object this$foo = this.getFoo();
            final Object other$foo = other.getFoo();
            if (this$foo == null ? other$foo != null : !this$foo.equals(other$foo)) return false;
            final Object this$error = this.getError();
            final Object other$error = other.getError();
            if (this$error == null ? other$error != null : !this$error.equals(other$error)) return false;
            return true;
        }

        protected boolean canEqual(final Object other) {
            return other instanceof Args;
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

        public String toString() {
            return "ApiTestResponse.Args(foo=" + this.getFoo() + ", error=" + this.getError() + ")";
        }
    }

    private boolean ok;
    private Args args;
    private String warning;
    private String error;
    private String needed;
    private String provided;

}