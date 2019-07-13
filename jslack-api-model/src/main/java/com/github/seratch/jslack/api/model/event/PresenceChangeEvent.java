package com.github.seratch.jslack.api.model.event;

import java.util.List;

/**
 * The presence_change event is sent to connections for a workspace
 * when a user changes presence status and the app has subscribed using presence_sub.
 * Clients can use this to update their local list of users' presence.
 * <p>
 * If a user updates their presence manually, the manual_presence_change event will also be sent to all connected clients for that user.
 * <p>
 * There are two forms of this event. When only one user's presence is being communicated,
 * you'll receive a user field with a single user ID present within. This form is deprecated.
 * <p>
 * Pass the batch_presence_aware=1 parameter to rtm.start or rtm.connect to instruct the Slack message server
 * to batch your presence messages and send a users attribute instead, containing an array of users changing to the same status.
 * <p>
 * Sometimes you'll get a single event for a single user but if you use batch_presence_aware=1,
 * that single user event will be single item in the users array.
 * <p>
 * In case you missed that: if you send batch_presence_aware=1 then the shape of presence_change events changes.
 * Instead of a string-based user field, you'll get users, an array.
 * <p>
 * If you're writing a library that supports presence_change events, you should be prepared to handle both kinds of presence events.
 * <p>
 * RTM API Presence is now only available via subscription.
 * As of January 2018, presence_change events are not dispatched without presence subscriptions established with presence_sub.
 * Relatedly, current user presence status is no longer communicated in rtm.start. Learn more.
 */
public class PresenceChangeEvent implements Event {

    public static final String TYPE_NAME = "presence_change";

    private final String type = TYPE_NAME;
    private String user; // Single-user presence change event:
    private List<String> users; // Multiple-user batch presence change event:
    private String presence;

    public PresenceChangeEvent() {
    }

    public String getType() {
        return this.type;
    }

    public String getUser() {
        return this.user;
    }

    public List<String> getUsers() {
        return this.users;
    }

    public String getPresence() {
        return this.presence;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setUsers(List<String> users) {
        this.users = users;
    }

    public void setPresence(String presence) {
        this.presence = presence;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof PresenceChangeEvent)) return false;
        final PresenceChangeEvent other = (PresenceChangeEvent) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$type = this.getType();
        final Object other$type = other.getType();
        if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
        final Object this$user = this.getUser();
        final Object other$user = other.getUser();
        if (this$user == null ? other$user != null : !this$user.equals(other$user)) return false;
        final Object this$users = this.getUsers();
        final Object other$users = other.getUsers();
        if (this$users == null ? other$users != null : !this$users.equals(other$users)) return false;
        final Object this$presence = this.getPresence();
        final Object other$presence = other.getPresence();
        if (this$presence == null ? other$presence != null : !this$presence.equals(other$presence)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof PresenceChangeEvent;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $type = this.getType();
        result = result * PRIME + ($type == null ? 43 : $type.hashCode());
        final Object $user = this.getUser();
        result = result * PRIME + ($user == null ? 43 : $user.hashCode());
        final Object $users = this.getUsers();
        result = result * PRIME + ($users == null ? 43 : $users.hashCode());
        final Object $presence = this.getPresence();
        result = result * PRIME + ($presence == null ? 43 : $presence.hashCode());
        return result;
    }

    public String toString() {
        return "PresenceChangeEvent(type=" + this.getType() + ", user=" + this.getUser() + ", users=" + this.getUsers() + ", presence=" + this.getPresence() + ")";
    }
}