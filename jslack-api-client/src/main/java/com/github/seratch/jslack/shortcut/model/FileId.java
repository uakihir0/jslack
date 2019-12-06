package com.github.seratch.jslack.shortcut.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(includeFieldNames = false)
public class FileId {

    private final String value;

    public FileId(String value) {
        this.value = value;
    }

    public static FileId of(String value) {
        return new FileId(value);
    }
}