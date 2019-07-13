package com.github.seratch.jslack.shortcut.model;

public class ChannelName {

    private final String value;

    public ChannelName(String value) {
        this.value = value;
    }

    public static ChannelName of(String value) {
        return new ChannelName(value);
    }

    public String getValue() {
        return this.value;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ChannelName)) return false;
        final ChannelName other = (ChannelName) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$value = this.getValue();
        final Object other$value = other.getValue();
        if (this$value == null ? other$value != null : !this$value.equals(other$value)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ChannelName;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $value = this.getValue();
        result = result * PRIME + ($value == null ? 43 : $value.hashCode());
        return result;
    }

    public String toString() {
        return "ChannelName(" + this.getValue() + ")";
    }
}
