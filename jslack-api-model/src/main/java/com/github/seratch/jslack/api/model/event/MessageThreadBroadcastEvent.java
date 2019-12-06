package com.github.seratch.jslack.api.model.event;

import com.github.seratch.jslack.api.model.Attachment;
import com.github.seratch.jslack.api.model.Message;
import com.github.seratch.jslack.api.model.block.LayoutBlock;

import java.util.List;

/**
 * https://api.slack.com/events/message/thread_broadcast
 */
public class MessageThreadBroadcastEvent implements Event {

    public static final String TYPE_NAME = "message";
    public static final String SUBTYPE_NAME = "thread_broadcast";

    private String clientMsgId;

    private final String type = TYPE_NAME;
    private final String subtype = SUBTYPE_NAME;
    private String channel;
    private String user;

    private Message.MessageRoot root;

    private String text;
    private List<LayoutBlock> blocks;
    private List<Attachment> attachments;

    private String ts;
    private String threadTs;

    private String eventTs;
    private String channelType; // app_home, channel, group, im, mpim

    public String getClientMsgId() {
        return this.clientMsgId;
    }

    public String getType() {
        return this.type;
    }

    public String getSubtype() {
        return this.subtype;
    }

    public String getChannel() {
        return this.channel;
    }

    public String getUser() {
        return this.user;
    }

    public Message.MessageRoot getRoot() {
        return this.root;
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

    public String getThreadTs() {
        return this.threadTs;
    }

    public String getEventTs() {
        return this.eventTs;
    }

    public String getChannelType() {
        return this.channelType;
    }

    public void setClientMsgId(String clientMsgId) {
        this.clientMsgId = clientMsgId;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setRoot(Message.MessageRoot root) {
        this.root = root;
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

    public void setThreadTs(String threadTs) {
        this.threadTs = threadTs;
    }

    public void setEventTs(String eventTs) {
        this.eventTs = eventTs;
    }

    public void setChannelType(String channelType) {
        this.channelType = channelType;
    }
}
