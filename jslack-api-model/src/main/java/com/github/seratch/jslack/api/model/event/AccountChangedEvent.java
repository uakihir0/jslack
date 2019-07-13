package com.github.seratch.jslack.api.model.event;

/**
 * The list of accounts a user is signed into has changed
 * <p>
 * The accounts_changed event is used by our web client
 * to maintain a list of logged-in accounts.
 * Other clients should ignore this event.
 * <p>
 * https://api.slack.com/events/accounts_changed
 */
public class AccountChangedEvent implements Event {

    public static final String TYPE_NAME = "accounts_changed";

    private final String type = TYPE_NAME;

    public AccountChangedEvent() {
    }

    public String getType() {
        return this.type;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof AccountChangedEvent)) return false;
        final AccountChangedEvent other = (AccountChangedEvent) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$type = this.getType();
        final Object other$type = other.getType();
        if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof AccountChangedEvent;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $type = this.getType();
        result = result * PRIME + ($type == null ? 43 : $type.hashCode());
        return result;
    }

    public String toString() {
        return "AccountChangedEvent(type=" + this.getType() + ")";
    }
}