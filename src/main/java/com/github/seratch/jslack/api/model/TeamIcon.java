package com.github.seratch.jslack.api.model;

import com.google.gson.annotations.SerializedName;

public class TeamIcon {

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

    private boolean imageDefault;

    public TeamIcon() {
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

    public boolean isImageDefault() {
        return this.imageDefault;
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

    public void setImageDefault(boolean imageDefault) {
        this.imageDefault = imageDefault;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof TeamIcon)) return false;
        final TeamIcon other = (TeamIcon) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$image34 = this.getImage34();
        final Object other$image34 = other.getImage34();
        if (this$image34 == null ? other$image34 != null : !this$image34.equals(other$image34)) return false;
        final Object this$image44 = this.getImage44();
        final Object other$image44 = other.getImage44();
        if (this$image44 == null ? other$image44 != null : !this$image44.equals(other$image44)) return false;
        final Object this$image68 = this.getImage68();
        final Object other$image68 = other.getImage68();
        if (this$image68 == null ? other$image68 != null : !this$image68.equals(other$image68)) return false;
        final Object this$image88 = this.getImage88();
        final Object other$image88 = other.getImage88();
        if (this$image88 == null ? other$image88 != null : !this$image88.equals(other$image88)) return false;
        final Object this$image102 = this.getImage102();
        final Object other$image102 = other.getImage102();
        if (this$image102 == null ? other$image102 != null : !this$image102.equals(other$image102)) return false;
        final Object this$image132 = this.getImage132();
        final Object other$image132 = other.getImage132();
        if (this$image132 == null ? other$image132 != null : !this$image132.equals(other$image132)) return false;
        if (this.isImageDefault() != other.isImageDefault()) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $image34 = this.getImage34();
        result = result * PRIME + ($image34 == null ? 43 : $image34.hashCode());
        final Object $image44 = this.getImage44();
        result = result * PRIME + ($image44 == null ? 43 : $image44.hashCode());
        final Object $image68 = this.getImage68();
        result = result * PRIME + ($image68 == null ? 43 : $image68.hashCode());
        final Object $image88 = this.getImage88();
        result = result * PRIME + ($image88 == null ? 43 : $image88.hashCode());
        final Object $image102 = this.getImage102();
        result = result * PRIME + ($image102 == null ? 43 : $image102.hashCode());
        final Object $image132 = this.getImage132();
        result = result * PRIME + ($image132 == null ? 43 : $image132.hashCode());
        result = result * PRIME + (this.isImageDefault() ? 79 : 97);
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof TeamIcon;
    }

    public String toString() {
        return "TeamIcon(image34=" + this.getImage34() + ", image44=" + this.getImage44() + ", image68=" + this.getImage68() + ", image88=" + this.getImage88() + ", image102=" + this.getImage102() + ", image132=" + this.getImage132() + ", imageDefault=" + this.isImageDefault() + ")";
    }
}
