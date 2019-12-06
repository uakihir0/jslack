package com.github.seratch.jslack.shortcut.model;

public class ChannelId {

    private final String value;

    public ChannelId(String value) {
        this.value = value;
    }

    public static ChannelId of(String value) {
        return new ChannelId(value);
    }

    public String getValue() {
        return this.value;
    }

    public String toString() {
        return "ChannelId(" + this.getValue() + ")";
    }
}
