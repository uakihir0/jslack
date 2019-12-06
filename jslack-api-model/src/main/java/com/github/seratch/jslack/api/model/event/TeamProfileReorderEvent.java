package com.github.seratch.jslack.api.model.event;

import java.util.List;

/**
 * The team_profile_reorder event is sent to all connections for a workspace
 * when Workspace Admin reorders the field definitions in the profile.
 * The payload includes only the id and the ordering for each field definition that is reordered.
 * Where appropriate, clients should update to reflect new changes immediately.
 * <p>
 * https://api.slack.com/events/team_profile_reorder
 */
public class TeamProfileReorderEvent implements Event {

    public static final String TYPE_NAME = "team_profile_reorder";

    private final String type = TYPE_NAME;
    private Profile profile;

    public String getType() {
        return this.type;
    }

    public Profile getProfile() {
        return this.profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public static class Profile {
        private List<Field> fields;

        public List<Field> getFields() {
            return this.fields;
        }

        public void setFields(List<Field> fields) {
            this.fields = fields;
        }
    }

    public static class Field {
        private String id;
        private Integer ordering;

        public String getId() {
            return this.id;
        }

        public Integer getOrdering() {
            return this.ordering;
        }

        public void setId(String id) {
            this.id = id;
        }

        public void setOrdering(Integer ordering) {
            this.ordering = ordering;
        }
        // TODO: other attributes
    }

}