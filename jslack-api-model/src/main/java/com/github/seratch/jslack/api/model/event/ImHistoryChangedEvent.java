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

    public ImHistoryChangedEvent() {
    }

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

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ImHistoryChangedEvent)) return false;
        final ImHistoryChangedEvent other = (ImHistoryChangedEvent) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$type = this.getType();
        final Object other$type = other.getType();
        if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
        final Object this$latest = this.getLatest();
        final Object other$latest = other.getLatest();
        if (this$latest == null ? other$latest != null : !this$latest.equals(other$latest)) return false;
        final Object this$ts = this.getTs();
        final Object other$ts = other.getTs();
        if (this$ts == null ? other$ts != null : !this$ts.equals(other$ts)) return false;
        final Object this$eventTs = this.getEventTs();
        final Object other$eventTs = other.getEventTs();
        if (this$eventTs == null ? other$eventTs != null : !this$eventTs.equals(other$eventTs)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ImHistoryChangedEvent;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $type = this.getType();
        result = result * PRIME + ($type == null ? 43 : $type.hashCode());
        final Object $latest = this.getLatest();
        result = result * PRIME + ($latest == null ? 43 : $latest.hashCode());
        final Object $ts = this.getTs();
        result = result * PRIME + ($ts == null ? 43 : $ts.hashCode());
        final Object $eventTs = this.getEventTs();
        result = result * PRIME + ($eventTs == null ? 43 : $eventTs.hashCode());
        return result;
    }

    public String toString() {
        return "ImHistoryChangedEvent(type=" + this.getType() + ", latest=" + this.getLatest() + ", ts=" + this.getTs() + ", eventTs=" + this.getEventTs() + ")";
    }
}