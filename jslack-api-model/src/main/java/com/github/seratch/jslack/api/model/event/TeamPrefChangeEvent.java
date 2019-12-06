package com.github.seratch.jslack.api.model.event;

import lombok.Getter;
import lombok.Setter;

/**
 * The team_pref_change event is sent to all connections for a workspace when a preference is changed.
 * Where appropriate clients should update to reflect new changes immediately.
 * <p>
 * https://api.slack.com/events/team_pref_change
 */
@Getter
@Setter
public class TeamPrefChangeEvent implements Event {

    public static final String TYPE_NAME = "team_pref_change";

    private final String type = TYPE_NAME;
    private String name;
    private String value;

}