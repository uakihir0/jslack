package com.github.seratch.jslack.api.model.event;

/**
 * A group_history_changed event is sent to all clients in a private channel when bulk changes have occurred to that group's history.
 * When clients receive this message they should reload chat history for the private channel
 * if they have any cached messages before latest.
 * <p>
 * https://api.slack.com/events/group_history_changed
 */
public class GroupHistoryChangedEvent implements Event {

    public static final String TYPE_NAME = "group_history_changed";

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