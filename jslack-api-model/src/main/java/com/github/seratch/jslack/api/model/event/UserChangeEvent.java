package com.github.seratch.jslack.api.model.event;

import com.github.seratch.jslack.api.model.User;

/**
 * The user_change event is sent to all connections for a workspace when a member updates their profile or data.
 * Clients can use this to update their local cache of members.
 * <p>
 * Use the users.profile.set method to update user profile data.
 * <p>
 * https://api.slack.com/events/user_change
 */
public class UserChangeEvent implements Event {

    public static final String TYPE_NAME = "user_change";

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