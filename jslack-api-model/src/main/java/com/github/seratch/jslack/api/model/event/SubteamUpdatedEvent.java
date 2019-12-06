package com.github.seratch.jslack.api.model.event;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * The subteam_updated event is sent to all connections for a workspace when an existing User Group is updated.
 * This event is triggered for changes to the User Group information (name, description, or handle)
 * as well as the members of the group.
 * <p>
 * Clients can use this to update their local list of groups and group members.
 * The users field is truncated at 500, however the user_count field will still show the actual count.
 * <p>
 * If you are only interested in User Group membership changes, consider using the subteam_members_changed event instead.
 * <p>
 * This event type may also arise when a subteam has been disabled.
 * <p>
 * https://api.slack.com/events/subteam_updated
 */
public class SubteamUpdatedEvent implements Event {

    public static final String TYPE_NAME = "subteam_updated";

    private final String type = TYPE_NAME;
    private Subteam subteam;

    public String getType() {
        return this.type;
    }

    public Subteam getSubteam() {
        return this.subteam;
    }

    public void setSubteam(Subteam subteam) {
        this.subteam = subteam;
    }

    public static class Subteam {
        private String id;
        private String teamId;
        @SerializedName("is_usergroup")
        private boolean usergroup;
        private String name;
        private String description;
        private String handle;
        @SerializedName("is_external")
        private boolean external;
        private Integer dateCreate;
        private Integer dateUpdate;
        private Integer dateDelete;
        private String autoType;
        private String createdBy;
        private String updatedBy;
        private String deletedBy;
        private Prefs prefs;
        private List<String> users;
        private String userCount;

        public String getId() {
            return this.id;
        }

        public String getTeamId() {
            return this.teamId;
        }

        public boolean isUsergroup() {
            return this.usergroup;
        }

        public String getName() {
            return this.name;
        }

        public String getDescription() {
            return this.description;
        }

        public String getHandle() {
            return this.handle;
        }

        public boolean isExternal() {
            return this.external;
        }

        public Integer getDateCreate() {
            return this.dateCreate;
        }

        public Integer getDateUpdate() {
            return this.dateUpdate;
        }

        public Integer getDateDelete() {
            return this.dateDelete;
        }

        public String getAutoType() {
            return this.autoType;
        }

        public String getCreatedBy() {
            return this.createdBy;
        }

        public String getUpdatedBy() {
            return this.updatedBy;
        }

        public String getDeletedBy() {
            return this.deletedBy;
        }

        public Prefs getPrefs() {
            return this.prefs;
        }

        public List<String> getUsers() {
            return this.users;
        }

        public String getUserCount() {
            return this.userCount;
        }

        public void setId(String id) {
            this.id = id;
        }

        public void setTeamId(String teamId) {
            this.teamId = teamId;
        }

        public void setUsergroup(boolean usergroup) {
            this.usergroup = usergroup;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public void setHandle(String handle) {
            this.handle = handle;
        }

        public void setExternal(boolean external) {
            this.external = external;
        }

        public void setDateCreate(Integer dateCreate) {
            this.dateCreate = dateCreate;
        }

        public void setDateUpdate(Integer dateUpdate) {
            this.dateUpdate = dateUpdate;
        }

        public void setDateDelete(Integer dateDelete) {
            this.dateDelete = dateDelete;
        }

        public void setAutoType(String autoType) {
            this.autoType = autoType;
        }

        public void setCreatedBy(String createdBy) {
            this.createdBy = createdBy;
        }

        public void setUpdatedBy(String updatedBy) {
            this.updatedBy = updatedBy;
        }

        public void setDeletedBy(String deletedBy) {
            this.deletedBy = deletedBy;
        }

        public void setPrefs(Prefs prefs) {
            this.prefs = prefs;
        }

        public void setUsers(List<String> users) {
            this.users = users;
        }

        public void setUserCount(String userCount) {
            this.userCount = userCount;
        }
    }

    public static class Prefs {
        private List<String> channels;
        private List<String> groups;

        public List<String> getChannels() {
            return this.channels;
        }

        public List<String> getGroups() {
            return this.groups;
        }

        public void setChannels(List<String> channels) {
            this.channels = channels;
        }

        public void setGroups(List<String> groups) {
            this.groups = groups;
        }
    }

}