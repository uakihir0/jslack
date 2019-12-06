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
