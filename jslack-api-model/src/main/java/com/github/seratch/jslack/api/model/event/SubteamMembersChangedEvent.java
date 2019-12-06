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
}