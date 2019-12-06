package com.github.seratch.jslack.api.model.event;

import com.github.seratch.jslack.api.model.Attachment;
import com.github.seratch.jslack.api.model.block.LayoutBlock;

import java.util.List;

/**
 * A message is delivered from several sources:
 * <p>
 * - They are sent via the Real Time Messaging API when a message is sent to a channel to which you subscribe.
 * This message should immediately be displayed in the client.
 * - They are returned via calls to channels.history, im.history or groups.history
 * - They are returned as latest property on channel, group and im objects.
 * <p>
 * https://api.slack.com/events/message
 */
public class MessageEvent implements Event {

    public static final String TYPE_NAME = "message";

    private String clientMsgId;

    private final String type = TYPE_NAME;
    private String channel;
    private String user;

    private String text;
    private List<LayoutBlock> blocks;
    private List<Attachment> attachments;

    private String ts;

    private String parentUserId; // in the case of replies in thread
    private String threadTs; // in the case of replies in thread

    private String eventTs;
    private String channelType; // app_home, channel, group, im, mpim

    private Edited edited;

    public String getClientMsgId() {
        return this.clientMsgId;
    }

    public String getType() {
        return this.type;
    }

    public String getChannel() {
        return this.channel;
    }

    public String getUser() {
        return this.user;
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

    public String getParentUserId() {
        return this.parentUserId;
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

    public Edited getEdited() {
        return this.edited;
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

    public void setParentUserId(String parentUserId) {
        this.parentUserId = parentUserId;
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

    public void setEdited(Edited edited) {
        this.edited = edited;
    }

    public static class Edited {
        private String user;
        private String ts;

        public String getUser() {
            return this.user;
        }

        public String getTs() {
            return this.ts;
        }

        public void setUser(String user) {
            this.user = user;
        }

        public void setTs(String ts) {
            this.ts = ts;
        }
    }
}
