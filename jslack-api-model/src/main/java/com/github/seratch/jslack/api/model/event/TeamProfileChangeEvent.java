package com.github.seratch.jslack.api.model.event;

import java.util.List;

/**
 * The team_profile_change event is sent to all connections for a workspace
 * when Workspace Admin updates the field definitions in the profile.
 * Only the modified field definitions are included in the payload.
 * Where appropriate, clients should update to reflect new changes immediately.
 * <p>
 * https://api.slack.com/events/team_profile_change
 */
public class TeamProfileChangeEvent implements Event {

    public static final String TYPE_NAME = "team_profile_change";

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

        public String getId() {
            return this.id;
        }

        public void setId(String id) {
            this.id = id;
        }
        // TODO: other attributes
    }

}