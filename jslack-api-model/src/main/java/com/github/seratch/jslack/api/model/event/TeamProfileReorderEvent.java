package com.github.seratch.jslack.api.model.event;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * The team_profile_reorder event is sent to all connections for a workspace
 * when Workspace Admin reorders the field definitions in the profile.
 * The payload includes only the id and the ordering for each field definition that is reordered.
 * Where appropriate, clients should update to reflect new changes immediately.
 * <p>
 * https://api.slack.com/events/team_profile_reorder
 */
@Getter
@Setter
public class TeamProfileReorderEvent implements Event {

    public static final String TYPE_NAME = "team_profile_reorder";

    private final String type = TYPE_NAME;
    private Profile profile;

    @Getter
@Setter
    public static class Profile {
        private List<Field> fields;
    }

    @Getter
@Setter
    public static class Field {
        private String id;
        private Integer ordering;
        // TODO: other attributes
    }

}