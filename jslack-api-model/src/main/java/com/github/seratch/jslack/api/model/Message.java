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

    private BotProfile botProfile;

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

    private List<String> xFiles; // remote file ids

    private String lastRead;

    // this field exists only when posting the message with "reply_broadcast": true
    private MessageRoot root;

    private String itemType;
    private MessageItem item;

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

    public BotProfile getBotProfile() {
        return this.botProfile;
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

    public List<String> getXFiles() {
        return this.xFiles;
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

    public void setBotProfile(BotProfile botProfile) {
        this.botProfile = botProfile;
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

    public void setXFiles(List<String> xFiles) {
        this.xFiles = xFiles;
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
    }

    /**
     * A reply message information in a MessageRoot.
     */
    public static class MessageRootReply {
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
    }

}
