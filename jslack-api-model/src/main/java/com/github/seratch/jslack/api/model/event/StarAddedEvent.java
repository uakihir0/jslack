package com.github.seratch.jslack.api.model.event;

import com.github.seratch.jslack.api.model.Attachment;
import com.github.seratch.jslack.api.model.File;
import com.github.seratch.jslack.api.model.FileComment;
import com.github.seratch.jslack.api.model.block.LayoutBlock;

import java.util.List;

/**
 * When an item is starred, the star_added event is sent to all connected clients for the authenticated user who starred the item.
 * <p>
 * See the stars.list method for details of the structure of the item property.
 * <p>
 * https://api.slack.com/events/star_added
 */
public class StarAddedEvent implements Event {

    public static final String TYPE_NAME = "star_added";

    private final String type = TYPE_NAME;
    private String user;
    private Item item;
    private String eventTs;

    public String getType() {
        return this.type;
    }

    public String getUser() {
        return this.user;
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

    public void setItem(Item item) {
        this.item = item;
    }

    public void setEventTs(String eventTs) {
        this.eventTs = eventTs;
    }

    public static class Item {
        private String type;
        private String channel;
        private String createdBy; // user id
        private Integer created;

        private Message message;
        private File file; // TODO: correct definition
        private FileComment comment; // TODO: correct definition

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
    }

}