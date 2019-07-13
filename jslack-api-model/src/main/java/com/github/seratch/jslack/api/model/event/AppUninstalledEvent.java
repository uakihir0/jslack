package com.github.seratch.jslack.api.model.event;

/**
 * This Events API-only event is sent via subscription whenever a Slack app is completely uninstalled.
 * <p>
 * You should also receive tokens_revoked events for revoked tokens.
 * An app is not uninstalled until its final user and bot tokens are revoked.
 * <p>
 * The example above details the complete Events API payload, including the event wrapper.
 * The team_id indicates which workspace uninstalled the Slack app identified by api_app_id.
 * <p>
 * https://api.slack.com/events/app_uninstalled
 */
public class AppUninstalledEvent implements Event {

    public static final String TYPE_NAME = "app_uninstalled";

    private final String type = TYPE_NAME;

    public AppUninstalledEvent() {
    }

    public String getType() {
        return this.type;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof AppUninstalledEvent)) return false;
        final AppUninstalledEvent other = (AppUninstalledEvent) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$type = this.getType();
        final Object other$type = other.getType();
        if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof AppUninstalledEvent;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $type = this.getType();
        result = result * PRIME + ($type == null ? 43 : $type.hashCode());
        return result;
    }

    public String toString() {
        return "AppUninstalledEvent(type=" + this.getType() + ")";
    }
}