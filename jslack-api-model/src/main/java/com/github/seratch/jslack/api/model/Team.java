package com.github.seratch.jslack.api.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Team {

    private String id;
    private String name;
    private String domain;
    private String emailDomain;
    private TeamIcon icon;

    private String enterpriseId;
    private String enterpriseName;

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getDomain() {
        return this.domain;
    }

    public String getEmailDomain() {
        return this.emailDomain;
    }

    public TeamIcon getIcon() {
        return this.icon;
    }

    public String getEnterpriseId() {
        return this.enterpriseId;
    }

    public String getEnterpriseName() {
        return this.enterpriseName;
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

    public void setEmailDomain(String emailDomain) {
        this.emailDomain = emailDomain;
    }

    public void setIcon(TeamIcon icon) {
        this.icon = icon;
    }

    public void setEnterpriseId(String enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }

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

        public String getId() {
            return this.id;
        }

        public String getFieldName() {
            return this.fieldName;
        }

        public Integer getOrdering() {
            return this.ordering;
        }

        public String getLabel() {
            return this.label;
        }

        public String getHint() {
            return this.hint;
        }

        public String getType() {
            return this.type;
        }

        public List<String> getPossibleValues() {
            return this.possibleValues;
        }

        public ProfileOptions getOptions() {
            return this.options;
        }

        public boolean isHidden() {
            return this.hidden;
        }

        public void setId(String id) {
            this.id = id;
        }

        public void setFieldName(String fieldName) {
            this.fieldName = fieldName;
        }

        public void setOrdering(Integer ordering) {
            this.ordering = ordering;
        }

        public void setLabel(String label) {
            this.label = label;
        }

        public void setHint(String hint) {
            this.hint = hint;
        }

        public void setType(String type) {
            this.type = type;
        }

        public void setPossibleValues(List<String> possibleValues) {
            this.possibleValues = possibleValues;
        }

        public void setOptions(ProfileOptions options) {
            this.options = options;
        }

        public void setHidden(boolean hidden) {
            this.hidden = hidden;
        }
    }

    public static class ProfileOptions {
        @SerializedName("is_protected")
        private boolean _protected;

        public boolean isProtected() {
            return _protected;
        }

        public void setProtected(boolean isProtected) {
            this._protected = isProtected;
        }

        public boolean is_protected() {
            return this._protected;
        }

        public void set_protected(boolean _protected) {
            this._protected = _protected;
        }
    }
}
