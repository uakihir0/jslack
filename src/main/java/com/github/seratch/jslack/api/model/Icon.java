package com.github.seratch.jslack.api.model;

import com.google.gson.annotations.SerializedName;

public class Icon {

    @SerializedName("image_48")
    public String image48;

    public Icon() {
    }

    public String getImage48() {
        return this.image48;
    }

    public void setImage48(String image48) {
        this.image48 = image48;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Icon)) return false;
        final Icon other = (Icon) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$image48 = this.getImage48();
        final Object other$image48 = other.getImage48();
        if (this$image48 == null ? other$image48 != null : !this$image48.equals(other$image48)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Icon;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $image48 = this.getImage48();
        result = result * PRIME + ($image48 == null ? 43 : $image48.hashCode());
        return result;
    }

    public String toString() {
        return "Icon(image48=" + this.getImage48() + ")";
    }
}
