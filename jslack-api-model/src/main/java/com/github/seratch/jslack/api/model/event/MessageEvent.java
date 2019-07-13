package com.github.seratch.jslack.api.model.event;

import com.github.seratch.jslack.api.model.Attachment;
import com.github.seratch.jslack.api.model.Message;
import com.github.seratch.jslack.api.model.Reaction;
import com.github.seratch.jslack.api.model.block.LayoutBlock;
import com.google.gson.annotations.SerializedName;

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
    private String threadTs;
    private String eventTs;
    private String channelType; // app_home, channel, group, im, mpim

    private Edited edited;

    public MessageEvent() {
    }

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

    public String getSubtype() {
        return this.subtype;
    }

    public boolean isHidden() {
        return this.hidden;
    }

    public String getDeletedTs() {
        return this.deletedTs;
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

    public String getBotId() {
        return this.botId;
    }

    public String getUsername() {
        return this.username;
    }

    public Message.Icons getIcons() {
        return this.icons;
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

    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }

    public void setHidden(boolean hidden) {
        this.hidden = hidden;
    }

    public void setDeletedTs(String deletedTs) {
        this.deletedTs = deletedTs;
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

    public void setBotId(String botId) {
        this.botId = botId;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setIcons(Message.Icons icons) {
        this.icons = icons;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof MessageEvent)) return false;
        final MessageEvent other = (MessageEvent) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$clientMsgId = this.getClientMsgId();
        final Object other$clientMsgId = other.getClientMsgId();
        if (this$clientMsgId == null ? other$clientMsgId != null : !this$clientMsgId.equals(other$clientMsgId))
            return false;
        final Object this$type = this.getType();
        final Object other$type = other.getType();
        if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
        final Object this$channel = this.getChannel();
        final Object other$channel = other.getChannel();
        if (this$channel == null ? other$channel != null : !this$channel.equals(other$channel)) return false;
        final Object this$user = this.getUser();
        final Object other$user = other.getUser();
        if (this$user == null ? other$user != null : !this$user.equals(other$user)) return false;
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
        final Object this$ts = this.getTs();
        final Object other$ts = other.getTs();
        if (this$ts == null ? other$ts != null : !this$ts.equals(other$ts)) return false;
        final Object this$threadTs = this.getThreadTs();
        final Object other$threadTs = other.getThreadTs();
        if (this$threadTs == null ? other$threadTs != null : !this$threadTs.equals(other$threadTs)) return false;
        final Object this$eventTs = this.getEventTs();
        final Object other$eventTs = other.getEventTs();
        if (this$eventTs == null ? other$eventTs != null : !this$eventTs.equals(other$eventTs)) return false;
        final Object this$channelType = this.getChannelType();
        final Object other$channelType = other.getChannelType();
        if (this$channelType == null ? other$channelType != null : !this$channelType.equals(other$channelType))
            return false;
        final Object this$edited = this.getEdited();
        final Object other$edited = other.getEdited();
        if (this$edited == null ? other$edited != null : !this$edited.equals(other$edited)) return false;
        final Object this$subtype = this.getSubtype();
        final Object other$subtype = other.getSubtype();
        if (this$subtype == null ? other$subtype != null : !this$subtype.equals(other$subtype)) return false;
        if (this.isHidden() != other.isHidden()) return false;
        final Object this$deletedTs = this.getDeletedTs();
        final Object other$deletedTs = other.getDeletedTs();
        if (this$deletedTs == null ? other$deletedTs != null : !this$deletedTs.equals(other$deletedTs)) return false;
        if (this.isStarred() != other.isStarred()) return false;
        final Object this$pinnedTo = this.getPinnedTo();
        final Object other$pinnedTo = other.getPinnedTo();
        if (this$pinnedTo == null ? other$pinnedTo != null : !this$pinnedTo.equals(other$pinnedTo)) return false;
        final Object this$reactions = this.getReactions();
        final Object other$reactions = other.getReactions();
        if (this$reactions == null ? other$reactions != null : !this$reactions.equals(other$reactions)) return false;
        final Object this$botId = this.getBotId();
        final Object other$botId = other.getBotId();
        if (this$botId == null ? other$botId != null : !this$botId.equals(other$botId)) return false;
        final Object this$username = this.getUsername();
        final Object other$username = other.getUsername();
        if (this$username == null ? other$username != null : !this$username.equals(other$username)) return false;
        final Object this$icons = this.getIcons();
        final Object other$icons = other.getIcons();
        if (this$icons == null ? other$icons != null : !this$icons.equals(other$icons)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof MessageEvent;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $clientMsgId = this.getClientMsgId();
        result = result * PRIME + ($clientMsgId == null ? 43 : $clientMsgId.hashCode());
        final Object $type = this.getType();
        result = result * PRIME + ($type == null ? 43 : $type.hashCode());
        final Object $channel = this.getChannel();
        result = result * PRIME + ($channel == null ? 43 : $channel.hashCode());
        final Object $user = this.getUser();
        result = result * PRIME + ($user == null ? 43 : $user.hashCode());
        final Object $text = this.getText();
        result = result * PRIME + ($text == null ? 43 : $text.hashCode());
        final Object $blocks = this.getBlocks();
        result = result * PRIME + ($blocks == null ? 43 : $blocks.hashCode());
        final Object $attachments = this.getAttachments();
        result = result * PRIME + ($attachments == null ? 43 : $attachments.hashCode());
        final Object $ts = this.getTs();
        result = result * PRIME + ($ts == null ? 43 : $ts.hashCode());
        final Object $threadTs = this.getThreadTs();
        result = result * PRIME + ($threadTs == null ? 43 : $threadTs.hashCode());
        final Object $eventTs = this.getEventTs();
        result = result * PRIME + ($eventTs == null ? 43 : $eventTs.hashCode());
        final Object $channelType = this.getChannelType();
        result = result * PRIME + ($channelType == null ? 43 : $channelType.hashCode());
        final Object $edited = this.getEdited();
        result = result * PRIME + ($edited == null ? 43 : $edited.hashCode());
        final Object $subtype = this.getSubtype();
        result = result * PRIME + ($subtype == null ? 43 : $subtype.hashCode());
        result = result * PRIME + (this.isHidden() ? 79 : 97);
        final Object $deletedTs = this.getDeletedTs();
        result = result * PRIME + ($deletedTs == null ? 43 : $deletedTs.hashCode());
        result = result * PRIME + (this.isStarred() ? 79 : 97);
        final Object $pinnedTo = this.getPinnedTo();
        result = result * PRIME + ($pinnedTo == null ? 43 : $pinnedTo.hashCode());
        final Object $reactions = this.getReactions();
        result = result * PRIME + ($reactions == null ? 43 : $reactions.hashCode());
        final Object $botId = this.getBotId();
        result = result * PRIME + ($botId == null ? 43 : $botId.hashCode());
        final Object $username = this.getUsername();
        result = result * PRIME + ($username == null ? 43 : $username.hashCode());
        final Object $icons = this.getIcons();
        result = result * PRIME + ($icons == null ? 43 : $icons.hashCode());
        return result;
    }

    public String toString() {
        return "MessageEvent(clientMsgId=" + this.getClientMsgId() + ", type=" + this.getType() + ", channel=" + this.getChannel() + ", user=" + this.getUser() + ", text=" + this.getText() + ", blocks=" + this.getBlocks() + ", attachments=" + this.getAttachments() + ", ts=" + this.getTs() + ", threadTs=" + this.getThreadTs() + ", eventTs=" + this.getEventTs() + ", channelType=" + this.getChannelType() + ", edited=" + this.getEdited() + ", subtype=" + this.getSubtype() + ", hidden=" + this.isHidden() + ", deletedTs=" + this.getDeletedTs() + ", starred=" + this.isStarred() + ", pinnedTo=" + this.getPinnedTo() + ", reactions=" + this.getReactions() + ", botId=" + this.getBotId() + ", username=" + this.getUsername() + ", icons=" + this.getIcons() + ")";
    }

    public static class Edited {
        private String user;
        private String ts;

        public Edited() {
        }

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

        public boolean equals(final Object o) {
            if (o == this) return true;
            if (!(o instanceof Edited)) return false;
            final Edited other = (Edited) o;
            if (!other.canEqual((Object) this)) return false;
            final Object this$user = this.getUser();
            final Object other$user = other.getUser();
            if (this$user == null ? other$user != null : !this$user.equals(other$user)) return false;
            final Object this$ts = this.getTs();
            final Object other$ts = other.getTs();
            if (this$ts == null ? other$ts != null : !this$ts.equals(other$ts)) return false;
            return true;
        }

        protected boolean canEqual(final Object other) {
            return other instanceof Edited;
        }

        public int hashCode() {
            final int PRIME = 59;
            int result = 1;
            final Object $user = this.getUser();
            result = result * PRIME + ($user == null ? 43 : $user.hashCode());
            final Object $ts = this.getTs();
            result = result * PRIME + ($ts == null ? 43 : $ts.hashCode());
            return result;
        }

        public String toString() {
            return "MessageEvent.Edited(user=" + this.getUser() + ", ts=" + this.getTs() + ")";
        }
    }

    private String subtype;
    private boolean hidden;
    private String deletedTs;

    @SerializedName("is_starred")
    private boolean starred;
    private List<String> pinnedTo;
    private List<Reaction> reactions;

    // bot_message
    private String botId;
    private String username;
    private Message.Icons icons;
}
