package com.github.seratch.jslack.api.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Channel {

    private String enterpriseId;
    private String id;
    private String name;
    private String nameNormalized;
    private Integer created;
    private String creator;

    @SerializedName("is_read_only")
    private boolean readOnly;
    @SerializedName("is_thread_only")
    private boolean threadOnly;
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
    @SerializedName("is_global_shared")
    private boolean globalShared;
    @SerializedName("is_org_default")
    private boolean orgDefault;
    @SerializedName("is_org_mandatory")
    private boolean orgMandatory;
    @SerializedName("is_moved")
    private Integer isMoved;

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

    public String getEnterpriseId() {
        return this.enterpriseId;
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

    public boolean isThreadOnly() {
        return this.threadOnly;
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

    public void setEnterpriseId(String enterpriseId) {
        this.enterpriseId = enterpriseId;
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

    public void setThreadOnly(boolean threadOnly) {
        this.threadOnly = threadOnly;
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
}
