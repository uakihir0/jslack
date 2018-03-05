package com.github.seratch.jslack.api.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Represents a <a href="https://api.slack.com/types/conversation">conversation</a>
 * as used with the {@code conversations} API<p>
 *
 * @see https://api.slack.com/docs/conversations-api
 */
public class Conversation {

    private String id;
    private String name;
    private String created;
    private String creator;
    private Integer unlinked;
    @SerializedName("name_normalized")
    private String nameNormalized;
    @SerializedName("pending_shared")
    private List<String> pendingShared;
    @SerializedName("last_read")
    private String lastRead;
    private Topic topic;
    private Purpose purpose;
    @SerializedName("previous_names")
    private List<String> previousNames;
    @SerializedName("num_members")
    private Integer numOfMembers;
    private List<String> members;
    private Latest latest;
    private String locale;
    @SerializedName("unreadCount")
    private Integer unreadCount;
    @SerializedName("unreadCountDisplay")
    private Integer unreadCountDisplay;

    @SerializedName("is_channel")
    private boolean isChannel;
    @SerializedName("is_group")
    private boolean isGroup;
    @SerializedName("is_im")
    private boolean isIm;
    @SerializedName("is_archived")
    private boolean isArchived;
    @SerializedName("is_general")
    private boolean isGeneral;
    @SerializedName("is_read_only")
    private boolean isReadOnly;
    @SerializedName("is_shared")
    private boolean isShared;
    @SerializedName("is_ext_shared")
    private boolean isExtShared;
    @SerializedName("is_org_shared")
    private boolean isOrgShared;
    @SerializedName("is_pending_ext_shared")
    private boolean isPendingExtShared;
    @SerializedName("is_member")
    private boolean isMember;
    @SerializedName("is_private")
    private boolean isPrivate;
    @SerializedName("is_mpim")
    private boolean isMpim;

    Conversation(String id, String name, String created, String creator, Integer unlinked, String nameNormalized, List<String> pendingShared, String lastRead, Topic topic, Purpose purpose, List<String> previousNames, Integer numOfMembers, List<String> members, Latest latest, String locale, Integer unreadCount, Integer unreadCountDisplay, boolean isChannel, boolean isGroup, boolean isIm, boolean isArchived, boolean isGeneral, boolean isReadOnly, boolean isShared, boolean isExtShared, boolean isOrgShared, boolean isPendingExtShared, boolean isMember, boolean isPrivate, boolean isMpim) {
        this.id = id;
        this.name = name;
        this.created = created;
        this.creator = creator;
        this.unlinked = unlinked;
        this.nameNormalized = nameNormalized;
        this.pendingShared = pendingShared;
        this.lastRead = lastRead;
        this.topic = topic;
        this.purpose = purpose;
        this.previousNames = previousNames;
        this.numOfMembers = numOfMembers;
        this.members = members;
        this.latest = latest;
        this.locale = locale;
        this.unreadCount = unreadCount;
        this.unreadCountDisplay = unreadCountDisplay;
        this.isChannel = isChannel;
        this.isGroup = isGroup;
        this.isIm = isIm;
        this.isArchived = isArchived;
        this.isGeneral = isGeneral;
        this.isReadOnly = isReadOnly;
        this.isShared = isShared;
        this.isExtShared = isExtShared;
        this.isOrgShared = isOrgShared;
        this.isPendingExtShared = isPendingExtShared;
        this.isMember = isMember;
        this.isPrivate = isPrivate;
        this.isMpim = isMpim;
    }

    public static ConversationBuilder builder() {
        return new ConversationBuilder();
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getCreated() {
        return this.created;
    }

    public String getCreator() {
        return this.creator;
    }

    public Integer getUnlinked() {
        return this.unlinked;
    }

    public String getNameNormalized() {
        return this.nameNormalized;
    }

    public List<String> getPendingShared() {
        return this.pendingShared;
    }

    public String getLastRead() {
        return this.lastRead;
    }

    public Topic getTopic() {
        return this.topic;
    }

    public Purpose getPurpose() {
        return this.purpose;
    }

    public List<String> getPreviousNames() {
        return this.previousNames;
    }

    public Integer getNumOfMembers() {
        return this.numOfMembers;
    }

    public List<String> getMembers() {
        return this.members;
    }

    public Latest getLatest() {
        return this.latest;
    }

    public String getLocale() {
        return this.locale;
    }

    public Integer getUnreadCount() {
        return this.unreadCount;
    }

    public Integer getUnreadCountDisplay() {
        return this.unreadCountDisplay;
    }

    public boolean isChannel() {
        return this.isChannel;
    }

    public boolean isGroup() {
        return this.isGroup;
    }

    public boolean isIm() {
        return this.isIm;
    }

    public boolean isArchived() {
        return this.isArchived;
    }

    public boolean isGeneral() {
        return this.isGeneral;
    }

    public boolean isReadOnly() {
        return this.isReadOnly;
    }

    public boolean isShared() {
        return this.isShared;
    }

    public boolean isExtShared() {
        return this.isExtShared;
    }

    public boolean isOrgShared() {
        return this.isOrgShared;
    }

    public boolean isPendingExtShared() {
        return this.isPendingExtShared;
    }

    public boolean isMember() {
        return this.isMember;
    }

    public boolean isPrivate() {
        return this.isPrivate;
    }

    public boolean isMpim() {
        return this.isMpim;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public void setUnlinked(Integer unlinked) {
        this.unlinked = unlinked;
    }

    public void setNameNormalized(String nameNormalized) {
        this.nameNormalized = nameNormalized;
    }

    public void setPendingShared(List<String> pendingShared) {
        this.pendingShared = pendingShared;
    }

    public void setLastRead(String lastRead) {
        this.lastRead = lastRead;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }

    public void setPurpose(Purpose purpose) {
        this.purpose = purpose;
    }

    public void setPreviousNames(List<String> previousNames) {
        this.previousNames = previousNames;
    }

    public void setNumOfMembers(Integer numOfMembers) {
        this.numOfMembers = numOfMembers;
    }

    public void setMembers(List<String> members) {
        this.members = members;
    }

    public void setLatest(Latest latest) {
        this.latest = latest;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public void setUnreadCount(Integer unreadCount) {
        this.unreadCount = unreadCount;
    }

    public void setUnreadCountDisplay(Integer unreadCountDisplay) {
        this.unreadCountDisplay = unreadCountDisplay;
    }

    public void setChannel(boolean isChannel) {
        this.isChannel = isChannel;
    }

    public void setGroup(boolean isGroup) {
        this.isGroup = isGroup;
    }

    public void setIm(boolean isIm) {
        this.isIm = isIm;
    }

    public void setArchived(boolean isArchived) {
        this.isArchived = isArchived;
    }

    public void setGeneral(boolean isGeneral) {
        this.isGeneral = isGeneral;
    }

    public void setReadOnly(boolean isReadOnly) {
        this.isReadOnly = isReadOnly;
    }

    public void setShared(boolean isShared) {
        this.isShared = isShared;
    }

    public void setExtShared(boolean isExtShared) {
        this.isExtShared = isExtShared;
    }

    public void setOrgShared(boolean isOrgShared) {
        this.isOrgShared = isOrgShared;
    }

    public void setPendingExtShared(boolean isPendingExtShared) {
        this.isPendingExtShared = isPendingExtShared;
    }

    public void setMember(boolean isMember) {
        this.isMember = isMember;
    }

    public void setPrivate(boolean isPrivate) {
        this.isPrivate = isPrivate;
    }

    public void setMpim(boolean isMpim) {
        this.isMpim = isMpim;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Conversation)) return false;
        final Conversation other = (Conversation) o;
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
        final Object this$unlinked = this.getUnlinked();
        final Object other$unlinked = other.getUnlinked();
        if (this$unlinked == null ? other$unlinked != null : !this$unlinked.equals(other$unlinked)) return false;
        final Object this$nameNormalized = this.getNameNormalized();
        final Object other$nameNormalized = other.getNameNormalized();
        if (this$nameNormalized == null ? other$nameNormalized != null : !this$nameNormalized.equals(other$nameNormalized))
            return false;
        final Object this$pendingShared = this.getPendingShared();
        final Object other$pendingShared = other.getPendingShared();
        if (this$pendingShared == null ? other$pendingShared != null : !this$pendingShared.equals(other$pendingShared))
            return false;
        final Object this$lastRead = this.getLastRead();
        final Object other$lastRead = other.getLastRead();
        if (this$lastRead == null ? other$lastRead != null : !this$lastRead.equals(other$lastRead)) return false;
        final Object this$topic = this.getTopic();
        final Object other$topic = other.getTopic();
        if (this$topic == null ? other$topic != null : !this$topic.equals(other$topic)) return false;
        final Object this$purpose = this.getPurpose();
        final Object other$purpose = other.getPurpose();
        if (this$purpose == null ? other$purpose != null : !this$purpose.equals(other$purpose)) return false;
        final Object this$previousNames = this.getPreviousNames();
        final Object other$previousNames = other.getPreviousNames();
        if (this$previousNames == null ? other$previousNames != null : !this$previousNames.equals(other$previousNames))
            return false;
        final Object this$numOfMembers = this.getNumOfMembers();
        final Object other$numOfMembers = other.getNumOfMembers();
        if (this$numOfMembers == null ? other$numOfMembers != null : !this$numOfMembers.equals(other$numOfMembers))
            return false;
        final Object this$members = this.getMembers();
        final Object other$members = other.getMembers();
        if (this$members == null ? other$members != null : !this$members.equals(other$members)) return false;
        final Object this$latest = this.getLatest();
        final Object other$latest = other.getLatest();
        if (this$latest == null ? other$latest != null : !this$latest.equals(other$latest)) return false;
        final Object this$locale = this.getLocale();
        final Object other$locale = other.getLocale();
        if (this$locale == null ? other$locale != null : !this$locale.equals(other$locale)) return false;
        final Object this$unreadCount = this.getUnreadCount();
        final Object other$unreadCount = other.getUnreadCount();
        if (this$unreadCount == null ? other$unreadCount != null : !this$unreadCount.equals(other$unreadCount))
            return false;
        final Object this$unreadCountDisplay = this.getUnreadCountDisplay();
        final Object other$unreadCountDisplay = other.getUnreadCountDisplay();
        if (this$unreadCountDisplay == null ? other$unreadCountDisplay != null : !this$unreadCountDisplay.equals(other$unreadCountDisplay))
            return false;
        if (this.isChannel() != other.isChannel()) return false;
        if (this.isGroup() != other.isGroup()) return false;
        if (this.isIm() != other.isIm()) return false;
        if (this.isArchived() != other.isArchived()) return false;
        if (this.isGeneral() != other.isGeneral()) return false;
        if (this.isReadOnly() != other.isReadOnly()) return false;
        if (this.isShared() != other.isShared()) return false;
        if (this.isExtShared() != other.isExtShared()) return false;
        if (this.isOrgShared() != other.isOrgShared()) return false;
        if (this.isPendingExtShared() != other.isPendingExtShared()) return false;
        if (this.isMember() != other.isMember()) return false;
        if (this.isPrivate() != other.isPrivate()) return false;
        if (this.isMpim() != other.isMpim()) return false;
        return true;
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
        final Object $unlinked = this.getUnlinked();
        result = result * PRIME + ($unlinked == null ? 43 : $unlinked.hashCode());
        final Object $nameNormalized = this.getNameNormalized();
        result = result * PRIME + ($nameNormalized == null ? 43 : $nameNormalized.hashCode());
        final Object $pendingShared = this.getPendingShared();
        result = result * PRIME + ($pendingShared == null ? 43 : $pendingShared.hashCode());
        final Object $lastRead = this.getLastRead();
        result = result * PRIME + ($lastRead == null ? 43 : $lastRead.hashCode());
        final Object $topic = this.getTopic();
        result = result * PRIME + ($topic == null ? 43 : $topic.hashCode());
        final Object $purpose = this.getPurpose();
        result = result * PRIME + ($purpose == null ? 43 : $purpose.hashCode());
        final Object $previousNames = this.getPreviousNames();
        result = result * PRIME + ($previousNames == null ? 43 : $previousNames.hashCode());
        final Object $numOfMembers = this.getNumOfMembers();
        result = result * PRIME + ($numOfMembers == null ? 43 : $numOfMembers.hashCode());
        final Object $members = this.getMembers();
        result = result * PRIME + ($members == null ? 43 : $members.hashCode());
        final Object $latest = this.getLatest();
        result = result * PRIME + ($latest == null ? 43 : $latest.hashCode());
        final Object $locale = this.getLocale();
        result = result * PRIME + ($locale == null ? 43 : $locale.hashCode());
        final Object $unreadCount = this.getUnreadCount();
        result = result * PRIME + ($unreadCount == null ? 43 : $unreadCount.hashCode());
        final Object $unreadCountDisplay = this.getUnreadCountDisplay();
        result = result * PRIME + ($unreadCountDisplay == null ? 43 : $unreadCountDisplay.hashCode());
        result = result * PRIME + (this.isChannel() ? 79 : 97);
        result = result * PRIME + (this.isGroup() ? 79 : 97);
        result = result * PRIME + (this.isIm() ? 79 : 97);
        result = result * PRIME + (this.isArchived() ? 79 : 97);
        result = result * PRIME + (this.isGeneral() ? 79 : 97);
        result = result * PRIME + (this.isReadOnly() ? 79 : 97);
        result = result * PRIME + (this.isShared() ? 79 : 97);
        result = result * PRIME + (this.isExtShared() ? 79 : 97);
        result = result * PRIME + (this.isOrgShared() ? 79 : 97);
        result = result * PRIME + (this.isPendingExtShared() ? 79 : 97);
        result = result * PRIME + (this.isMember() ? 79 : 97);
        result = result * PRIME + (this.isPrivate() ? 79 : 97);
        result = result * PRIME + (this.isMpim() ? 79 : 97);
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof Conversation;
    }

    public String toString() {
        return "Conversation(id=" + this.getId() + ", name=" + this.getName() + ", created=" + this.getCreated() + ", creator=" + this.getCreator() + ", unlinked=" + this.getUnlinked() + ", nameNormalized=" + this.getNameNormalized() + ", pendingShared=" + this.getPendingShared() + ", lastRead=" + this.getLastRead() + ", topic=" + this.getTopic() + ", purpose=" + this.getPurpose() + ", previousNames=" + this.getPreviousNames() + ", numOfMembers=" + this.getNumOfMembers() + ", members=" + this.getMembers() + ", latest=" + this.getLatest() + ", locale=" + this.getLocale() + ", unreadCount=" + this.getUnreadCount() + ", unreadCountDisplay=" + this.getUnreadCountDisplay() + ", isChannel=" + this.isChannel() + ", isGroup=" + this.isGroup() + ", isIm=" + this.isIm() + ", isArchived=" + this.isArchived() + ", isGeneral=" + this.isGeneral() + ", isReadOnly=" + this.isReadOnly() + ", isShared=" + this.isShared() + ", isExtShared=" + this.isExtShared() + ", isOrgShared=" + this.isOrgShared() + ", isPendingExtShared=" + this.isPendingExtShared() + ", isMember=" + this.isMember() + ", isPrivate=" + this.isPrivate() + ", isMpim=" + this.isMpim() + ")";
    }

    public static class ConversationBuilder {
        private String id;
        private String name;
        private String created;
        private String creator;
        private Integer unlinked;
        private String nameNormalized;
        private List<String> pendingShared;
        private String lastRead;
        private Topic topic;
        private Purpose purpose;
        private List<String> previousNames;
        private Integer numOfMembers;
        private List<String> members;
        private Latest latest;
        private String locale;
        private Integer unreadCount;
        private Integer unreadCountDisplay;
        private boolean isChannel;
        private boolean isGroup;
        private boolean isIm;
        private boolean isArchived;
        private boolean isGeneral;
        private boolean isReadOnly;
        private boolean isShared;
        private boolean isExtShared;
        private boolean isOrgShared;
        private boolean isPendingExtShared;
        private boolean isMember;
        private boolean isPrivate;
        private boolean isMpim;

        ConversationBuilder() {
        }

        public Conversation.ConversationBuilder id(String id) {
            this.id = id;
            return this;
        }

        public Conversation.ConversationBuilder name(String name) {
            this.name = name;
            return this;
        }

        public Conversation.ConversationBuilder created(String created) {
            this.created = created;
            return this;
        }

        public Conversation.ConversationBuilder creator(String creator) {
            this.creator = creator;
            return this;
        }

        public Conversation.ConversationBuilder unlinked(Integer unlinked) {
            this.unlinked = unlinked;
            return this;
        }

        public Conversation.ConversationBuilder nameNormalized(String nameNormalized) {
            this.nameNormalized = nameNormalized;
            return this;
        }

        public Conversation.ConversationBuilder pendingShared(List<String> pendingShared) {
            this.pendingShared = pendingShared;
            return this;
        }

        public Conversation.ConversationBuilder lastRead(String lastRead) {
            this.lastRead = lastRead;
            return this;
        }

        public Conversation.ConversationBuilder topic(Topic topic) {
            this.topic = topic;
            return this;
        }

        public Conversation.ConversationBuilder purpose(Purpose purpose) {
            this.purpose = purpose;
            return this;
        }

        public Conversation.ConversationBuilder previousNames(List<String> previousNames) {
            this.previousNames = previousNames;
            return this;
        }

        public Conversation.ConversationBuilder numOfMembers(Integer numOfMembers) {
            this.numOfMembers = numOfMembers;
            return this;
        }

        public Conversation.ConversationBuilder members(List<String> members) {
            this.members = members;
            return this;
        }

        public Conversation.ConversationBuilder latest(Latest latest) {
            this.latest = latest;
            return this;
        }

        public Conversation.ConversationBuilder locale(String locale) {
            this.locale = locale;
            return this;
        }

        public Conversation.ConversationBuilder unreadCount(Integer unreadCount) {
            this.unreadCount = unreadCount;
            return this;
        }

        public Conversation.ConversationBuilder unreadCountDisplay(Integer unreadCountDisplay) {
            this.unreadCountDisplay = unreadCountDisplay;
            return this;
        }

        public Conversation.ConversationBuilder isChannel(boolean isChannel) {
            this.isChannel = isChannel;
            return this;
        }

        public Conversation.ConversationBuilder isGroup(boolean isGroup) {
            this.isGroup = isGroup;
            return this;
        }

        public Conversation.ConversationBuilder isIm(boolean isIm) {
            this.isIm = isIm;
            return this;
        }

        public Conversation.ConversationBuilder isArchived(boolean isArchived) {
            this.isArchived = isArchived;
            return this;
        }

        public Conversation.ConversationBuilder isGeneral(boolean isGeneral) {
            this.isGeneral = isGeneral;
            return this;
        }

        public Conversation.ConversationBuilder isReadOnly(boolean isReadOnly) {
            this.isReadOnly = isReadOnly;
            return this;
        }

        public Conversation.ConversationBuilder isShared(boolean isShared) {
            this.isShared = isShared;
            return this;
        }

        public Conversation.ConversationBuilder isExtShared(boolean isExtShared) {
            this.isExtShared = isExtShared;
            return this;
        }

        public Conversation.ConversationBuilder isOrgShared(boolean isOrgShared) {
            this.isOrgShared = isOrgShared;
            return this;
        }

        public Conversation.ConversationBuilder isPendingExtShared(boolean isPendingExtShared) {
            this.isPendingExtShared = isPendingExtShared;
            return this;
        }

        public Conversation.ConversationBuilder isMember(boolean isMember) {
            this.isMember = isMember;
            return this;
        }

        public Conversation.ConversationBuilder isPrivate(boolean isPrivate) {
            this.isPrivate = isPrivate;
            return this;
        }

        public Conversation.ConversationBuilder isMpim(boolean isMpim) {
            this.isMpim = isMpim;
            return this;
        }

        public Conversation build() {
            return new Conversation(id, name, created, creator, unlinked, nameNormalized, pendingShared, lastRead, topic, purpose, previousNames, numOfMembers, members, latest, locale, unreadCount, unreadCountDisplay, isChannel, isGroup, isIm, isArchived, isGeneral, isReadOnly, isShared, isExtShared, isOrgShared, isPendingExtShared, isMember, isPrivate, isMpim);
        }

        public String toString() {
            return "Conversation.ConversationBuilder(id=" + this.id + ", name=" + this.name + ", created=" + this.created + ", creator=" + this.creator + ", unlinked=" + this.unlinked + ", nameNormalized=" + this.nameNormalized + ", pendingShared=" + this.pendingShared + ", lastRead=" + this.lastRead + ", topic=" + this.topic + ", purpose=" + this.purpose + ", previousNames=" + this.previousNames + ", numOfMembers=" + this.numOfMembers + ", members=" + this.members + ", latest=" + this.latest + ", locale=" + this.locale + ", unreadCount=" + this.unreadCount + ", unreadCountDisplay=" + this.unreadCountDisplay + ", isChannel=" + this.isChannel + ", isGroup=" + this.isGroup + ", isIm=" + this.isIm + ", isArchived=" + this.isArchived + ", isGeneral=" + this.isGeneral + ", isReadOnly=" + this.isReadOnly + ", isShared=" + this.isShared + ", isExtShared=" + this.isExtShared + ", isOrgShared=" + this.isOrgShared + ", isPendingExtShared=" + this.isPendingExtShared + ", isMember=" + this.isMember + ", isPrivate=" + this.isPrivate + ", isMpim=" + this.isMpim + ")";
        }
    }
}
