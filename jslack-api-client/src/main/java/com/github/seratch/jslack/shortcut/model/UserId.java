package com.github.seratch.jslack.shortcut.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(includeFieldNames = false)
public class UserId {

    private final String value;

    public UserId(String value) {
        this.value = value;
    }

    public static UserId of(String value) {
        return new UserId(value);
    }
}