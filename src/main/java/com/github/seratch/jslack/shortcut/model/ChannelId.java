package com.github.seratch.jslack.shortcut.model;

public class ChannelId {

    private final String value;

    public ChannelId(String value) {
        this.value = value;
    }

    public static ChannelId of(String value) {
        return new ChannelId(value);
    }

    public String getValue() {
        return this.value;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof ChannelId)) return false;
        final ChannelId other = (ChannelId) o;
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
        return other instanceof ChannelId;
    }

    public String toString() {
        return "ChannelId(" + this.getValue() + ")";
    }
}
