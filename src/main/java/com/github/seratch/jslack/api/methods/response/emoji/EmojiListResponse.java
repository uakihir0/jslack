package com.github.seratch.jslack.api.methods.response.emoji;

import com.github.seratch.jslack.api.methods.SlackApiResponse;

import java.util.Map;

public class EmojiListResponse implements SlackApiResponse {

    private boolean ok;
    private String warning;
    private String error;

    private Map<String, String> emoji;

    public EmojiListResponse() {
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

    public Map<String, String> getEmoji() {
        return this.emoji;
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

    public void setEmoji(Map<String, String> emoji) {
        this.emoji = emoji;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof EmojiListResponse)) return false;
        final EmojiListResponse other = (EmojiListResponse) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.isOk() != other.isOk()) return false;
        final Object this$warning = this.getWarning();
        final Object other$warning = other.getWarning();
        if (this$warning == null ? other$warning != null : !this$warning.equals(other$warning)) return false;
        final Object this$error = this.getError();
        final Object other$error = other.getError();
        if (this$error == null ? other$error != null : !this$error.equals(other$error)) return false;
        final Object this$emoji = this.getEmoji();
        final Object other$emoji = other.getEmoji();
        if (this$emoji == null ? other$emoji != null : !this$emoji.equals(other$emoji)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof EmojiListResponse;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + (this.isOk() ? 79 : 97);
        final Object $warning = this.getWarning();
        result = result * PRIME + ($warning == null ? 43 : $warning.hashCode());
        final Object $error = this.getError();
        result = result * PRIME + ($error == null ? 43 : $error.hashCode());
        final Object $emoji = this.getEmoji();
        result = result * PRIME + ($emoji == null ? 43 : $emoji.hashCode());
        return result;
    }

    public String toString() {
        return "EmojiListResponse(ok=" + this.isOk() + ", warning=" + this.getWarning() + ", error=" + this.getError() + ", emoji=" + this.getEmoji() + ")";
    }
}