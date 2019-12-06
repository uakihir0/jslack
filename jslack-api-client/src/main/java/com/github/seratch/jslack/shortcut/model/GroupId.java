package com.github.seratch.jslack.shortcut.model;

public class GroupId {

    private final String value;

    public GroupId(String value) {
        this.value = value;
    }

    public static GroupId of(String value) {
        return new GroupId(value);
    }

    public String getValue() {
        return this.value;
    }

    public String toString() {
        return "GroupId(" + this.getValue() + ")";
    }
}