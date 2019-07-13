package com.github.seratch.jslack.api.model;

public class Purpose {
    private String value;
    private String creator;
    private Integer lastSet;

    public Purpose() {
    }

    public String getValue() {
        return this.value;
    }

    public String getCreator() {
        return this.creator;
    }

    public Integer getLastSet() {
        return this.lastSet;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public void setLastSet(Integer lastSet) {
        this.lastSet = lastSet;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Purpose)) return false;
        final Purpose other = (Purpose) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$value = this.getValue();
        final Object other$value = other.getValue();
        if (this$value == null ? other$value != null : !this$value.equals(other$value)) return false;
        final Object this$creator = this.getCreator();
        final Object other$creator = other.getCreator();
        if (this$creator == null ? other$creator != null : !this$creator.equals(other$creator)) return false;
        final Object this$lastSet = this.getLastSet();
        final Object other$lastSet = other.getLastSet();
        if (this$lastSet == null ? other$lastSet != null : !this$lastSet.equals(other$lastSet)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Purpose;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $value = this.getValue();
        result = result * PRIME + ($value == null ? 43 : $value.hashCode());
        final Object $creator = this.getCreator();
        result = result * PRIME + ($creator == null ? 43 : $creator.hashCode());
        final Object $lastSet = this.getLastSet();
        result = result * PRIME + ($lastSet == null ? 43 : $lastSet.hashCode());
        return result;
    }

    public String toString() {
        return "Purpose(value=" + this.getValue() + ", creator=" + this.getCreator() + ", lastSet=" + this.getLastSet() + ")";
    }
}
