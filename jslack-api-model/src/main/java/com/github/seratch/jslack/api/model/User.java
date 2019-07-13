package com.github.seratch.jslack.api.model;

import com.google.gson.annotations.SerializedName;

import java.util.Map;

/**
 * - https://api.slack.com/types/user
 * - https://api.slack.com/changelog/2017-09-the-one-about-usernames
 */
public class User {

    private String id;
    private String teamId;
    private String name;
    private boolean deleted;
    private String color;
    private String realName;
    private String tz;
    private String tzLabel;
    private Integer tzOffset;
    private Profile profile;
    @SerializedName("is_admin")
    private boolean admin;
    @SerializedName("is_owner")
    private boolean owner;
    @SerializedName("is_primary_owner")
    private boolean primaryOwner;
    /**
     * is_restricted indicates the user is a multi-channel guest.
     * see also: https://get.slack.help/hc/en-us/articles/201314026-roles-and-permissions-in-slack
     */
    @SerializedName("is_restricted")
    private boolean restricted;
    /**
     * is_ultra_restricted indicates they are a single channel guest.
     * see also: https://get.slack.help/hc/en-us/articles/201314026-roles-and-permissions-in-slack
     */
    @SerializedName("is_ultra_restricted")
    private boolean ultraRestricted;
    @SerializedName("is_bot")
    private boolean bot;
    @SerializedName("is_stranger")
    private boolean stranger;
    @SerializedName("is_app_user")
    private boolean appUser;
    private Long updated;
    @SerializedName("has_2fa")
    private boolean has2fa;
    private String presence; // away, etc
    private String twoFactorType;
    private boolean hasFiles;
    private String locale;

    public User() {
    }

    public String getId() {
        return this.id;
    }

    public String getTeamId() {
        return this.teamId;
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

    public String getRealName() {
        return this.realName;
    }

    public String getTz() {
        return this.tz;
    }

    public String getTzLabel() {
        return this.tzLabel;
    }

    public Integer getTzOffset() {
        return this.tzOffset;
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

    public boolean isBot() {
        return this.bot;
    }

    public boolean isStranger() {
        return this.stranger;
    }

    public boolean isAppUser() {
        return this.appUser;
    }

    public Long getUpdated() {
        return this.updated;
    }

    public boolean isHas2fa() {
        return this.has2fa;
    }

    public String getPresence() {
        return this.presence;
    }

    public String getTwoFactorType() {
        return this.twoFactorType;
    }

    public boolean isHasFiles() {
        return this.hasFiles;
    }

    public String getLocale() {
        return this.locale;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
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

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public void setTz(String tz) {
        this.tz = tz;
    }

    public void setTzLabel(String tzLabel) {
        this.tzLabel = tzLabel;
    }

    public void setTzOffset(Integer tzOffset) {
        this.tzOffset = tzOffset;
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

    public void setBot(boolean bot) {
        this.bot = bot;
    }

    public void setStranger(boolean stranger) {
        this.stranger = stranger;
    }

    public void setAppUser(boolean appUser) {
        this.appUser = appUser;
    }

    public void setUpdated(Long updated) {
        this.updated = updated;
    }

    public void setHas2fa(boolean has2fa) {
        this.has2fa = has2fa;
    }

    public void setPresence(String presence) {
        this.presence = presence;
    }

    public void setTwoFactorType(String twoFactorType) {
        this.twoFactorType = twoFactorType;
    }

    public void setHasFiles(boolean hasFiles) {
        this.hasFiles = hasFiles;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof User)) return false;
        final User other = (User) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$teamId = this.getTeamId();
        final Object other$teamId = other.getTeamId();
        if (this$teamId == null ? other$teamId != null : !this$teamId.equals(other$teamId)) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        if (this.isDeleted() != other.isDeleted()) return false;
        final Object this$color = this.getColor();
        final Object other$color = other.getColor();
        if (this$color == null ? other$color != null : !this$color.equals(other$color)) return false;
        final Object this$realName = this.getRealName();
        final Object other$realName = other.getRealName();
        if (this$realName == null ? other$realName != null : !this$realName.equals(other$realName)) return false;
        final Object this$tz = this.getTz();
        final Object other$tz = other.getTz();
        if (this$tz == null ? other$tz != null : !this$tz.equals(other$tz)) return false;
        final Object this$tzLabel = this.getTzLabel();
        final Object other$tzLabel = other.getTzLabel();
        if (this$tzLabel == null ? other$tzLabel != null : !this$tzLabel.equals(other$tzLabel)) return false;
        final Object this$tzOffset = this.getTzOffset();
        final Object other$tzOffset = other.getTzOffset();
        if (this$tzOffset == null ? other$tzOffset != null : !this$tzOffset.equals(other$tzOffset)) return false;
        final Object this$profile = this.getProfile();
        final Object other$profile = other.getProfile();
        if (this$profile == null ? other$profile != null : !this$profile.equals(other$profile)) return false;
        if (this.isAdmin() != other.isAdmin()) return false;
        if (this.isOwner() != other.isOwner()) return false;
        if (this.isPrimaryOwner() != other.isPrimaryOwner()) return false;
        if (this.isRestricted() != other.isRestricted()) return false;
        if (this.isUltraRestricted() != other.isUltraRestricted()) return false;
        if (this.isBot() != other.isBot()) return false;
        if (this.isStranger() != other.isStranger()) return false;
        if (this.isAppUser() != other.isAppUser()) return false;
        final Object this$updated = this.getUpdated();
        final Object other$updated = other.getUpdated();
        if (this$updated == null ? other$updated != null : !this$updated.equals(other$updated)) return false;
        if (this.isHas2fa() != other.isHas2fa()) return false;
        final Object this$presence = this.getPresence();
        final Object other$presence = other.getPresence();
        if (this$presence == null ? other$presence != null : !this$presence.equals(other$presence)) return false;
        final Object this$twoFactorType = this.getTwoFactorType();
        final Object other$twoFactorType = other.getTwoFactorType();
        if (this$twoFactorType == null ? other$twoFactorType != null : !this$twoFactorType.equals(other$twoFactorType))
            return false;
        if (this.isHasFiles() != other.isHasFiles()) return false;
        final Object this$locale = this.getLocale();
        final Object other$locale = other.getLocale();
        if (this$locale == null ? other$locale != null : !this$locale.equals(other$locale)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof User;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $teamId = this.getTeamId();
        result = result * PRIME + ($teamId == null ? 43 : $teamId.hashCode());
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        result = result * PRIME + (this.isDeleted() ? 79 : 97);
        final Object $color = this.getColor();
        result = result * PRIME + ($color == null ? 43 : $color.hashCode());
        final Object $realName = this.getRealName();
        result = result * PRIME + ($realName == null ? 43 : $realName.hashCode());
        final Object $tz = this.getTz();
        result = result * PRIME + ($tz == null ? 43 : $tz.hashCode());
        final Object $tzLabel = this.getTzLabel();
        result = result * PRIME + ($tzLabel == null ? 43 : $tzLabel.hashCode());
        final Object $tzOffset = this.getTzOffset();
        result = result * PRIME + ($tzOffset == null ? 43 : $tzOffset.hashCode());
        final Object $profile = this.getProfile();
        result = result * PRIME + ($profile == null ? 43 : $profile.hashCode());
        result = result * PRIME + (this.isAdmin() ? 79 : 97);
        result = result * PRIME + (this.isOwner() ? 79 : 97);
        result = result * PRIME + (this.isPrimaryOwner() ? 79 : 97);
        result = result * PRIME + (this.isRestricted() ? 79 : 97);
        result = result * PRIME + (this.isUltraRestricted() ? 79 : 97);
        result = result * PRIME + (this.isBot() ? 79 : 97);
        result = result * PRIME + (this.isStranger() ? 79 : 97);
        result = result * PRIME + (this.isAppUser() ? 79 : 97);
        final Object $updated = this.getUpdated();
        result = result * PRIME + ($updated == null ? 43 : $updated.hashCode());
        result = result * PRIME + (this.isHas2fa() ? 79 : 97);
        final Object $presence = this.getPresence();
        result = result * PRIME + ($presence == null ? 43 : $presence.hashCode());
        final Object $twoFactorType = this.getTwoFactorType();
        result = result * PRIME + ($twoFactorType == null ? 43 : $twoFactorType.hashCode());
        result = result * PRIME + (this.isHasFiles() ? 79 : 97);
        final Object $locale = this.getLocale();
        result = result * PRIME + ($locale == null ? 43 : $locale.hashCode());
        return result;
    }

    public String toString() {
        return "User(id=" + this.getId() + ", teamId=" + this.getTeamId() + ", name=" + this.getName() + ", deleted=" + this.isDeleted() + ", color=" + this.getColor() + ", realName=" + this.getRealName() + ", tz=" + this.getTz() + ", tzLabel=" + this.getTzLabel() + ", tzOffset=" + this.getTzOffset() + ", profile=" + this.getProfile() + ", admin=" + this.isAdmin() + ", owner=" + this.isOwner() + ", primaryOwner=" + this.isPrimaryOwner() + ", restricted=" + this.isRestricted() + ", ultraRestricted=" + this.isUltraRestricted() + ", bot=" + this.isBot() + ", stranger=" + this.isStranger() + ", appUser=" + this.isAppUser() + ", updated=" + this.getUpdated() + ", has2fa=" + this.isHas2fa() + ", presence=" + this.getPresence() + ", twoFactorType=" + this.getTwoFactorType() + ", hasFiles=" + this.isHasFiles() + ", locale=" + this.getLocale() + ")";
    }

    public static class Profile {

        private String guestChannels;
        private String guestInvitedBy;
        private String avatarHash;
        private String statusText;
        private String statusTextCanonical;
        private String statusEmoji;
        private Long statusExpiration;

        private String displayName;
        private String displayNameNormalized;
        private String realName;
        private String realNameNormalized;
        private String botId;

        private String title;
        private String email;
        private String skype;
        private String phone;
        private String team;

        private String apiAppId;
        private boolean alwaysActive;

        private String imageOriginal;

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
        @SerializedName("image_1024")
        private String image1024;

        @SerializedName("is_custom_image")
        private boolean customImage;

        private Map<String, Field> fields;

        public Profile() {
        }

        public String getGuestChannels() {
            return this.guestChannels;
        }

        public String getGuestInvitedBy() {
            return this.guestInvitedBy;
        }

        public String getAvatarHash() {
            return this.avatarHash;
        }

        public String getStatusText() {
            return this.statusText;
        }

        public String getStatusTextCanonical() {
            return this.statusTextCanonical;
        }

        public String getStatusEmoji() {
            return this.statusEmoji;
        }

        public Long getStatusExpiration() {
            return this.statusExpiration;
        }

        public String getDisplayName() {
            return this.displayName;
        }

        public String getDisplayNameNormalized() {
            return this.displayNameNormalized;
        }

        public String getRealName() {
            return this.realName;
        }

        public String getRealNameNormalized() {
            return this.realNameNormalized;
        }

        public String getBotId() {
            return this.botId;
        }

        public String getTitle() {
            return this.title;
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

        public String getTeam() {
            return this.team;
        }

        public String getApiAppId() {
            return this.apiAppId;
        }

        public boolean isAlwaysActive() {
            return this.alwaysActive;
        }

        public String getImageOriginal() {
            return this.imageOriginal;
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

        public String getImage1024() {
            return this.image1024;
        }

        public boolean isCustomImage() {
            return this.customImage;
        }

        public Map<String, Field> getFields() {
            return this.fields;
        }

        @Deprecated
        public String getFirstName() {
            return this.firstName;
        }

        @Deprecated
        public String getLastName() {
            return this.lastName;
        }

        public void setGuestChannels(String guestChannels) {
            this.guestChannels = guestChannels;
        }

        public void setGuestInvitedBy(String guestInvitedBy) {
            this.guestInvitedBy = guestInvitedBy;
        }

        public void setAvatarHash(String avatarHash) {
            this.avatarHash = avatarHash;
        }

        public void setStatusText(String statusText) {
            this.statusText = statusText;
        }

        public void setStatusTextCanonical(String statusTextCanonical) {
            this.statusTextCanonical = statusTextCanonical;
        }

        public void setStatusEmoji(String statusEmoji) {
            this.statusEmoji = statusEmoji;
        }

        public void setStatusExpiration(Long statusExpiration) {
            this.statusExpiration = statusExpiration;
        }

        public void setDisplayName(String displayName) {
            this.displayName = displayName;
        }

        public void setDisplayNameNormalized(String displayNameNormalized) {
            this.displayNameNormalized = displayNameNormalized;
        }

        public void setRealName(String realName) {
            this.realName = realName;
        }

        public void setRealNameNormalized(String realNameNormalized) {
            this.realNameNormalized = realNameNormalized;
        }

        public void setBotId(String botId) {
            this.botId = botId;
        }

        public void setTitle(String title) {
            this.title = title;
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

        public void setTeam(String team) {
            this.team = team;
        }

        public void setApiAppId(String apiAppId) {
            this.apiAppId = apiAppId;
        }

        public void setAlwaysActive(boolean alwaysActive) {
            this.alwaysActive = alwaysActive;
        }

        public void setImageOriginal(String imageOriginal) {
            this.imageOriginal = imageOriginal;
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

        public void setImage1024(String image1024) {
            this.image1024 = image1024;
        }

        public void setCustomImage(boolean customImage) {
            this.customImage = customImage;
        }

        public void setFields(Map<String, Field> fields) {
            this.fields = fields;
        }

        @Deprecated
        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        @Deprecated
        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public boolean equals(final Object o) {
            if (o == this) return true;
            if (!(o instanceof Profile)) return false;
            final Profile other = (Profile) o;
            if (!other.canEqual((Object) this)) return false;
            final Object this$guestChannels = this.getGuestChannels();
            final Object other$guestChannels = other.getGuestChannels();
            if (this$guestChannels == null ? other$guestChannels != null : !this$guestChannels.equals(other$guestChannels))
                return false;
            final Object this$guestInvitedBy = this.getGuestInvitedBy();
            final Object other$guestInvitedBy = other.getGuestInvitedBy();
            if (this$guestInvitedBy == null ? other$guestInvitedBy != null : !this$guestInvitedBy.equals(other$guestInvitedBy))
                return false;
            final Object this$avatarHash = this.getAvatarHash();
            final Object other$avatarHash = other.getAvatarHash();
            if (this$avatarHash == null ? other$avatarHash != null : !this$avatarHash.equals(other$avatarHash))
                return false;
            final Object this$statusText = this.getStatusText();
            final Object other$statusText = other.getStatusText();
            if (this$statusText == null ? other$statusText != null : !this$statusText.equals(other$statusText))
                return false;
            final Object this$statusTextCanonical = this.getStatusTextCanonical();
            final Object other$statusTextCanonical = other.getStatusTextCanonical();
            if (this$statusTextCanonical == null ? other$statusTextCanonical != null : !this$statusTextCanonical.equals(other$statusTextCanonical))
                return false;
            final Object this$statusEmoji = this.getStatusEmoji();
            final Object other$statusEmoji = other.getStatusEmoji();
            if (this$statusEmoji == null ? other$statusEmoji != null : !this$statusEmoji.equals(other$statusEmoji))
                return false;
            final Object this$statusExpiration = this.getStatusExpiration();
            final Object other$statusExpiration = other.getStatusExpiration();
            if (this$statusExpiration == null ? other$statusExpiration != null : !this$statusExpiration.equals(other$statusExpiration))
                return false;
            final Object this$displayName = this.getDisplayName();
            final Object other$displayName = other.getDisplayName();
            if (this$displayName == null ? other$displayName != null : !this$displayName.equals(other$displayName))
                return false;
            final Object this$displayNameNormalized = this.getDisplayNameNormalized();
            final Object other$displayNameNormalized = other.getDisplayNameNormalized();
            if (this$displayNameNormalized == null ? other$displayNameNormalized != null : !this$displayNameNormalized.equals(other$displayNameNormalized))
                return false;
            final Object this$realName = this.getRealName();
            final Object other$realName = other.getRealName();
            if (this$realName == null ? other$realName != null : !this$realName.equals(other$realName)) return false;
            final Object this$realNameNormalized = this.getRealNameNormalized();
            final Object other$realNameNormalized = other.getRealNameNormalized();
            if (this$realNameNormalized == null ? other$realNameNormalized != null : !this$realNameNormalized.equals(other$realNameNormalized))
                return false;
            final Object this$botId = this.getBotId();
            final Object other$botId = other.getBotId();
            if (this$botId == null ? other$botId != null : !this$botId.equals(other$botId)) return false;
            final Object this$title = this.getTitle();
            final Object other$title = other.getTitle();
            if (this$title == null ? other$title != null : !this$title.equals(other$title)) return false;
            final Object this$email = this.getEmail();
            final Object other$email = other.getEmail();
            if (this$email == null ? other$email != null : !this$email.equals(other$email)) return false;
            final Object this$skype = this.getSkype();
            final Object other$skype = other.getSkype();
            if (this$skype == null ? other$skype != null : !this$skype.equals(other$skype)) return false;
            final Object this$phone = this.getPhone();
            final Object other$phone = other.getPhone();
            if (this$phone == null ? other$phone != null : !this$phone.equals(other$phone)) return false;
            final Object this$team = this.getTeam();
            final Object other$team = other.getTeam();
            if (this$team == null ? other$team != null : !this$team.equals(other$team)) return false;
            final Object this$apiAppId = this.getApiAppId();
            final Object other$apiAppId = other.getApiAppId();
            if (this$apiAppId == null ? other$apiAppId != null : !this$apiAppId.equals(other$apiAppId)) return false;
            if (this.isAlwaysActive() != other.isAlwaysActive()) return false;
            final Object this$imageOriginal = this.getImageOriginal();
            final Object other$imageOriginal = other.getImageOriginal();
            if (this$imageOriginal == null ? other$imageOriginal != null : !this$imageOriginal.equals(other$imageOriginal))
                return false;
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
            final Object this$image1024 = this.getImage1024();
            final Object other$image1024 = other.getImage1024();
            if (this$image1024 == null ? other$image1024 != null : !this$image1024.equals(other$image1024))
                return false;
            if (this.isCustomImage() != other.isCustomImage()) return false;
            final Object this$fields = this.getFields();
            final Object other$fields = other.getFields();
            if (this$fields == null ? other$fields != null : !this$fields.equals(other$fields)) return false;
            final Object this$firstName = this.getFirstName();
            final Object other$firstName = other.getFirstName();
            if (this$firstName == null ? other$firstName != null : !this$firstName.equals(other$firstName))
                return false;
            final Object this$lastName = this.getLastName();
            final Object other$lastName = other.getLastName();
            if (this$lastName == null ? other$lastName != null : !this$lastName.equals(other$lastName)) return false;
            return true;
        }

        protected boolean canEqual(final Object other) {
            return other instanceof Profile;
        }

        public int hashCode() {
            final int PRIME = 59;
            int result = 1;
            final Object $guestChannels = this.getGuestChannels();
            result = result * PRIME + ($guestChannels == null ? 43 : $guestChannels.hashCode());
            final Object $guestInvitedBy = this.getGuestInvitedBy();
            result = result * PRIME + ($guestInvitedBy == null ? 43 : $guestInvitedBy.hashCode());
            final Object $avatarHash = this.getAvatarHash();
            result = result * PRIME + ($avatarHash == null ? 43 : $avatarHash.hashCode());
            final Object $statusText = this.getStatusText();
            result = result * PRIME + ($statusText == null ? 43 : $statusText.hashCode());
            final Object $statusTextCanonical = this.getStatusTextCanonical();
            result = result * PRIME + ($statusTextCanonical == null ? 43 : $statusTextCanonical.hashCode());
            final Object $statusEmoji = this.getStatusEmoji();
            result = result * PRIME + ($statusEmoji == null ? 43 : $statusEmoji.hashCode());
            final Object $statusExpiration = this.getStatusExpiration();
            result = result * PRIME + ($statusExpiration == null ? 43 : $statusExpiration.hashCode());
            final Object $displayName = this.getDisplayName();
            result = result * PRIME + ($displayName == null ? 43 : $displayName.hashCode());
            final Object $displayNameNormalized = this.getDisplayNameNormalized();
            result = result * PRIME + ($displayNameNormalized == null ? 43 : $displayNameNormalized.hashCode());
            final Object $realName = this.getRealName();
            result = result * PRIME + ($realName == null ? 43 : $realName.hashCode());
            final Object $realNameNormalized = this.getRealNameNormalized();
            result = result * PRIME + ($realNameNormalized == null ? 43 : $realNameNormalized.hashCode());
            final Object $botId = this.getBotId();
            result = result * PRIME + ($botId == null ? 43 : $botId.hashCode());
            final Object $title = this.getTitle();
            result = result * PRIME + ($title == null ? 43 : $title.hashCode());
            final Object $email = this.getEmail();
            result = result * PRIME + ($email == null ? 43 : $email.hashCode());
            final Object $skype = this.getSkype();
            result = result * PRIME + ($skype == null ? 43 : $skype.hashCode());
            final Object $phone = this.getPhone();
            result = result * PRIME + ($phone == null ? 43 : $phone.hashCode());
            final Object $team = this.getTeam();
            result = result * PRIME + ($team == null ? 43 : $team.hashCode());
            final Object $apiAppId = this.getApiAppId();
            result = result * PRIME + ($apiAppId == null ? 43 : $apiAppId.hashCode());
            result = result * PRIME + (this.isAlwaysActive() ? 79 : 97);
            final Object $imageOriginal = this.getImageOriginal();
            result = result * PRIME + ($imageOriginal == null ? 43 : $imageOriginal.hashCode());
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
            final Object $image1024 = this.getImage1024();
            result = result * PRIME + ($image1024 == null ? 43 : $image1024.hashCode());
            result = result * PRIME + (this.isCustomImage() ? 79 : 97);
            final Object $fields = this.getFields();
            result = result * PRIME + ($fields == null ? 43 : $fields.hashCode());
            final Object $firstName = this.getFirstName();
            result = result * PRIME + ($firstName == null ? 43 : $firstName.hashCode());
            final Object $lastName = this.getLastName();
            result = result * PRIME + ($lastName == null ? 43 : $lastName.hashCode());
            return result;
        }

        public String toString() {
            return "User.Profile(guestChannels=" + this.getGuestChannels() + ", guestInvitedBy=" + this.getGuestInvitedBy() + ", avatarHash=" + this.getAvatarHash() + ", statusText=" + this.getStatusText() + ", statusTextCanonical=" + this.getStatusTextCanonical() + ", statusEmoji=" + this.getStatusEmoji() + ", statusExpiration=" + this.getStatusExpiration() + ", displayName=" + this.getDisplayName() + ", displayNameNormalized=" + this.getDisplayNameNormalized() + ", realName=" + this.getRealName() + ", realNameNormalized=" + this.getRealNameNormalized() + ", botId=" + this.getBotId() + ", title=" + this.getTitle() + ", email=" + this.getEmail() + ", skype=" + this.getSkype() + ", phone=" + this.getPhone() + ", team=" + this.getTeam() + ", apiAppId=" + this.getApiAppId() + ", alwaysActive=" + this.isAlwaysActive() + ", imageOriginal=" + this.getImageOriginal() + ", image24=" + this.getImage24() + ", image32=" + this.getImage32() + ", image48=" + this.getImage48() + ", image72=" + this.getImage72() + ", image192=" + this.getImage192() + ", image512=" + this.getImage512() + ", image1024=" + this.getImage1024() + ", customImage=" + this.isCustomImage() + ", fields=" + this.getFields() + ", firstName=" + this.getFirstName() + ", lastName=" + this.getLastName() + ")";
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

            public boolean equals(final Object o) {
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

            protected boolean canEqual(final Object other) {
                return other instanceof Field;
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

            public String toString() {
                return "User.Profile.Field(value=" + this.getValue() + ", alt=" + this.getAlt() + ", label=" + this.getLabel() + ")";
            }
        }

        @Deprecated
        private String firstName;
        @Deprecated
        private String lastName;
    }
}
