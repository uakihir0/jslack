package com.github.seratch.jslack.shortcut.model;

public class GroupId {

    private final String value;

    public GroupId(String value) {
        this.value = value;
    }

    public static GroupId of(String value) {
        return new GroupId(value);
    }

    public String getValue() {
        return this.value;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof GroupId)) return false;
        final GroupId other = (GroupId) o;
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
        return other instanceof GroupId;
    }

    public String toString() {
        return "GroupId(" + this.getValue() + ")";
    }
}