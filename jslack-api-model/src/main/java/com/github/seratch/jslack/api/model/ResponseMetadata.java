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

    public String getNextCursor() {
        return this.nextCursor;
    }

    public void setNextCursor(String nextCursor) {
        this.nextCursor = nextCursor;
    }
}
