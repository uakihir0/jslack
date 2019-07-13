package com.github.seratch.jslack.api.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Channel {

    private String id;
    private String name;
    private String nameNormalized;
    private Integer created;
    private String creator;

    @SerializedName("is_read_only")
    private boolean readOnly;
    @SerializedName("is_archived")
    private boolean archived;
    @SerializedName("is_member")
    private boolean member;
    @SerializedName("is_general")
    private boolean general;
    @SerializedName("is_channel")
    private boolean channel;
    @SerializedName("is_group")
    private boolean group;
    @SerializedName("is_im")
    private boolean im;
    @SerializedName("is_private")
    private boolean privateChannel;
    @SerializedName("is_mpim")
    private boolean mpim;
    @SerializedName("is_shared")
    private boolean shared;
    @SerializedName("is_org_shared")
    private boolean orgShared;

    @SerializedName("is_ext_shared") // search result
    private boolean extShared;
    @SerializedName("is_pending_ext_shared") // search result
    private boolean pendingExtShared;
    private List<String> pendingShared; // search result

    private String lastRead;
    private Latest latest;
    private Integer unreadCount;
    private Integer unreadCountDisplay;
    private Integer unlinked;
    private List<String> members;
    private Topic topic;
    private Purpose purpose;
    private String user;
    private List<String> previousNames;
    private Integer numMembers;
    private Double priority;

    public Channel() {
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

    public Integer getCreated() {
        return this.created;
    }

    public String getCreator() {
        return this.creator;
    }

    public boolean isReadOnly() {
        return this.readOnly;
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

    public boolean isChannel() {
        return this.channel;
    }

    public boolean isGroup() {
        return this.group;
    }

    public boolean isIm() {
        return this.im;
    }

    public boolean isPrivateChannel() {
        return this.privateChannel;
    }

    public boolean isMpim() {
        return this.mpim;
    }

    public boolean isShared() {
        return this.shared;
    }

    public boolean isOrgShared() {
        return this.orgShared;
    }

    public boolean isExtShared() {
        return this.extShared;
    }

    public boolean isPendingExtShared() {
        return this.pendingExtShared;
    }

    public List<String> getPendingShared() {
        return this.pendingShared;
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

    public Integer getUnlinked() {
        return this.unlinked;
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

    public String getUser() {
        return this.user;
    }

    public List<String> getPreviousNames() {
        return this.previousNames;
    }

    public Integer getNumMembers() {
        return this.numMembers;
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

    public void setCreated(Integer created) {
        this.created = created;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public void setReadOnly(boolean readOnly) {
        this.readOnly = readOnly;
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

    public void setChannel(boolean channel) {
        this.channel = channel;
    }

    public void setGroup(boolean group) {
        this.group = group;
    }

    public void setIm(boolean im) {
        this.im = im;
    }

    public void setPrivateChannel(boolean privateChannel) {
        this.privateChannel = privateChannel;
    }

    public void setMpim(boolean mpim) {
        this.mpim = mpim;
    }

    public void setShared(boolean shared) {
        this.shared = shared;
    }

    public void setOrgShared(boolean orgShared) {
        this.orgShared = orgShared;
    }

    public void setExtShared(boolean extShared) {
        this.extShared = extShared;
    }

    public void setPendingExtShared(boolean pendingExtShared) {
        this.pendingExtShared = pendingExtShared;
    }

    public void setPendingShared(List<String> pendingShared) {
        this.pendingShared = pendingShared;
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

    public void setUnlinked(Integer unlinked) {
        this.unlinked = unlinked;
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

    public void setUser(String user) {
        this.user = user;
    }

    public void setPreviousNames(List<String> previousNames) {
        this.previousNames = previousNames;
    }

    public void setNumMembers(Integer numMembers) {
        this.numMembers = numMembers;
    }

    public void setPriority(Double priority) {
        this.priority = priority;
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
        final Object this$nameNormalized = this.getNameNormalized();
        final Object other$nameNormalized = other.getNameNormalized();
        if (this$nameNormalized == null ? other$nameNormalized != null : !this$nameNormalized.equals(other$nameNormalized))
            return false;
        final Object this$created = this.getCreated();
        final Object other$created = other.getCreated();
        if (this$created == null ? other$created != null : !this$created.equals(other$created)) return false;
        final Object this$creator = this.getCreator();
        final Object other$creator = other.getCreator();
        if (this$creator == null ? other$creator != null : !this$creator.equals(other$creator)) return false;
        if (this.isReadOnly() != other.isReadOnly()) return false;
        if (this.isArchived() != other.isArchived()) return false;
        if (this.isMember() != other.isMember()) return false;
        if (this.isGeneral() != other.isGeneral()) return false;
        if (this.isChannel() != other.isChannel()) return false;
        if (this.isGroup() != other.isGroup()) return false;
        if (this.isIm() != other.isIm()) return false;
        if (this.isPrivateChannel() != other.isPrivateChannel()) return false;
        if (this.isMpim() != other.isMpim()) return false;
        if (this.isShared() != other.isShared()) return false;
        if (this.isOrgShared() != other.isOrgShared()) return false;
        if (this.isExtShared() != other.isExtShared()) return false;
        if (this.isPendingExtShared() != other.isPendingExtShared()) return false;
        final Object this$pendingShared = this.getPendingShared();
        final Object other$pendingShared = other.getPendingShared();
        if (this$pendingShared == null ? other$pendingShared != null : !this$pendingShared.equals(other$pendingShared))
            return false;
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
        final Object this$unlinked = this.getUnlinked();
        final Object other$unlinked = other.getUnlinked();
        if (this$unlinked == null ? other$unlinked != null : !this$unlinked.equals(other$unlinked)) return false;
        final Object this$members = this.getMembers();
        final Object other$members = other.getMembers();
        if (this$members == null ? other$members != null : !this$members.equals(other$members)) return false;
        final Object this$topic = this.getTopic();
        final Object other$topic = other.getTopic();
        if (this$topic == null ? other$topic != null : !this$topic.equals(other$topic)) return false;
        final Object this$purpose = this.getPurpose();
        final Object other$purpose = other.getPurpose();
        if (this$purpose == null ? other$purpose != null : !this$purpose.equals(other$purpose)) return false;
        final Object this$user = this.getUser();
        final Object other$user = other.getUser();
        if (this$user == null ? other$user != null : !this$user.equals(other$user)) return false;
        final Object this$previousNames = this.getPreviousNames();
        final Object other$previousNames = other.getPreviousNames();
        if (this$previousNames == null ? other$previousNames != null : !this$previousNames.equals(other$previousNames))
            return false;
        final Object this$numMembers = this.getNumMembers();
        final Object other$numMembers = other.getNumMembers();
        if (this$numMembers == null ? other$numMembers != null : !this$numMembers.equals(other$numMembers))
            return false;
        final Object this$priority = this.getPriority();
        final Object other$priority = other.getPriority();
        if (this$priority == null ? other$priority != null : !this$priority.equals(other$priority)) return false;
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
        final Object $nameNormalized = this.getNameNormalized();
        result = result * PRIME + ($nameNormalized == null ? 43 : $nameNormalized.hashCode());
        final Object $created = this.getCreated();
        result = result * PRIME + ($created == null ? 43 : $created.hashCode());
        final Object $creator = this.getCreator();
        result = result * PRIME + ($creator == null ? 43 : $creator.hashCode());
        result = result * PRIME + (this.isReadOnly() ? 79 : 97);
        result = result * PRIME + (this.isArchived() ? 79 : 97);
        result = result * PRIME + (this.isMember() ? 79 : 97);
        result = result * PRIME + (this.isGeneral() ? 79 : 97);
        result = result * PRIME + (this.isChannel() ? 79 : 97);
        result = result * PRIME + (this.isGroup() ? 79 : 97);
        result = result * PRIME + (this.isIm() ? 79 : 97);
        result = result * PRIME + (this.isPrivateChannel() ? 79 : 97);
        result = result * PRIME + (this.isMpim() ? 79 : 97);
        result = result * PRIME + (this.isShared() ? 79 : 97);
        result = result * PRIME + (this.isOrgShared() ? 79 : 97);
        result = result * PRIME + (this.isExtShared() ? 79 : 97);
        result = result * PRIME + (this.isPendingExtShared() ? 79 : 97);
        final Object $pendingShared = this.getPendingShared();
        result = result * PRIME + ($pendingShared == null ? 43 : $pendingShared.hashCode());
        final Object $lastRead = this.getLastRead();
        result = result * PRIME + ($lastRead == null ? 43 : $lastRead.hashCode());
        final Object $latest = this.getLatest();
        result = result * PRIME + ($latest == null ? 43 : $latest.hashCode());
        final Object $unreadCount = this.getUnreadCount();
        result = result * PRIME + ($unreadCount == null ? 43 : $unreadCount.hashCode());
        final Object $unreadCountDisplay = this.getUnreadCountDisplay();
        result = result * PRIME + ($unreadCountDisplay == null ? 43 : $unreadCountDisplay.hashCode());
        final Object $unlinked = this.getUnlinked();
        result = result * PRIME + ($unlinked == null ? 43 : $unlinked.hashCode());
        final Object $members = this.getMembers();
        result = result * PRIME + ($members == null ? 43 : $members.hashCode());
        final Object $topic = this.getTopic();
        result = result * PRIME + ($topic == null ? 43 : $topic.hashCode());
        final Object $purpose = this.getPurpose();
        result = result * PRIME + ($purpose == null ? 43 : $purpose.hashCode());
        final Object $user = this.getUser();
        result = result * PRIME + ($user == null ? 43 : $user.hashCode());
        final Object $previousNames = this.getPreviousNames();
        result = result * PRIME + ($previousNames == null ? 43 : $previousNames.hashCode());
        final Object $numMembers = this.getNumMembers();
        result = result * PRIME + ($numMembers == null ? 43 : $numMembers.hashCode());
        final Object $priority = this.getPriority();
        result = result * PRIME + ($priority == null ? 43 : $priority.hashCode());
        return result;
    }

    public String toString() {
        return "Channel(id=" + this.getId() + ", name=" + this.getName() + ", nameNormalized=" + this.getNameNormalized() + ", created=" + this.getCreated() + ", creator=" + this.getCreator() + ", readOnly=" + this.isReadOnly() + ", archived=" + this.isArchived() + ", member=" + this.isMember() + ", general=" + this.isGeneral() + ", channel=" + this.isChannel() + ", group=" + this.isGroup() + ", im=" + this.isIm() + ", privateChannel=" + this.isPrivateChannel() + ", mpim=" + this.isMpim() + ", shared=" + this.isShared() + ", orgShared=" + this.isOrgShared() + ", extShared=" + this.isExtShared() + ", pendingExtShared=" + this.isPendingExtShared() + ", pendingShared=" + this.getPendingShared() + ", lastRead=" + this.getLastRead() + ", latest=" + this.getLatest() + ", unreadCount=" + this.getUnreadCount() + ", unreadCountDisplay=" + this.getUnreadCountDisplay() + ", unlinked=" + this.getUnlinked() + ", members=" + this.getMembers() + ", topic=" + this.getTopic() + ", purpose=" + this.getPurpose() + ", user=" + this.getUser() + ", previousNames=" + this.getPreviousNames() + ", numMembers=" + this.getNumMembers() + ", priority=" + this.getPriority() + ")";
    }
}
