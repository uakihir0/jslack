package com.github.seratch.jslack.shortcut.model;

public class Timestamp {

    private final String value;

    public Timestamp(String value) {
        this.value = value;
    }

    public static Timestamp of(String value) {
        return new Timestamp(value);
    }

    public String getValue() {
        return this.value;
    }

    public String toString() {
        return "Timestamp(" + this.getValue() + ")";
    }
}