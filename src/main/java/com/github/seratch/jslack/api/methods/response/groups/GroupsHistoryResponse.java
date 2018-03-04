package com.github.seratch.jslack.api.methods.response.groups;

import com.github.seratch.jslack.api.methods.SlackApiResponse;
import com.github.seratch.jslack.api.model.Message;

import java.util.List;

public class GroupsHistoryResponse implements SlackApiResponse {

    private boolean ok;
    private String warning;
    private String error;

    private String latest;
    private List<Message> messages;
    private boolean hasMore;

    public GroupsHistoryResponse() {
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

    public String getLatest() {
        return this.latest;
    }

    public List<Message> getMessages() {
        return this.messages;
    }

    public boolean isHasMore() {
        return this.hasMore;
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

    public void setLatest(String latest) {
        this.latest = latest;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    public void setHasMore(boolean hasMore) {
        this.hasMore = hasMore;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof GroupsHistoryResponse)) return false;
        final GroupsHistoryResponse other = (GroupsHistoryResponse) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.isOk() != other.isOk()) return false;
        final Object this$warning = this.getWarning();
        final Object other$warning = other.getWarning();
        if (this$warning == null ? other$warning != null : !this$warning.equals(other$warning)) return false;
        final Object this$error = this.getError();
        final Object other$error = other.getError();
        if (this$error == null ? other$error != null : !this$error.equals(other$error)) return false;
        final Object this$latest = this.getLatest();
        final Object other$latest = other.getLatest();
        if (this$latest == null ? other$latest != null : !this$latest.equals(other$latest)) return false;
        final Object this$messages = this.getMessages();
        final Object other$messages = other.getMessages();
        if (this$messages == null ? other$messages != null : !this$messages.equals(other$messages)) return false;
        if (this.isHasMore() != other.isHasMore()) return false;
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
        final Object $latest = this.getLatest();
        result = result * PRIME + ($latest == null ? 43 : $latest.hashCode());
        final Object $messages = this.getMessages();
        result = result * PRIME + ($messages == null ? 43 : $messages.hashCode());
        result = result * PRIME + (this.isHasMore() ? 79 : 97);
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof GroupsHistoryResponse;
    }

    public String toString() {
        return "GroupsHistoryResponse(ok=" + this.isOk() + ", warning=" + this.getWarning() + ", error=" + this.getError() + ", latest=" + this.getLatest() + ", messages=" + this.getMessages() + ", hasMore=" + this.isHasMore() + ")";
    }
}