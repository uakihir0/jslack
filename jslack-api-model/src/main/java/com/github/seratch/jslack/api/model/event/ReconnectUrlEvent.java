package com.github.seratch.jslack.api.model.event;

/**
 * The reconnect_url event is currently unsupported and experimental.
 * <p>
 * https://api.slack.com/events/reconnect_url
 */
public class ReconnectUrlEvent implements Event {

    public static final String TYPE_NAME = "reconnect_url";

    private final String type = TYPE_NAME;

    public ReconnectUrlEvent() {
    }

    public String getType() {
        return this.type;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ReconnectUrlEvent)) return false;
        final ReconnectUrlEvent other = (ReconnectUrlEvent) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$type = this.getType();
        final Object other$type = other.getType();
        if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ReconnectUrlEvent;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $type = this.getType();
        result = result * PRIME + ($type == null ? 43 : $type.hashCode());
        return result;
    }

    public String toString() {
        return "ReconnectUrlEvent(type=" + this.getType() + ")";
    }
}