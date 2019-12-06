package com.github.seratch.jslack.api.model;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

/**
 * https://api.slack.com/methods/files.comments.add
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FileComment {

    private String id;
    private Integer created;
    private Integer timestamp;
    private String user;
    private String comment;
    private String channel;

    @SerializedName("is_intro")
    private boolean intro;
}