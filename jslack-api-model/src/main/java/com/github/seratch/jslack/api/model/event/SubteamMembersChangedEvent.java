package com.github.seratch.jslack.api.model.event;

import java.util.List;

/**
 * The subteam_members_changed event is sent to all connections for a workspace
 * when users are added or removed from an existing User Group.
 * Clients can use the timestamp information to detect if they are out of sync with the user list.
 * <p>
 * Unlike subteam_updated, this only shows the delta of added or removed members and does not include a snapshot of the User Group.
 * <p>
 * https://api.slack.com/events/subteam_members_changed
 */
public class SubteamMembersChangedEvent implements Event {

    public static final String TYPE_NAME = "subteam_members_changed";

    private final String type = TYPE_NAME;
    private String subteamId;
    private String teamId;
    private Integer datePreviousUpdate;
    private Integer dateUpdate;
    private List<String> addedUsers;
    private Integer addedUsersCount;
    private List<String> removedUsers;
    private Integer removedUsersCount;

    public SubteamMembersChangedEvent() {
    }

    public String getType() {
        return this.type;
    }

    public String getSubteamId() {
        return this.subteamId;
    }

    public String getTeamId() {
        return this.teamId;
    }

    public Integer getDatePreviousUpdate() {
        return this.datePreviousUpdate;
    }

    public Integer getDateUpdate() {
        return this.dateUpdate;
    }

    public List<String> getAddedUsers() {
        return this.addedUsers;
    }

    public Integer getAddedUsersCount() {
        return this.addedUsersCount;
    }

    public List<String> getRemovedUsers() {
        return this.removedUsers;
    }

    public Integer getRemovedUsersCount() {
        return this.removedUsersCount;
    }

    public void setSubteamId(String subteamId) {
        this.subteamId = subteamId;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    public void setDatePreviousUpdate(Integer datePreviousUpdate) {
        this.datePreviousUpdate = datePreviousUpdate;
    }

    public void setDateUpdate(Integer dateUpdate) {
        this.dateUpdate = dateUpdate;
    }

    public void setAddedUsers(List<String> addedUsers) {
        this.addedUsers = addedUsers;
    }

    public void setAddedUsersCount(Integer addedUsersCount) {
        this.addedUsersCount = addedUsersCount;
    }

    public void setRemovedUsers(List<String> removedUsers) {
        this.removedUsers = removedUsers;
    }

    public void setRemovedUsersCount(Integer removedUsersCount) {
        this.removedUsersCount = removedUsersCount;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof SubteamMembersChangedEvent)) return false;
        final SubteamMembersChangedEvent other = (SubteamMembersChangedEvent) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$type = this.getType();
        final Object other$type = other.getType();
        if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
        final Object this$subteamId = this.getSubteamId();
        final Object other$subteamId = other.getSubteamId();
        if (this$subteamId == null ? other$subteamId != null : !this$subteamId.equals(other$subteamId)) return false;
        final Object this$teamId = this.getTeamId();
        final Object other$teamId = other.getTeamId();
        if (this$teamId == null ? other$teamId != null : !this$teamId.equals(other$teamId)) return false;
        final Object this$datePreviousUpdate = this.getDatePreviousUpdate();
        final Object other$datePreviousUpdate = other.getDatePreviousUpdate();
        if (this$datePreviousUpdate == null ? other$datePreviousUpdate != null : !this$datePreviousUpdate.equals(other$datePreviousUpdate))
            return false;
        final Object this$dateUpdate = this.getDateUpdate();
        final Object other$dateUpdate = other.getDateUpdate();
        if (this$dateUpdate == null ? other$dateUpdate != null : !this$dateUpdate.equals(other$dateUpdate))
            return false;
        final Object this$addedUsers = this.getAddedUsers();
        final Object other$addedUsers = other.getAddedUsers();
        if (this$addedUsers == null ? other$addedUsers != null : !this$addedUsers.equals(other$addedUsers))
            return false;
        final Object this$addedUsersCount = this.getAddedUsersCount();
        final Object other$addedUsersCount = other.getAddedUsersCount();
        if (this$addedUsersCount == null ? other$addedUsersCount != null : !this$addedUsersCount.equals(other$addedUsersCount))
            return false;
        final Object this$removedUsers = this.getRemovedUsers();
        final Object other$removedUsers = other.getRemovedUsers();
        if (this$removedUsers == null ? other$removedUsers != null : !this$removedUsers.equals(other$removedUsers))
            return false;
        final Object this$removedUsersCount = this.getRemovedUsersCount();
        final Object other$removedUsersCount = other.getRemovedUsersCount();
        if (this$removedUsersCount == null ? other$removedUsersCount != null : !this$removedUsersCount.equals(other$removedUsersCount))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof SubteamMembersChangedEvent;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $type = this.getType();
        result = result * PRIME + ($type == null ? 43 : $type.hashCode());
        final Object $subteamId = this.getSubteamId();
        result = result * PRIME + ($subteamId == null ? 43 : $subteamId.hashCode());
        final Object $teamId = this.getTeamId();
        result = result * PRIME + ($teamId == null ? 43 : $teamId.hashCode());
        final Object $datePreviousUpdate = this.getDatePreviousUpdate();
        result = result * PRIME + ($datePreviousUpdate == null ? 43 : $datePreviousUpdate.hashCode());
        final Object $dateUpdate = this.getDateUpdate();
        result = result * PRIME + ($dateUpdate == null ? 43 : $dateUpdate.hashCode());
        final Object $addedUsers = this.getAddedUsers();
        result = result * PRIME + ($addedUsers == null ? 43 : $addedUsers.hashCode());
        final Object $addedUsersCount = this.getAddedUsersCount();
        result = result * PRIME + ($addedUsersCount == null ? 43 : $addedUsersCount.hashCode());
        final Object $removedUsers = this.getRemovedUsers();
        result = result * PRIME + ($removedUsers == null ? 43 : $removedUsers.hashCode());
        final Object $removedUsersCount = this.getRemovedUsersCount();
        result = result * PRIME + ($removedUsersCount == null ? 43 : $removedUsersCount.hashCode());
        return result;
    }

    public String toString() {
        return "SubteamMembersChangedEvent(type=" + this.getType() + ", subteamId=" + this.getSubteamId() + ", teamId=" + this.getTeamId() + ", datePreviousUpdate=" + this.getDatePreviousUpdate() + ", dateUpdate=" + this.getDateUpdate() + ", addedUsers=" + this.getAddedUsers() + ", addedUsersCount=" + this.getAddedUsersCount() + ", removedUsers=" + this.getRemovedUsers() + ", removedUsersCount=" + this.getRemovedUsersCount() + ")";
    }
}