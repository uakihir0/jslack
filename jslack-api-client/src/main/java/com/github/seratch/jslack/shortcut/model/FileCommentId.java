package com.github.seratch.jslack.shortcut.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(includeFieldNames = false)
public class FileCommentId {

    private final String value;

    public FileCommentId(String value) {
        this.value = value;
    }

    public static FileCommentId of(String value) {
        return new FileCommentId(value);
    }
}
