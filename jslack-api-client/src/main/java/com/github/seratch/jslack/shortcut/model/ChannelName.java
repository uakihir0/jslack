package com.github.seratch.jslack.shortcut.model;

public class ChannelName {

    private final String value;

    public ChannelName(String value) {
        this.value = value;
    }

    public static ChannelName of(String value) {
        return new ChannelName(value);
    }

    public String getValue() {
        return this.value;
    }

    public String toString() {
        return "ChannelName(" + this.getValue() + ")";
    }
}
