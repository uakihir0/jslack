package com.github.seratch.jslack.api.model;

import com.google.gson.annotations.SerializedName;

import java.util.Map;

/**
 * https://api.slack.com/types/user
 */
public class User {

    private String id;
    private String name;
    private boolean deleted;
    private String color;
    private Profile profile;
    @SerializedName("is_admin")
    private boolean admin;
    @SerializedName("is_owner")
    private boolean owner;
    @SerializedName("is_primary_owner")
    private boolean primaryOwner;
    @SerializedName("is_restricted")
    private boolean restricted;
    @SerializedName("is_ultra_restricted")
    private boolean ultraRestricted;
    private boolean has2fa;
    private String twoFactorType;
    private boolean hasFiles;

    public User() {
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public boolean isDeleted() {
        return this.deleted;
    }

    public String getColor() {
        return this.color;
    }

    public Profile getProfile() {
        return this.profile;
    }

    public boolean isAdmin() {
        return this.admin;
    }

    public boolean isOwner() {
        return this.owner;
    }

    public boolean isPrimaryOwner() {
        return this.primaryOwner;
    }

    public boolean isRestricted() {
        return this.restricted;
    }

    public boolean isUltraRestricted() {
        return this.ultraRestricted;
    }

    public boolean isHas2fa() {
        return this.has2fa;
    }

    public String getTwoFactorType() {
        return this.twoFactorType;
    }

    public boolean isHasFiles() {
        return this.hasFiles;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public void setOwner(boolean owner) {
        this.owner = owner;
    }

    public void setPrimaryOwner(boolean primaryOwner) {
        this.primaryOwner = primaryOwner;
    }

    public void setRestricted(boolean restricted) {
        this.restricted = restricted;
    }

    public void setUltraRestricted(boolean ultraRestricted) {
        this.ultraRestricted = ultraRestricted;
    }

    public void setHas2fa(boolean has2fa) {
        this.has2fa = has2fa;
    }

    public void setTwoFactorType(String twoFactorType) {
        this.twoFactorType = twoFactorType;
    }

    public void setHasFiles(boolean hasFiles) {
        this.hasFiles = hasFiles;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof User)) return false;
        final User other = (User) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        if (this.isDeleted() != other.isDeleted()) return false;
        final Object this$color = this.getColor();
        final Object other$color = other.getColor();
        if (this$color == null ? other$color != null : !this$color.equals(other$color)) return false;
        final Object this$profile = this.getProfile();
        final Object other$profile = other.getProfile();
        if (this$profile == null ? other$profile != null : !this$profile.equals(other$profile)) return false;
        if (this.isAdmin() != other.isAdmin()) return false;
        if (this.isOwner() != other.isOwner()) return false;
        if (this.isPrimaryOwner() != other.isPrimaryOwner()) return false;
        if (this.isRestricted() != other.isRestricted()) return false;
        if (this.isUltraRestricted() != other.isUltraRestricted()) return false;
        if (this.isHas2fa() != other.isHas2fa()) return false;
        final Object this$twoFactorType = this.getTwoFactorType();
        final Object other$twoFactorType = other.getTwoFactorType();
        if (this$twoFactorType == null ? other$twoFactorType != null : !this$twoFactorType.equals(other$twoFactorType))
            return false;
        if (this.isHasFiles() != other.isHasFiles()) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        result = result * PRIME + (this.isDeleted() ? 79 : 97);
        final Object $color = this.getColor();
        result = result * PRIME + ($color == null ? 43 : $color.hashCode());
        final Object $profile = this.getProfile();
        result = result * PRIME + ($profile == null ? 43 : $profile.hashCode());
        result = result * PRIME + (this.isAdmin() ? 79 : 97);
        result = result * PRIME + (this.isOwner() ? 79 : 97);
        result = result * PRIME + (this.isPrimaryOwner() ? 79 : 97);
        result = result * PRIME + (this.isRestricted() ? 79 : 97);
        result = result * PRIME + (this.isUltraRestricted() ? 79 : 97);
        result = result * PRIME + (this.isHas2fa() ? 79 : 97);
        final Object $twoFactorType = this.getTwoFactorType();
        result = result * PRIME + ($twoFactorType == null ? 43 : $twoFactorType.hashCode());
        result = result * PRIME + (this.isHasFiles() ? 79 : 97);
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof User;
    }

    public String toString() {
        return "User(id=" + this.getId() + ", name=" + this.getName() + ", deleted=" + this.isDeleted() + ", color=" + this.getColor() + ", profile=" + this.getProfile() + ", admin=" + this.isAdmin() + ", owner=" + this.isOwner() + ", primaryOwner=" + this.isPrimaryOwner() + ", restricted=" + this.isRestricted() + ", ultraRestricted=" + this.isUltraRestricted() + ", has2fa=" + this.isHas2fa() + ", twoFactorType=" + this.getTwoFactorType() + ", hasFiles=" + this.isHasFiles() + ")";
    }

    public static class Profile {
        private String firstName;
        private String lastName;
        private String realName;
        private String email;
        private String skype;
        private String phone;
        @SerializedName("image_24")
        private String image24;
        @SerializedName("image_32")
        private String image32;
        @SerializedName("image_48")
        private String image48;
        @SerializedName("image_72")
        private String image72;
        @SerializedName("image_192")
        private String image192;
        @SerializedName("image_512")
        private String image512;
        private String imageOriginal;

        private Map<String, Field> fields;

        public Profile() {
        }

        public String getFirstName() {
            return this.firstName;
        }

        public String getLastName() {
            return this.lastName;
        }

        public String getRealName() {
            return this.realName;
        }

        public String getEmail() {
            return this.email;
        }

        public String getSkype() {
            return this.skype;
        }

        public String getPhone() {
            return this.phone;
        }

        public String getImage24() {
            return this.image24;
        }

        public String getImage32() {
            return this.image32;
        }

        public String getImage48() {
            return this.image48;
        }

        public String getImage72() {
            return this.image72;
        }

        public String getImage192() {
            return this.image192;
        }

        public String getImage512() {
            return this.image512;
        }

        public String getImageOriginal() {
            return this.imageOriginal;
        }

        public Map<String, Field> getFields() {
            return this.fields;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public void setRealName(String realName) {
            this.realName = realName;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public void setSkype(String skype) {
            this.skype = skype;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public void setImage24(String image24) {
            this.image24 = image24;
        }

        public void setImage32(String image32) {
            this.image32 = image32;
        }

        public void setImage48(String image48) {
            this.image48 = image48;
        }

        public void setImage72(String image72) {
            this.image72 = image72;
        }

        public void setImage192(String image192) {
            this.image192 = image192;
        }

        public void setImage512(String image512) {
            this.image512 = image512;
        }

        public void setImageOriginal(String imageOriginal) {
            this.imageOriginal = imageOriginal;
        }

        public void setFields(Map<String, Field> fields) {
            this.fields = fields;
        }

        public boolean equals(Object o) {
            if (o == this) return true;
            if (!(o instanceof Profile)) return false;
            final Profile other = (Profile) o;
            if (!other.canEqual((Object) this)) return false;
            final Object this$firstName = this.getFirstName();
            final Object other$firstName = other.getFirstName();
            if (this$firstName == null ? other$firstName != null : !this$firstName.equals(other$firstName))
                return false;
            final Object this$lastName = this.getLastName();
            final Object other$lastName = other.getLastName();
            if (this$lastName == null ? other$lastName != null : !this$lastName.equals(other$lastName)) return false;
            final Object this$realName = this.getRealName();
            final Object other$realName = other.getRealName();
            if (this$realName == null ? other$realName != null : !this$realName.equals(other$realName)) return false;
            final Object this$email = this.getEmail();
            final Object other$email = other.getEmail();
            if (this$email == null ? other$email != null : !this$email.equals(other$email)) return false;
            final Object this$skype = this.getSkype();
            final Object other$skype = other.getSkype();
            if (this$skype == null ? other$skype != null : !this$skype.equals(other$skype)) return false;
            final Object this$phone = this.getPhone();
            final Object other$phone = other.getPhone();
            if (this$phone == null ? other$phone != null : !this$phone.equals(other$phone)) return false;
            final Object this$image24 = this.getImage24();
            final Object other$image24 = other.getImage24();
            if (this$image24 == null ? other$image24 != null : !this$image24.equals(other$image24)) return false;
            final Object this$image32 = this.getImage32();
            final Object other$image32 = other.getImage32();
            if (this$image32 == null ? other$image32 != null : !this$image32.equals(other$image32)) return false;
            final Object this$image48 = this.getImage48();
            final Object other$image48 = other.getImage48();
            if (this$image48 == null ? other$image48 != null : !this$image48.equals(other$image48)) return false;
            final Object this$image72 = this.getImage72();
            final Object other$image72 = other.getImage72();
            if (this$image72 == null ? other$image72 != null : !this$image72.equals(other$image72)) return false;
            final Object this$image192 = this.getImage192();
            final Object other$image192 = other.getImage192();
            if (this$image192 == null ? other$image192 != null : !this$image192.equals(other$image192)) return false;
            final Object this$image512 = this.getImage512();
            final Object other$image512 = other.getImage512();
            if (this$image512 == null ? other$image512 != null : !this$image512.equals(other$image512)) return false;
            final Object this$imageOriginal = this.getImageOriginal();
            final Object other$imageOriginal = other.getImageOriginal();
            if (this$imageOriginal == null ? other$imageOriginal != null : !this$imageOriginal.equals(other$imageOriginal))
                return false;
            final Object this$fields = this.getFields();
            final Object other$fields = other.getFields();
            if (this$fields == null ? other$fields != null : !this$fields.equals(other$fields)) return false;
            return true;
        }

        public int hashCode() {
            final int PRIME = 59;
            int result = 1;
            final Object $firstName = this.getFirstName();
            result = result * PRIME + ($firstName == null ? 43 : $firstName.hashCode());
            final Object $lastName = this.getLastName();
            result = result * PRIME + ($lastName == null ? 43 : $lastName.hashCode());
            final Object $realName = this.getRealName();
            result = result * PRIME + ($realName == null ? 43 : $realName.hashCode());
            final Object $email = this.getEmail();
            result = result * PRIME + ($email == null ? 43 : $email.hashCode());
            final Object $skype = this.getSkype();
            result = result * PRIME + ($skype == null ? 43 : $skype.hashCode());
            final Object $phone = this.getPhone();
            result = result * PRIME + ($phone == null ? 43 : $phone.hashCode());
            final Object $image24 = this.getImage24();
            result = result * PRIME + ($image24 == null ? 43 : $image24.hashCode());
            final Object $image32 = this.getImage32();
            result = result * PRIME + ($image32 == null ? 43 : $image32.hashCode());
            final Object $image48 = this.getImage48();
            result = result * PRIME + ($image48 == null ? 43 : $image48.hashCode());
            final Object $image72 = this.getImage72();
            result = result * PRIME + ($image72 == null ? 43 : $image72.hashCode());
            final Object $image192 = this.getImage192();
            result = result * PRIME + ($image192 == null ? 43 : $image192.hashCode());
            final Object $image512 = this.getImage512();
            result = result * PRIME + ($image512 == null ? 43 : $image512.hashCode());
            final Object $imageOriginal = this.getImageOriginal();
            result = result * PRIME + ($imageOriginal == null ? 43 : $imageOriginal.hashCode());
            final Object $fields = this.getFields();
            result = result * PRIME + ($fields == null ? 43 : $fields.hashCode());
            return result;
        }

        protected boolean canEqual(Object other) {
            return other instanceof Profile;
        }

        public String toString() {
            return "User.Profile(firstName=" + this.getFirstName() + ", lastName=" + this.getLastName() + ", realName=" + this.getRealName() + ", email=" + this.getEmail() + ", skype=" + this.getSkype() + ", phone=" + this.getPhone() + ", image24=" + this.getImage24() + ", image32=" + this.getImage32() + ", image48=" + this.getImage48() + ", image72=" + this.getImage72() + ", image192=" + this.getImage192() + ", image512=" + this.getImage512() + ", imageOriginal=" + this.getImageOriginal() + ", fields=" + this.getFields() + ")";
        }

        public static class Field {
            private String value;
            private String alt;
            private String label;

            public Field() {
            }

            public String getValue() {
                return this.value;
            }

            public String getAlt() {
                return this.alt;
            }

            public String getLabel() {
                return this.label;
            }

            public void setValue(String value) {
                this.value = value;
            }

            public void setAlt(String alt) {
                this.alt = alt;
            }

            public void setLabel(String label) {
                this.label = label;
            }

            public boolean equals(Object o) {
                if (o == this) return true;
                if (!(o instanceof Field)) return false;
                final Field other = (Field) o;
                if (!other.canEqual((Object) this)) return false;
                final Object this$value = this.getValue();
                final Object other$value = other.getValue();
                if (this$value == null ? other$value != null : !this$value.equals(other$value)) return false;
                final Object this$alt = this.getAlt();
                final Object other$alt = other.getAlt();
                if (this$alt == null ? other$alt != null : !this$alt.equals(other$alt)) return false;
                final Object this$label = this.getLabel();
                final Object other$label = other.getLabel();
                if (this$label == null ? other$label != null : !this$label.equals(other$label)) return false;
                return true;
            }

            public int hashCode() {
                final int PRIME = 59;
                int result = 1;
                final Object $value = this.getValue();
                result = result * PRIME + ($value == null ? 43 : $value.hashCode());
                final Object $alt = this.getAlt();
                result = result * PRIME + ($alt == null ? 43 : $alt.hashCode());
                final Object $label = this.getLabel();
                result = result * PRIME + ($label == null ? 43 : $label.hashCode());
                return result;
            }

            protected boolean canEqual(Object other) {
                return other instanceof Field;
            }

            public String toString() {
                return "User.Profile.Field(value=" + this.getValue() + ", alt=" + this.getAlt() + ", label=" + this.getLabel() + ")";
            }
        }
    }
}
