package com.github.seratch.jslack.shortcut.model;

public class UserId {

    private final String value;

    public UserId(String value) {
        this.value = value;
    }

    public static UserId of(String value) {
        return new UserId(value);
    }

    public String getValue() {
        return this.value;
    }

    public String toString() {
        return "UserId(" + this.getValue() + ")";
    }
}