package com.github.seratch.jslack.api.methods.response.dialog;

import com.github.seratch.jslack.api.methods.SlackApiResponse;
import com.github.seratch.jslack.api.model.dialog.DialogResponseMetadata;

public class DialogOpenResponse implements SlackApiResponse {

    private boolean ok;
    private String warning;
    private String error;
    private DialogResponseMetadata responseMetadata;

    public DialogOpenResponse() {
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

    public DialogResponseMetadata getResponseMetadata() {
        return this.responseMetadata;
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

    public void setResponseMetadata(DialogResponseMetadata responseMetadata) {
        this.responseMetadata = responseMetadata;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof DialogOpenResponse)) return false;
        final DialogOpenResponse other = (DialogOpenResponse) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.isOk() != other.isOk()) return false;
        final Object this$warning = this.getWarning();
        final Object other$warning = other.getWarning();
        if (this$warning == null ? other$warning != null : !this$warning.equals(other$warning)) return false;
        final Object this$error = this.getError();
        final Object other$error = other.getError();
        if (this$error == null ? other$error != null : !this$error.equals(other$error)) return false;
        final Object this$responseMetadata = this.getResponseMetadata();
        final Object other$responseMetadata = other.getResponseMetadata();
        if (this$responseMetadata == null ? other$responseMetadata != null : !this$responseMetadata.equals(other$responseMetadata))
            return false;
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
        final Object $responseMetadata = this.getResponseMetadata();
        result = result * PRIME + ($responseMetadata == null ? 43 : $responseMetadata.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof DialogOpenResponse;
    }

    public String toString() {
        return "DialogOpenResponse(ok=" + this.isOk() + ", warning=" + this.getWarning() + ", error=" + this.getError() + ", responseMetadata=" + this.getResponseMetadata() + ")";
    }
}
