package com.github.seratch.jslack.api.model.admin;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class AppRequest {
    private String id;
    private App app;
    private User user;
    private Team team;
    private List<Scope> scopes;
    private PreviousResolution previousResolution;
    private String message;
    private Integer dateCreated;

    public String getId() {
        return this.id;
    }

    public App getApp() {
        return this.app;
    }

    public User getUser() {
        return this.user;
    }

    public Team getTeam() {
        return this.team;
    }

    public List<Scope> getScopes() {
        return this.scopes;
    }

    public PreviousResolution getPreviousResolution() {
        return this.previousResolution;
    }

    public String getMessage() {
        return this.message;
    }

    public Integer getDateCreated() {
        return this.dateCreated;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setApp(App app) {
        this.app = app;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public void setScopes(List<Scope> scopes) {
        this.scopes = scopes;
    }

    public void setPreviousResolution(PreviousResolution previousResolution) {
        this.previousResolution = previousResolution;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setDateCreated(Integer dateCreated) {
        this.dateCreated = dateCreated;
    }

    public static class App {
        private String id;
        private String name;
        private String description;
        private String helpUrl;
        private String privacyPolicyUrl;
        private String appHomepageUrl;
        private String appDirectoryUrl;
        @SerializedName("is_app_directory_approved")
        private boolean isAppDirectoryApproved;
        @SerializedName("is_internal")
        private boolean isInternal;
        private String additionalInfo;
        private Icons icons;

        public String getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }

        public String getDescription() {
            return this.description;
        }

        public String getHelpUrl() {
            return this.helpUrl;
        }

        public String getPrivacyPolicyUrl() {
            return this.privacyPolicyUrl;
        }

        public String getAppHomepageUrl() {
            return this.appHomepageUrl;
        }

        public String getAppDirectoryUrl() {
            return this.appDirectoryUrl;
        }

        public boolean isAppDirectoryApproved() {
            return this.isAppDirectoryApproved;
        }

        public boolean isInternal() {
            return this.isInternal;
        }

        public String getAdditionalInfo() {
            return this.additionalInfo;
        }

        public Icons getIcons() {
            return this.icons;
        }

        public void setId(String id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public void setHelpUrl(String helpUrl) {
            this.helpUrl = helpUrl;
        }

        public void setPrivacyPolicyUrl(String privacyPolicyUrl) {
            this.privacyPolicyUrl = privacyPolicyUrl;
        }

        public void setAppHomepageUrl(String appHomepageUrl) {
            this.appHomepageUrl = appHomepageUrl;
        }

        public void setAppDirectoryUrl(String appDirectoryUrl) {
            this.appDirectoryUrl = appDirectoryUrl;
        }

        public void setAppDirectoryApproved(boolean isAppDirectoryApproved) {
            this.isAppDirectoryApproved = isAppDirectoryApproved;
        }

        public void setInternal(boolean isInternal) {
            this.isInternal = isInternal;
        }

        public void setAdditionalInfo(String additionalInfo) {
            this.additionalInfo = additionalInfo;
        }

        public void setIcons(Icons icons) {
            this.icons = icons;
        }
    }

    public static class User {
        private String id;
        private String name;
        private String email;

        public String getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }

        public String getEmail() {
            return this.email;
        }

        public void setId(String id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setEmail(String email) {
            this.email = email;
        }
    }

    public static class Team {
        private String id;
        private String name;
        private String domain;

        public String getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }

        public String getDomain() {
            return this.domain;
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
    }

    public static class Scope {
        private String name;
        private String description;
        @SerializedName("is_sensitive")
        private boolean isSensitive;
        private String tokenType;

        public String getName() {
            return this.name;
        }

        public String getDescription() {
            return this.description;
        }

        public boolean isSensitive() {
            return this.isSensitive;
        }

        public String getTokenType() {
            return this.tokenType;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public void setSensitive(boolean isSensitive) {
            this.isSensitive = isSensitive;
        }

        public void setTokenType(String tokenType) {
            this.tokenType = tokenType;
        }
    }

    public static class PreviousResolution {
        private String status;
        private List<Scope> scopes;

        public String getStatus() {
            return this.status;
        }

        public List<Scope> getScopes() {
            return this.scopes;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public void setScopes(List<Scope> scopes) {
            this.scopes = scopes;
        }
    }

    public static class Icons {
        @SerializedName("image_32")
        private String image32;
        @SerializedName("image_36")
        private String image36;
        @SerializedName("image_48")
        private String image48;
        @SerializedName("image_64")
        private String image64;
        @SerializedName("image_72")
        private String image72;
        @SerializedName("image_96")
        private String image96;
        @SerializedName("image_128")
        private String image128;
        @SerializedName("image_192")
        private String image192;
        @SerializedName("image_512")
        private String image512;
        @SerializedName("image_1024")
        private String image1024;

        public String getImage32() {
            return this.image32;
        }

        public String getImage36() {
            return this.image36;
        }

        public String getImage48() {
            return this.image48;
        }

        public String getImage64() {
            return this.image64;
        }

        public String getImage72() {
            return this.image72;
        }

        public String getImage96() {
            return this.image96;
        }

        public String getImage128() {
            return this.image128;
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

        public void setImage32(String image32) {
            this.image32 = image32;
        }

        public void setImage36(String image36) {
            this.image36 = image36;
        }

        public void setImage48(String image48) {
            this.image48 = image48;
        }

        public void setImage64(String image64) {
            this.image64 = image64;
        }

        public void setImage72(String image72) {
            this.image72 = image72;
        }

        public void setImage96(String image96) {
            this.image96 = image96;
        }

        public void setImage128(String image128) {
            this.image128 = image128;
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
    }

}
