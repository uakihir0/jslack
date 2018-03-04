package com.github.seratch.jslack.shortcut.model;

public class ReactionName {

    private final String value;

    public ReactionName(String value) {
        this.value = value;
    }

    public static ReactionName of(String value) {
        return new ReactionName(value);
    }

    public String getValue() {
        return this.value;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof ReactionName)) return false;
        final ReactionName other = (ReactionName) o;
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
        return other instanceof ReactionName;
    }

    public String toString() {
        return "ReactionName(" + this.getValue() + ")";
    }
}
