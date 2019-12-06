package com.github.seratch.jslack.api.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Represents a <a href="https://api.slack.com/types/conversation">conversation</a>
 * as used with the {@code conversations} API
 *
 * @see "https://api.slack.com/docs/conversations-api"
 */
public class Conversation {

    private String enterpriseId;
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
    @SerializedName("unread_count")
    private Integer unreadCount;
    @SerializedName("unread_count_display")
    private Integer unreadCountDisplay;
    private String user; // conversations.open
    private Double priority;

    private List<String> sharedTeamIds;

    private String parentConversation;
    private List<String> pendingConnectedTeamIds;

    // shared channels
    private String conversationHostId;
    private List<String> internalTeamIds;
    private List<String> connectedTeamIds;

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
    @SerializedName("is_thread_only")
    private boolean isThreadOnly;
    @SerializedName("is_non_threadable")
    private boolean isNonThreadable;
    @SerializedName("is_shared")
    private boolean isShared;
    @SerializedName("is_ext_shared")
    private boolean isExtShared;
    @SerializedName("is_org_shared")
    private boolean isOrgShared;
    @SerializedName("is_pending_ext_shared")
    private boolean isPendingExtShared;
    @SerializedName("is_global_shared")
    private boolean globalShared;
    @SerializedName("is_org_default")
    private boolean orgDefault;
    @SerializedName("is_org_mandatory")
    private boolean orgMandatory;
    @SerializedName("is_moved")
    private Integer isMoved;
    @SerializedName("is_member")
    private boolean isMember;
    @SerializedName("is_open")
    private boolean open;
    @SerializedName("is_private")
    private boolean isPrivate;
    @SerializedName("is_mpim")
    private boolean isMpim;

    public Conversation(String enterpriseId, String id, String name, String created, String creator, Integer unlinked, String nameNormalized, List<String> pendingShared, String lastRead, Topic topic, Purpose purpose, List<String> previousNames, Integer numOfMembers, List<String> members, Latest latest, String locale, Integer unreadCount, Integer unreadCountDisplay, String user, Double priority, List<String> sharedTeamIds, String parentConversation, List<String> pendingConnectedTeamIds, String conversationHostId, List<String> internalTeamIds, List<String> connectedTeamIds, boolean isChannel, boolean isGroup, boolean isIm, boolean isArchived, boolean isGeneral, boolean isReadOnly, boolean isThreadOnly, boolean isNonThreadable, boolean isShared, boolean isExtShared, boolean isOrgShared, boolean isPendingExtShared, boolean globalShared, boolean orgDefault, boolean orgMandatory, Integer isMoved, boolean isMember, boolean open, boolean isPrivate, boolean isMpim) {
        this.enterpriseId = enterpriseId;
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
        this.user = user;
        this.priority = priority;
        this.sharedTeamIds = sharedTeamIds;
        this.parentConversation = parentConversation;
        this.pendingConnectedTeamIds = pendingConnectedTeamIds;
        this.conversationHostId = conversationHostId;
        this.internalTeamIds = internalTeamIds;
        this.connectedTeamIds = connectedTeamIds;
        this.isChannel = isChannel;
        this.isGroup = isGroup;
        this.isIm = isIm;
        this.isArchived = isArchived;
        this.isGeneral = isGeneral;
        this.isReadOnly = isReadOnly;
        this.isThreadOnly = isThreadOnly;
        this.isNonThreadable = isNonThreadable;
        this.isShared = isShared;
        this.isExtShared = isExtShared;
        this.isOrgShared = isOrgShared;
        this.isPendingExtShared = isPendingExtShared;
        this.globalShared = globalShared;
        this.orgDefault = orgDefault;
        this.orgMandatory = orgMandatory;
        this.isMoved = isMoved;
        this.isMember = isMember;
        this.open = open;
        this.isPrivate = isPrivate;
        this.isMpim = isMpim;
    }

    public Conversation() {
    }

    public static ConversationBuilder builder() {
        return new ConversationBuilder();
    }

    public String getEnterpriseId() {
        return this.enterpriseId;
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

    public String getUser() {
        return this.user;
    }

    public Double getPriority() {
        return this.priority;
    }

    public List<String> getSharedTeamIds() {
        return this.sharedTeamIds;
    }

    public String getParentConversation() {
        return this.parentConversation;
    }

    public List<String> getPendingConnectedTeamIds() {
        return this.pendingConnectedTeamIds;
    }

    public String getConversationHostId() {
        return this.conversationHostId;
    }

    public List<String> getInternalTeamIds() {
        return this.internalTeamIds;
    }

    public List<String> getConnectedTeamIds() {
        return this.connectedTeamIds;
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

    public boolean isThreadOnly() {
        return this.isThreadOnly;
    }

    public boolean isNonThreadable() {
        return this.isNonThreadable;
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

    public boolean isGlobalShared() {
        return this.globalShared;
    }

    public boolean isOrgDefault() {
        return this.orgDefault;
    }

    public boolean isOrgMandatory() {
        return this.orgMandatory;
    }

    public Integer getIsMoved() {
        return this.isMoved;
    }

    public boolean isMember() {
        return this.isMember;
    }

    public boolean isOpen() {
        return this.open;
    }

    public boolean isPrivate() {
        return this.isPrivate;
    }

    public boolean isMpim() {
        return this.isMpim;
    }

    public void setEnterpriseId(String enterpriseId) {
        this.enterpriseId = enterpriseId;
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

    public void setUser(String user) {
        this.user = user;
    }

    public void setPriority(Double priority) {
        this.priority = priority;
    }

    public void setSharedTeamIds(List<String> sharedTeamIds) {
        this.sharedTeamIds = sharedTeamIds;
    }

    public void setParentConversation(String parentConversation) {
        this.parentConversation = parentConversation;
    }

    public void setPendingConnectedTeamIds(List<String> pendingConnectedTeamIds) {
        this.pendingConnectedTeamIds = pendingConnectedTeamIds;
    }

    public void setConversationHostId(String conversationHostId) {
        this.conversationHostId = conversationHostId;
    }

    public void setInternalTeamIds(List<String> internalTeamIds) {
        this.internalTeamIds = internalTeamIds;
    }

    public void setConnectedTeamIds(List<String> connectedTeamIds) {
        this.connectedTeamIds = connectedTeamIds;
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

    public void setThreadOnly(boolean isThreadOnly) {
        this.isThreadOnly = isThreadOnly;
    }

    public void setNonThreadable(boolean isNonThreadable) {
        this.isNonThreadable = isNonThreadable;
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

    public void setGlobalShared(boolean globalShared) {
        this.globalShared = globalShared;
    }

    public void setOrgDefault(boolean orgDefault) {
        this.orgDefault = orgDefault;
    }

    public void setOrgMandatory(boolean orgMandatory) {
        this.orgMandatory = orgMandatory;
    }

    public void setIsMoved(Integer isMoved) {
        this.isMoved = isMoved;
    }

    public void setMember(boolean isMember) {
        this.isMember = isMember;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public void setPrivate(boolean isPrivate) {
        this.isPrivate = isPrivate;
    }

    public void setMpim(boolean isMpim) {
        this.isMpim = isMpim;
    }

    public static class ConversationBuilder {
        private String enterpriseId;
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
        private String user;
        private Double priority;
        private List<String> sharedTeamIds;
        private String parentConversation;
        private List<String> pendingConnectedTeamIds;
        private String conversationHostId;
        private List<String> internalTeamIds;
        private List<String> connectedTeamIds;
        private boolean isChannel;
        private boolean isGroup;
        private boolean isIm;
        private boolean isArchived;
        private boolean isGeneral;
        private boolean isReadOnly;
        private boolean isThreadOnly;
        private boolean isNonThreadable;
        private boolean isShared;
        private boolean isExtShared;
        private boolean isOrgShared;
        private boolean isPendingExtShared;
        private boolean globalShared;
        private boolean orgDefault;
        private boolean orgMandatory;
        private Integer isMoved;
        private boolean isMember;
        private boolean open;
        private boolean isPrivate;
        private boolean isMpim;

        ConversationBuilder() {
        }

        public Conversation.ConversationBuilder enterpriseId(String enterpriseId) {
            this.enterpriseId = enterpriseId;
            return this;
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

        public Conversation.ConversationBuilder user(String user) {
            this.user = user;
            return this;
        }

        public Conversation.ConversationBuilder priority(Double priority) {
            this.priority = priority;
            return this;
        }

        public Conversation.ConversationBuilder sharedTeamIds(List<String> sharedTeamIds) {
            this.sharedTeamIds = sharedTeamIds;
            return this;
        }

        public Conversation.ConversationBuilder parentConversation(String parentConversation) {
            this.parentConversation = parentConversation;
            return this;
        }

        public Conversation.ConversationBuilder pendingConnectedTeamIds(List<String> pendingConnectedTeamIds) {
            this.pendingConnectedTeamIds = pendingConnectedTeamIds;
            return this;
        }

        public Conversation.ConversationBuilder conversationHostId(String conversationHostId) {
            this.conversationHostId = conversationHostId;
            return this;
        }

        public Conversation.ConversationBuilder internalTeamIds(List<String> internalTeamIds) {
            this.internalTeamIds = internalTeamIds;
            return this;
        }

        public Conversation.ConversationBuilder connectedTeamIds(List<String> connectedTeamIds) {
            this.connectedTeamIds = connectedTeamIds;
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

        public Conversation.ConversationBuilder isThreadOnly(boolean isThreadOnly) {
            this.isThreadOnly = isThreadOnly;
            return this;
        }

        public Conversation.ConversationBuilder isNonThreadable(boolean isNonThreadable) {
            this.isNonThreadable = isNonThreadable;
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

        public Conversation.ConversationBuilder globalShared(boolean globalShared) {
            this.globalShared = globalShared;
            return this;
        }

        public Conversation.ConversationBuilder orgDefault(boolean orgDefault) {
            this.orgDefault = orgDefault;
            return this;
        }

        public Conversation.ConversationBuilder orgMandatory(boolean orgMandatory) {
            this.orgMandatory = orgMandatory;
            return this;
        }

        public Conversation.ConversationBuilder isMoved(Integer isMoved) {
            this.isMoved = isMoved;
            return this;
        }

        public Conversation.ConversationBuilder isMember(boolean isMember) {
            this.isMember = isMember;
            return this;
        }

        public Conversation.ConversationBuilder open(boolean open) {
            this.open = open;
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
            return new Conversation(enterpriseId, id, name, created, creator, unlinked, nameNormalized, pendingShared, lastRead, topic, purpose, previousNames, numOfMembers, members, latest, locale, unreadCount, unreadCountDisplay, user, priority, sharedTeamIds, parentConversation, pendingConnectedTeamIds, conversationHostId, internalTeamIds, connectedTeamIds, isChannel, isGroup, isIm, isArchived, isGeneral, isReadOnly, isThreadOnly, isNonThreadable, isShared, isExtShared, isOrgShared, isPendingExtShared, globalShared, orgDefault, orgMandatory, isMoved, isMember, open, isPrivate, isMpim);
        }

        public String toString() {
            return "Conversation.ConversationBuilder(enterpriseId=" + this.enterpriseId + ", id=" + this.id + ", name=" + this.name + ", created=" + this.created + ", creator=" + this.creator + ", unlinked=" + this.unlinked + ", nameNormalized=" + this.nameNormalized + ", pendingShared=" + this.pendingShared + ", lastRead=" + this.lastRead + ", topic=" + this.topic + ", purpose=" + this.purpose + ", previousNames=" + this.previousNames + ", numOfMembers=" + this.numOfMembers + ", members=" + this.members + ", latest=" + this.latest + ", locale=" + this.locale + ", unreadCount=" + this.unreadCount + ", unreadCountDisplay=" + this.unreadCountDisplay + ", user=" + this.user + ", priority=" + this.priority + ", sharedTeamIds=" + this.sharedTeamIds + ", parentConversation=" + this.parentConversation + ", pendingConnectedTeamIds=" + this.pendingConnectedTeamIds + ", conversationHostId=" + this.conversationHostId + ", internalTeamIds=" + this.internalTeamIds + ", connectedTeamIds=" + this.connectedTeamIds + ", isChannel=" + this.isChannel + ", isGroup=" + this.isGroup + ", isIm=" + this.isIm + ", isArchived=" + this.isArchived + ", isGeneral=" + this.isGeneral + ", isReadOnly=" + this.isReadOnly + ", isThreadOnly=" + this.isThreadOnly + ", isNonThreadable=" + this.isNonThreadable + ", isShared=" + this.isShared + ", isExtShared=" + this.isExtShared + ", isOrgShared=" + this.isOrgShared + ", isPendingExtShared=" + this.isPendingExtShared + ", globalShared=" + this.globalShared + ", orgDefault=" + this.orgDefault + ", orgMandatory=" + this.orgMandatory + ", isMoved=" + this.isMoved + ", isMember=" + this.isMember + ", open=" + this.open + ", isPrivate=" + this.isPrivate + ", isMpim=" + this.isMpim + ")";
        }
    }
}
