package com.github.seratch.jslack.api.model.event;

import java.util.List;

/**
 * The email_domain_changed event is sent to all connections for a workspace
 * when the email domain settings for a workspace change.
 * Most clients can ignore this event.
 * <p>
 * https://api.slack.com/events/emoji_changed
 */
public class EmojiChangedEvent implements Event {

    public static final String TYPE_NAME = "emoji_changed";

    private final String type = TYPE_NAME;

    private String subtype; // possible values: add, remove

    private List<String> names; // only for subtype:remove

    private String name; // only for subtype:add

    /**
     * The URL of the image
     */
    private String value; // only for subtype:add

    private String eventTs;

    public EmojiChangedEvent() {
    }

    public String getType() {
        return this.type;
    }

    public String getSubtype() {
        return this.subtype;
    }

    public List<String> getNames() {
        return this.names;
    }

    public String getName() {
        return this.name;
    }

    public String getValue() {
        return this.value;
    }

    public String getEventTs() {
        return this.eventTs;
    }

    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setEventTs(String eventTs) {
        this.eventTs = eventTs;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof EmojiChangedEvent)) return false;
        final EmojiChangedEvent other = (EmojiChangedEvent) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$type = this.getType();
        final Object other$type = other.getType();
        if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
        final Object this$subtype = this.getSubtype();
        final Object other$subtype = other.getSubtype();
        if (this$subtype == null ? other$subtype != null : !this$subtype.equals(other$subtype)) return false;
        final Object this$names = this.getNames();
        final Object other$names = other.getNames();
        if (this$names == null ? other$names != null : !this$names.equals(other$names)) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        final Object this$value = this.getValue();
        final Object other$value = other.getValue();
        if (this$value == null ? other$value != null : !this$value.equals(other$value)) return false;
        final Object this$eventTs = this.getEventTs();
        final Object other$eventTs = other.getEventTs();
        if (this$eventTs == null ? other$eventTs != null : !this$eventTs.equals(other$eventTs)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof EmojiChangedEvent;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $type = this.getType();
        result = result * PRIME + ($type == null ? 43 : $type.hashCode());
        final Object $subtype = this.getSubtype();
        result = result * PRIME + ($subtype == null ? 43 : $subtype.hashCode());
        final Object $names = this.getNames();
        result = result * PRIME + ($names == null ? 43 : $names.hashCode());
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        final Object $value = this.getValue();
        result = result * PRIME + ($value == null ? 43 : $value.hashCode());
        final Object $eventTs = this.getEventTs();
        result = result * PRIME + ($eventTs == null ? 43 : $eventTs.hashCode());
        return result;
    }

    public String toString() {
        return "EmojiChangedEvent(type=" + this.getType() + ", subtype=" + this.getSubtype() + ", names=" + this.getNames() + ", name=" + this.getName() + ", value=" + this.getValue() + ", eventTs=" + this.getEventTs() + ")";
    }
}