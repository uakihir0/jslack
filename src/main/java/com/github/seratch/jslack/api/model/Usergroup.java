package com.github.seratch.jslack.api.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * https://api.slack.com/types/usergroup
 */
public class Usergroup {

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
    private Integer userCount;

    @java.beans.ConstructorProperties({"id", "teamId", "usergroup", "name", "description", "handle", "external", "dateCreate", "dateUpdate", "dateDelete", "autoType", "createdBy", "updatedBy", "deletedBy", "prefs", "users", "userCount"})
    Usergroup(String id, String teamId, boolean usergroup, String name, String description, String handle, boolean external, Integer dateCreate, Integer dateUpdate, Integer dateDelete, String autoType, String createdBy, String updatedBy, String deletedBy, Prefs prefs, List<String> users, Integer userCount) {
        this.id = id;
        this.teamId = teamId;
        this.usergroup = usergroup;
        this.name = name;
        this.description = description;
        this.handle = handle;
        this.external = external;
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

    public static UsergroupBuilder builder() {
        return new UsergroupBuilder();
    }

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

    public Integer getUserCount() {
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

    public void setUserCount(Integer userCount) {
        this.userCount = userCount;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Usergroup)) return false;
        final Usergroup other = (Usergroup) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$teamId = this.getTeamId();
        final Object other$teamId = other.getTeamId();
        if (this$teamId == null ? other$teamId != null : !this$teamId.equals(other$teamId)) return false;
        if (this.isUsergroup() != other.isUsergroup()) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        final Object this$description = this.getDescription();
        final Object other$description = other.getDescription();
        if (this$description == null ? other$description != null : !this$description.equals(other$description))
            return false;
        final Object this$handle = this.getHandle();
        final Object other$handle = other.getHandle();
        if (this$handle == null ? other$handle != null : !this$handle.equals(other$handle)) return false;
        if (this.isExternal() != other.isExternal()) return false;
        final Object this$dateCreate = this.getDateCreate();
        final Object other$dateCreate = other.getDateCreate();
        if (this$dateCreate == null ? other$dateCreate != null : !this$dateCreate.equals(other$dateCreate))
            return false;
        final Object this$dateUpdate = this.getDateUpdate();
        final Object other$dateUpdate = other.getDateUpdate();
        if (this$dateUpdate == null ? other$dateUpdate != null : !this$dateUpdate.equals(other$dateUpdate))
            return false;
        final Object this$dateDelete = this.getDateDelete();
        final Object other$dateDelete = other.getDateDelete();
        if (this$dateDelete == null ? other$dateDelete != null : !this$dateDelete.equals(other$dateDelete))
            return false;
        final Object this$autoType = this.getAutoType();
        final Object other$autoType = other.getAutoType();
        if (this$autoType == null ? other$autoType != null : !this$autoType.equals(other$autoType)) return false;
        final Object this$createdBy = this.getCreatedBy();
        final Object other$createdBy = other.getCreatedBy();
        if (this$createdBy == null ? other$createdBy != null : !this$createdBy.equals(other$createdBy)) return false;
        final Object this$updatedBy = this.getUpdatedBy();
        final Object other$updatedBy = other.getUpdatedBy();
        if (this$updatedBy == null ? other$updatedBy != null : !this$updatedBy.equals(other$updatedBy)) return false;
        final Object this$deletedBy = this.getDeletedBy();
        final Object other$deletedBy = other.getDeletedBy();
        if (this$deletedBy == null ? other$deletedBy != null : !this$deletedBy.equals(other$deletedBy)) return false;
        final Object this$prefs = this.getPrefs();
        final Object other$prefs = other.getPrefs();
        if (this$prefs == null ? other$prefs != null : !this$prefs.equals(other$prefs)) return false;
        final Object this$users = this.getUsers();
        final Object other$users = other.getUsers();
        if (this$users == null ? other$users != null : !this$users.equals(other$users)) return false;
        final Object this$userCount = this.getUserCount();
        final Object other$userCount = other.getUserCount();
        if (this$userCount == null ? other$userCount != null : !this$userCount.equals(other$userCount)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $teamId = this.getTeamId();
        result = result * PRIME + ($teamId == null ? 43 : $teamId.hashCode());
        result = result * PRIME + (this.isUsergroup() ? 79 : 97);
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        final Object $description = this.getDescription();
        result = result * PRIME + ($description == null ? 43 : $description.hashCode());
        final Object $handle = this.getHandle();
        result = result * PRIME + ($handle == null ? 43 : $handle.hashCode());
        result = result * PRIME + (this.isExternal() ? 79 : 97);
        final Object $dateCreate = this.getDateCreate();
        result = result * PRIME + ($dateCreate == null ? 43 : $dateCreate.hashCode());
        final Object $dateUpdate = this.getDateUpdate();
        result = result * PRIME + ($dateUpdate == null ? 43 : $dateUpdate.hashCode());
        final Object $dateDelete = this.getDateDelete();
        result = result * PRIME + ($dateDelete == null ? 43 : $dateDelete.hashCode());
        final Object $autoType = this.getAutoType();
        result = result * PRIME + ($autoType == null ? 43 : $autoType.hashCode());
        final Object $createdBy = this.getCreatedBy();
        result = result * PRIME + ($createdBy == null ? 43 : $createdBy.hashCode());
        final Object $updatedBy = this.getUpdatedBy();
        result = result * PRIME + ($updatedBy == null ? 43 : $updatedBy.hashCode());
        final Object $deletedBy = this.getDeletedBy();
        result = result * PRIME + ($deletedBy == null ? 43 : $deletedBy.hashCode());
        final Object $prefs = this.getPrefs();
        result = result * PRIME + ($prefs == null ? 43 : $prefs.hashCode());
        final Object $users = this.getUsers();
        result = result * PRIME + ($users == null ? 43 : $users.hashCode());
        final Object $userCount = this.getUserCount();
        result = result * PRIME + ($userCount == null ? 43 : $userCount.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof Usergroup;
    }

    public String toString() {
        return "Usergroup(id=" + this.getId() + ", teamId=" + this.getTeamId() + ", usergroup=" + this.isUsergroup() + ", name=" + this.getName() + ", description=" + this.getDescription() + ", handle=" + this.getHandle() + ", external=" + this.isExternal() + ", dateCreate=" + this.getDateCreate() + ", dateUpdate=" + this.getDateUpdate() + ", dateDelete=" + this.getDateDelete() + ", autoType=" + this.getAutoType() + ", createdBy=" + this.getCreatedBy() + ", updatedBy=" + this.getUpdatedBy() + ", deletedBy=" + this.getDeletedBy() + ", prefs=" + this.getPrefs() + ", users=" + this.getUsers() + ", userCount=" + this.getUserCount() + ")";
    }

    public static class Prefs {
        private List<String> channels;
        private List<String> groups;

        public Prefs() {
        }

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

        public boolean equals(Object o) {
            if (o == this) return true;
            if (!(o instanceof Prefs)) return false;
            final Prefs other = (Prefs) o;
            if (!other.canEqual((Object) this)) return false;
            final Object this$channels = this.getChannels();
            final Object other$channels = other.getChannels();
            if (this$channels == null ? other$channels != null : !this$channels.equals(other$channels)) return false;
            final Object this$groups = this.getGroups();
            final Object other$groups = other.getGroups();
            if (this$groups == null ? other$groups != null : !this$groups.equals(other$groups)) return false;
            return true;
        }

        public int hashCode() {
            final int PRIME = 59;
            int result = 1;
            final Object $channels = this.getChannels();
            result = result * PRIME + ($channels == null ? 43 : $channels.hashCode());
            final Object $groups = this.getGroups();
            result = result * PRIME + ($groups == null ? 43 : $groups.hashCode());
            return result;
        }

        protected boolean canEqual(Object other) {
            return other instanceof Prefs;
        }

        public String toString() {
            return "Usergroup.Prefs(channels=" + this.getChannels() + ", groups=" + this.getGroups() + ")";
        }
    }

    public static class UsergroupBuilder {
        private String id;
        private String teamId;
        private boolean usergroup;
        private String name;
        private String description;
        private String handle;
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

        public Usergroup.UsergroupBuilder usergroup(boolean usergroup) {
            this.usergroup = usergroup;
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
            return new Usergroup(id, teamId, usergroup, name, description, handle, external, dateCreate, dateUpdate, dateDelete, autoType, createdBy, updatedBy, deletedBy, prefs, users, userCount);
        }

        public String toString() {
            return "Usergroup.UsergroupBuilder(id=" + this.id + ", teamId=" + this.teamId + ", usergroup=" + this.usergroup + ", name=" + this.name + ", description=" + this.description + ", handle=" + this.handle + ", external=" + this.external + ", dateCreate=" + this.dateCreate + ", dateUpdate=" + this.dateUpdate + ", dateDelete=" + this.dateDelete + ", autoType=" + this.autoType + ", createdBy=" + this.createdBy + ", updatedBy=" + this.updatedBy + ", deletedBy=" + this.deletedBy + ", prefs=" + this.prefs + ", users=" + this.users + ", userCount=" + this.userCount + ")";
        }
    }
}