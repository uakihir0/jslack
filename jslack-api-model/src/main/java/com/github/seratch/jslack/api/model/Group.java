package com.github.seratch.jslack.api.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * https://api.slack.com/types/group
 */
public class Group {

    private String id;
    private String name;
    private String nameNormalized;
    @SerializedName("is_group")
    private boolean group;
    private Integer created;
    private String creator;
    @SerializedName("is_archived")
    private boolean archived;
    @SerializedName("is_mpim")
    private boolean mpim;
    @SerializedName("is_open")
    private boolean open;
    @SerializedName("is_read_only")
    private boolean readOnly;
    @SerializedName("is_thread_only")
    private boolean threadOnly;

    private List<String> members;
    private String parentGroup; // group id
    private Topic topic;
    private Purpose purpose;
    private String lastRead;
    private Latest latest;
    private Integer unreadCount;
    private Integer unreadCountDisplay;
    private Double priority;

    public Group(String id, String name, String nameNormalized, boolean group, Integer created, String creator, boolean archived, boolean mpim, boolean open, boolean readOnly, boolean threadOnly, List<String> members, String parentGroup, Topic topic, Purpose purpose, String lastRead, Latest latest, Integer unreadCount, Integer unreadCountDisplay, Double priority) {
        this.id = id;
        this.name = name;
        this.nameNormalized = nameNormalized;
        this.group = group;
        this.created = created;
        this.creator = creator;
        this.archived = archived;
        this.mpim = mpim;
        this.open = open;
        this.readOnly = readOnly;
        this.threadOnly = threadOnly;
        this.members = members;
        this.parentGroup = parentGroup;
        this.topic = topic;
        this.purpose = purpose;
        this.lastRead = lastRead;
        this.latest = latest;
        this.unreadCount = unreadCount;
        this.unreadCountDisplay = unreadCountDisplay;
        this.priority = priority;
    }

    public Group() {
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

    public String getNameNormalized() {
        return this.nameNormalized;
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

    public boolean isOpen() {
        return this.open;
    }

    public boolean isReadOnly() {
        return this.readOnly;
    }

    public boolean isThreadOnly() {
        return this.threadOnly;
    }

    public List<String> getMembers() {
        return this.members;
    }

    public String getParentGroup() {
        return this.parentGroup;
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

    public Double getPriority() {
        return this.priority;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNameNormalized(String nameNormalized) {
        this.nameNormalized = nameNormalized;
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

    public void setOpen(boolean open) {
        this.open = open;
    }

    public void setReadOnly(boolean readOnly) {
        this.readOnly = readOnly;
    }

    public void setThreadOnly(boolean threadOnly) {
        this.threadOnly = threadOnly;
    }

    public void setMembers(List<String> members) {
        this.members = members;
    }

    public void setParentGroup(String parentGroup) {
        this.parentGroup = parentGroup;
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

    public void setPriority(Double priority) {
        this.priority = priority;
    }

    public static class GroupBuilder {
        private String id;
        private String name;
        private String nameNormalized;
        private boolean group;
        private Integer created;
        private String creator;
        private boolean archived;
        private boolean mpim;
        private boolean open;
        private boolean readOnly;
        private boolean threadOnly;
        private List<String> members;
        private String parentGroup;
        private Topic topic;
        private Purpose purpose;
        private String lastRead;
        private Latest latest;
        private Integer unreadCount;
        private Integer unreadCountDisplay;
        private Double priority;

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

        public Group.GroupBuilder nameNormalized(String nameNormalized) {
            this.nameNormalized = nameNormalized;
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

        public Group.GroupBuilder open(boolean open) {
            this.open = open;
            return this;
        }

        public Group.GroupBuilder readOnly(boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }

        public Group.GroupBuilder threadOnly(boolean threadOnly) {
            this.threadOnly = threadOnly;
            return this;
        }

        public Group.GroupBuilder members(List<String> members) {
            this.members = members;
            return this;
        }

        public Group.GroupBuilder parentGroup(String parentGroup) {
            this.parentGroup = parentGroup;
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

        public Group.GroupBuilder priority(Double priority) {
            this.priority = priority;
            return this;
        }

        public Group build() {
            return new Group(id, name, nameNormalized, group, created, creator, archived, mpim, open, readOnly, threadOnly, members, parentGroup, topic, purpose, lastRead, latest, unreadCount, unreadCountDisplay, priority);
        }

        public String toString() {
            return "Group.GroupBuilder(id=" + this.id + ", name=" + this.name + ", nameNormalized=" + this.nameNormalized + ", group=" + this.group + ", created=" + this.created + ", creator=" + this.creator + ", archived=" + this.archived + ", mpim=" + this.mpim + ", open=" + this.open + ", readOnly=" + this.readOnly + ", threadOnly=" + this.threadOnly + ", members=" + this.members + ", parentGroup=" + this.parentGroup + ", topic=" + this.topic + ", purpose=" + this.purpose + ", lastRead=" + this.lastRead + ", latest=" + this.latest + ", unreadCount=" + this.unreadCount + ", unreadCountDisplay=" + this.unreadCountDisplay + ", priority=" + this.priority + ")";
        }
    }
}