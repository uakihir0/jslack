package com.github.seratch.jslack.api.model;

import com.google.gson.annotations.SerializedName;

/**
 * https://api.slack.com/types/im
 */
public class Im {

    private String id;
    @SerializedName("is_im")
    private boolean im;
    private String user;
    private Integer created;
    @SerializedName("is_org_shared")
    private boolean orgShared;
    @SerializedName("is_user_deleted")
    private boolean user_deleted;
    private Double priority;
    private String latest;

    public Im() {
    }

    public String getId() {
        return this.id;
    }

    public boolean isIm() {
        return this.im;
    }

    public String getUser() {
        return this.user;
    }

    public Integer getCreated() {
        return this.created;
    }

    public boolean isOrgShared() {
        return this.orgShared;
    }

    public boolean isUser_deleted() {
        return this.user_deleted;
    }

    public Double getPriority() {
        return this.priority;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setIm(boolean im) {
        this.im = im;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setCreated(Integer created) {
        this.created = created;
    }

    public void setOrgShared(boolean orgShared) {
        this.orgShared = orgShared;
    }

    public void setUser_deleted(boolean user_deleted) {
        this.user_deleted = user_deleted;
    }

    public void setPriority(Double priority) {
        this.priority = priority;
    }

    public String getLatest() {
        return latest;
    }

    public void setLatest(String latest) {
        this.latest = latest;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Im)) return false;
        final Im other = (Im) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        if (this.isIm() != other.isIm()) return false;
        final Object this$user = this.getUser();
        final Object other$user = other.getUser();
        if (this$user == null ? other$user != null : !this$user.equals(other$user)) return false;
        final Object this$created = this.getCreated();
        final Object other$created = other.getCreated();
        if (this$created == null ? other$created != null : !this$created.equals(other$created)) return false;
        if (this.isOrgShared() != other.isOrgShared()) return false;
        if (this.isUser_deleted() != other.isUser_deleted()) return false;
        final Object this$priority = this.getPriority();
        final Object other$priority = other.getPriority();
        if (this$priority == null ? other$priority != null : !this$priority.equals(other$priority)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Im;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        result = result * PRIME + (this.isIm() ? 79 : 97);
        final Object $user = this.getUser();
        result = result * PRIME + ($user == null ? 43 : $user.hashCode());
        final Object $created = this.getCreated();
        result = result * PRIME + ($created == null ? 43 : $created.hashCode());
        result = result * PRIME + (this.isOrgShared() ? 79 : 97);
        result = result * PRIME + (this.isUser_deleted() ? 79 : 97);
        final Object $priority = this.getPriority();
        result = result * PRIME + ($priority == null ? 43 : $priority.hashCode());
        return result;
    }

    public String toString() {
        return "Im(id=" + this.getId() + ", im=" + this.isIm() + ", user=" + this.getUser() + ", created=" + this.getCreated() + ", orgShared=" + this.isOrgShared() + ", user_deleted=" + this.isUser_deleted() + ", priority=" + this.getPriority() + ")";
    }
}
