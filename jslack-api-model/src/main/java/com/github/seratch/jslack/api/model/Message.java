package com.github.seratch.jslack.api.model;

import com.github.seratch.jslack.api.model.block.LayoutBlock;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Message {

    private String type;
    private String subtype;

    private String team; // team id
    private String channel;

    private String user;
    private String username;

    private String text;
    private List<LayoutBlock> blocks;
    private List<Attachment> attachments;

    private String ts;
    private String threadTs;

    @SerializedName("is_intro")
    private boolean intro;
    @SerializedName("is_starred")
    private boolean starred;
    private boolean wibblr;
    private List<String> pinnedTo;
    private List<Reaction> reactions;

    private String botId;
    private String botLink;
    private boolean displayAsBot;

    private Icons icons;

    private File file;
    private List<File> files;
    private boolean upload;

    private String parentUserId;
    private String inviter;
    private String clientMsgId;

    private MessageItem comment;
    private String topic; // "subtype":"channel_topic"
    private String purpose; // "subtype":"channel_topic"

    // field exists only if the message was edited
    private Edited edited;

    // https://api.slack.com/docs/message-link-unfurling
    private boolean unfurlLinks;
    private boolean unfurlMedia;

    @SerializedName("is_thread_broadcast")
    private boolean threadBroadcast;

    // https://api.slack.com/messaging/retrieving#threading
    // Parent messages in a thread will no longer explicitly list their replies.
    // Instead of a large replies array containing threaded message replies,
    // we'll provide a lighter-weight list of reply_users,
    // plus a reply_users_count and the latest_reply message.
    // These new fields are already available. We'll remove the replies array on October 18, 2019.
    @Deprecated
    private List<MessageRootReply> replies;
    private Integer replyCount;

    private List<String> replyUsers;
    private Integer replyUsersCount;

    private String latestReply; // ts

    private boolean subscribed;

    private String lastRead;

    // this field exists only when posting the message with "reply_broadcast": true
    private MessageRoot root;

    private String itemType;
    private MessageItem item;

    public Message() {
    }

    public String getType() {
        return this.type;
    }

    public String getSubtype() {
        return this.subtype;
    }

    public String getTeam() {
        return this.team;
    }

    public String getChannel() {
        return this.channel;
    }

    public String getUser() {
        return this.user;
    }

    public String getUsername() {
        return this.username;
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

    public boolean isIntro() {
        return this.intro;
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

    public String getBotId() {
        return this.botId;
    }

    public String getBotLink() {
        return this.botLink;
    }

    public boolean isDisplayAsBot() {
        return this.displayAsBot;
    }

    public Icons getIcons() {
        return this.icons;
    }

    public File getFile() {
        return this.file;
    }

    public List<File> getFiles() {
        return this.files;
    }

    public boolean isUpload() {
        return this.upload;
    }

    public String getParentUserId() {
        return this.parentUserId;
    }

    public String getInviter() {
        return this.inviter;
    }

    public String getClientMsgId() {
        return this.clientMsgId;
    }

    public MessageItem getComment() {
        return this.comment;
    }

    public String getTopic() {
        return this.topic;
    }

    public String getPurpose() {
        return this.purpose;
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

    @Deprecated
    public List<MessageRootReply> getReplies() {
        return this.replies;
    }

    public Integer getReplyCount() {
        return this.replyCount;
    }

    public List<String> getReplyUsers() {
        return this.replyUsers;
    }

    public Integer getReplyUsersCount() {
        return this.replyUsersCount;
    }

    public String getLatestReply() {
        return this.latestReply;
    }

    public boolean isSubscribed() {
        return this.subscribed;
    }

    public String getLastRead() {
        return this.lastRead;
    }

    public MessageRoot getRoot() {
        return this.root;
    }

    public String getItemType() {
        return this.itemType;
    }

    public MessageItem getItem() {
        return this.item;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public void setIntro(boolean intro) {
        this.intro = intro;
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

    public void setBotId(String botId) {
        this.botId = botId;
    }

    public void setBotLink(String botLink) {
        this.botLink = botLink;
    }

    public void setDisplayAsBot(boolean displayAsBot) {
        this.displayAsBot = displayAsBot;
    }

    public void setIcons(Icons icons) {
        this.icons = icons;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }

    public void setUpload(boolean upload) {
        this.upload = upload;
    }

    public void setParentUserId(String parentUserId) {
        this.parentUserId = parentUserId;
    }

    public void setInviter(String inviter) {
        this.inviter = inviter;
    }

    public void setClientMsgId(String clientMsgId) {
        this.clientMsgId = clientMsgId;
    }

    public void setComment(MessageItem comment) {
        this.comment = comment;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
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

    @Deprecated
    public void setReplies(List<MessageRootReply> replies) {
        this.replies = replies;
    }

    public void setReplyCount(Integer replyCount) {
        this.replyCount = replyCount;
    }

    public void setReplyUsers(List<String> replyUsers) {
        this.replyUsers = replyUsers;
    }

    public void setReplyUsersCount(Integer replyUsersCount) {
        this.replyUsersCount = replyUsersCount;
    }

    public void setLatestReply(String latestReply) {
        this.latestReply = latestReply;
    }

    public void setSubscribed(boolean subscribed) {
        this.subscribed = subscribed;
    }

    public void setLastRead(String lastRead) {
        this.lastRead = lastRead;
    }

    public void setRoot(MessageRoot root) {
        this.root = root;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public void setItem(MessageItem item) {
        this.item = item;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Message)) return false;
        final Message other = (Message) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$type = this.getType();
        final Object other$type = other.getType();
        if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
        final Object this$subtype = this.getSubtype();
        final Object other$subtype = other.getSubtype();
        if (this$subtype == null ? other$subtype != null : !this$subtype.equals(other$subtype)) return false;
        final Object this$team = this.getTeam();
        final Object other$team = other.getTeam();
        if (this$team == null ? other$team != null : !this$team.equals(other$team)) return false;
        final Object this$channel = this.getChannel();
        final Object other$channel = other.getChannel();
        if (this$channel == null ? other$channel != null : !this$channel.equals(other$channel)) return false;
        final Object this$user = this.getUser();
        final Object other$user = other.getUser();
        if (this$user == null ? other$user != null : !this$user.equals(other$user)) return false;
        final Object this$username = this.getUsername();
        final Object other$username = other.getUsername();
        if (this$username == null ? other$username != null : !this$username.equals(other$username)) return false;
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
        if (this.isIntro() != other.isIntro()) return false;
        if (this.isStarred() != other.isStarred()) return false;
        if (this.isWibblr() != other.isWibblr()) return false;
        final Object this$pinnedTo = this.getPinnedTo();
        final Object other$pinnedTo = other.getPinnedTo();
        if (this$pinnedTo == null ? other$pinnedTo != null : !this$pinnedTo.equals(other$pinnedTo)) return false;
        final Object this$reactions = this.getReactions();
        final Object other$reactions = other.getReactions();
        if (this$reactions == null ? other$reactions != null : !this$reactions.equals(other$reactions)) return false;
        final Object this$botId = this.getBotId();
        final Object other$botId = other.getBotId();
        if (this$botId == null ? other$botId != null : !this$botId.equals(other$botId)) return false;
        final Object this$botLink = this.getBotLink();
        final Object other$botLink = other.getBotLink();
        if (this$botLink == null ? other$botLink != null : !this$botLink.equals(other$botLink)) return false;
        if (this.isDisplayAsBot() != other.isDisplayAsBot()) return false;
        final Object this$icons = this.getIcons();
        final Object other$icons = other.getIcons();
        if (this$icons == null ? other$icons != null : !this$icons.equals(other$icons)) return false;
        final Object this$file = this.getFile();
        final Object other$file = other.getFile();
        if (this$file == null ? other$file != null : !this$file.equals(other$file)) return false;
        final Object this$files = this.getFiles();
        final Object other$files = other.getFiles();
        if (this$files == null ? other$files != null : !this$files.equals(other$files)) return false;
        if (this.isUpload() != other.isUpload()) return false;
        final Object this$parentUserId = this.getParentUserId();
        final Object other$parentUserId = other.getParentUserId();
        if (this$parentUserId == null ? other$parentUserId != null : !this$parentUserId.equals(other$parentUserId))
            return false;
        final Object this$inviter = this.getInviter();
        final Object other$inviter = other.getInviter();
        if (this$inviter == null ? other$inviter != null : !this$inviter.equals(other$inviter)) return false;
        final Object this$clientMsgId = this.getClientMsgId();
        final Object other$clientMsgId = other.getClientMsgId();
        if (this$clientMsgId == null ? other$clientMsgId != null : !this$clientMsgId.equals(other$clientMsgId))
            return false;
        final Object this$comment = this.getComment();
        final Object other$comment = other.getComment();
        if (this$comment == null ? other$comment != null : !this$comment.equals(other$comment)) return false;
        final Object this$topic = this.getTopic();
        final Object other$topic = other.getTopic();
        if (this$topic == null ? other$topic != null : !this$topic.equals(other$topic)) return false;
        final Object this$purpose = this.getPurpose();
        final Object other$purpose = other.getPurpose();
        if (this$purpose == null ? other$purpose != null : !this$purpose.equals(other$purpose)) return false;
        final Object this$edited = this.getEdited();
        final Object other$edited = other.getEdited();
        if (this$edited == null ? other$edited != null : !this$edited.equals(other$edited)) return false;
        if (this.isUnfurlLinks() != other.isUnfurlLinks()) return false;
        if (this.isUnfurlMedia() != other.isUnfurlMedia()) return false;
        if (this.isThreadBroadcast() != other.isThreadBroadcast()) return false;
        final Object this$replies = this.getReplies();
        final Object other$replies = other.getReplies();
        if (this$replies == null ? other$replies != null : !this$replies.equals(other$replies)) return false;
        final Object this$replyCount = this.getReplyCount();
        final Object other$replyCount = other.getReplyCount();
        if (this$replyCount == null ? other$replyCount != null : !this$replyCount.equals(other$replyCount))
            return false;
        final Object this$replyUsers = this.getReplyUsers();
        final Object other$replyUsers = other.getReplyUsers();
        if (this$replyUsers == null ? other$replyUsers != null : !this$replyUsers.equals(other$replyUsers))
            return false;
        final Object this$replyUsersCount = this.getReplyUsersCount();
        final Object other$replyUsersCount = other.getReplyUsersCount();
        if (this$replyUsersCount == null ? other$replyUsersCount != null : !this$replyUsersCount.equals(other$replyUsersCount))
            return false;
        final Object this$latestReply = this.getLatestReply();
        final Object other$latestReply = other.getLatestReply();
        if (this$latestReply == null ? other$latestReply != null : !this$latestReply.equals(other$latestReply))
            return false;
        if (this.isSubscribed() != other.isSubscribed()) return false;
        final Object this$lastRead = this.getLastRead();
        final Object other$lastRead = other.getLastRead();
        if (this$lastRead == null ? other$lastRead != null : !this$lastRead.equals(other$lastRead)) return false;
        final Object this$root = this.getRoot();
        final Object other$root = other.getRoot();
        if (this$root == null ? other$root != null : !this$root.equals(other$root)) return false;
        final Object this$itemType = this.getItemType();
        final Object other$itemType = other.getItemType();
        if (this$itemType == null ? other$itemType != null : !this$itemType.equals(other$itemType)) return false;
        final Object this$item = this.getItem();
        final Object other$item = other.getItem();
        if (this$item == null ? other$item != null : !this$item.equals(other$item)) return false;
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
        final Object $subtype = this.getSubtype();
        result = result * PRIME + ($subtype == null ? 43 : $subtype.hashCode());
        final Object $team = this.getTeam();
        result = result * PRIME + ($team == null ? 43 : $team.hashCode());
        final Object $channel = this.getChannel();
        result = result * PRIME + ($channel == null ? 43 : $channel.hashCode());
        final Object $user = this.getUser();
        result = result * PRIME + ($user == null ? 43 : $user.hashCode());
        final Object $username = this.getUsername();
        result = result * PRIME + ($username == null ? 43 : $username.hashCode());
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
        result = result * PRIME + (this.isIntro() ? 79 : 97);
        result = result * PRIME + (this.isStarred() ? 79 : 97);
        result = result * PRIME + (this.isWibblr() ? 79 : 97);
        final Object $pinnedTo = this.getPinnedTo();
        result = result * PRIME + ($pinnedTo == null ? 43 : $pinnedTo.hashCode());
        final Object $reactions = this.getReactions();
        result = result * PRIME + ($reactions == null ? 43 : $reactions.hashCode());
        final Object $botId = this.getBotId();
        result = result * PRIME + ($botId == null ? 43 : $botId.hashCode());
        final Object $botLink = this.getBotLink();
        result = result * PRIME + ($botLink == null ? 43 : $botLink.hashCode());
        result = result * PRIME + (this.isDisplayAsBot() ? 79 : 97);
        final Object $icons = this.getIcons();
        result = result * PRIME + ($icons == null ? 43 : $icons.hashCode());
        final Object $file = this.getFile();
        result = result * PRIME + ($file == null ? 43 : $file.hashCode());
        final Object $files = this.getFiles();
        result = result * PRIME + ($files == null ? 43 : $files.hashCode());
        result = result * PRIME + (this.isUpload() ? 79 : 97);
        final Object $parentUserId = this.getParentUserId();
        result = result * PRIME + ($parentUserId == null ? 43 : $parentUserId.hashCode());
        final Object $inviter = this.getInviter();
        result = result * PRIME + ($inviter == null ? 43 : $inviter.hashCode());
        final Object $clientMsgId = this.getClientMsgId();
        result = result * PRIME + ($clientMsgId == null ? 43 : $clientMsgId.hashCode());
        final Object $comment = this.getComment();
        result = result * PRIME + ($comment == null ? 43 : $comment.hashCode());
        final Object $topic = this.getTopic();
        result = result * PRIME + ($topic == null ? 43 : $topic.hashCode());
        final Object $purpose = this.getPurpose();
        result = result * PRIME + ($purpose == null ? 43 : $purpose.hashCode());
        final Object $edited = this.getEdited();
        result = result * PRIME + ($edited == null ? 43 : $edited.hashCode());
        result = result * PRIME + (this.isUnfurlLinks() ? 79 : 97);
        result = result * PRIME + (this.isUnfurlMedia() ? 79 : 97);
        result = result * PRIME + (this.isThreadBroadcast() ? 79 : 97);
        final Object $replies = this.getReplies();
        result = result * PRIME + ($replies == null ? 43 : $replies.hashCode());
        final Object $replyCount = this.getReplyCount();
        result = result * PRIME + ($replyCount == null ? 43 : $replyCount.hashCode());
        final Object $replyUsers = this.getReplyUsers();
        result = result * PRIME + ($replyUsers == null ? 43 : $replyUsers.hashCode());
        final Object $replyUsersCount = this.getReplyUsersCount();
        result = result * PRIME + ($replyUsersCount == null ? 43 : $replyUsersCount.hashCode());
        final Object $latestReply = this.getLatestReply();
        result = result * PRIME + ($latestReply == null ? 43 : $latestReply.hashCode());
        result = result * PRIME + (this.isSubscribed() ? 79 : 97);
        final Object $lastRead = this.getLastRead();
        result = result * PRIME + ($lastRead == null ? 43 : $lastRead.hashCode());
        final Object $root = this.getRoot();
        result = result * PRIME + ($root == null ? 43 : $root.hashCode());
        final Object $itemType = this.getItemType();
        result = result * PRIME + ($itemType == null ? 43 : $itemType.hashCode());
        final Object $item = this.getItem();
        result = result * PRIME + ($item == null ? 43 : $item.hashCode());
        return result;
    }

    public String toString() {
        return "Message(type=" + this.getType() + ", subtype=" + this.getSubtype() + ", team=" + this.getTeam() + ", channel=" + this.getChannel() + ", user=" + this.getUser() + ", username=" + this.getUsername() + ", text=" + this.getText() + ", blocks=" + this.getBlocks() + ", attachments=" + this.getAttachments() + ", ts=" + this.getTs() + ", threadTs=" + this.getThreadTs() + ", intro=" + this.isIntro() + ", starred=" + this.isStarred() + ", wibblr=" + this.isWibblr() + ", pinnedTo=" + this.getPinnedTo() + ", reactions=" + this.getReactions() + ", botId=" + this.getBotId() + ", botLink=" + this.getBotLink() + ", displayAsBot=" + this.isDisplayAsBot() + ", icons=" + this.getIcons() + ", file=" + this.getFile() + ", files=" + this.getFiles() + ", upload=" + this.isUpload() + ", parentUserId=" + this.getParentUserId() + ", inviter=" + this.getInviter() + ", clientMsgId=" + this.getClientMsgId() + ", comment=" + this.getComment() + ", topic=" + this.getTopic() + ", purpose=" + this.getPurpose() + ", edited=" + this.getEdited() + ", unfurlLinks=" + this.isUnfurlLinks() + ", unfurlMedia=" + this.isUnfurlMedia() + ", threadBroadcast=" + this.isThreadBroadcast() + ", replies=" + this.getReplies() + ", replyCount=" + this.getReplyCount() + ", replyUsers=" + this.getReplyUsers() + ", replyUsersCount=" + this.getReplyUsersCount() + ", latestReply=" + this.getLatestReply() + ", subscribed=" + this.isSubscribed() + ", lastRead=" + this.getLastRead() + ", root=" + this.getRoot() + ", itemType=" + this.getItemType() + ", item=" + this.getItem() + ")";
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

        // https://api.slack.com/messaging/retrieving#threading
        // Parent messages in a thread will no longer explicitly list their replies.
        // Instead of a large replies array containing threaded message replies,
        // we'll provide a lighter-weight list of reply_users,
        // plus a reply_users_count and the latest_reply message.
        // These new fields are already available. We'll remove the replies array on October 18, 2019.
        @Deprecated
        private List<MessageRootReply> replies;
        private Integer replyCount;
        private List<String> replyUsers;
        private Integer replyUsersCount;
        private String latestReply; // ts

        private boolean subscribed;
        private String lastRead;
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

        @Deprecated
        public List<MessageRootReply> getReplies() {
            return this.replies;
        }

        public Integer getReplyCount() {
            return this.replyCount;
        }

        public List<String> getReplyUsers() {
            return this.replyUsers;
        }

        public Integer getReplyUsersCount() {
            return this.replyUsersCount;
        }

        public String getLatestReply() {
            return this.latestReply;
        }

        public boolean isSubscribed() {
            return this.subscribed;
        }

        public String getLastRead() {
            return this.lastRead;
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

        @Deprecated
        public void setReplies(List<MessageRootReply> replies) {
            this.replies = replies;
        }

        public void setReplyCount(Integer replyCount) {
            this.replyCount = replyCount;
        }

        public void setReplyUsers(List<String> replyUsers) {
            this.replyUsers = replyUsers;
        }

        public void setReplyUsersCount(Integer replyUsersCount) {
            this.replyUsersCount = replyUsersCount;
        }

        public void setLatestReply(String latestReply) {
            this.latestReply = latestReply;
        }

        public void setSubscribed(boolean subscribed) {
            this.subscribed = subscribed;
        }

        public void setLastRead(String lastRead) {
            this.lastRead = lastRead;
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
            final Object this$replies = this.getReplies();
            final Object other$replies = other.getReplies();
            if (this$replies == null ? other$replies != null : !this$replies.equals(other$replies)) return false;
            final Object this$replyCount = this.getReplyCount();
            final Object other$replyCount = other.getReplyCount();
            if (this$replyCount == null ? other$replyCount != null : !this$replyCount.equals(other$replyCount))
                return false;
            final Object this$replyUsers = this.getReplyUsers();
            final Object other$replyUsers = other.getReplyUsers();
            if (this$replyUsers == null ? other$replyUsers != null : !this$replyUsers.equals(other$replyUsers))
                return false;
            final Object this$replyUsersCount = this.getReplyUsersCount();
            final Object other$replyUsersCount = other.getReplyUsersCount();
            if (this$replyUsersCount == null ? other$replyUsersCount != null : !this$replyUsersCount.equals(other$replyUsersCount))
                return false;
            final Object this$latestReply = this.getLatestReply();
            final Object other$latestReply = other.getLatestReply();
            if (this$latestReply == null ? other$latestReply != null : !this$latestReply.equals(other$latestReply))
                return false;
            if (this.isSubscribed() != other.isSubscribed()) return false;
            final Object this$lastRead = this.getLastRead();
            final Object other$lastRead = other.getLastRead();
            if (this$lastRead == null ? other$lastRead != null : !this$lastRead.equals(other$lastRead)) return false;
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
            final Object $replies = this.getReplies();
            result = result * PRIME + ($replies == null ? 43 : $replies.hashCode());
            final Object $replyCount = this.getReplyCount();
            result = result * PRIME + ($replyCount == null ? 43 : $replyCount.hashCode());
            final Object $replyUsers = this.getReplyUsers();
            result = result * PRIME + ($replyUsers == null ? 43 : $replyUsers.hashCode());
            final Object $replyUsersCount = this.getReplyUsersCount();
            result = result * PRIME + ($replyUsersCount == null ? 43 : $replyUsersCount.hashCode());
            final Object $latestReply = this.getLatestReply();
            result = result * PRIME + ($latestReply == null ? 43 : $latestReply.hashCode());
            result = result * PRIME + (this.isSubscribed() ? 79 : 97);
            final Object $lastRead = this.getLastRead();
            result = result * PRIME + ($lastRead == null ? 43 : $lastRead.hashCode());
            final Object $unreadCount = this.getUnreadCount();
            result = result * PRIME + ($unreadCount == null ? 43 : $unreadCount.hashCode());
            final Object $ts = this.getTs();
            result = result * PRIME + ($ts == null ? 43 : $ts.hashCode());
            return result;
        }

        public String toString() {
            return "Message.MessageRoot(text=" + this.getText() + ", username=" + this.getUsername() + ", botId=" + this.getBotId() + ", mrkdwn=" + this.isMrkdwn() + ", type=" + this.getType() + ", subtype=" + this.getSubtype() + ", threadTs=" + this.getThreadTs() + ", replies=" + this.getReplies() + ", replyCount=" + this.getReplyCount() + ", replyUsers=" + this.getReplyUsers() + ", replyUsersCount=" + this.getReplyUsersCount() + ", latestReply=" + this.getLatestReply() + ", subscribed=" + this.isSubscribed() + ", lastRead=" + this.getLastRead() + ", unreadCount=" + this.getUnreadCount() + ", ts=" + this.getTs() + ")";
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

    // https://raw.githubusercontent.com/slackapi/slack-api-specs/master/web-api/slack_web_openapi_v2.json
    // TODO: confirm the actual behavior
    public static class Icons {
        private String emoji;

        @SerializedName("image_36")
        private String image36;
        @SerializedName("image_48")
        private String image48;
        @SerializedName("image_64")
        private String image64;
        @SerializedName("image_72")
        private String image72;

        public Icons() {
        }

        public String getEmoji() {
            return this.emoji;
        }

        public String getImage36() {
            return this.image36;
        }

        public String getImage48() {
            return this.image48;
        }

        public String getImage64() {
            return this.image64;
        }

        public String getImage72() {
            return this.image72;
        }

        public void setEmoji(String emoji) {
            this.emoji = emoji;
        }

        public void setImage36(String image36) {
            this.image36 = image36;
        }

        public void setImage48(String image48) {
            this.image48 = image48;
        }

        public void setImage64(String image64) {
            this.image64 = image64;
        }

        public void setImage72(String image72) {
            this.image72 = image72;
        }

        public boolean equals(final Object o) {
            if (o == this) return true;
            if (!(o instanceof Icons)) return false;
            final Icons other = (Icons) o;
            if (!other.canEqual((Object) this)) return false;
            final Object this$emoji = this.getEmoji();
            final Object other$emoji = other.getEmoji();
            if (this$emoji == null ? other$emoji != null : !this$emoji.equals(other$emoji)) return false;
            final Object this$image36 = this.getImage36();
            final Object other$image36 = other.getImage36();
            if (this$image36 == null ? other$image36 != null : !this$image36.equals(other$image36)) return false;
            final Object this$image48 = this.getImage48();
            final Object other$image48 = other.getImage48();
            if (this$image48 == null ? other$image48 != null : !this$image48.equals(other$image48)) return false;
            final Object this$image64 = this.getImage64();
            final Object other$image64 = other.getImage64();
            if (this$image64 == null ? other$image64 != null : !this$image64.equals(other$image64)) return false;
            final Object this$image72 = this.getImage72();
            final Object other$image72 = other.getImage72();
            if (this$image72 == null ? other$image72 != null : !this$image72.equals(other$image72)) return false;
            return true;
        }

        protected boolean canEqual(final Object other) {
            return other instanceof Icons;
        }

        public int hashCode() {
            final int PRIME = 59;
            int result = 1;
            final Object $emoji = this.getEmoji();
            result = result * PRIME + ($emoji == null ? 43 : $emoji.hashCode());
            final Object $image36 = this.getImage36();
            result = result * PRIME + ($image36 == null ? 43 : $image36.hashCode());
            final Object $image48 = this.getImage48();
            result = result * PRIME + ($image48 == null ? 43 : $image48.hashCode());
            final Object $image64 = this.getImage64();
            result = result * PRIME + ($image64 == null ? 43 : $image64.hashCode());
            final Object $image72 = this.getImage72();
            result = result * PRIME + ($image72 == null ? 43 : $image72.hashCode());
            return result;
        }

        public String toString() {
            return "Message.Icons(emoji=" + this.getEmoji() + ", image36=" + this.getImage36() + ", image48=" + this.getImage48() + ", image64=" + this.getImage64() + ", image72=" + this.getImage72() + ")";
        }
    }

    public static class MessageItem {
        private String id;
        private String name;
        private String title;
        private String created;
        private String timestamp;
        private String user;
        private String username;
        @SerializedName("is_intro")
        private boolean intro;

        @SerializedName("is_public")
        private boolean _public;
        @SerializedName("is_starred")
        private boolean starred;

        public MessageItem() {
        }

        public boolean isPublic() {
            return _public;
        }

        public void setPublic(boolean isPublic) {
            this._public = isPublic;
        }

        private boolean publicUrlShared;
        private String urlPrivate;
        private boolean urlPrivateDownload;

        private String permalink;
        private boolean permalinkPublic;

        private String editLink;
        private String preview;
        private String previewHighlight;

        private Integer lines;
        private Integer linesMore;
        @SerializedName("preview_is_truncated")
        private boolean previewTruncated;
        private boolean hasRichPreview;

        private String mimetype;
        private String filetype;
        private String prettyType; // "Plain Text"
        @SerializedName("is_external")
        private boolean external;
        private String externalType;
        private boolean editable;
        private boolean displayAsBot;
        private Integer size;
        private String mode;
        private String comment;

        public String getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }

        public String getTitle() {
            return this.title;
        }

        public String getCreated() {
            return this.created;
        }

        public String getTimestamp() {
            return this.timestamp;
        }

        public String getUser() {
            return this.user;
        }

        public String getUsername() {
            return this.username;
        }

        public boolean isIntro() {
            return this.intro;
        }

        public boolean is_public() {
            return this._public;
        }

        public boolean isStarred() {
            return this.starred;
        }

        public boolean isPublicUrlShared() {
            return this.publicUrlShared;
        }

        public String getUrlPrivate() {
            return this.urlPrivate;
        }

        public boolean isUrlPrivateDownload() {
            return this.urlPrivateDownload;
        }

        public String getPermalink() {
            return this.permalink;
        }

        public boolean isPermalinkPublic() {
            return this.permalinkPublic;
        }

        public String getEditLink() {
            return this.editLink;
        }

        public String getPreview() {
            return this.preview;
        }

        public String getPreviewHighlight() {
            return this.previewHighlight;
        }

        public Integer getLines() {
            return this.lines;
        }

        public Integer getLinesMore() {
            return this.linesMore;
        }

        public boolean isPreviewTruncated() {
            return this.previewTruncated;
        }

        public boolean isHasRichPreview() {
            return this.hasRichPreview;
        }

        public String getMimetype() {
            return this.mimetype;
        }

        public String getFiletype() {
            return this.filetype;
        }

        public String getPrettyType() {
            return this.prettyType;
        }

        public boolean isExternal() {
            return this.external;
        }

        public String getExternalType() {
            return this.externalType;
        }

        public boolean isEditable() {
            return this.editable;
        }

        public boolean isDisplayAsBot() {
            return this.displayAsBot;
        }

        public Integer getSize() {
            return this.size;
        }

        public String getMode() {
            return this.mode;
        }

        public String getComment() {
            return this.comment;
        }

        public void setId(String id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public void setCreated(String created) {
            this.created = created;
        }

        public void setTimestamp(String timestamp) {
            this.timestamp = timestamp;
        }

        public void setUser(String user) {
            this.user = user;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public void setIntro(boolean intro) {
            this.intro = intro;
        }

        public void set_public(boolean _public) {
            this._public = _public;
        }

        public void setStarred(boolean starred) {
            this.starred = starred;
        }

        public void setPublicUrlShared(boolean publicUrlShared) {
            this.publicUrlShared = publicUrlShared;
        }

        public void setUrlPrivate(String urlPrivate) {
            this.urlPrivate = urlPrivate;
        }

        public void setUrlPrivateDownload(boolean urlPrivateDownload) {
            this.urlPrivateDownload = urlPrivateDownload;
        }

        public void setPermalink(String permalink) {
            this.permalink = permalink;
        }

        public void setPermalinkPublic(boolean permalinkPublic) {
            this.permalinkPublic = permalinkPublic;
        }

        public void setEditLink(String editLink) {
            this.editLink = editLink;
        }

        public void setPreview(String preview) {
            this.preview = preview;
        }

        public void setPreviewHighlight(String previewHighlight) {
            this.previewHighlight = previewHighlight;
        }

        public void setLines(Integer lines) {
            this.lines = lines;
        }

        public void setLinesMore(Integer linesMore) {
            this.linesMore = linesMore;
        }

        public void setPreviewTruncated(boolean previewTruncated) {
            this.previewTruncated = previewTruncated;
        }

        public void setHasRichPreview(boolean hasRichPreview) {
            this.hasRichPreview = hasRichPreview;
        }

        public void setMimetype(String mimetype) {
            this.mimetype = mimetype;
        }

        public void setFiletype(String filetype) {
            this.filetype = filetype;
        }

        public void setPrettyType(String prettyType) {
            this.prettyType = prettyType;
        }

        public void setExternal(boolean external) {
            this.external = external;
        }

        public void setExternalType(String externalType) {
            this.externalType = externalType;
        }

        public void setEditable(boolean editable) {
            this.editable = editable;
        }

        public void setDisplayAsBot(boolean displayAsBot) {
            this.displayAsBot = displayAsBot;
        }

        public void setSize(Integer size) {
            this.size = size;
        }

        public void setMode(String mode) {
            this.mode = mode;
        }

        public void setComment(String comment) {
            this.comment = comment;
        }

        public boolean equals(final Object o) {
            if (o == this) return true;
            if (!(o instanceof MessageItem)) return false;
            final MessageItem other = (MessageItem) o;
            if (!other.canEqual((Object) this)) return false;
            final Object this$id = this.getId();
            final Object other$id = other.getId();
            if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
            final Object this$name = this.getName();
            final Object other$name = other.getName();
            if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
            final Object this$title = this.getTitle();
            final Object other$title = other.getTitle();
            if (this$title == null ? other$title != null : !this$title.equals(other$title)) return false;
            final Object this$created = this.getCreated();
            final Object other$created = other.getCreated();
            if (this$created == null ? other$created != null : !this$created.equals(other$created)) return false;
            final Object this$timestamp = this.getTimestamp();
            final Object other$timestamp = other.getTimestamp();
            if (this$timestamp == null ? other$timestamp != null : !this$timestamp.equals(other$timestamp))
                return false;
            final Object this$user = this.getUser();
            final Object other$user = other.getUser();
            if (this$user == null ? other$user != null : !this$user.equals(other$user)) return false;
            final Object this$username = this.getUsername();
            final Object other$username = other.getUsername();
            if (this$username == null ? other$username != null : !this$username.equals(other$username)) return false;
            if (this.isIntro() != other.isIntro()) return false;
            if (this.is_public() != other.is_public()) return false;
            if (this.isStarred() != other.isStarred()) return false;
            if (this.isPublicUrlShared() != other.isPublicUrlShared()) return false;
            final Object this$urlPrivate = this.getUrlPrivate();
            final Object other$urlPrivate = other.getUrlPrivate();
            if (this$urlPrivate == null ? other$urlPrivate != null : !this$urlPrivate.equals(other$urlPrivate))
                return false;
            if (this.isUrlPrivateDownload() != other.isUrlPrivateDownload()) return false;
            final Object this$permalink = this.getPermalink();
            final Object other$permalink = other.getPermalink();
            if (this$permalink == null ? other$permalink != null : !this$permalink.equals(other$permalink))
                return false;
            if (this.isPermalinkPublic() != other.isPermalinkPublic()) return false;
            final Object this$editLink = this.getEditLink();
            final Object other$editLink = other.getEditLink();
            if (this$editLink == null ? other$editLink != null : !this$editLink.equals(other$editLink)) return false;
            final Object this$preview = this.getPreview();
            final Object other$preview = other.getPreview();
            if (this$preview == null ? other$preview != null : !this$preview.equals(other$preview)) return false;
            final Object this$previewHighlight = this.getPreviewHighlight();
            final Object other$previewHighlight = other.getPreviewHighlight();
            if (this$previewHighlight == null ? other$previewHighlight != null : !this$previewHighlight.equals(other$previewHighlight))
                return false;
            final Object this$lines = this.getLines();
            final Object other$lines = other.getLines();
            if (this$lines == null ? other$lines != null : !this$lines.equals(other$lines)) return false;
            final Object this$linesMore = this.getLinesMore();
            final Object other$linesMore = other.getLinesMore();
            if (this$linesMore == null ? other$linesMore != null : !this$linesMore.equals(other$linesMore))
                return false;
            if (this.isPreviewTruncated() != other.isPreviewTruncated()) return false;
            if (this.isHasRichPreview() != other.isHasRichPreview()) return false;
            final Object this$mimetype = this.getMimetype();
            final Object other$mimetype = other.getMimetype();
            if (this$mimetype == null ? other$mimetype != null : !this$mimetype.equals(other$mimetype)) return false;
            final Object this$filetype = this.getFiletype();
            final Object other$filetype = other.getFiletype();
            if (this$filetype == null ? other$filetype != null : !this$filetype.equals(other$filetype)) return false;
            final Object this$prettyType = this.getPrettyType();
            final Object other$prettyType = other.getPrettyType();
            if (this$prettyType == null ? other$prettyType != null : !this$prettyType.equals(other$prettyType))
                return false;
            if (this.isExternal() != other.isExternal()) return false;
            final Object this$externalType = this.getExternalType();
            final Object other$externalType = other.getExternalType();
            if (this$externalType == null ? other$externalType != null : !this$externalType.equals(other$externalType))
                return false;
            if (this.isEditable() != other.isEditable()) return false;
            if (this.isDisplayAsBot() != other.isDisplayAsBot()) return false;
            final Object this$size = this.getSize();
            final Object other$size = other.getSize();
            if (this$size == null ? other$size != null : !this$size.equals(other$size)) return false;
            final Object this$mode = this.getMode();
            final Object other$mode = other.getMode();
            if (this$mode == null ? other$mode != null : !this$mode.equals(other$mode)) return false;
            final Object this$comment = this.getComment();
            final Object other$comment = other.getComment();
            if (this$comment == null ? other$comment != null : !this$comment.equals(other$comment)) return false;
            return true;
        }

        protected boolean canEqual(final Object other) {
            return other instanceof MessageItem;
        }

        public int hashCode() {
            final int PRIME = 59;
            int result = 1;
            final Object $id = this.getId();
            result = result * PRIME + ($id == null ? 43 : $id.hashCode());
            final Object $name = this.getName();
            result = result * PRIME + ($name == null ? 43 : $name.hashCode());
            final Object $title = this.getTitle();
            result = result * PRIME + ($title == null ? 43 : $title.hashCode());
            final Object $created = this.getCreated();
            result = result * PRIME + ($created == null ? 43 : $created.hashCode());
            final Object $timestamp = this.getTimestamp();
            result = result * PRIME + ($timestamp == null ? 43 : $timestamp.hashCode());
            final Object $user = this.getUser();
            result = result * PRIME + ($user == null ? 43 : $user.hashCode());
            final Object $username = this.getUsername();
            result = result * PRIME + ($username == null ? 43 : $username.hashCode());
            result = result * PRIME + (this.isIntro() ? 79 : 97);
            result = result * PRIME + (this.is_public() ? 79 : 97);
            result = result * PRIME + (this.isStarred() ? 79 : 97);
            result = result * PRIME + (this.isPublicUrlShared() ? 79 : 97);
            final Object $urlPrivate = this.getUrlPrivate();
            result = result * PRIME + ($urlPrivate == null ? 43 : $urlPrivate.hashCode());
            result = result * PRIME + (this.isUrlPrivateDownload() ? 79 : 97);
            final Object $permalink = this.getPermalink();
            result = result * PRIME + ($permalink == null ? 43 : $permalink.hashCode());
            result = result * PRIME + (this.isPermalinkPublic() ? 79 : 97);
            final Object $editLink = this.getEditLink();
            result = result * PRIME + ($editLink == null ? 43 : $editLink.hashCode());
            final Object $preview = this.getPreview();
            result = result * PRIME + ($preview == null ? 43 : $preview.hashCode());
            final Object $previewHighlight = this.getPreviewHighlight();
            result = result * PRIME + ($previewHighlight == null ? 43 : $previewHighlight.hashCode());
            final Object $lines = this.getLines();
            result = result * PRIME + ($lines == null ? 43 : $lines.hashCode());
            final Object $linesMore = this.getLinesMore();
            result = result * PRIME + ($linesMore == null ? 43 : $linesMore.hashCode());
            result = result * PRIME + (this.isPreviewTruncated() ? 79 : 97);
            result = result * PRIME + (this.isHasRichPreview() ? 79 : 97);
            final Object $mimetype = this.getMimetype();
            result = result * PRIME + ($mimetype == null ? 43 : $mimetype.hashCode());
            final Object $filetype = this.getFiletype();
            result = result * PRIME + ($filetype == null ? 43 : $filetype.hashCode());
            final Object $prettyType = this.getPrettyType();
            result = result * PRIME + ($prettyType == null ? 43 : $prettyType.hashCode());
            result = result * PRIME + (this.isExternal() ? 79 : 97);
            final Object $externalType = this.getExternalType();
            result = result * PRIME + ($externalType == null ? 43 : $externalType.hashCode());
            result = result * PRIME + (this.isEditable() ? 79 : 97);
            result = result * PRIME + (this.isDisplayAsBot() ? 79 : 97);
            final Object $size = this.getSize();
            result = result * PRIME + ($size == null ? 43 : $size.hashCode());
            final Object $mode = this.getMode();
            result = result * PRIME + ($mode == null ? 43 : $mode.hashCode());
            final Object $comment = this.getComment();
            result = result * PRIME + ($comment == null ? 43 : $comment.hashCode());
            return result;
        }

        public String toString() {
            return "Message.MessageItem(id=" + this.getId() + ", name=" + this.getName() + ", title=" + this.getTitle() + ", created=" + this.getCreated() + ", timestamp=" + this.getTimestamp() + ", user=" + this.getUser() + ", username=" + this.getUsername() + ", intro=" + this.isIntro() + ", _public=" + this.is_public() + ", starred=" + this.isStarred() + ", publicUrlShared=" + this.isPublicUrlShared() + ", urlPrivate=" + this.getUrlPrivate() + ", urlPrivateDownload=" + this.isUrlPrivateDownload() + ", permalink=" + this.getPermalink() + ", permalinkPublic=" + this.isPermalinkPublic() + ", editLink=" + this.getEditLink() + ", preview=" + this.getPreview() + ", previewHighlight=" + this.getPreviewHighlight() + ", lines=" + this.getLines() + ", linesMore=" + this.getLinesMore() + ", previewTruncated=" + this.isPreviewTruncated() + ", hasRichPreview=" + this.isHasRichPreview() + ", mimetype=" + this.getMimetype() + ", filetype=" + this.getFiletype() + ", prettyType=" + this.getPrettyType() + ", external=" + this.isExternal() + ", externalType=" + this.getExternalType() + ", editable=" + this.isEditable() + ", displayAsBot=" + this.isDisplayAsBot() + ", size=" + this.getSize() + ", mode=" + this.getMode() + ", comment=" + this.getComment() + ")";
        }
    }

}
