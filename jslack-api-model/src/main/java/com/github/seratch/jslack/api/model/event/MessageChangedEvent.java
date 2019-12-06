package com.github.seratch.jslack.api.model.event;

import com.github.seratch.jslack.api.model.Attachment;
import com.github.seratch.jslack.api.model.Reaction;
import com.github.seratch.jslack.api.model.block.LayoutBlock;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * https://api.slack.com/events/message/message_changed
 */
public class MessageChangedEvent implements Event {

    public static final String TYPE_NAME = "message";
    public static final String SUBTYPE_NAME = "message_changed";

    private final String type = TYPE_NAME;
    private final String subtype = SUBTYPE_NAME;
    private String channel;

    private boolean hidden;

    private Message message;
    private Message previousMessage;

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

    public Message getMessage() {
        return this.message;
    }

    public Message getPreviousMessage() {
        return this.previousMessage;
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

    public void setMessage(Message message) {
        this.message = message;
    }

    public void setPreviousMessage(Message previousMessage) {
        this.previousMessage = previousMessage;
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

    public static class Message {
        private String clientMsgId;

        private final String type = TYPE_NAME;
        private String subtype;

        private String user;
        private String team;

        private MessageEvent.Edited edited;

        private String text;
        private List<LayoutBlock> blocks;
        private List<Attachment> attachments;

        private String ts;
        private String userTeam;
        private String sourceTeam;

        @SerializedName("is_starred")
        private boolean starred;
        private List<String> pinnedTo;
        private List<Reaction> reactions;

        public String getClientMsgId() {
            return this.clientMsgId;
        }

        public String getType() {
            return this.type;
        }

        public String getSubtype() {
            return this.subtype;
        }

        public String getUser() {
            return this.user;
        }

        public String getTeam() {
            return this.team;
        }

        public MessageEvent.Edited getEdited() {
            return this.edited;
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

        public String getUserTeam() {
            return this.userTeam;
        }

        public String getSourceTeam() {
            return this.sourceTeam;
        }

        public boolean isStarred() {
            return this.starred;
        }

        public List<String> getPinnedTo() {
            return this.pinnedTo;
        }

        public List<Reaction> getReactions() {
            return this.reactions;
        }

        public void setClientMsgId(String clientMsgId) {
            this.clientMsgId = clientMsgId;
        }

        public void setSubtype(String subtype) {
            this.subtype = subtype;
        }

        public void setUser(String user) {
            this.user = user;
        }

        public void setTeam(String team) {
            this.team = team;
        }

        public void setEdited(MessageEvent.Edited edited) {
            this.edited = edited;
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

        public void setUserTeam(String userTeam) {
            this.userTeam = userTeam;
        }

        public void setSourceTeam(String sourceTeam) {
            this.sourceTeam = sourceTeam;
        }

        public void setStarred(boolean starred) {
            this.starred = starred;
        }

        public void setPinnedTo(List<String> pinnedTo) {
            this.pinnedTo = pinnedTo;
        }

        public void setReactions(List<Reaction> reactions) {
            this.reactions = reactions;
        }
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
