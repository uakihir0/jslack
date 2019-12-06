package com.github.seratch.jslack.api.model;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

/**
 * https://api.slack.com/types/im
 */
@Getter
@Setter
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
}
