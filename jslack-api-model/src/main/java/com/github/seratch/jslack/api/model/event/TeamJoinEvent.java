package com.github.seratch.jslack.api.model.event;

import com.github.seratch.jslack.api.model.User;

/**
 * The team_join event is sent to all connections for a workspace when a new member joins.
 * Clients can use this to update their local cache of members.
 * <p>
 * https://api.slack.com/events/team_join
 */
public class TeamJoinEvent implements Event {

    public static final String TYPE_NAME = "team_join";

    private final String type = TYPE_NAME;
    private User user; // TODO: make sure the available attributes

    public String getType() {
        return this.type;
    }

    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}