package com.github.seratch.jslack.api.model.event;

/**
 * When a reaction is added to an item the reaction_added event is sent to all connected clients
 * for users who can see the content that was reacted to.
 * <p>
 * The user field indicates the ID of the user who performed this event.
 * The item_user field represents the ID of the user that created the original item that has been reacted to.
 * <p>
 * Some messages aren't authored by "users," like those created by incoming webhooks.
 * reaction_added events related to these messages will not include an item_user.
 * <p>
 * The item field is a brief reference to what was reacted to. The above example describes a reaction to a message.
 * <p>
 * https://api.slack.com/events/reaction_added
 */
public class ReactionAddedEvent implements Event {

    public static final String TYPE_NAME = "reaction_added";

    private final String type = TYPE_NAME;
    private String user;
    private String reaction;
    private String itemUser;
    private Item item;
    private String eventTs;

    public ReactionAddedEvent() {
    }

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

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ReactionAddedEvent)) return false;
        final ReactionAddedEvent other = (ReactionAddedEvent) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$type = this.getType();
        final Object other$type = other.getType();
        if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
        final Object this$user = this.getUser();
        final Object other$user = other.getUser();
        if (this$user == null ? other$user != null : !this$user.equals(other$user)) return false;
        final Object this$reaction = this.getReaction();
        final Object other$reaction = other.getReaction();
        if (this$reaction == null ? other$reaction != null : !this$reaction.equals(other$reaction)) return false;
        final Object this$itemUser = this.getItemUser();
        final Object other$itemUser = other.getItemUser();
        if (this$itemUser == null ? other$itemUser != null : !this$itemUser.equals(other$itemUser)) return false;
        final Object this$item = this.getItem();
        final Object other$item = other.getItem();
        if (this$item == null ? other$item != null : !this$item.equals(other$item)) return false;
        final Object this$eventTs = this.getEventTs();
        final Object other$eventTs = other.getEventTs();
        if (this$eventTs == null ? other$eventTs != null : !this$eventTs.equals(other$eventTs)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ReactionAddedEvent;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $type = this.getType();
        result = result * PRIME + ($type == null ? 43 : $type.hashCode());
        final Object $user = this.getUser();
        result = result * PRIME + ($user == null ? 43 : $user.hashCode());
        final Object $reaction = this.getReaction();
        result = result * PRIME + ($reaction == null ? 43 : $reaction.hashCode());
        final Object $itemUser = this.getItemUser();
        result = result * PRIME + ($itemUser == null ? 43 : $itemUser.hashCode());
        final Object $item = this.getItem();
        result = result * PRIME + ($item == null ? 43 : $item.hashCode());
        final Object $eventTs = this.getEventTs();
        result = result * PRIME + ($eventTs == null ? 43 : $eventTs.hashCode());
        return result;
    }

    public String toString() {
        return "ReactionAddedEvent(type=" + this.getType() + ", user=" + this.getUser() + ", reaction=" + this.getReaction() + ", itemUser=" + this.getItemUser() + ", item=" + this.getItem() + ", eventTs=" + this.getEventTs() + ")";
    }

    public static class Item {
        private String type;
        private String channel;
        private String ts;

        private String file; // "type": "file" or "type": "file_comment"
        private String fileComment; // "type": "file_comment"

        public Item() {
        }

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
            final Object this$ts = this.getTs();
            final Object other$ts = other.getTs();
            if (this$ts == null ? other$ts != null : !this$ts.equals(other$ts)) return false;
            final Object this$file = this.getFile();
            final Object other$file = other.getFile();
            if (this$file == null ? other$file != null : !this$file.equals(other$file)) return false;
            final Object this$fileComment = this.getFileComment();
            final Object other$fileComment = other.getFileComment();
            if (this$fileComment == null ? other$fileComment != null : !this$fileComment.equals(other$fileComment))
                return false;
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
            final Object $ts = this.getTs();
            result = result * PRIME + ($ts == null ? 43 : $ts.hashCode());
            final Object $file = this.getFile();
            result = result * PRIME + ($file == null ? 43 : $file.hashCode());
            final Object $fileComment = this.getFileComment();
            result = result * PRIME + ($fileComment == null ? 43 : $fileComment.hashCode());
            return result;
        }

        public String toString() {
            return "ReactionAddedEvent.Item(type=" + this.getType() + ", channel=" + this.getChannel() + ", ts=" + this.getTs() + ", file=" + this.getFile() + ", fileComment=" + this.getFileComment() + ")";
        }
    }
}