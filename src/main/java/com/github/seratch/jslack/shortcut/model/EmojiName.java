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

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof EmojiName)) return false;
        final EmojiName other = (EmojiName) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$value = this.getValue();
        final Object other$value = other.getValue();
        if (this$value == null ? other$value != null : !this$value.equals(other$value)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $value = this.getValue();
        result = result * PRIME + ($value == null ? 43 : $value.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof EmojiName;
    }

    public String toString() {
        return "EmojiName(" + this.getValue() + ")";
    }
}
