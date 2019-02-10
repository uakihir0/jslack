package com.github.seratch.jslack.api.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Message {

    private String type;
    private String channel;
    private String user;
    private String text;
    private List<Attachment> attachments;
    private String ts;
    private String threadTs;
    @SerializedName("is_starred")
    private boolean starred;
    private boolean wibblr;
    private List<String> pinnedTo;
    private List<Reaction> reactions;
    private String username;
    private String subtype;
    private String botId;
    private Icon icons;
    private File file;

    // field exists only if the message was edited
    private Edited edited;

    // https://api.slack.com/docs/message-link-unfurling
    private boolean unfurlLinks;
    private boolean unfurlMedia;

    @SerializedName("is_thread_broadcast")
    private boolean threadBroadcast;

    // this field exists only when posting the message with "reply_broadcast": true
    private MessageRoot root;

    public Message() {
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

    public List<Attachment> getAttachments() {
        return this.attachments;
    }

    public String getTs() {
        return this.ts;
    }

    public String getThreadTs() {
        return this.threadTs;
    }

    public boolean isStarred() {
        return this.starred;
    }

    public boolean isWibblr() {
        return this.wibblr;
    }

    public List<String> getPinnedTo() {
        return this.pinnedTo;
    }

    public List<Reaction> getReactions() {
        return this.reactions;
    }

    public String getUsername() {
        return this.username;
    }

    public String getSubtype() {
        return this.subtype;
    }

    public String getBotId() {
        return this.botId;
    }

    public Icon getIcons() {
        return this.icons;
    }

    public File getFile() {
        return this.file;
    }

    public Edited getEdited() {
        return this.edited;
    }

    public boolean isUnfurlLinks() {
        return this.unfurlLinks;
    }

    public boolean isUnfurlMedia() {
        return this.unfurlMedia;
    }

    public boolean isThreadBroadcast() {
        return this.threadBroadcast;
    }

    public MessageRoot getRoot() {
        return this.root;
    }

    public void setType(String type) {
        this.type = type;
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

    public void setAttachments(List<Attachment> attachments) {
        this.attachments = attachments;
    }

    public void setTs(String ts) {
        this.ts = ts;
    }

    public void setThreadTs(String threadTs) {
        this.threadTs = threadTs;
    }

    public void setStarred(boolean starred) {
        this.starred = starred;
    }

    public void setWibblr(boolean wibblr) {
        this.wibblr = wibblr;
    }

    public void setPinnedTo(List<String> pinnedTo) {
        this.pinnedTo = pinnedTo;
    }

    public void setReactions(List<Reaction> reactions) {
        this.reactions = reactions;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }

    public void setBotId(String botId) {
        this.botId = botId;
    }

    public void setIcons(Icon icons) {
        this.icons = icons;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public void setEdited(Edited edited) {
        this.edited = edited;
    }

    public void setUnfurlLinks(boolean unfurlLinks) {
        this.unfurlLinks = unfurlLinks;
    }

    public void setUnfurlMedia(boolean unfurlMedia) {
        this.unfurlMedia = unfurlMedia;
    }

    public void setThreadBroadcast(boolean threadBroadcast) {
        this.threadBroadcast = threadBroadcast;
    }

    public void setRoot(MessageRoot root) {
        this.root = root;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Message)) return false;
        final Message other = (Message) o;
        if (!other.canEqual((Object) this)) return false;
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
        if (this.isStarred() != other.isStarred()) return false;
        if (this.isWibblr() != other.isWibblr()) return false;
        final Object this$pinnedTo = this.getPinnedTo();
        final Object other$pinnedTo = other.getPinnedTo();
        if (this$pinnedTo == null ? other$pinnedTo != null : !this$pinnedTo.equals(other$pinnedTo)) return false;
        final Object this$reactions = this.getReactions();
        final Object other$reactions = other.getReactions();
        if (this$reactions == null ? other$reactions != null : !this$reactions.equals(other$reactions)) return false;
        final Object this$username = this.getUsername();
        final Object other$username = other.getUsername();
        if (this$username == null ? other$username != null : !this$username.equals(other$username)) return false;
        final Object this$subtype = this.getSubtype();
        final Object other$subtype = other.getSubtype();
        if (this$subtype == null ? other$subtype != null : !this$subtype.equals(other$subtype)) return false;
        final Object this$botId = this.getBotId();
        final Object other$botId = other.getBotId();
        if (this$botId == null ? other$botId != null : !this$botId.equals(other$botId)) return false;
        final Object this$icons = this.getIcons();
        final Object other$icons = other.getIcons();
        if (this$icons == null ? other$icons != null : !this$icons.equals(other$icons)) return false;
        final Object this$file = this.getFile();
        final Object other$file = other.getFile();
        if (this$file == null ? other$file != null : !this$file.equals(other$file)) return false;
        final Object this$edited = this.getEdited();
        final Object other$edited = other.getEdited();
        if (this$edited == null ? other$edited != null : !this$edited.equals(other$edited)) return false;
        if (this.isUnfurlLinks() != other.isUnfurlLinks()) return false;
        if (this.isUnfurlMedia() != other.isUnfurlMedia()) return false;
        if (this.isThreadBroadcast() != other.isThreadBroadcast()) return false;
        final Object this$root = this.getRoot();
        final Object other$root = other.getRoot();
        if (this$root == null ? other$root != null : !this$root.equals(other$root)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Message;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $type = this.getType();
        result = result * PRIME + ($type == null ? 43 : $type.hashCode());
        final Object $channel = this.getChannel();
        result = result * PRIME + ($channel == null ? 43 : $channel.hashCode());
        final Object $user = this.getUser();
        result = result * PRIME + ($user == null ? 43 : $user.hashCode());
        final Object $text = this.getText();
        result = result * PRIME + ($text == null ? 43 : $text.hashCode());
        final Object $attachments = this.getAttachments();
        result = result * PRIME + ($attachments == null ? 43 : $attachments.hashCode());
        final Object $ts = this.getTs();
        result = result * PRIME + ($ts == null ? 43 : $ts.hashCode());
        final Object $threadTs = this.getThreadTs();
        result = result * PRIME + ($threadTs == null ? 43 : $threadTs.hashCode());
        result = result * PRIME + (this.isStarred() ? 79 : 97);
        result = result * PRIME + (this.isWibblr() ? 79 : 97);
        final Object $pinnedTo = this.getPinnedTo();
        result = result * PRIME + ($pinnedTo == null ? 43 : $pinnedTo.hashCode());
        final Object $reactions = this.getReactions();
        result = result * PRIME + ($reactions == null ? 43 : $reactions.hashCode());
        final Object $username = this.getUsername();
        result = result * PRIME + ($username == null ? 43 : $username.hashCode());
        final Object $subtype = this.getSubtype();
        result = result * PRIME + ($subtype == null ? 43 : $subtype.hashCode());
        final Object $botId = this.getBotId();
        result = result * PRIME + ($botId == null ? 43 : $botId.hashCode());
        final Object $icons = this.getIcons();
        result = result * PRIME + ($icons == null ? 43 : $icons.hashCode());
        final Object $file = this.getFile();
        result = result * PRIME + ($file == null ? 43 : $file.hashCode());
        final Object $edited = this.getEdited();
        result = result * PRIME + ($edited == null ? 43 : $edited.hashCode());
        result = result * PRIME + (this.isUnfurlLinks() ? 79 : 97);
        result = result * PRIME + (this.isUnfurlMedia() ? 79 : 97);
        result = result * PRIME + (this.isThreadBroadcast() ? 79 : 97);
        final Object $root = this.getRoot();
        result = result * PRIME + ($root == null ? 43 : $root.hashCode());
        return result;
    }

    public String toString() {
        return "Message(type=" + this.getType() + ", channel=" + this.getChannel() + ", user=" + this.getUser() + ", text=" + this.getText() + ", attachments=" + this.getAttachments() + ", ts=" + this.getTs() + ", threadTs=" + this.getThreadTs() + ", starred=" + this.isStarred() + ", wibblr=" + this.isWibblr() + ", pinnedTo=" + this.getPinnedTo() + ", reactions=" + this.getReactions() + ", username=" + this.getUsername() + ", subtype=" + this.getSubtype() + ", botId=" + this.getBotId() + ", icons=" + this.getIcons() + ", file=" + this.getFile() + ", edited=" + this.getEdited() + ", unfurlLinks=" + this.isUnfurlLinks() + ", unfurlMedia=" + this.isUnfurlMedia() + ", threadBroadcast=" + this.isThreadBroadcast() + ", root=" + this.getRoot() + ")";
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
            return "Message.Edited(user=" + this.getUser() + ", ts=" + this.getTs() + ")";
        }
    }

    /**
     * The root message information of a "thread_broadcast" message.
     */
    public static class MessageRoot {
        private String text;
        private String username;
        private String botId;
        private boolean mrkdwn;
        private String type;
        private String subtype;
        private String threadTs;
        private Integer replyCount;
        private List<MessageRootReply> replies;
        private boolean subscribed;
        private Integer unreadCount;
        private String ts;

        public MessageRoot() {
        }

        public String getText() {
            return this.text;
        }

        public String getUsername() {
            return this.username;
        }

        public String getBotId() {
            return this.botId;
        }

        public boolean isMrkdwn() {
            return this.mrkdwn;
        }

        public String getType() {
            return this.type;
        }

        public String getSubtype() {
            return this.subtype;
        }

        public String getThreadTs() {
            return this.threadTs;
        }

        public Integer getReplyCount() {
            return this.replyCount;
        }

        public List<MessageRootReply> getReplies() {
            return this.replies;
        }

        public boolean isSubscribed() {
            return this.subscribed;
        }

        public Integer getUnreadCount() {
            return this.unreadCount;
        }

        public String getTs() {
            return this.ts;
        }

        public void setText(String text) {
            this.text = text;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public void setBotId(String botId) {
            this.botId = botId;
        }

        public void setMrkdwn(boolean mrkdwn) {
            this.mrkdwn = mrkdwn;
        }

        public void setType(String type) {
            this.type = type;
        }

        public void setSubtype(String subtype) {
            this.subtype = subtype;
        }

        public void setThreadTs(String threadTs) {
            this.threadTs = threadTs;
        }

        public void setReplyCount(Integer replyCount) {
            this.replyCount = replyCount;
        }

        public void setReplies(List<MessageRootReply> replies) {
            this.replies = replies;
        }

        public void setSubscribed(boolean subscribed) {
            this.subscribed = subscribed;
        }

        public void setUnreadCount(Integer unreadCount) {
            this.unreadCount = unreadCount;
        }

        public void setTs(String ts) {
            this.ts = ts;
        }

        public boolean equals(final Object o) {
            if (o == this) return true;
            if (!(o instanceof MessageRoot)) return false;
            final MessageRoot other = (MessageRoot) o;
            if (!other.canEqual((Object) this)) return false;
            final Object this$text = this.getText();
            final Object other$text = other.getText();
            if (this$text == null ? other$text != null : !this$text.equals(other$text)) return false;
            final Object this$username = this.getUsername();
            final Object other$username = other.getUsername();
            if (this$username == null ? other$username != null : !this$username.equals(other$username)) return false;
            final Object this$botId = this.getBotId();
            final Object other$botId = other.getBotId();
            if (this$botId == null ? other$botId != null : !this$botId.equals(other$botId)) return false;
            if (this.isMrkdwn() != other.isMrkdwn()) return false;
            final Object this$type = this.getType();
            final Object other$type = other.getType();
            if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
            final Object this$subtype = this.getSubtype();
            final Object other$subtype = other.getSubtype();
            if (this$subtype == null ? other$subtype != null : !this$subtype.equals(other$subtype)) return false;
            final Object this$threadTs = this.getThreadTs();
            final Object other$threadTs = other.getThreadTs();
            if (this$threadTs == null ? other$threadTs != null : !this$threadTs.equals(other$threadTs)) return false;
            final Object this$replyCount = this.getReplyCount();
            final Object other$replyCount = other.getReplyCount();
            if (this$replyCount == null ? other$replyCount != null : !this$replyCount.equals(other$replyCount))
                return false;
            final Object this$replies = this.getReplies();
            final Object other$replies = other.getReplies();
            if (this$replies == null ? other$replies != null : !this$replies.equals(other$replies)) return false;
            if (this.isSubscribed() != other.isSubscribed()) return false;
            final Object this$unreadCount = this.getUnreadCount();
            final Object other$unreadCount = other.getUnreadCount();
            if (this$unreadCount == null ? other$unreadCount != null : !this$unreadCount.equals(other$unreadCount))
                return false;
            final Object this$ts = this.getTs();
            final Object other$ts = other.getTs();
            if (this$ts == null ? other$ts != null : !this$ts.equals(other$ts)) return false;
            return true;
        }

        protected boolean canEqual(final Object other) {
            return other instanceof MessageRoot;
        }

        public int hashCode() {
            final int PRIME = 59;
            int result = 1;
            final Object $text = this.getText();
            result = result * PRIME + ($text == null ? 43 : $text.hashCode());
            final Object $username = this.getUsername();
            result = result * PRIME + ($username == null ? 43 : $username.hashCode());
            final Object $botId = this.getBotId();
            result = result * PRIME + ($botId == null ? 43 : $botId.hashCode());
            result = result * PRIME + (this.isMrkdwn() ? 79 : 97);
            final Object $type = this.getType();
            result = result * PRIME + ($type == null ? 43 : $type.hashCode());
            final Object $subtype = this.getSubtype();
            result = result * PRIME + ($subtype == null ? 43 : $subtype.hashCode());
            final Object $threadTs = this.getThreadTs();
            result = result * PRIME + ($threadTs == null ? 43 : $threadTs.hashCode());
            final Object $replyCount = this.getReplyCount();
            result = result * PRIME + ($replyCount == null ? 43 : $replyCount.hashCode());
            final Object $replies = this.getReplies();
            result = result * PRIME + ($replies == null ? 43 : $replies.hashCode());
            result = result * PRIME + (this.isSubscribed() ? 79 : 97);
            final Object $unreadCount = this.getUnreadCount();
            result = result * PRIME + ($unreadCount == null ? 43 : $unreadCount.hashCode());
            final Object $ts = this.getTs();
            result = result * PRIME + ($ts == null ? 43 : $ts.hashCode());
            return result;
        }

        public String toString() {
            return "Message.MessageRoot(text=" + this.getText() + ", username=" + this.getUsername() + ", botId=" + this.getBotId() + ", mrkdwn=" + this.isMrkdwn() + ", type=" + this.getType() + ", subtype=" + this.getSubtype() + ", threadTs=" + this.getThreadTs() + ", replyCount=" + this.getReplyCount() + ", replies=" + this.getReplies() + ", subscribed=" + this.isSubscribed() + ", unreadCount=" + this.getUnreadCount() + ", ts=" + this.getTs() + ")";
        }
    }

    /**
     * A reply message information in a MessageRoot.
     */
    public static class MessageRootReply {
        private String user;
        private String ts;

        public MessageRootReply() {
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
            if (!(o instanceof MessageRootReply)) return false;
            final MessageRootReply other = (MessageRootReply) o;
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
            return other instanceof MessageRootReply;
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
            return "Message.MessageRootReply(user=" + this.getUser() + ", ts=" + this.getTs() + ")";
        }
    }

}
