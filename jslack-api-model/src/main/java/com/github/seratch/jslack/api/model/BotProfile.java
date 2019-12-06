package com.github.seratch.jslack.api.model;

import com.google.gson.annotations.SerializedName;

public class BotProfile {

    private String id; // B00000000
    private boolean deleted;
    private String name;
    private Integer updated;
    private String appId; // A00000000
    private Icons icons;
    private String teamId;

    public String getId() {
        return this.id;
    }

    public boolean isDeleted() {
        return this.deleted;
    }

    public String getName() {
        return this.name;
    }

    public Integer getUpdated() {
        return this.updated;
    }

    public String getAppId() {
        return this.appId;
    }

    public Icons getIcons() {
        return this.icons;
    }

    public String getTeamId() {
        return this.teamId;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUpdated(Integer updated) {
        this.updated = updated;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public void setIcons(Icons icons) {
        this.icons = icons;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    public static class Icons {
        @SerializedName("image_36")
        private String image36;
        @SerializedName("image_48")
        private String image48;
        @SerializedName("image_72")
        private String image72;

        public String getImage36() {
            return this.image36;
        }

        public String getImage48() {
            return this.image48;
        }

        public String getImage72() {
            return this.image72;
        }

        public void setImage36(String image36) {
            this.image36 = image36;
        }

        public void setImage48(String image48) {
            this.image48 = image48;
        }

        public void setImage72(String image72) {
            this.image72 = image72;
        }
    }


}
