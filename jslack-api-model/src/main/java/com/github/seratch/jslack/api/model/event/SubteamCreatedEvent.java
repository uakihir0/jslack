package com.github.seratch.jslack.api.model.event;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * The subteam_created event is sent to all connections for a workspace when a new User Group is created.
 * Clients can use this to update their local list of User Groups and group members.
 * <p>
 * https://api.slack.com/events/subteam_created
 */
@Getter
@Setter
public class SubteamCreatedEvent implements Event {

    public static final String TYPE_NAME = "subteam_created";

    private final String type = TYPE_NAME;
    private Subteam subteam;

    @Getter
@Setter
    public static class Subteam {
        private String id;
        private String teamId;
        @SerializedName("is_usergroup")
        private boolean usergroup;
        private String name;
        private String description;
        private String handle;
        @SerializedName("is_external")
        private boolean external;
        private Integer dateCreate;
        private Integer dateUpdate;
        private Integer dateDelete;
        private String autoType;
        private String createdBy;
        private String updatedBy;
        private String deletedBy;
        private Prefs prefs;
        private String userCount;
    }

    @Getter
@Setter
    public static class Prefs {
        private List<String> channels;
        private List<String> groups;
    }

}