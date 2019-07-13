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

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Message)) return false;
        final Message other = (Message) o;
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
        final Object this$text = this.getText();
        final Object other$text = other.getText();
        if (this$text == null ? other$text != null : !this$text.equals(other$text)) return false;
        final Object this$blocks = this.getBlocks();
        final Object other$blocks = other.getBlocks();
        if (this$blocks == null ? other$blocks != null : !this$blocks.equals(other$blocks)) return false;
        final Object this$attachments = this.getAttachments();
        final Object other$attachments = other.getAttachments();
        if (this$attachments == null ? other$attachments != null : !this$attachments.equals(other$attachments))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Message;
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
        final Object $text = this.getText();
        result = result * PRIME + ($text == null ? 43 : $text.hashCode());
        final Object $blocks = this.getBlocks();
        result = result * PRIME + ($blocks == null ? 43 : $blocks.hashCode());
        final Object $attachments = this.getAttachments();
        result = result * PRIME + ($attachments == null ? 43 : $attachments.hashCode());
        return result;
    }

    public String toString() {
        return "Message(id=" + this.getId() + ", type=" + this.getType() + ", channel=" + this.getChannel() + ", text=" + this.getText() + ", blocks=" + this.getBlocks() + ", attachments=" + this.getAttachments() + ")";
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
