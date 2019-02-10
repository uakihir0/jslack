package com.github.seratch.jslack.api.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * https://api.slack.com/types/group
 */
public class Group {

    private String id;
    private String name;
    @SerializedName("is_group")
    private boolean group;
    private Integer created;
    private String creator;
    @SerializedName("is_archived")
    private boolean archived;
    @SerializedName("is_mpim")
    private boolean mpim;
    private List<String> members;
    private Topic topic;
    private Purpose purpose;
    private String lastRead;
    private Latest latest;
    private Integer unreadCount;
    private Integer unreadCountDisplay;

    Group(String id, String name, boolean group, Integer created, String creator, boolean archived, boolean mpim, List<String> members, Topic topic, Purpose purpose, String lastRead, Latest latest, Integer unreadCount, Integer unreadCountDisplay) {
        this.id = id;
        this.name = name;
        this.group = group;
        this.created = created;
        this.creator = creator;
        this.archived = archived;
        this.mpim = mpim;
        this.members = members;
        this.topic = topic;
        this.purpose = purpose;
        this.lastRead = lastRead;
        this.latest = latest;
        this.unreadCount = unreadCount;
        this.unreadCountDisplay = unreadCountDisplay;
    }

    public static GroupBuilder builder() {
        return new GroupBuilder();
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public boolean isGroup() {
        return this.group;
    }

    public Integer getCreated() {
        return this.created;
    }

    public String getCreator() {
        return this.creator;
    }

    public boolean isArchived() {
        return this.archived;
    }

    public boolean isMpim() {
        return this.mpim;
    }

    public List<String> getMembers() {
        return this.members;
    }

    public Topic getTopic() {
        return this.topic;
    }

    public Purpose getPurpose() {
        return this.purpose;
    }

    public String getLastRead() {
        return this.lastRead;
    }

    public Latest getLatest() {
        return this.latest;
    }

    public Integer getUnreadCount() {
        return this.unreadCount;
    }

    public Integer getUnreadCountDisplay() {
        return this.unreadCountDisplay;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGroup(boolean group) {
        this.group = group;
    }

    public void setCreated(Integer created) {
        this.created = created;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public void setArchived(boolean archived) {
        this.archived = archived;
    }

    public void setMpim(boolean mpim) {
        this.mpim = mpim;
    }

    public void setMembers(List<String> members) {
        this.members = members;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }

    public void setPurpose(Purpose purpose) {
        this.purpose = purpose;
    }

    public void setLastRead(String lastRead) {
        this.lastRead = lastRead;
    }

    public void setLatest(Latest latest) {
        this.latest = latest;
    }

    public void setUnreadCount(Integer unreadCount) {
        this.unreadCount = unreadCount;
    }

    public void setUnreadCountDisplay(Integer unreadCountDisplay) {
        this.unreadCountDisplay = unreadCountDisplay;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Group)) return false;
        final Group other = (Group) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        if (this.isGroup() != other.isGroup()) return false;
        final Object this$created = this.getCreated();
        final Object other$created = other.getCreated();
        if (this$created == null ? other$created != null : !this$created.equals(other$created)) return false;
        final Object this$creator = this.getCreator();
        final Object other$creator = other.getCreator();
        if (this$creator == null ? other$creator != null : !this$creator.equals(other$creator)) return false;
        if (this.isArchived() != other.isArchived()) return false;
        if (this.isMpim() != other.isMpim()) return false;
        final Object this$members = this.getMembers();
        final Object other$members = other.getMembers();
        if (this$members == null ? other$members != null : !this$members.equals(other$members)) return false;
        final Object this$topic = this.getTopic();
        final Object other$topic = other.getTopic();
        if (this$topic == null ? other$topic != null : !this$topic.equals(other$topic)) return false;
        final Object this$purpose = this.getPurpose();
        final Object other$purpose = other.getPurpose();
        if (this$purpose == null ? other$purpose != null : !this$purpose.equals(other$purpose)) return false;
        final Object this$lastRead = this.getLastRead();
        final Object other$lastRead = other.getLastRead();
        if (this$lastRead == null ? other$lastRead != null : !this$lastRead.equals(other$lastRead)) return false;
        final Object this$latest = this.getLatest();
        final Object other$latest = other.getLatest();
        if (this$latest == null ? other$latest != null : !this$latest.equals(other$latest)) return false;
        final Object this$unreadCount = this.getUnreadCount();
        final Object other$unreadCount = other.getUnreadCount();
        if (this$unreadCount == null ? other$unreadCount != null : !this$unreadCount.equals(other$unreadCount))
            return false;
        final Object this$unreadCountDisplay = this.getUnreadCountDisplay();
        final Object other$unreadCountDisplay = other.getUnreadCountDisplay();
        if (this$unreadCountDisplay == null ? other$unreadCountDisplay != null : !this$unreadCountDisplay.equals(other$unreadCountDisplay))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Group;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        result = result * PRIME + (this.isGroup() ? 79 : 97);
        final Object $created = this.getCreated();
        result = result * PRIME + ($created == null ? 43 : $created.hashCode());
        final Object $creator = this.getCreator();
        result = result * PRIME + ($creator == null ? 43 : $creator.hashCode());
        result = result * PRIME + (this.isArchived() ? 79 : 97);
        result = result * PRIME + (this.isMpim() ? 79 : 97);
        final Object $members = this.getMembers();
        result = result * PRIME + ($members == null ? 43 : $members.hashCode());
        final Object $topic = this.getTopic();
        result = result * PRIME + ($topic == null ? 43 : $topic.hashCode());
        final Object $purpose = this.getPurpose();
        result = result * PRIME + ($purpose == null ? 43 : $purpose.hashCode());
        final Object $lastRead = this.getLastRead();
        result = result * PRIME + ($lastRead == null ? 43 : $lastRead.hashCode());
        final Object $latest = this.getLatest();
        result = result * PRIME + ($latest == null ? 43 : $latest.hashCode());
        final Object $unreadCount = this.getUnreadCount();
        result = result * PRIME + ($unreadCount == null ? 43 : $unreadCount.hashCode());
        final Object $unreadCountDisplay = this.getUnreadCountDisplay();
        result = result * PRIME + ($unreadCountDisplay == null ? 43 : $unreadCountDisplay.hashCode());
        return result;
    }

    public String toString() {
        return "Group(id=" + this.getId() + ", name=" + this.getName() + ", group=" + this.isGroup() + ", created=" + this.getCreated() + ", creator=" + this.getCreator() + ", archived=" + this.isArchived() + ", mpim=" + this.isMpim() + ", members=" + this.getMembers() + ", topic=" + this.getTopic() + ", purpose=" + this.getPurpose() + ", lastRead=" + this.getLastRead() + ", latest=" + this.getLatest() + ", unreadCount=" + this.getUnreadCount() + ", unreadCountDisplay=" + this.getUnreadCountDisplay() + ")";
    }

    public static class GroupBuilder {
        private String id;
        private String name;
        private boolean group;
        private Integer created;
        private String creator;
        private boolean archived;
        private boolean mpim;
        private List<String> members;
        private Topic topic;
        private Purpose purpose;
        private String lastRead;
        private Latest latest;
        private Integer unreadCount;
        private Integer unreadCountDisplay;

        GroupBuilder() {
        }

        public Group.GroupBuilder id(String id) {
            this.id = id;
            return this;
        }

        public Group.GroupBuilder name(String name) {
            this.name = name;
            return this;
        }

        public Group.GroupBuilder group(boolean group) {
            this.group = group;
            return this;
        }

        public Group.GroupBuilder created(Integer created) {
            this.created = created;
            return this;
        }

        public Group.GroupBuilder creator(String creator) {
            this.creator = creator;
            return this;
        }

        public Group.GroupBuilder archived(boolean archived) {
            this.archived = archived;
            return this;
        }

        public Group.GroupBuilder mpim(boolean mpim) {
            this.mpim = mpim;
            return this;
        }

        public Group.GroupBuilder members(List<String> members) {
            this.members = members;
            return this;
        }

        public Group.GroupBuilder topic(Topic topic) {
            this.topic = topic;
            return this;
        }

        public Group.GroupBuilder purpose(Purpose purpose) {
            this.purpose = purpose;
            return this;
        }

        public Group.GroupBuilder lastRead(String lastRead) {
            this.lastRead = lastRead;
            return this;
        }

        public Group.GroupBuilder latest(Latest latest) {
            this.latest = latest;
            return this;
        }

        public Group.GroupBuilder unreadCount(Integer unreadCount) {
            this.unreadCount = unreadCount;
            return this;
        }

        public Group.GroupBuilder unreadCountDisplay(Integer unreadCountDisplay) {
            this.unreadCountDisplay = unreadCountDisplay;
            return this;
        }

        public Group build() {
            return new Group(id, name, group, created, creator, archived, mpim, members, topic, purpose, lastRead, latest, unreadCount, unreadCountDisplay);
        }

        public String toString() {
            return "Group.GroupBuilder(id=" + this.id + ", name=" + this.name + ", group=" + this.group + ", created=" + this.created + ", creator=" + this.creator + ", archived=" + this.archived + ", mpim=" + this.mpim + ", members=" + this.members + ", topic=" + this.topic + ", purpose=" + this.purpose + ", lastRead=" + this.lastRead + ", latest=" + this.latest + ", unreadCount=" + this.unreadCount + ", unreadCountDisplay=" + this.unreadCountDisplay + ")";
        }
    }
}