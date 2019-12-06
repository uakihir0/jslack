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
}