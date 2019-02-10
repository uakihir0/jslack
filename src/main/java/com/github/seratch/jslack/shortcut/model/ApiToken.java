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

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ApiToken)) return false;
        final ApiToken other = (ApiToken) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$value = this.getValue();
        final Object other$value = other.getValue();
        if (this$value == null ? other$value != null : !this$value.equals(other$value)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ApiToken;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $value = this.getValue();
        result = result * PRIME + ($value == null ? 43 : $value.hashCode());
        return result;
    }

    public String toString() {
        return "ApiToken(" + this.getValue() + ")";
    }
}
