package com.github.seratch.jslack.api.model.event;

/**
 * The subteam_self_removed event is sent to you when you have been removed to an existing User Group.
 * Clients can use this to update their local list of User Groups.
 * <p>
 * This event is not available to bot user subscriptions in the Events API.
 * <p>
 * https://api.slack.com/events/subteam_self_removed
 */
public class SubteamSelfRemovedEvent implements Event {

    public static final String TYPE_NAME = "subteam_self_removed";

    private final String type = TYPE_NAME;
    private String subteamId;

    public SubteamSelfRemovedEvent() {
    }

    public String getType() {
        return this.type;
    }

    public String getSubteamId() {
        return this.subteamId;
    }

    public void setSubteamId(String subteamId) {
        this.subteamId = subteamId;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof SubteamSelfRemovedEvent)) return false;
        final SubteamSelfRemovedEvent other = (SubteamSelfRemovedEvent) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$type = this.getType();
        final Object other$type = other.getType();
        if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
        final Object this$subteamId = this.getSubteamId();
        final Object other$subteamId = other.getSubteamId();
        if (this$subteamId == null ? other$subteamId != null : !this$subteamId.equals(other$subteamId)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof SubteamSelfRemovedEvent;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $type = this.getType();
        result = result * PRIME + ($type == null ? 43 : $type.hashCode());
        final Object $subteamId = this.getSubteamId();
        result = result * PRIME + ($subteamId == null ? 43 : $subteamId.hashCode());
        return result;
    }

    public String toString() {
        return "SubteamSelfRemovedEvent(type=" + this.getType() + ", subteamId=" + this.getSubteamId() + ")";
    }
}