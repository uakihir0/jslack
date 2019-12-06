package com.github.seratch.jslack.api.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * https://api.slack.com/types/usergroup
 */
public class Usergroup {

    private String id;
    private String teamId;
    private String enterpriseSubteamId;
    @SerializedName("is_usergroup")
    private boolean usergroup;
    @SerializedName("is_subteam")
    private boolean subteam;
    private String name;
    private String description;
    private String handle;
    @SerializedName("is_external")
    private boolean external;
    private boolean autoProvision;
    private Integer dateCreate;
    private Integer dateUpdate;
    private Integer dateDelete;
    private String autoType;
    private String createdBy;
    private String updatedBy;
    private String deletedBy;
    private Prefs prefs;
    private List<String> users;
    private Integer userCount;

    public Usergroup(String id, String teamId, String enterpriseSubteamId, boolean usergroup, boolean subteam, String name, String description, String handle, boolean external, boolean autoProvision, Integer dateCreate, Integer dateUpdate, Integer dateDelete, String autoType, String createdBy, String updatedBy, String deletedBy, Prefs prefs, List<String> users, Integer userCount) {
        this.id = id;
        this.teamId = teamId;
        this.enterpriseSubteamId = enterpriseSubteamId;
        this.usergroup = usergroup;
        this.subteam = subteam;
        this.name = name;
        this.description = description;
        this.handle = handle;
        this.external = external;
        this.autoProvision = autoProvision;
        this.dateCreate = dateCreate;
        this.dateUpdate = dateUpdate;
        this.dateDelete = dateDelete;
        this.autoType = autoType;
        this.createdBy = createdBy;
        this.updatedBy = updatedBy;
        this.deletedBy = deletedBy;
        this.prefs = prefs;
        this.users = users;
        this.userCount = userCount;
    }

    public Usergroup() {
    }

    public static UsergroupBuilder builder() {
        return new UsergroupBuilder();
    }

    public String getId() {
        return this.id;
    }

    public String getTeamId() {
        return this.teamId;
    }

    public String getEnterpriseSubteamId() {
        return this.enterpriseSubteamId;
    }

    public boolean isUsergroup() {
        return this.usergroup;
    }

    public boolean isSubteam() {
        return this.subteam;
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

    public boolean isAutoProvision() {
        return this.autoProvision;
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

    public Integer getUserCount() {
        return this.userCount;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    public void setEnterpriseSubteamId(String enterpriseSubteamId) {
        this.enterpriseSubteamId = enterpriseSubteamId;
    }

    public void setUsergroup(boolean usergroup) {
        this.usergroup = usergroup;
    }

    public void setSubteam(boolean subteam) {
        this.subteam = subteam;
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

    public void setAutoProvision(boolean autoProvision) {
        this.autoProvision = autoProvision;
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

    public void setUserCount(Integer userCount) {
        this.userCount = userCount;
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

    public static class UsergroupBuilder {
        private String id;
        private String teamId;
        private String enterpriseSubteamId;
        private boolean usergroup;
        private boolean subteam;
        private String name;
        private String description;
        private String handle;
        private boolean external;
        private boolean autoProvision;
        private Integer dateCreate;
        private Integer dateUpdate;
        private Integer dateDelete;
        private String autoType;
        private String createdBy;
        private String updatedBy;
        private String deletedBy;
        private Prefs prefs;
        private List<String> users;
        private Integer userCount;

        UsergroupBuilder() {
        }

        public Usergroup.UsergroupBuilder id(String id) {
            this.id = id;
            return this;
        }

        public Usergroup.UsergroupBuilder teamId(String teamId) {
            this.teamId = teamId;
            return this;
        }

        public Usergroup.UsergroupBuilder enterpriseSubteamId(String enterpriseSubteamId) {
            this.enterpriseSubteamId = enterpriseSubteamId;
            return this;
        }

        public Usergroup.UsergroupBuilder usergroup(boolean usergroup) {
            this.usergroup = usergroup;
            return this;
        }

        public Usergroup.UsergroupBuilder subteam(boolean subteam) {
            this.subteam = subteam;
            return this;
        }

        public Usergroup.UsergroupBuilder name(String name) {
            this.name = name;
            return this;
        }

        public Usergroup.UsergroupBuilder description(String description) {
            this.description = description;
            return this;
        }

        public Usergroup.UsergroupBuilder handle(String handle) {
            this.handle = handle;
            return this;
        }

        public Usergroup.UsergroupBuilder external(boolean external) {
            this.external = external;
            return this;
        }

        public Usergroup.UsergroupBuilder autoProvision(boolean autoProvision) {
            this.autoProvision = autoProvision;
            return this;
        }

        public Usergroup.UsergroupBuilder dateCreate(Integer dateCreate) {
            this.dateCreate = dateCreate;
            return this;
        }

        public Usergroup.UsergroupBuilder dateUpdate(Integer dateUpdate) {
            this.dateUpdate = dateUpdate;
            return this;
        }

        public Usergroup.UsergroupBuilder dateDelete(Integer dateDelete) {
            this.dateDelete = dateDelete;
            return this;
        }

        public Usergroup.UsergroupBuilder autoType(String autoType) {
            this.autoType = autoType;
            return this;
        }

        public Usergroup.UsergroupBuilder createdBy(String createdBy) {
            this.createdBy = createdBy;
            return this;
        }

        public Usergroup.UsergroupBuilder updatedBy(String updatedBy) {
            this.updatedBy = updatedBy;
            return this;
        }

        public Usergroup.UsergroupBuilder deletedBy(String deletedBy) {
            this.deletedBy = deletedBy;
            return this;
        }

        public Usergroup.UsergroupBuilder prefs(Prefs prefs) {
            this.prefs = prefs;
            return this;
        }

        public Usergroup.UsergroupBuilder users(List<String> users) {
            this.users = users;
            return this;
        }

        public Usergroup.UsergroupBuilder userCount(Integer userCount) {
            this.userCount = userCount;
            return this;
        }

        public Usergroup build() {
            return new Usergroup(id, teamId, enterpriseSubteamId, usergroup, subteam, name, description, handle, external, autoProvision, dateCreate, dateUpdate, dateDelete, autoType, createdBy, updatedBy, deletedBy, prefs, users, userCount);
        }

        public String toString() {
            return "Usergroup.UsergroupBuilder(id=" + this.id + ", teamId=" + this.teamId + ", enterpriseSubteamId=" + this.enterpriseSubteamId + ", usergroup=" + this.usergroup + ", subteam=" + this.subteam + ", name=" + this.name + ", description=" + this.description + ", handle=" + this.handle + ", external=" + this.external + ", autoProvision=" + this.autoProvision + ", dateCreate=" + this.dateCreate + ", dateUpdate=" + this.dateUpdate + ", dateDelete=" + this.dateDelete + ", autoType=" + this.autoType + ", createdBy=" + this.createdBy + ", updatedBy=" + this.updatedBy + ", deletedBy=" + this.deletedBy + ", prefs=" + this.prefs + ", users=" + this.users + ", userCount=" + this.userCount + ")";
        }
    }
}