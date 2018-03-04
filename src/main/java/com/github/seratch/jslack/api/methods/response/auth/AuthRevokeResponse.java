package com.github.seratch.jslack.api.methods.response.auth;

import com.github.seratch.jslack.api.methods.SlackApiResponse;

public class AuthRevokeResponse implements SlackApiResponse {

    private boolean ok;
    private String warning;
    private String error;

    private boolean revoked;

    public AuthRevokeResponse() {
    }

    public boolean isOk() {
        return this.ok;
    }

    public String getWarning() {
        return this.warning;
    }

    public String getError() {
        return this.error;
    }

    public boolean isRevoked() {
        return this.revoked;
    }

    public void setOk(boolean ok) {
        this.ok = ok;
    }

    public void setWarning(String warning) {
        this.warning = warning;
    }

    public void setError(String error) {
        this.error = error;
    }

    public void setRevoked(boolean revoked) {
        this.revoked = revoked;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof AuthRevokeResponse)) return false;
        final AuthRevokeResponse other = (AuthRevokeResponse) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.isOk() != other.isOk()) return false;
        final Object this$warning = this.getWarning();
        final Object other$warning = other.getWarning();
        if (this$warning == null ? other$warning != null : !this$warning.equals(other$warning)) return false;
        final Object this$error = this.getError();
        final Object other$error = other.getError();
        if (this$error == null ? other$error != null : !this$error.equals(other$error)) return false;
        if (this.isRevoked() != other.isRevoked()) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + (this.isOk() ? 79 : 97);
        final Object $warning = this.getWarning();
        result = result * PRIME + ($warning == null ? 43 : $warning.hashCode());
        final Object $error = this.getError();
        result = result * PRIME + ($error == null ? 43 : $error.hashCode());
        result = result * PRIME + (this.isRevoked() ? 79 : 97);
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof AuthRevokeResponse;
    }

    public String toString() {
        return "AuthRevokeResponse(ok=" + this.isOk() + ", warning=" + this.getWarning() + ", error=" + this.getError() + ", revoked=" + this.isRevoked() + ")";
    }
}