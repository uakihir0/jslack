package com.github.seratch.jslack.api.model.event;

import com.github.seratch.jslack.api.model.Attachment;
import com.github.seratch.jslack.api.model.Message;
import com.github.seratch.jslack.api.model.block.LayoutBlock;

import java.util.List;

/**
 * https://api.slack.com/events/message/bot_message
 */
public class MessageBotEvent implements Event {

    public static final String TYPE_NAME = "message";
    public static final String SUBTYPE_NAME = "bot_message";

    private final String type = TYPE_NAME;
    private final String subtype = SUBTYPE_NAME;

    private String botId;
    private String username;
    private Message.Icons icons;

    private String channel;

    private String text;
    private List<LayoutBlock> blocks;
    private List<Attachment> attachments;

    private String ts;

    private String eventTs;
    private String channelType; // app_home, channel, group, im, mpim

    public String getType() {
        return this.type;
    }

    public String getSubtype() {
        return this.subtype;
    }

    public String getBotId() {
        return this.botId;
    }

    public String getUsername() {
        return this.username;
    }

    public Message.Icons getIcons() {
        return this.icons;
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

    public String getTs() {
        return this.ts;
    }

    public String getEventTs() {
        return this.eventTs;
    }

    public String getChannelType() {
        return this.channelType;
    }

    public void setBotId(String botId) {
        this.botId = botId;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setIcons(Message.Icons icons) {
        this.icons = icons;
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

    public void setTs(String ts) {
        this.ts = ts;
    }

    public void setEventTs(String eventTs) {
        this.eventTs = eventTs;
    }

    public void setChannelType(String channelType) {
        this.channelType = channelType;
    }
}
