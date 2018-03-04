package com.github.seratch.jslack.api.methods.response.im;

import com.github.seratch.jslack.api.methods.SlackApiResponse;
import com.github.seratch.jslack.api.model.Im;

import java.util.List;

public class ImListResponse implements SlackApiResponse {

    private boolean ok;
    private String warning;
    private String error;

    private List<Im> ims;

    public ImListResponse() {
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

    public List<Im> getIms() {
        return this.ims;
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

    public void setIms(List<Im> ims) {
        this.ims = ims;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof ImListResponse)) return false;
        final ImListResponse other = (ImListResponse) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.isOk() != other.isOk()) return false;
        final Object this$warning = this.getWarning();
        final Object other$warning = other.getWarning();
        if (this$warning == null ? other$warning != null : !this$warning.equals(other$warning)) return false;
        final Object this$error = this.getError();
        final Object other$error = other.getError();
        if (this$error == null ? other$error != null : !this$error.equals(other$error)) return false;
        final Object this$ims = this.getIms();
        final Object other$ims = other.getIms();
        if (this$ims == null ? other$ims != null : !this$ims.equals(other$ims)) return false;
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
        final Object $ims = this.getIms();
        result = result * PRIME + ($ims == null ? 43 : $ims.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof ImListResponse;
    }

    public String toString() {
        return "ImListResponse(ok=" + this.isOk() + ", warning=" + this.getWarning() + ", error=" + this.getError() + ", ims=" + this.getIms() + ")";
    }
}