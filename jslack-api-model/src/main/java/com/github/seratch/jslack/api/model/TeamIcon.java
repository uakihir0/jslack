package com.github.seratch.jslack.api.model;

import com.google.gson.annotations.SerializedName;

public class TeamIcon {

    private String imageOriginal;

    @SerializedName("image_34")
    private String image34;
    @SerializedName("image_44")
    private String image44;
    @SerializedName("image_68")
    private String image68;
    @SerializedName("image_88")
    private String image88;
    @SerializedName("image_102")
    private String image102;
    @SerializedName("image_132")
    private String image132;
    @SerializedName("image_230")
    private String image230;

    private boolean imageDefault;

    public String getImageOriginal() {
        return this.imageOriginal;
    }

    public String getImage34() {
        return this.image34;
    }

    public String getImage44() {
        return this.image44;
    }

    public String getImage68() {
        return this.image68;
    }

    public String getImage88() {
        return this.image88;
    }

    public String getImage102() {
        return this.image102;
    }

    public String getImage132() {
        return this.image132;
    }

    public String getImage230() {
        return this.image230;
    }

    public boolean isImageDefault() {
        return this.imageDefault;
    }

    public void setImageOriginal(String imageOriginal) {
        this.imageOriginal = imageOriginal;
    }

    public void setImage34(String image34) {
        this.image34 = image34;
    }

    public void setImage44(String image44) {
        this.image44 = image44;
    }

    public void setImage68(String image68) {
        this.image68 = image68;
    }

    public void setImage88(String image88) {
        this.image88 = image88;
    }

    public void setImage102(String image102) {
        this.image102 = image102;
    }

    public void setImage132(String image132) {
        this.image132 = image132;
    }

    public void setImage230(String image230) {
        this.image230 = image230;
    }

    public void setImageDefault(boolean imageDefault) {
        this.imageDefault = imageDefault;
    }
}
