package com.github.seratch.jslack.shortcut.model;

public class FileCommentId {

    private final String value;

    public FileCommentId(String value) {
        this.value = value;
    }

    public static FileCommentId of(String value) {
        return new FileCommentId(value);
    }

    public String getValue() {
        return this.value;
    }

    public String toString() {
        return "FileCommentId(" + this.getValue() + ")";
    }
}
