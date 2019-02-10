package com.github.seratch.jslack.api.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Channel {

    private String id;
    private String name;
    private Integer created;
    private String creator;
    @SerializedName("is_archived")
    private boolean archived;
    @SerializedName("is_member")
    private boolean member;
    @SerializedName("is_general")
    private boolean general;
    private String lastRead;
    private Latest latest;
    private Integer unreadCount;
    private Integer unreadCountDisplay;
    private List<String> members;
    private Topic topic;
    private Purpose purpose;

    public Channel() {
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
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

    public boolean isMember() {
        return this.member;
    }

    public boolean isGeneral() {
        return this.general;
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

    public List<String> getMembers() {
        return this.members;
    }

    public Topic getTopic() {
        return this.topic;
    }

    public Purpose getPurpose() {
        return this.purpose;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
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

    public void setMember(boolean member) {
        this.member = member;
    }

    public void setGeneral(boolean general) {
        this.general = general;
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

    public void setMembers(List<String> members) {
        this.members = members;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }

    public void setPurpose(Purpose purpose) {
        this.purpose = purpose;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Channel)) return false;
        final Channel other = (Channel) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        final Object this$created = this.getCreated();
        final Object other$created = other.getCreated();
        if (this$created == null ? other$created != null : !this$created.equals(other$created)) return false;
        final Object this$creator = this.getCreator();
        final Object other$creator = other.getCreator();
        if (this$creator == null ? other$creator != null : !this$creator.equals(other$creator)) return false;
        if (this.isArchived() != other.isArchived()) return false;
        if (this.isMember() != other.isMember()) return false;
        if (this.isGeneral() != other.isGeneral()) return false;
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
        final Object this$members = this.getMembers();
        final Object other$members = other.getMembers();
        if (this$members == null ? other$members != null : !this$members.equals(other$members)) return false;
        final Object this$topic = this.getTopic();
        final Object other$topic = other.getTopic();
        if (this$topic == null ? other$topic != null : !this$topic.equals(other$topic)) return false;
        final Object this$purpose = this.getPurpose();
        final Object other$purpose = other.getPurpose();
        if (this$purpose == null ? other$purpose != null : !this$purpose.equals(other$purpose)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Channel;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        final Object $created = this.getCreated();
        result = result * PRIME + ($created == null ? 43 : $created.hashCode());
        final Object $creator = this.getCreator();
        result = result * PRIME + ($creator == null ? 43 : $creator.hashCode());
        result = result * PRIME + (this.isArchived() ? 79 : 97);
        result = result * PRIME + (this.isMember() ? 79 : 97);
        result = result * PRIME + (this.isGeneral() ? 79 : 97);
        final Object $lastRead = this.getLastRead();
        result = result * PRIME + ($lastRead == null ? 43 : $lastRead.hashCode());
        final Object $latest = this.getLatest();
        result = result * PRIME + ($latest == null ? 43 : $latest.hashCode());
        final Object $unreadCount = this.getUnreadCount();
        result = result * PRIME + ($unreadCount == null ? 43 : $unreadCount.hashCode());
        final Object $unreadCountDisplay = this.getUnreadCountDisplay();
        result = result * PRIME + ($unreadCountDisplay == null ? 43 : $unreadCountDisplay.hashCode());
        final Object $members = this.getMembers();
        result = result * PRIME + ($members == null ? 43 : $members.hashCode());
        final Object $topic = this.getTopic();
        result = result * PRIME + ($topic == null ? 43 : $topic.hashCode());
        final Object $purpose = this.getPurpose();
        result = result * PRIME + ($purpose == null ? 43 : $purpose.hashCode());
        return result;
    }

    public String toString() {
        return "Channel(id=" + this.getId() + ", name=" + this.getName() + ", created=" + this.getCreated() + ", creator=" + this.getCreator() + ", archived=" + this.isArchived() + ", member=" + this.isMember() + ", general=" + this.isGeneral() + ", lastRead=" + this.getLastRead() + ", latest=" + this.getLatest() + ", unreadCount=" + this.getUnreadCount() + ", unreadCountDisplay=" + this.getUnreadCountDisplay() + ", members=" + this.getMembers() + ", topic=" + this.getTopic() + ", purpose=" + this.getPurpose() + ")";
    }
}
