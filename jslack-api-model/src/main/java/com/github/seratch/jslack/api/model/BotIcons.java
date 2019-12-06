package com.github.seratch.jslack.api.model;

import com.google.gson.annotations.SerializedName;

public class BotIcons {
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
