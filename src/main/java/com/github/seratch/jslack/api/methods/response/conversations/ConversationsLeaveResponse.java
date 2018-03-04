package com.github.seratch.jslack.api.methods.response.conversations;

public class ConversationsLeaveResponse {

    private boolean ok;
    private String warning;
    private String error;

    private boolean notInChannel;

    public ConversationsLeaveResponse() {
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

    public boolean isNotInChannel() {
        return this.notInChannel;
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

    public void setNotInChannel(boolean notInChannel) {
        this.notInChannel = notInChannel;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof ConversationsLeaveResponse)) return false;
        final ConversationsLeaveResponse other = (ConversationsLeaveResponse) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.isOk() != other.isOk()) return false;
        final Object this$warning = this.getWarning();
        final Object other$warning = other.getWarning();
        if (this$warning == null ? other$warning != null : !this$warning.equals(other$warning)) return false;
        final Object this$error = this.getError();
        final Object other$error = other.getError();
        if (this$error == null ? other$error != null : !this$error.equals(other$error)) return false;
        if (this.isNotInChannel() != other.isNotInChannel()) return false;
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
        result = result * PRIME + (this.isNotInChannel() ? 79 : 97);
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof ConversationsLeaveResponse;
    }

    public String toString() {
        return "ConversationsLeaveResponse(ok=" + this.isOk() + ", warning=" + this.getWarning() + ", error=" + this.getError() + ", notInChannel=" + this.isNotInChannel() + ")";
    }
}
