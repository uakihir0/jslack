package com.github.seratch.jslack.api.model.event;

/**
 * When a reaction is removed from an item the reaction_removed event is sent to all connected clients
 * for users who can see the content that had the reaction.
 * <p>
 * The user field indicates the ID of the user who performed this event.
 * The item_user field represents the ID of the user that created the original item that has been reacted to.
 * <p>
 * Some messages aren't authored by "users," like those created by incoming webhooks.
 * reaction_removed events related to these messages will not include an item_user.
 * <p>
 * The item field is a brief reference to what the reaction was attached to.
 * The above example describes a reaction being removed from a message.
 * <p>
 * https://api.slack.com/events/reaction_removed
 */
public class ReactionRemovedEvent implements Event {

    public static final String TYPE_NAME = "reaction_removed";

    private final String type = TYPE_NAME;
    private String user;
    private String reaction;
    private String itemUser;
    private Item item;
    private String eventTs;

    public String getType() {
        return this.type;
    }

    public String getUser() {
        return this.user;
    }

    public String getReaction() {
        return this.reaction;
    }

    public String getItemUser() {
        return this.itemUser;
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

    public void setReaction(String reaction) {
        this.reaction = reaction;
    }

    public void setItemUser(String itemUser) {
        this.itemUser = itemUser;
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
        private String ts;

        private String file; // "type": "file" or "type": "file_comment"
        private String fileComment; // "type": "file_comment"

        public String getType() {
            return this.type;
        }

        public String getChannel() {
            return this.channel;
        }

        public String getTs() {
            return this.ts;
        }

        public String getFile() {
            return this.file;
        }

        public String getFileComment() {
            return this.fileComment;
        }

        public void setType(String type) {
            this.type = type;
        }

        public void setChannel(String channel) {
            this.channel = channel;
        }

        public void setTs(String ts) {
            this.ts = ts;
        }

        public void setFile(String file) {
            this.file = file;
        }

        public void setFileComment(String fileComment) {
            this.fileComment = fileComment;
        }
    }
}