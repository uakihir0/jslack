package com.github.seratch.jslack.api.model.event;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * The team_profile_delete event is sent to all connections for a workspace when Workspace Admin deletes field definitions
 * from the profile. Only the ids of the deleted field definitions are included in the payload.
 * Where appropriate, clients should update to reflect new changes immediately.
 * <p>
 * https://api.slack.com/events/team_profile_delete
 */
@Getter
@Setter
public class TeamProfileDeleteEvent implements Event {

    public static final String TYPE_NAME = "team_profile_delete";

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
        // TODO: other attributes
    }

}