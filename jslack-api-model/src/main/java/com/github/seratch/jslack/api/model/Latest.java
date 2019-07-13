package com.github.seratch.jslack.api.model;

import com.github.seratch.jslack.api.model.block.LayoutBlock;

import java.util.List;

public class Latest {

    private String clientMsgId;

    private String type;
    private String subtype;
    private String team;
    private String user;
    private String username;
    private String text;
    private String topic; // groups
    private List<Attachment> attachments;
    private List<LayoutBlock> blocks;
    private List<File> files;
    private List<Reaction> reactions;
    private Message.MessageRoot root;
    private boolean upload;
    private boolean displayAsBot;
    private String botId;
    private String threadTs;
    private String ts;
    private Message.Icons icons;

    public Latest() {
    }

    public String getClientMsgId() {
        return this.clientMsgId;
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

    public String getUser() {
        return this.user;
    }

    public String getUsername() {
        return this.username;
    }

    public String getText() {
        return this.text;
    }

    public String getTopic() {
        return this.topic;
    }

    public List<Attachment> getAttachments() {
        return this.attachments;
    }

    public List<LayoutBlock> getBlocks() {
        return this.blocks;
    }

    public List<File> getFiles() {
        return this.files;
    }

    public List<Reaction> getReactions() {
        return this.reactions;
    }

    public Message.MessageRoot getRoot() {
        return this.root;
    }

    public boolean isUpload() {
        return this.upload;
    }

    public boolean isDisplayAsBot() {
        return this.displayAsBot;
    }

    public String getBotId() {
        return this.botId;
    }

    public String getThreadTs() {
        return this.threadTs;
    }

    public String getTs() {
        return this.ts;
    }

    public Message.Icons getIcons() {
        return this.icons;
    }

    public void setClientMsgId(String clientMsgId) {
        this.clientMsgId = clientMsgId;
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

    public void setUser(String user) {
        this.user = user;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public void setAttachments(List<Attachment> attachments) {
        this.attachments = attachments;
    }

    public void setBlocks(List<LayoutBlock> blocks) {
        this.blocks = blocks;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }

    public void setReactions(List<Reaction> reactions) {
        this.reactions = reactions;
    }

    public void setRoot(Message.MessageRoot root) {
        this.root = root;
    }

    public void setUpload(boolean upload) {
        this.upload = upload;
    }

    public void setDisplayAsBot(boolean displayAsBot) {
        this.displayAsBot = displayAsBot;
    }

    public void setBotId(String botId) {
        this.botId = botId;
    }

    public void setThreadTs(String threadTs) {
        this.threadTs = threadTs;
    }

    public void setTs(String ts) {
        this.ts = ts;
    }

    public void setIcons(Message.Icons icons) {
        this.icons = icons;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Latest)) return false;
        final Latest other = (Latest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$clientMsgId = this.getClientMsgId();
        final Object other$clientMsgId = other.getClientMsgId();
        if (this$clientMsgId == null ? other$clientMsgId != null : !this$clientMsgId.equals(other$clientMsgId))
            return false;
        final Object this$type = this.getType();
        final Object other$type = other.getType();
        if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
        final Object this$subtype = this.getSubtype();
        final Object other$subtype = other.getSubtype();
        if (this$subtype == null ? other$subtype != null : !this$subtype.equals(other$subtype)) return false;
        final Object this$team = this.getTeam();
        final Object other$team = other.getTeam();
        if (this$team == null ? other$team != null : !this$team.equals(other$team)) return false;
        final Object this$user = this.getUser();
        final Object other$user = other.getUser();
        if (this$user == null ? other$user != null : !this$user.equals(other$user)) return false;
        final Object this$username = this.getUsername();
        final Object other$username = other.getUsername();
        if (this$username == null ? other$username != null : !this$username.equals(other$username)) return false;
        final Object this$text = this.getText();
        final Object other$text = other.getText();
        if (this$text == null ? other$text != null : !this$text.equals(other$text)) return false;
        final Object this$topic = this.getTopic();
        final Object other$topic = other.getTopic();
        if (this$topic == null ? other$topic != null : !this$topic.equals(other$topic)) return false;
        final Object this$attachments = this.getAttachments();
        final Object other$attachments = other.getAttachments();
        if (this$attachments == null ? other$attachments != null : !this$attachments.equals(other$attachments))
            return false;
        final Object this$blocks = this.getBlocks();
        final Object other$blocks = other.getBlocks();
        if (this$blocks == null ? other$blocks != null : !this$blocks.equals(other$blocks)) return false;
        final Object this$files = this.getFiles();
        final Object other$files = other.getFiles();
        if (this$files == null ? other$files != null : !this$files.equals(other$files)) return false;
        final Object this$reactions = this.getReactions();
        final Object other$reactions = other.getReactions();
        if (this$reactions == null ? other$reactions != null : !this$reactions.equals(other$reactions)) return false;
        final Object this$root = this.getRoot();
        final Object other$root = other.getRoot();
        if (this$root == null ? other$root != null : !this$root.equals(other$root)) return false;
        if (this.isUpload() != other.isUpload()) return false;
        if (this.isDisplayAsBot() != other.isDisplayAsBot()) return false;
        final Object this$botId = this.getBotId();
        final Object other$botId = other.getBotId();
        if (this$botId == null ? other$botId != null : !this$botId.equals(other$botId)) return false;
        final Object this$threadTs = this.getThreadTs();
        final Object other$threadTs = other.getThreadTs();
        if (this$threadTs == null ? other$threadTs != null : !this$threadTs.equals(other$threadTs)) return false;
        final Object this$ts = this.getTs();
        final Object other$ts = other.getTs();
        if (this$ts == null ? other$ts != null : !this$ts.equals(other$ts)) return false;
        final Object this$icons = this.getIcons();
        final Object other$icons = other.getIcons();
        if (this$icons == null ? other$icons != null : !this$icons.equals(other$icons)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Latest;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $clientMsgId = this.getClientMsgId();
        result = result * PRIME + ($clientMsgId == null ? 43 : $clientMsgId.hashCode());
        final Object $type = this.getType();
        result = result * PRIME + ($type == null ? 43 : $type.hashCode());
        final Object $subtype = this.getSubtype();
        result = result * PRIME + ($subtype == null ? 43 : $subtype.hashCode());
        final Object $team = this.getTeam();
        result = result * PRIME + ($team == null ? 43 : $team.hashCode());
        final Object $user = this.getUser();
        result = result * PRIME + ($user == null ? 43 : $user.hashCode());
        final Object $username = this.getUsername();
        result = result * PRIME + ($username == null ? 43 : $username.hashCode());
        final Object $text = this.getText();
        result = result * PRIME + ($text == null ? 43 : $text.hashCode());
        final Object $topic = this.getTopic();
        result = result * PRIME + ($topic == null ? 43 : $topic.hashCode());
        final Object $attachments = this.getAttachments();
        result = result * PRIME + ($attachments == null ? 43 : $attachments.hashCode());
        final Object $blocks = this.getBlocks();
        result = result * PRIME + ($blocks == null ? 43 : $blocks.hashCode());
        final Object $files = this.getFiles();
        result = result * PRIME + ($files == null ? 43 : $files.hashCode());
        final Object $reactions = this.getReactions();
        result = result * PRIME + ($reactions == null ? 43 : $reactions.hashCode());
        final Object $root = this.getRoot();
        result = result * PRIME + ($root == null ? 43 : $root.hashCode());
        result = result * PRIME + (this.isUpload() ? 79 : 97);
        result = result * PRIME + (this.isDisplayAsBot() ? 79 : 97);
        final Object $botId = this.getBotId();
        result = result * PRIME + ($botId == null ? 43 : $botId.hashCode());
        final Object $threadTs = this.getThreadTs();
        result = result * PRIME + ($threadTs == null ? 43 : $threadTs.hashCode());
        final Object $ts = this.getTs();
        result = result * PRIME + ($ts == null ? 43 : $ts.hashCode());
        final Object $icons = this.getIcons();
        result = result * PRIME + ($icons == null ? 43 : $icons.hashCode());
        return result;
    }

    public String toString() {
        return "Latest(clientMsgId=" + this.getClientMsgId() + ", type=" + this.getType() + ", subtype=" + this.getSubtype() + ", team=" + this.getTeam() + ", user=" + this.getUser() + ", username=" + this.getUsername() + ", text=" + this.getText() + ", topic=" + this.getTopic() + ", attachments=" + this.getAttachments() + ", blocks=" + this.getBlocks() + ", files=" + this.getFiles() + ", reactions=" + this.getReactions() + ", root=" + this.getRoot() + ", upload=" + this.isUpload() + ", displayAsBot=" + this.isDisplayAsBot() + ", botId=" + this.getBotId() + ", threadTs=" + this.getThreadTs() + ", ts=" + this.getTs() + ", icons=" + this.getIcons() + ")";
    }
}
