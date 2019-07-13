package com.github.seratch.jslack.api.model.event;

/**
 * The file_unshared event is sent when a file is unshared.
 * It is sent to all connected clients for all users that had permission to see the file.
 * The file property includes the file ID, as well as a top-level file_id.
 * To obtain additional information about the unshared file, use the files.info API method.
 * <p>
 * https://api.slack.com/events/goodbye
 */
public class GoodbyeEvent implements Event {

    public static final String TYPE_NAME = "goodbye";

    private final String type = TYPE_NAME;

    public GoodbyeEvent() {
    }

    public String getType() {
        return this.type;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof GoodbyeEvent)) return false;
        final GoodbyeEvent other = (GoodbyeEvent) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$type = this.getType();
        final Object other$type = other.getType();
        if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof GoodbyeEvent;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $type = this.getType();
        result = result * PRIME + ($type == null ? 43 : $type.hashCode());
        return result;
    }

    public String toString() {
        return "GoodbyeEvent(type=" + this.getType() + ")";
    }
}