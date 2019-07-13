package com.github.seratch.jslack.api.rtm.message;

/**
 * https://api.slack.com/events/user_typing
 */
public class Typing implements RTMMessage {

    public static final String TYPE_NAME = "typing";

    private Long id;
    private final String type = TYPE_NAME;
    private String channel;

    public Typing(Long id, String channel) {
        this.id = id;
        this.channel = channel;
    }

    public Typing() {
    }

    public static TypingBuilder builder() {
        return new TypingBuilder();
    }

    public Long getId() {
        return this.id;
    }

    public String getType() {
        return this.type;
    }

    public String getChannel() {
        return this.channel;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Typing)) return false;
        final Typing other = (Typing) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$type = this.getType();
        final Object other$type = other.getType();
        if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
        final Object this$channel = this.getChannel();
        final Object other$channel = other.getChannel();
        if (this$channel == null ? other$channel != null : !this$channel.equals(other$channel)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Typing;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $type = this.getType();
        result = result * PRIME + ($type == null ? 43 : $type.hashCode());
        final Object $channel = this.getChannel();
        result = result * PRIME + ($channel == null ? 43 : $channel.hashCode());
        return result;
    }

    public String toString() {
        return "Typing(id=" + this.getId() + ", type=" + this.getType() + ", channel=" + this.getChannel() + ")";
    }

    public static class TypingBuilder {
        private Long id;
        private String channel;

        TypingBuilder() {
        }

        public Typing.TypingBuilder id(Long id) {
            this.id = id;
            return this;
        }

        public Typing.TypingBuilder channel(String channel) {
            this.channel = channel;
            return this;
        }

        public Typing build() {
            return new Typing(id, channel);
        }

        public String toString() {
            return "Typing.TypingBuilder(id=" + this.id + ", channel=" + this.channel + ")";
        }
    }
}
