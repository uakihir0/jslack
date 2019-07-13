package com.github.seratch.jslack.api.model.event;

/**
 * The team_migration_started event is sent when a Slack workspace is about to be migrated between servers.
 * The websocket connection will close immediately after it is sent.
 * <p>
 * Occasionally we need to move Slack workspaces to a new server.
 * To avoid any data synchronization bugs or race conditions we disconnect all clients
 * from a workspace before starting this process. By the time a client has reconnected the process is usually complete,
 * so the impact is minimal.
 * <p>
 * When clients receive this event, immediately start a reconnection process by calling rtm.start again.
 * You may receive occasional migration_in_progress errors when re-calling rtm.start.
 * If this happens you should wait a few seconds and try again.
 * If the error continues you should wait longer before retrying, and so on.
 * <p>
 * https://api.slack.com/events/team_migration_started
 */
public class TeamMigrationStartedEvent implements Event {

    public static final String TYPE_NAME = "team_migration_started";

    private final String type = TYPE_NAME;

    public TeamMigrationStartedEvent() {
    }

    public String getType() {
        return this.type;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof TeamMigrationStartedEvent)) return false;
        final TeamMigrationStartedEvent other = (TeamMigrationStartedEvent) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$type = this.getType();
        final Object other$type = other.getType();
        if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof TeamMigrationStartedEvent;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $type = this.getType();
        result = result * PRIME + ($type == null ? 43 : $type.hashCode());
        return result;
    }

    public String toString() {
        return "TeamMigrationStartedEvent(type=" + this.getType() + ")";
    }
}