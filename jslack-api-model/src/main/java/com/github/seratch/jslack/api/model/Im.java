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
    @SerializedName("is_archived")
    private boolean archived;
    private Double priority;
    private String latest;

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

    public boolean isArchived() {
        return this.archived;
    }

    public Double getPriority() {
        return this.priority;
    }

    public String getLatest() {
        return this.latest;
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

    public void setArchived(boolean archived) {
        this.archived = archived;
    }

    public void setPriority(Double priority) {
        this.priority = priority;
    }

    public void setLatest(String latest) {
        this.latest = latest;
    }
}
