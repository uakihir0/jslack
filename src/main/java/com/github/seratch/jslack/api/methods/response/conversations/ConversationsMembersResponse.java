package com.github.seratch.jslack.api.methods.response.conversations;

import com.github.seratch.jslack.api.model.ResponseMetadata;

import java.util.List;

public class ConversationsMembersResponse {

    private boolean ok;
    private String warning;
    private String error;

    private List<String> members;
    private ResponseMetadata responseMetadata;

    public ConversationsMembersResponse() {
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

    public List<String> getMembers() {
        return this.members;
    }

    public ResponseMetadata getResponseMetadata() {
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

    public void setMembers(List<String> members) {
        this.members = members;
    }

    public void setResponseMetadata(ResponseMetadata responseMetadata) {
        this.responseMetadata = responseMetadata;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof ConversationsMembersResponse)) return false;
        final ConversationsMembersResponse other = (ConversationsMembersResponse) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.isOk() != other.isOk()) return false;
        final Object this$warning = this.getWarning();
        final Object other$warning = other.getWarning();
        if (this$warning == null ? other$warning != null : !this$warning.equals(other$warning)) return false;
        final Object this$error = this.getError();
        final Object other$error = other.getError();
        if (this$error == null ? other$error != null : !this$error.equals(other$error)) return false;
        final Object this$members = this.getMembers();
        final Object other$members = other.getMembers();
        if (this$members == null ? other$members != null : !this$members.equals(other$members)) return false;
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
        final Object $members = this.getMembers();
        result = result * PRIME + ($members == null ? 43 : $members.hashCode());
        final Object $responseMetadata = this.getResponseMetadata();
        result = result * PRIME + ($responseMetadata == null ? 43 : $responseMetadata.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof ConversationsMembersResponse;
    }

    public String toString() {
        return "ConversationsMembersResponse(ok=" + this.isOk() + ", warning=" + this.getWarning() + ", error=" + this.getError() + ", members=" + this.getMembers() + ", responseMetadata=" + this.getResponseMetadata() + ")";
    }
}
