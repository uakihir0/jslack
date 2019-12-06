package com.github.seratch.jslack.api.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;
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
    private EnterpriseUser enterpriseUser;
    private String twoFactorType;
    private boolean hasFiles;
    private String locale;
    @SerializedName("is_workflow_bot")
    private boolean workflowBot;

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

    public EnterpriseUser getEnterpriseUser() {
        return this.enterpriseUser;
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

    public boolean isWorkflowBot() {
        return this.workflowBot;
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

    public void setEnterpriseUser(EnterpriseUser enterpriseUser) {
        this.enterpriseUser = enterpriseUser;
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

    public void setWorkflowBot(boolean workflowBot) {
        this.workflowBot = workflowBot;
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

        public static class Field {
            private String value;
            private String alt;
            private String label;

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
        }

        @Deprecated
        private String firstName;
        @Deprecated
        private String lastName;
    }

    public static class EnterpriseUser {
        private String id;
        private String enterpriseId;
        private String enterpriseName;
        @SerializedName("is_admin")
        private boolean isAdmin;
        @SerializedName("is_owner")
        private boolean isOwner;
        private List<String> teams;

        public String getId() {
            return this.id;
        }

        public String getEnterpriseId() {
            return this.enterpriseId;
        }

        public String getEnterpriseName() {
            return this.enterpriseName;
        }

        public boolean isAdmin() {
            return this.isAdmin;
        }

        public boolean isOwner() {
            return this.isOwner;
        }

        public List<String> getTeams() {
            return this.teams;
        }

        public void setId(String id) {
            this.id = id;
        }

        public void setEnterpriseId(String enterpriseId) {
            this.enterpriseId = enterpriseId;
        }

        public void setEnterpriseName(String enterpriseName) {
            this.enterpriseName = enterpriseName;
        }

        public void setAdmin(boolean isAdmin) {
            this.isAdmin = isAdmin;
        }

        public void setOwner(boolean isOwner) {
            this.isOwner = isOwner;
        }

        public void setTeams(List<String> teams) {
            this.teams = teams;
        }
    }

}
