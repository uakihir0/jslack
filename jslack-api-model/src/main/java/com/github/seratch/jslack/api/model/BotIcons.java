package com.github.seratch.jslack.api.model;

import com.google.gson.annotations.SerializedName;

public class BotIcons {
    @SerializedName("image_36")
    private String image36;
    @SerializedName("image_48")
    private String image48;
    @SerializedName("image_72")
    private String image72;

    public BotIcons() {
    }

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

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof BotIcons)) return false;
        final BotIcons other = (BotIcons) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$image36 = this.getImage36();
        final Object other$image36 = other.getImage36();
        if (this$image36 == null ? other$image36 != null : !this$image36.equals(other$image36)) return false;
        final Object this$image48 = this.getImage48();
        final Object other$image48 = other.getImage48();
        if (this$image48 == null ? other$image48 != null : !this$image48.equals(other$image48)) return false;
        final Object this$image72 = this.getImage72();
        final Object other$image72 = other.getImage72();
        if (this$image72 == null ? other$image72 != null : !this$image72.equals(other$image72)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof BotIcons;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $image36 = this.getImage36();
        result = result * PRIME + ($image36 == null ? 43 : $image36.hashCode());
        final Object $image48 = this.getImage48();
        result = result * PRIME + ($image48 == null ? 43 : $image48.hashCode());
        final Object $image72 = this.getImage72();
        result = result * PRIME + ($image72 == null ? 43 : $image72.hashCode());
        return result;
    }

    public String toString() {
        return "BotIcons(image36=" + this.getImage36() + ", image48=" + this.getImage48() + ", image72=" + this.getImage72() + ")";
    }
}
