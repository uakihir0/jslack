package com.github.seratch.jslack.api.model.event;

/**
 * The manual_presence_change event is sent to all connections for a user when that user manually updates their presence.
 * Clients can use this to update their local state.
 * <p>
 * https://api.slack.com/events/manual_presence_change
 */
public class ManualPresenceChangeEvent implements Event {

    public static final String TYPE_NAME = "manual_presence_change";

    private final String type = TYPE_NAME;
    private String presence;

    public ManualPresenceChangeEvent() {
    }

    public String getType() {
        return this.type;
    }

    public String getPresence() {
        return this.presence;
    }

    public void setPresence(String presence) {
        this.presence = presence;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ManualPresenceChangeEvent)) return false;
        final ManualPresenceChangeEvent other = (ManualPresenceChangeEvent) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$type = this.getType();
        final Object other$type = other.getType();
        if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
        final Object this$presence = this.getPresence();
        final Object other$presence = other.getPresence();
        if (this$presence == null ? other$presence != null : !this$presence.equals(other$presence)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ManualPresenceChangeEvent;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $type = this.getType();
        result = result * PRIME + ($type == null ? 43 : $type.hashCode());
        final Object $presence = this.getPresence();
        result = result * PRIME + ($presence == null ? 43 : $presence.hashCode());
        return result;
    }

    public String toString() {
        return "ManualPresenceChangeEvent(type=" + this.getType() + ", presence=" + this.getPresence() + ")";
    }
}