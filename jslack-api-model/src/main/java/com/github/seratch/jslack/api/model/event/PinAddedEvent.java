package com.github.seratch.jslack.api.model.event;

import com.github.seratch.jslack.api.model.Attachment;
import com.github.seratch.jslack.api.model.File;
import com.github.seratch.jslack.api.model.FileComment;
import com.github.seratch.jslack.api.model.block.LayoutBlock;

import java.util.List;

/**
 * When an item is pinned in a channel, the pin_added event is sent to all members of that channel.
 * <p>
 * https://api.slack.com/events/pin_added
 */
public class PinAddedEvent implements Event {

    public static final String TYPE_NAME = "pin_added";

    private final String type = TYPE_NAME;
    private String user;
    private String channelId;
    private Item item;
    private String eventTs;

    public PinAddedEvent() {
    }

    public String getType() {
        return this.type;
    }

    public String getUser() {
        return this.user;
    }

    public String getChannelId() {
        return this.channelId;
    }

    public Item getItem() {
        return this.item;
    }

    public String getEventTs() {
        return this.eventTs;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public void setEventTs(String eventTs) {
        this.eventTs = eventTs;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof PinAddedEvent)) return false;
        final PinAddedEvent other = (PinAddedEvent) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$type = this.getType();
        final Object other$type = other.getType();
        if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
        final Object this$user = this.getUser();
        final Object other$user = other.getUser();
        if (this$user == null ? other$user != null : !this$user.equals(other$user)) return false;
        final Object this$channelId = this.getChannelId();
        final Object other$channelId = other.getChannelId();
        if (this$channelId == null ? other$channelId != null : !this$channelId.equals(other$channelId)) return false;
        final Object this$item = this.getItem();
        final Object other$item = other.getItem();
        if (this$item == null ? other$item != null : !this$item.equals(other$item)) return false;
        final Object this$eventTs = this.getEventTs();
        final Object other$eventTs = other.getEventTs();
        if (this$eventTs == null ? other$eventTs != null : !this$eventTs.equals(other$eventTs)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof PinAddedEvent;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $type = this.getType();
        result = result * PRIME + ($type == null ? 43 : $type.hashCode());
        final Object $user = this.getUser();
        result = result * PRIME + ($user == null ? 43 : $user.hashCode());
        final Object $channelId = this.getChannelId();
        result = result * PRIME + ($channelId == null ? 43 : $channelId.hashCode());
        final Object $item = this.getItem();
        result = result * PRIME + ($item == null ? 43 : $item.hashCode());
        final Object $eventTs = this.getEventTs();
        result = result * PRIME + ($eventTs == null ? 43 : $eventTs.hashCode());
        return result;
    }

    public String toString() {
        return "PinAddedEvent(type=" + this.getType() + ", user=" + this.getUser() + ", channelId=" + this.getChannelId() + ", item=" + this.getItem() + ", eventTs=" + this.getEventTs() + ")";
    }

    public static class Item {
        private String type;
        private String channel;
        private String createdBy; // user id
        private Integer created;

        private Message message;
        private File file; // TODO: correct definition
        private FileComment comment; // TODO: correct definition

        public Item() {
        }

        public String getType() {
            return this.type;
        }

        public String getChannel() {
            return this.channel;
        }

        public String getCreatedBy() {
            return this.createdBy;
        }

        public Integer getCreated() {
            return this.created;
        }

        public Message getMessage() {
            return this.message;
        }

        public File getFile() {
            return this.file;
        }

        public FileComment getComment() {
            return this.comment;
        }

        public void setType(String type) {
            this.type = type;
        }

        public void setChannel(String channel) {
            this.channel = channel;
        }

        public void setCreatedBy(String createdBy) {
            this.createdBy = createdBy;
        }

        public void setCreated(Integer created) {
            this.created = created;
        }

        public void setMessage(Message message) {
            this.message = message;
        }

        public void setFile(File file) {
            this.file = file;
        }

        public void setComment(FileComment comment) {
            this.comment = comment;
        }

        public boolean equals(final Object o) {
            if (o == this) return true;
            if (!(o instanceof Item)) return false;
            final Item other = (Item) o;
            if (!other.canEqual((Object) this)) return false;
            final Object this$type = this.getType();
            final Object other$type = other.getType();
            if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
            final Object this$channel = this.getChannel();
            final Object other$channel = other.getChannel();
            if (this$channel == null ? other$channel != null : !this$channel.equals(other$channel)) return false;
            final Object this$createdBy = this.getCreatedBy();
            final Object other$createdBy = other.getCreatedBy();
            if (this$createdBy == null ? other$createdBy != null : !this$createdBy.equals(other$createdBy))
                return false;
            final Object this$created = this.getCreated();
            final Object other$created = other.getCreated();
            if (this$created == null ? other$created != null : !this$created.equals(other$created)) return false;
            final Object this$message = this.getMessage();
            final Object other$message = other.getMessage();
            if (this$message == null ? other$message != null : !this$message.equals(other$message)) return false;
            final Object this$file = this.getFile();
            final Object other$file = other.getFile();
            if (this$file == null ? other$file != null : !this$file.equals(other$file)) return false;
            final Object this$comment = this.getComment();
            final Object other$comment = other.getComment();
            if (this$comment == null ? other$comment != null : !this$comment.equals(other$comment)) return false;
            return true;
        }

        protected boolean canEqual(final Object other) {
            return other instanceof Item;
        }

        public int hashCode() {
            final int PRIME = 59;
            int result = 1;
            final Object $type = this.getType();
            result = result * PRIME + ($type == null ? 43 : $type.hashCode());
            final Object $channel = this.getChannel();
            result = result * PRIME + ($channel == null ? 43 : $channel.hashCode());
            final Object $createdBy = this.getCreatedBy();
            result = result * PRIME + ($createdBy == null ? 43 : $createdBy.hashCode());
            final Object $created = this.getCreated();
            result = result * PRIME + ($created == null ? 43 : $created.hashCode());
            final Object $message = this.getMessage();
            result = result * PRIME + ($message == null ? 43 : $message.hashCode());
            final Object $file = this.getFile();
            result = result * PRIME + ($file == null ? 43 : $file.hashCode());
            final Object $comment = this.getComment();
            result = result * PRIME + ($comment == null ? 43 : $comment.hashCode());
            return result;
        }

        public String toString() {
            return "PinAddedEvent.Item(type=" + this.getType() + ", channel=" + this.getChannel() + ", createdBy=" + this.getCreatedBy() + ", created=" + this.getCreated() + ", message=" + this.getMessage() + ", file=" + this.getFile() + ", comment=" + this.getComment() + ")";
        }
    }

    public static class Message {
        private String clientMsgId;
        private String type;
        private String user;
        private String text;
        private List<LayoutBlock> blocks;
        private List<Attachment> attachments;
        private String ts;
        private List<String> pinnedTo;
        private String permalink;

        public Message() {
        }

        public String getClientMsgId() {
            return this.clientMsgId;
        }

        public String getType() {
            return this.type;
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

        public List<String> getPinnedTo() {
            return this.pinnedTo;
        }

        public String getPermalink() {
            return this.permalink;
        }

        public void setClientMsgId(String clientMsgId) {
            this.clientMsgId = clientMsgId;
        }

        public void setType(String type) {
            this.type = type;
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

        public void setPinnedTo(List<String> pinnedTo) {
            this.pinnedTo = pinnedTo;
        }

        public void setPermalink(String permalink) {
            this.permalink = permalink;
        }

        public boolean equals(final Object o) {
            if (o == this) return true;
            if (!(o instanceof Message)) return false;
            final Message other = (Message) o;
            if (!other.canEqual((Object) this)) return false;
            final Object this$clientMsgId = this.getClientMsgId();
            final Object other$clientMsgId = other.getClientMsgId();
            if (this$clientMsgId == null ? other$clientMsgId != null : !this$clientMsgId.equals(other$clientMsgId))
                return false;
            final Object this$type = this.getType();
            final Object other$type = other.getType();
            if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
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
            final Object this$pinnedTo = this.getPinnedTo();
            final Object other$pinnedTo = other.getPinnedTo();
            if (this$pinnedTo == null ? other$pinnedTo != null : !this$pinnedTo.equals(other$pinnedTo)) return false;
            final Object this$permalink = this.getPermalink();
            final Object other$permalink = other.getPermalink();
            if (this$permalink == null ? other$permalink != null : !this$permalink.equals(other$permalink))
                return false;
            return true;
        }

        protected boolean canEqual(final Object other) {
            return other instanceof Message;
        }

        public int hashCode() {
            final int PRIME = 59;
            int result = 1;
            final Object $clientMsgId = this.getClientMsgId();
            result = result * PRIME + ($clientMsgId == null ? 43 : $clientMsgId.hashCode());
            final Object $type = this.getType();
            result = result * PRIME + ($type == null ? 43 : $type.hashCode());
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
            final Object $pinnedTo = this.getPinnedTo();
            result = result * PRIME + ($pinnedTo == null ? 43 : $pinnedTo.hashCode());
            final Object $permalink = this.getPermalink();
            result = result * PRIME + ($permalink == null ? 43 : $permalink.hashCode());
            return result;
        }

        public String toString() {
            return "PinAddedEvent.Message(clientMsgId=" + this.getClientMsgId() + ", type=" + this.getType() + ", user=" + this.getUser() + ", text=" + this.getText() + ", blocks=" + this.getBlocks() + ", attachments=" + this.getAttachments() + ", ts=" + this.getTs() + ", pinnedTo=" + this.getPinnedTo() + ", permalink=" + this.getPermalink() + ")";
        }
    }

}