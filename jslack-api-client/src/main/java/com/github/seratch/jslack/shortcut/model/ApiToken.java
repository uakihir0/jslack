package com.github.seratch.jslack.shortcut.model;

public class ApiToken {

    private final String value;

    public ApiToken(String value) {
        this.value = value;
    }

    public static ApiToken of(String value) {
        return new ApiToken(value);
    }

    public String getValue() {
        return this.value;
    }

    public String toString() {
        return "ApiToken(" + this.getValue() + ")";
    }
}
