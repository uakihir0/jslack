package com.github.seratch.jslack.api.model.event;

/**
 * The commands_changed event is sent to all connections for a workspace when a slash command for that workspace is added, removed or changed.
 * <p>
 * This functionality is only used by our web client.
 * The other APIs required to support slash command metadata are currently unstable.
 * Until they are released other clients should ignore this event.
 * <p>
 * https://api.slack.com/events/commands_changed
 */
public class CommandsChangedEvent implements Event {

    public static final String TYPE_NAME = "commands_changed";

    private final String type = TYPE_NAME;
    private String eventTs;

    public CommandsChangedEvent() {
    }

    public String getType() {
        return this.type;
    }

    public String getEventTs() {
        return this.eventTs;
    }

    public void setEventTs(String eventTs) {
        this.eventTs = eventTs;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof CommandsChangedEvent)) return false;
        final CommandsChangedEvent other = (CommandsChangedEvent) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$type = this.getType();
        final Object other$type = other.getType();
        if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
        final Object this$eventTs = this.getEventTs();
        final Object other$eventTs = other.getEventTs();
        if (this$eventTs == null ? other$eventTs != null : !this$eventTs.equals(other$eventTs)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof CommandsChangedEvent;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $type = this.getType();
        result = result * PRIME + ($type == null ? 43 : $type.hashCode());
        final Object $eventTs = this.getEventTs();
        result = result * PRIME + ($eventTs == null ? 43 : $eventTs.hashCode());
        return result;
    }

    public String toString() {
        return "CommandsChangedEvent(type=" + this.getType() + ", eventTs=" + this.getEventTs() + ")";
    }
}