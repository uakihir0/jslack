package com.github.seratch.jslack.api.model.event;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * The subteam_created event is sent to all connections for a workspace when a new User Group is created.
 * Clients can use this to update their local list of User Groups and group members.
 * <p>
 * https://api.slack.com/events/subteam_created
 */
public class SubteamCreatedEvent implements Event {

    public static final String TYPE_NAME = "subteam_created";

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