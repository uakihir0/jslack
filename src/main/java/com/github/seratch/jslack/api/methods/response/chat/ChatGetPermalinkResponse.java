package com.github.seratch.jslack.api.methods.response.chat;

import com.github.seratch.jslack.api.methods.SlackApiResponse;

public class ChatGetPermalinkResponse implements SlackApiResponse {

    private boolean ok;
    private String warning;
    private String error;

    private String channel;
    private String permalink;

    public ChatGetPermalinkResponse() {
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

    public String getPermalink() {
        return this.permalink;
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

    public void setPermalink(String permalink) {
        this.permalink = permalink;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof ChatGetPermalinkResponse)) return false;
        final ChatGetPermalinkResponse other = (ChatGetPermalinkResponse) o;
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
        final Object this$permalink = this.getPermalink();
        final Object other$permalink = other.getPermalink();
        if (this$permalink == null ? other$permalink != null : !this$permalink.equals(other$permalink)) return false;
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
        final Object $channel = this.getChannel();
        result = result * PRIME + ($channel == null ? 43 : $channel.hashCode());
        final Object $permalink = this.getPermalink();
        result = result * PRIME + ($permalink == null ? 43 : $permalink.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof ChatGetPermalinkResponse;
    }

    public String toString() {
        return "ChatGetPermalinkResponse(ok=" + this.isOk() + ", warning=" + this.getWarning() + ", error=" + this.getError() + ", channel=" + this.getChannel() + ", permalink=" + this.getPermalink() + ")";
    }
}
