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
    private String botLink;
    private String threadTs;
    private String ts;
    private Message.Icons icons;
    private List<String> xFiles;

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

    public String getBotLink() {
        return this.botLink;
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

    public List<String> getXFiles() {
        return this.xFiles;
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

    public void setBotLink(String botLink) {
        this.botLink = botLink;
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

    public void setXFiles(List<String> xFiles) {
        this.xFiles = xFiles;
    }
}
