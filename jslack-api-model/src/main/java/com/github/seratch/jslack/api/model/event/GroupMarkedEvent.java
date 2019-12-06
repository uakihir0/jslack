package com.github.seratch.jslack.api.model.event;

/**
 * The group_marked event is sent to all open connections for a user
 * when that user moves the read cursor in a private channel by calling the groups.mark API method.
 * <p>
 * https://api.slack.com/events/group_marked
 */
public class GroupMarkedEvent implements Event {

    public static final String TYPE_NAME = "group_marked";

    private final String type = TYPE_NAME;
    private String channel;
    private String ts;

    public String getType() {
        return this.type;
    }

    public String getChannel() {
        return this.channel;
    }

    public String getTs() {
        return this.ts;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public void setTs(String ts) {
        this.ts = ts;
    }
}