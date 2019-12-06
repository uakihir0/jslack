package com.github.seratch.jslack.api.model.event;

/**
 * When a private channel is renamed, the group_rename event is sent to all connections for members of a private channel.
 * Clients can use this to update their local list of private channels.
 * <p>
 * https://api.slack.com/events/group_rename
 */
public class GroupRenameEvent implements Event {

    public static final String TYPE_NAME = "group_rename";

    private final String type = TYPE_NAME;
    private Channel channel;

    public String getType() {
        return this.type;
    }

    public Channel getChannel() {
        return this.channel;
    }

    public void setChannel(Channel channel) {
        this.channel = channel;
    }

    public static class Channel {
        private String id;
        private String name;
        private Integer created;

        public String getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }

        public Integer getCreated() {
            return this.created;
        }

        public void setId(String id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setCreated(Integer created) {
            this.created = created;
        }
    }

}