package com.github.seratch.jslack.api.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Team {

    private String id;
    private String name;
    private String domain;
    private String emailDomain;
    private TeamIcon icon;

    public Team() {
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getDomain() {
        return this.domain;
    }

    public String getEmailDomain() {
        return this.emailDomain;
    }

    public TeamIcon getIcon() {
        return this.icon;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public void setEmailDomain(String emailDomain) {
        this.emailDomain = emailDomain;
    }

    public void setIcon(TeamIcon icon) {
        this.icon = icon;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Team)) return false;
        final Team other = (Team) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        final Object this$domain = this.getDomain();
        final Object other$domain = other.getDomain();
        if (this$domain == null ? other$domain != null : !this$domain.equals(other$domain)) return false;
        final Object this$emailDomain = this.getEmailDomain();
        final Object other$emailDomain = other.getEmailDomain();
        if (this$emailDomain == null ? other$emailDomain != null : !this$emailDomain.equals(other$emailDomain))
            return false;
        final Object this$icon = this.getIcon();
        final Object other$icon = other.getIcon();
        if (this$icon == null ? other$icon != null : !this$icon.equals(other$icon)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Team;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        final Object $domain = this.getDomain();
        result = result * PRIME + ($domain == null ? 43 : $domain.hashCode());
        final Object $emailDomain = this.getEmailDomain();
        result = result * PRIME + ($emailDomain == null ? 43 : $emailDomain.hashCode());
        final Object $icon = this.getIcon();
        result = result * PRIME + ($icon == null ? 43 : $icon.hashCode());
        return result;
    }

    public String toString() {
        return "Team(id=" + this.getId() + ", name=" + this.getName() + ", domain=" + this.getDomain() + ", emailDomain=" + this.getEmailDomain() + ", icon=" + this.getIcon() + ")";
    }

    public static class Profile {
        private String id;
        private Integer ordering;
        private String label;
        private String hint;
        private String type;
        private List<String> possibleValues;
        private ProfileOptions options;

        public Profile() {
        }

        public String getId() {
            return this.id;
        }

        public Integer getOrdering() {
            return this.ordering;
        }

        public String getLabel() {
            return this.label;
        }

        public String getHint() {
            return this.hint;
        }

        public String getType() {
            return this.type;
        }

        public List<String> getPossibleValues() {
            return this.possibleValues;
        }

        public ProfileOptions getOptions() {
            return this.options;
        }

        public void setId(String id) {
            this.id = id;
        }

        public void setOrdering(Integer ordering) {
            this.ordering = ordering;
        }

        public void setLabel(String label) {
            this.label = label;
        }

        public void setHint(String hint) {
            this.hint = hint;
        }

        public void setType(String type) {
            this.type = type;
        }

        public void setPossibleValues(List<String> possibleValues) {
            this.possibleValues = possibleValues;
        }

        public void setOptions(ProfileOptions options) {
            this.options = options;
        }

        public boolean equals(final Object o) {
            if (o == this) return true;
            if (!(o instanceof Profile)) return false;
            final Profile other = (Profile) o;
            if (!other.canEqual((Object) this)) return false;
            final Object this$id = this.getId();
            final Object other$id = other.getId();
            if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
            final Object this$ordering = this.getOrdering();
            final Object other$ordering = other.getOrdering();
            if (this$ordering == null ? other$ordering != null : !this$ordering.equals(other$ordering)) return false;
            final Object this$label = this.getLabel();
            final Object other$label = other.getLabel();
            if (this$label == null ? other$label != null : !this$label.equals(other$label)) return false;
            final Object this$hint = this.getHint();
            final Object other$hint = other.getHint();
            if (this$hint == null ? other$hint != null : !this$hint.equals(other$hint)) return false;
            final Object this$type = this.getType();
            final Object other$type = other.getType();
            if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
            final Object this$possibleValues = this.getPossibleValues();
            final Object other$possibleValues = other.getPossibleValues();
            if (this$possibleValues == null ? other$possibleValues != null : !this$possibleValues.equals(other$possibleValues))
                return false;
            final Object this$options = this.getOptions();
            final Object other$options = other.getOptions();
            if (this$options == null ? other$options != null : !this$options.equals(other$options)) return false;
            return true;
        }

        protected boolean canEqual(final Object other) {
            return other instanceof Profile;
        }

        public int hashCode() {
            final int PRIME = 59;
            int result = 1;
            final Object $id = this.getId();
            result = result * PRIME + ($id == null ? 43 : $id.hashCode());
            final Object $ordering = this.getOrdering();
            result = result * PRIME + ($ordering == null ? 43 : $ordering.hashCode());
            final Object $label = this.getLabel();
            result = result * PRIME + ($label == null ? 43 : $label.hashCode());
            final Object $hint = this.getHint();
            result = result * PRIME + ($hint == null ? 43 : $hint.hashCode());
            final Object $type = this.getType();
            result = result * PRIME + ($type == null ? 43 : $type.hashCode());
            final Object $possibleValues = this.getPossibleValues();
            result = result * PRIME + ($possibleValues == null ? 43 : $possibleValues.hashCode());
            final Object $options = this.getOptions();
            result = result * PRIME + ($options == null ? 43 : $options.hashCode());
            return result;
        }

        public String toString() {
            return "Team.Profile(id=" + this.getId() + ", ordering=" + this.getOrdering() + ", label=" + this.getLabel() + ", hint=" + this.getHint() + ", type=" + this.getType() + ", possibleValues=" + this.getPossibleValues() + ", options=" + this.getOptions() + ")";
        }
    }

    public static class ProfileOptions {
        @SerializedName("is_protected")
        private boolean _protected;

        public ProfileOptions() {
        }

        public boolean isProtected() {
            return _protected;
        }

        public void setProtected(boolean isProtected) {
            this._protected = isProtected;
        }

        public boolean is_protected() {
            return this._protected;
        }

        public void set_protected(boolean _protected) {
            this._protected = _protected;
        }

        public boolean equals(final Object o) {
            if (o == this) return true;
            if (!(o instanceof ProfileOptions)) return false;
            final ProfileOptions other = (ProfileOptions) o;
            if (!other.canEqual((Object) this)) return false;
            if (this.is_protected() != other.is_protected()) return false;
            return true;
        }

        protected boolean canEqual(final Object other) {
            return other instanceof ProfileOptions;
        }

        public int hashCode() {
            final int PRIME = 59;
            int result = 1;
            result = result * PRIME + (this.is_protected() ? 79 : 97);
            return result;
        }

        public String toString() {
            return "Team.ProfileOptions(_protected=" + this.is_protected() + ")";
        }
    }
}
