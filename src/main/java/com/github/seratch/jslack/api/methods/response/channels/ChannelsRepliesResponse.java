package com.github.seratch.jslack.api.methods.response.channels;

import com.github.seratch.jslack.api.methods.SlackApiResponse;
import com.github.seratch.jslack.api.model.Message;
import com.github.seratch.jslack.api.model.ThreadInfo;

import java.util.List;

public class ChannelsRepliesResponse implements SlackApiResponse {

    private boolean ok;
    private String warning;
    private String error;

    private List<Message> messages;
    private ThreadInfo threadInfo;

    public ChannelsRepliesResponse() {
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

    public List<Message> getMessages() {
        return this.messages;
    }

    public ThreadInfo getThreadInfo() {
        return this.threadInfo;
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

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    public void setThreadInfo(ThreadInfo threadInfo) {
        this.threadInfo = threadInfo;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof ChannelsRepliesResponse)) return false;
        final ChannelsRepliesResponse other = (ChannelsRepliesResponse) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.isOk() != other.isOk()) return false;
        final Object this$warning = this.getWarning();
        final Object other$warning = other.getWarning();
        if (this$warning == null ? other$warning != null : !this$warning.equals(other$warning)) return false;
        final Object this$error = this.getError();
        final Object other$error = other.getError();
        if (this$error == null ? other$error != null : !this$error.equals(other$error)) return false;
        final Object this$messages = this.getMessages();
        final Object other$messages = other.getMessages();
        if (this$messages == null ? other$messages != null : !this$messages.equals(other$messages)) return false;
        final Object this$threadInfo = this.getThreadInfo();
        final Object other$threadInfo = other.getThreadInfo();
        if (this$threadInfo == null ? other$threadInfo != null : !this$threadInfo.equals(other$threadInfo))
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
        final Object $messages = this.getMessages();
        result = result * PRIME + ($messages == null ? 43 : $messages.hashCode());
        final Object $threadInfo = this.getThreadInfo();
        result = result * PRIME + ($threadInfo == null ? 43 : $threadInfo.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof ChannelsRepliesResponse;
    }

    public String toString() {
        return "ChannelsRepliesResponse(ok=" + this.isOk() + ", warning=" + this.getWarning() + ", error=" + this.getError() + ", messages=" + this.getMessages() + ", threadInfo=" + this.getThreadInfo() + ")";
    }
}
