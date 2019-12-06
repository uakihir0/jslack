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
}