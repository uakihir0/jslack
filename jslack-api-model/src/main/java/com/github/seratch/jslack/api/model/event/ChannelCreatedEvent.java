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

    public ChannelCreatedEvent() {
    }

    public String getType() {
        return this.type;
    }

    public Channel getChannel() {
        return this.channel;
    }

    public void setChannel(Channel channel) {
        this.channel = channel;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ChannelCreatedEvent)) return false;
        final ChannelCreatedEvent other = (ChannelCreatedEvent) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$type = this.getType();
        final Object other$type = other.getType();
        if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
        final Object this$channel = this.getChannel();
        final Object other$channel = other.getChannel();
        if (this$channel == null ? other$channel != null : !this$channel.equals(other$channel)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ChannelCreatedEvent;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $type = this.getType();
        result = result * PRIME + ($type == null ? 43 : $type.hashCode());
        final Object $channel = this.getChannel();
        result = result * PRIME + ($channel == null ? 43 : $channel.hashCode());
        return result;
    }

    public String toString() {
        return "ChannelCreatedEvent(type=" + this.getType() + ", channel=" + this.getChannel() + ")";
    }

    public static class Channel {
        private String id;
        private String name;
        private Integer created;
        private String creator;

        public Channel() {
        }

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

        public boolean equals(final Object o) {
            if (o == this) return true;
            if (!(o instanceof Channel)) return false;
            final Channel other = (Channel) o;
            if (!other.canEqual((Object) this)) return false;
            final Object this$id = this.getId();
            final Object other$id = other.getId();
            if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
            final Object this$name = this.getName();
            final Object other$name = other.getName();
            if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
            final Object this$created = this.getCreated();
            final Object other$created = other.getCreated();
            if (this$created == null ? other$created != null : !this$created.equals(other$created)) return false;
            final Object this$creator = this.getCreator();
            final Object other$creator = other.getCreator();
            if (this$creator == null ? other$creator != null : !this$creator.equals(other$creator)) return false;
            return true;
        }

        protected boolean canEqual(final Object other) {
            return other instanceof Channel;
        }

        public int hashCode() {
            final int PRIME = 59;
            int result = 1;
            final Object $id = this.getId();
            result = result * PRIME + ($id == null ? 43 : $id.hashCode());
            final Object $name = this.getName();
            result = result * PRIME + ($name == null ? 43 : $name.hashCode());
            final Object $created = this.getCreated();
            result = result * PRIME + ($created == null ? 43 : $created.hashCode());
            final Object $creator = this.getCreator();
            result = result * PRIME + ($creator == null ? 43 : $creator.hashCode());
            return result;
        }

        public String toString() {
            return "ChannelCreatedEvent.Channel(id=" + this.getId() + ", name=" + this.getName() + ", created=" + this.getCreated() + ", creator=" + this.getCreator() + ")";
        }
    }
}