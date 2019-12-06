package com.github.seratch.jslack.api.model.event;

/**
 * A im_history_changed event is sent to all clients in a DM channel When bulk changes have occurred to that DM channel's history.
 * When clients receive this message they should reload chat history for the channel if they have any cached messages before latest.
 * <p>
 * These bulk changes may be the result of data importation or bulk action taken by an administrator.
 * <p>
 * https://api.slack.com/events/im_history_changed
 */
public class ImHistoryChangedEvent implements Event {

    public static final String TYPE_NAME = "im_history_changed";

    private final String type = TYPE_NAME;
    private String latest;
    private String ts;
    private String eventTs;

    public String getType() {
        return this.type;
    }

    public String getLatest() {
        return this.latest;
    }

    public String getTs() {
        return this.ts;
    }

    public String getEventTs() {
        return this.eventTs;
    }

    public void setLatest(String latest) {
        this.latest = latest;
    }

    public void setTs(String ts) {
        this.ts = ts;
    }

    public void setEventTs(String eventTs) {
        this.eventTs = eventTs;
    }
}