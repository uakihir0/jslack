package com.github.seratch.jslack.api.model;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Team {

    private String id;
    private String name;
    private String domain;
    private String emailDomain;
    private TeamIcon icon;

    private String enterpriseId;
    private String enterpriseName;

    @Getter
@Setter
    public static class Profile {
        private String id;
        private String fieldName;
        private Integer ordering;
        private String label;
        private String hint;
        private String type;
        private List<String> possibleValues;
        private ProfileOptions options;
        @SerializedName("is_hidden")
        private boolean hidden;
    }

    @Getter
@Setter
    public static class ProfileOptions {
        @SerializedName("is_protected")
        private boolean _protected;

        public boolean isProtected() {
            return _protected;
        }

        public void setProtected(boolean isProtected) {
            this._protected = isProtected;
        }
    }
}
