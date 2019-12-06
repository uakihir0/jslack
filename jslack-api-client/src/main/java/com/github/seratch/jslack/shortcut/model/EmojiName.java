package com.github.seratch.jslack.shortcut.model;

public class EmojiName {

    private final String value;

    public EmojiName(String value) {
        this.value = value;
    }

    public static EmojiName of(String value) {
        return new EmojiName(value);
    }

    public String getValue() {
        return this.value;
    }

    public String toString() {
        return "EmojiName(" + this.getValue() + ")";
    }
}
