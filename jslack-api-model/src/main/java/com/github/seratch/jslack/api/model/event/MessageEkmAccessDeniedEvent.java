package com.github.seratch.jslack.api.model.event;

import com.github.seratch.jslack.api.model.Attachment;
import com.github.seratch.jslack.api.model.block.LayoutBlock;

import java.util.List;

/**
 * https://api.slack.com/events/message/ekm_access_denied
 */
public class MessageEkmAccessDeniedEvent implements Event {

    public static final String TYPE_NAME = "message";
    public static final String SUBTYPE_NAME = "ekm_access_denied";

    private final String type = TYPE_NAME;
    private final String subtype = SUBTYPE_NAME;
    private String channel;
    private boolean hidden;

    private String user;

    private String text;
    private List<LayoutBlock> blocks;
    private List<Attachment> attachments;

    private String eventTs;
    private String ts;
    private String channelType; // app_home, channel, group, im, mpim

    public String getType() {
        return this.type;
    }

    public String getSubtype() {
        return this.subtype;
    }

    public String getChannel() {
        return this.channel;
    }

    public boolean isHidden() {
        return this.hidden;
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

    public String getEventTs() {
        return this.eventTs;
    }

    public String getTs() {
        return this.ts;
    }

    public String getChannelType() {
        return this.channelType;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public void setHidden(boolean hidden) {
        this.hidden = hidden;
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

    public void setEventTs(String eventTs) {
        this.eventTs = eventTs;
    }

    public void setTs(String ts) {
        this.ts = ts;
    }

    public void setChannelType(String channelType) {
        this.channelType = channelType;
    }
}
