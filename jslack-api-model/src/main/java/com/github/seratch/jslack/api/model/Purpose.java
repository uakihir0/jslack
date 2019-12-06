package com.github.seratch.jslack.api.model;

public class Purpose {
    private String value;
    private String creator;
    private Integer lastSet;

    public String getValue() {
        return this.value;
    }

    public String getCreator() {
        return this.creator;
    }

    public Integer getLastSet() {
        return this.lastSet;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public void setLastSet(Integer lastSet) {
        this.lastSet = lastSet;
    }
}
