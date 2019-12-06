package com.github.seratch.jslack.shortcut.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(includeFieldNames = false)
public class ChannelId {

    private final String value;

    public ChannelId(String value) {
        this.value = value;
    }

    public static ChannelId of(String value) {
        return new ChannelId(value);
    }
}
