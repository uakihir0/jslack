package com.github.seratch.jslack.api.model.event;

/**
 * The channel_created event is sent to all connections for a workspace when a new channel is created.
 * Clients can use this to update their local cache of non-joined channels.
 * <p>
 * https://api.slack.com/events/channel_created
 */
public class ChannelCreatedEvent implements Event {

    public static final String TYPE_NAME = "channel_created";

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
        private String creator;

        public String getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }

        public Integer getCreated() {
            return this.created;
        }

        public String getCreator() {
            return this.creator;
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

        public void setCreator(String creator) {
            this.creator = creator;
        }
    }
}