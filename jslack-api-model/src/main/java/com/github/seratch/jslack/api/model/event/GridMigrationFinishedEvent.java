package com.github.seratch.jslack.api.model.event;

/**
 * This Events API-only event is sent via subscription whenever your app is installed by completes migration to Enterprise Grid.
 * <p>
 * The example above details the complete Events API payload, including the event wrapper.
 * The team_id indicates which workspace is migrating.
 * <p>
 * By also subscribing to the grid_migration_started event, you'll receive notice when the migration began.
 * <p>
 * It's best to cease API and platform operations for a workspace during migration.
 * While duration varies workspace-to-workspace, expect an extended period of unavailability.
 * <p>
 * https://api.slack.com/events/grid_migration_finished
 */
public class GridMigrationFinishedEvent implements Event {

    public static final String TYPE_NAME = "grid_migration_finished";

    private final String type = TYPE_NAME;
    private String enterpriseId;

    public GridMigrationFinishedEvent() {
    }

    public String getType() {
        return this.type;
    }

    public String getEnterpriseId() {
        return this.enterpriseId;
    }

    public void setEnterpriseId(String enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof GridMigrationFinishedEvent)) return false;
        final GridMigrationFinishedEvent other = (GridMigrationFinishedEvent) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$type = this.getType();
        final Object other$type = other.getType();
        if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
        final Object this$enterpriseId = this.getEnterpriseId();
        final Object other$enterpriseId = other.getEnterpriseId();
        if (this$enterpriseId == null ? other$enterpriseId != null : !this$enterpriseId.equals(other$enterpriseId))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof GridMigrationFinishedEvent;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $type = this.getType();
        result = result * PRIME + ($type == null ? 43 : $type.hashCode());
        final Object $enterpriseId = this.getEnterpriseId();
        result = result * PRIME + ($enterpriseId == null ? 43 : $enterpriseId.hashCode());
        return result;
    }

    public String toString() {
        return "GridMigrationFinishedEvent(type=" + this.getType() + ", enterpriseId=" + this.getEnterpriseId() + ")";
    }
}