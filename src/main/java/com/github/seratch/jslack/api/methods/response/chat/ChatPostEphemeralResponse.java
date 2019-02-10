package com.github.seratch.jslack.api.methods.response.chat;

import com.github.seratch.jslack.api.methods.SlackApiResponse;

public class ChatPostEphemeralResponse implements SlackApiResponse {

    private boolean ok;
    private String warning;
    private String error;

    private String channel;
    private String messageTs;

    public ChatPostEphemeralResponse() {
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

    public String getChannel() {
        return this.channel;
    }

    public String getMessageTs() {
        return this.messageTs;
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

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public void setMessageTs(String messageTs) {
        this.messageTs = messageTs;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ChatPostEphemeralResponse)) return false;
        final ChatPostEphemeralResponse other = (ChatPostEphemeralResponse) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.isOk() != other.isOk()) return false;
        final Object this$warning = this.getWarning();
        final Object other$warning = other.getWarning();
        if (this$warning == null ? other$warning != null : !this$warning.equals(other$warning)) return false;
        final Object this$error = this.getError();
        final Object other$error = other.getError();
        if (this$error == null ? other$error != null : !this$error.equals(other$error)) return false;
        final Object this$channel = this.getChannel();
        final Object other$channel = other.getChannel();
        if (this$channel == null ? other$channel != null : !this$channel.equals(other$channel)) return false;
        final Object this$messageTs = this.getMessageTs();
        final Object other$messageTs = other.getMessageTs();
        if (this$messageTs == null ? other$messageTs != null : !this$messageTs.equals(other$messageTs)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ChatPostEphemeralResponse;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + (this.isOk() ? 79 : 97);
        final Object $warning = this.getWarning();
        result = result * PRIME + ($warning == null ? 43 : $warning.hashCode());
        final Object $error = this.getError();
        result = result * PRIME + ($error == null ? 43 : $error.hashCode());
        final Object $channel = this.getChannel();
        result = result * PRIME + ($channel == null ? 43 : $channel.hashCode());
        final Object $messageTs = this.getMessageTs();
        result = result * PRIME + ($messageTs == null ? 43 : $messageTs.hashCode());
        return result;
    }

    public String toString() {
        return "ChatPostEphemeralResponse(ok=" + this.isOk() + ", warning=" + this.getWarning() + ", error=" + this.getError() + ", channel=" + this.getChannel() + ", messageTs=" + this.getMessageTs() + ")";
    }
}