package com.github.seratch.jslack.api.rtm.message;

import com.github.seratch.jslack.api.model.Attachment;
import com.github.seratch.jslack.api.model.block.LayoutBlock;

import java.util.List;

/**
 * https://api.slack.com/events/message
 */
public class Message implements RTMMessage {

    public static final String TYPE_NAME = "message";

    private Long id;
    private final String type = TYPE_NAME;
    private String channel;

    private String text;
    private List<LayoutBlock> blocks;
    private List<Attachment> attachments;

    public Message(Long id, String channel, String text, List<LayoutBlock> blocks, List<Attachment> attachments) {
        this.id = id;
        this.channel = channel;
        this.text = text;
        this.blocks = blocks;
        this.attachments = attachments;
    }

    public Message() {
    }

    public static MessageBuilder builder() {
        return new MessageBuilder();
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

    public String getText() {
        return this.text;
    }

    public List<LayoutBlock> getBlocks() {
        return this.blocks;
    }

    public List<Attachment> getAttachments() {
        return this.attachments;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setBlocks(List<LayoutBlock> blocks) {
        this.blocks = blocks;
    }

    public void setAttachments(List<Attachment> attachments) {
        this.attachments = attachments;
    }

    public static class MessageBuilder {
        private Long id;
        private String channel;
        private String text;
        private List<LayoutBlock> blocks;
        private List<Attachment> attachments;

        MessageBuilder() {
        }

        public Message.MessageBuilder id(Long id) {
            this.id = id;
            return this;
        }

        public Message.MessageBuilder channel(String channel) {
            this.channel = channel;
            return this;
        }

        public Message.MessageBuilder text(String text) {
            this.text = text;
            return this;
        }

        public Message.MessageBuilder blocks(List<LayoutBlock> blocks) {
            this.blocks = blocks;
            return this;
        }

        public Message.MessageBuilder attachments(List<Attachment> attachments) {
            this.attachments = attachments;
            return this;
        }

        public Message build() {
            return new Message(id, channel, text, blocks, attachments);
        }

        public String toString() {
            return "Message.MessageBuilder(id=" + this.id + ", channel=" + this.channel + ", text=" + this.text + ", blocks=" + this.blocks + ", attachments=" + this.attachments + ")";
        }
    }
}
