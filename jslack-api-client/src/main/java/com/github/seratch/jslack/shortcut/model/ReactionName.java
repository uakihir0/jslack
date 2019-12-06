package com.github.seratch.jslack.shortcut.model;

public class ReactionName {

    private final String value;

    public ReactionName(String value) {
        this.value = value;
    }

    public static ReactionName of(String value) {
        return new ReactionName(value);
    }

    public String getValue() {
        return this.value;
    }

    public String toString() {
        return "ReactionName(" + this.getValue() + ")";
    }
}
