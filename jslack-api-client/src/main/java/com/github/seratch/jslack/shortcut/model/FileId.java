package com.github.seratch.jslack.shortcut.model;

public class FileId {

    private final String value;

    public FileId(String value) {
        this.value = value;
    }

    public static FileId of(String value) {
        return new FileId(value);
    }

    public String getValue() {
        return this.value;
    }

    public String toString() {
        return "FileId(" + this.getValue() + ")";
    }
}