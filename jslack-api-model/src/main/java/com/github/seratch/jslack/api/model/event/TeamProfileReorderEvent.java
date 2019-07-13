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

    public TeamProfileReorderEvent() {
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
        if (!(o instanceof TeamProfileReorderEvent)) return false;
        final TeamProfileReorderEvent other = (TeamProfileReorderEvent) o;
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
        return other instanceof TeamProfileReorderEvent;
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
        return "TeamProfileReorderEvent(type=" + this.getType() + ", profile=" + this.getProfile() + ")";
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
            return "TeamProfileReorderEvent.Profile(fields=" + this.getFields() + ")";
        }
    }

    public static class Field {
        private String id;
        private Integer ordering;

        public Field() {
        }

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

        public boolean equals(final Object o) {
            if (o == this) return true;
            if (!(o instanceof Field)) return false;
            final Field other = (Field) o;
            if (!other.canEqual((Object) this)) return false;
            final Object this$id = this.getId();
            final Object other$id = other.getId();
            if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
            final Object this$ordering = this.getOrdering();
            final Object other$ordering = other.getOrdering();
            if (this$ordering == null ? other$ordering != null : !this$ordering.equals(other$ordering)) return false;
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
            final Object $ordering = this.getOrdering();
            result = result * PRIME + ($ordering == null ? 43 : $ordering.hashCode());
            return result;
        }

        public String toString() {
            return "TeamProfileReorderEvent.Field(id=" + this.getId() + ", ordering=" + this.getOrdering() + ")";
        }
        // TODO: other attributes
    }

}