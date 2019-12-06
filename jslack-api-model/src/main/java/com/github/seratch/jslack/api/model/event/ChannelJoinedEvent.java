package com.github.seratch.jslack.api.model.event;

/**
 * The channel_joined event is sent to all connections for a user when that user joins a channel.
 * <p>
 * In addition to this message, all existing members of the channel may receive a channel_join message event.
 * <p>
 * Of course, there's also the fresher, more dependable member_joined_channel. This changelog entry clears it all up.
 * <p>
 * https://api.slack.com/events/channel_joined
 */
public class ChannelJoinedEvent implements Event {

    public static final String TYPE_NAME = "channel_joined";

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

    // TODO: the existence of these attributes has not been verified yet
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