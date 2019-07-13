package com.github.seratch.jslack.api.model.event;

/**
 * The team_pref_change event is sent to all connections for a workspace when a preference is changed.
 * Where appropriate clients should update to reflect new changes immediately.
 * <p>
 * https://api.slack.com/events/team_pref_change
 */
public class TeamPrefChangeEvent implements Event {

    public static final String TYPE_NAME = "team_pref_change";

    private final String type = TYPE_NAME;
    private String name;
    private String value;

    public TeamPrefChangeEvent() {
    }

    public String getType() {
        return this.type;
    }

    public String getName() {
        return this.name;
    }

    public String getValue() {
        return this.value;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof TeamPrefChangeEvent)) return false;
        final TeamPrefChangeEvent other = (TeamPrefChangeEvent) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$type = this.getType();
        final Object other$type = other.getType();
        if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        final Object this$value = this.getValue();
        final Object other$value = other.getValue();
        if (this$value == null ? other$value != null : !this$value.equals(other$value)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof TeamPrefChangeEvent;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $type = this.getType();
        result = result * PRIME + ($type == null ? 43 : $type.hashCode());
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        final Object $value = this.getValue();
        result = result * PRIME + ($value == null ? 43 : $value.hashCode());
        return result;
    }

    public String toString() {
        return "TeamPrefChangeEvent(type=" + this.getType() + ", name=" + this.getName() + ", value=" + this.getValue() + ")";
    }
}