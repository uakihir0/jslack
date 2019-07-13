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

    public TeamProfileChangeEvent() {
    }

    public String getType() {
        return this.type;
    }

    public Profile getProfile() {
        return this.profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof TeamProfileChangeEvent)) return false;
        final TeamProfileChangeEvent other = (TeamProfileChangeEvent) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$type = this.getType();
        final Object other$type = other.getType();
        if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
        final Object this$profile = this.getProfile();
        final Object other$profile = other.getProfile();
        if (this$profile == null ? other$profile != null : !this$profile.equals(other$profile)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof TeamProfileChangeEvent;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $type = this.getType();
        result = result * PRIME + ($type == null ? 43 : $type.hashCode());
        final Object $profile = this.getProfile();
        result = result * PRIME + ($profile == null ? 43 : $profile.hashCode());
        return result;
    }

    public String toString() {
        return "TeamProfileChangeEvent(type=" + this.getType() + ", profile=" + this.getProfile() + ")";
    }

    public static class Profile {
        private List<Field> fields;

        public Profile() {
        }

        public List<Field> getFields() {
            return this.fields;
        }

        public void setFields(List<Field> fields) {
            this.fields = fields;
        }

        public boolean equals(final Object o) {
            if (o == this) return true;
            if (!(o instanceof Profile)) return false;
            final Profile other = (Profile) o;
            if (!other.canEqual((Object) this)) return false;
            final Object this$fields = this.getFields();
            final Object other$fields = other.getFields();
            if (this$fields == null ? other$fields != null : !this$fields.equals(other$fields)) return false;
            return true;
        }

        protected boolean canEqual(final Object other) {
            return other instanceof Profile;
        }

        public int hashCode() {
            final int PRIME = 59;
            int result = 1;
            final Object $fields = this.getFields();
            result = result * PRIME + ($fields == null ? 43 : $fields.hashCode());
            return result;
        }

        public String toString() {
            return "TeamProfileChangeEvent.Profile(fields=" + this.getFields() + ")";
        }
    }

    public static class Field {
        private String id;

        public Field() {
        }

        public String getId() {
            return this.id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public boolean equals(final Object o) {
            if (o == this) return true;
            if (!(o instanceof Field)) return false;
            final Field other = (Field) o;
            if (!other.canEqual((Object) this)) return false;
            final Object this$id = this.getId();
            final Object other$id = other.getId();
            if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
            return true;
        }

        protected boolean canEqual(final Object other) {
            return other instanceof Field;
        }

        public int hashCode() {
            final int PRIME = 59;
            int result = 1;
            final Object $id = this.getId();
            result = result * PRIME + ($id == null ? 43 : $id.hashCode());
            return result;
        }

        public String toString() {
            return "TeamProfileChangeEvent.Field(id=" + this.getId() + ")";
        }
        // TODO: other attributes
    }

}