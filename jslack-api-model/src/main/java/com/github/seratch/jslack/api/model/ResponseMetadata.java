package com.github.seratch.jslack.api.model;

import com.google.gson.annotations.SerializedName;

/**
 * An attribute included within the response of the newest Slack APIs which contains a {@code next_cursor}
 * value.  By using this value as a cursor parameter in a subsequent request, along with limit, you may
 * navigate through the collection page by virtual page.
 */
public class ResponseMetadata {

    @SerializedName("next_cursor")
    private String nextCursor;

    public ResponseMetadata() {
    }

    public String getNextCursor() {
        return this.nextCursor;
    }

    public void setNextCursor(String nextCursor) {
        this.nextCursor = nextCursor;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ResponseMetadata)) return false;
        final ResponseMetadata other = (ResponseMetadata) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$nextCursor = this.getNextCursor();
        final Object other$nextCursor = other.getNextCursor();
        if (this$nextCursor == null ? other$nextCursor != null : !this$nextCursor.equals(other$nextCursor))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ResponseMetadata;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $nextCursor = this.getNextCursor();
        result = result * PRIME + ($nextCursor == null ? 43 : $nextCursor.hashCode());
        return result;
    }

    public String toString() {
        return "ResponseMetadata(nextCursor=" + this.getNextCursor() + ")";
    }
}
