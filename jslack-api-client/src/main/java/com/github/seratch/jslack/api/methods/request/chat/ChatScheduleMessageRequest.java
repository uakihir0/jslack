package com.github.seratch.jslack.api.methods.request.chat;

import com.github.seratch.jslack.api.methods.SlackApiRequest;
import com.github.seratch.jslack.api.model.Attachment;
import com.github.seratch.jslack.api.model.block.LayoutBlock;

import java.util.List;

public class ChatScheduleMessageRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `chat:write`
     */
    private String token;

    /**
     * Channel, private group, or DM channel to send message to. Can be an encoded ID, or a name. See below for more details.
     */
    private String channel;

    /**
     * Unix EPOCH timestamp of time in future to send the message.
     */
    private Integer postAt;

    /**
     * Text of the message to send. See below for an explanation of formatting.
     * This field is usually required, unless you're providing only attachments instead.
     * Provide no more than 40,000 characters or risk truncation.
     */
    private String text;

    /**
     * Pass true to post the message as the authed user, instead of as a bot. Defaults to false. See authorship below.
     */
    private Boolean asUser;

    ChatScheduleMessageRequest(String token, String channel, Integer postAt, String text, Boolean asUser, List<Attachment> attachments, String attachmentsAsString, List<LayoutBlock> blocks, String blocksAsString, boolean linkNames, String parse, boolean replyBroadcast, String threadTs, boolean unfurlLinks, boolean unfurlMedia) {
        this.token = token;
        this.channel = channel;
        this.postAt = postAt;
        this.text = text;
        this.asUser = asUser;
        this.attachments = attachments;
        this.attachmentsAsString = attachmentsAsString;
        this.blocks = blocks;
        this.blocksAsString = blocksAsString;
        this.linkNames = linkNames;
        this.parse = parse;
        this.replyBroadcast = replyBroadcast;
        this.threadTs = threadTs;
        this.unfurlLinks = unfurlLinks;
        this.unfurlMedia = unfurlMedia;
    }

    public static ChatScheduleMessageRequestBuilder builder() {
        return new ChatScheduleMessageRequestBuilder();
    }

    // NOTE: The default value is intentionally null to support workplace apps.
    public Boolean isAsUser() {
        return this.asUser;
    }

    // NOTE: The default value is intentionally null to support workplace apps.
    public void setAsUser(Boolean asUser) {
        this.asUser = asUser;
    }

    /**
     * A JSON-based array of structured attachments, presented as a URL-encoded string.
     */
    private List<Attachment> attachments;

    /**
     * A JSON-based array of structured attachments, presented as a URL-encoded string.
     */
    private String attachmentsAsString;

    /**
     * A JSON-based array of structured blocks, presented as a URL-encoded string.
     */
    private List<LayoutBlock> blocks;

    /**
     * A JSON-based array of structured blocks as a String, presented as a URL-encoded string.
     */
    private String blocksAsString;

    /**
     * Find and link channel names and usernames.
     */
    private boolean linkNames;

    /**
     * Change how messages are treated. Defaults to none. See below.
     */
    private String parse;

    /**
     * Used in conjunction with thread_ts and indicates whether reply should be made visible to everyone
     * in the channel or conversation. Defaults to false.
     */
    private boolean replyBroadcast;

    /**
     * Provide another message's ts value to make this message a reply.
     * Avoid using a reply's ts value; use its parent instead.
     */
    private String threadTs;

    /**
     * Pass true to enable unfurling of primarily text-based content.
     */
    private boolean unfurlLinks;

    /**
     * Pass false to disable unfurling of media content.
     */
    private boolean unfurlMedia;

    public String getToken() {
        return this.token;
    }

    public String getChannel() {
        return this.channel;
    }

    public Integer getPostAt() {
        return this.postAt;
    }

    public String getText() {
        return this.text;
    }

    public List<Attachment> getAttachments() {
        return this.attachments;
    }

    public String getAttachmentsAsString() {
        return this.attachmentsAsString;
    }

    public List<LayoutBlock> getBlocks() {
        return this.blocks;
    }

    public String getBlocksAsString() {
        return this.blocksAsString;
    }

    public boolean isLinkNames() {
        return this.linkNames;
    }

    public String getParse() {
        return this.parse;
    }

    public boolean isReplyBroadcast() {
        return this.replyBroadcast;
    }

    public String getThreadTs() {
        return this.threadTs;
    }

    public boolean isUnfurlLinks() {
        return this.unfurlLinks;
    }

    public boolean isUnfurlMedia() {
        return this.unfurlMedia;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public void setPostAt(Integer postAt) {
        this.postAt = postAt;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setAttachments(List<Attachment> attachments) {
        this.attachments = attachments;
    }

    public void setAttachmentsAsString(String attachmentsAsString) {
        this.attachmentsAsString = attachmentsAsString;
    }

    public void setBlocks(List<LayoutBlock> blocks) {
        this.blocks = blocks;
    }

    public void setBlocksAsString(String blocksAsString) {
        this.blocksAsString = blocksAsString;
    }

    public void setLinkNames(boolean linkNames) {
        this.linkNames = linkNames;
    }

    public void setParse(String parse) {
        this.parse = parse;
    }

    public void setReplyBroadcast(boolean replyBroadcast) {
        this.replyBroadcast = replyBroadcast;
    }

    public void setThreadTs(String threadTs) {
        this.threadTs = threadTs;
    }

    public void setUnfurlLinks(boolean unfurlLinks) {
        this.unfurlLinks = unfurlLinks;
    }

    public void setUnfurlMedia(boolean unfurlMedia) {
        this.unfurlMedia = unfurlMedia;
    }

    public static class ChatScheduleMessageRequestBuilder {
        private String token;
        private String channel;
        private Integer postAt;
        private String text;
        private Boolean asUser;
        private List<Attachment> attachments;
        private String attachmentsAsString;
        private List<LayoutBlock> blocks;
        private String blocksAsString;
        private boolean linkNames;
        private String parse;
        private boolean replyBroadcast;
        private String threadTs;
        private boolean unfurlLinks;
        private boolean unfurlMedia;

        ChatScheduleMessageRequestBuilder() {
        }

        public ChatScheduleMessageRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public ChatScheduleMessageRequestBuilder channel(String channel) {
            this.channel = channel;
            return this;
        }

        public ChatScheduleMessageRequestBuilder postAt(Integer postAt) {
            this.postAt = postAt;
            return this;
        }

        public ChatScheduleMessageRequestBuilder text(String text) {
            this.text = text;
            return this;
        }

        public ChatScheduleMessageRequestBuilder asUser(Boolean asUser) {
            this.asUser = asUser;
            return this;
        }

        public ChatScheduleMessageRequestBuilder attachments(List<Attachment> attachments) {
            this.attachments = attachments;
            return this;
        }

        public ChatScheduleMessageRequestBuilder attachmentsAsString(String attachmentsAsString) {
            this.attachmentsAsString = attachmentsAsString;
            return this;
        }

        public ChatScheduleMessageRequestBuilder blocks(List<LayoutBlock> blocks) {
            this.blocks = blocks;
            return this;
        }

        public ChatScheduleMessageRequestBuilder blocksAsString(String blocksAsString) {
            this.blocksAsString = blocksAsString;
            return this;
        }

        public ChatScheduleMessageRequestBuilder linkNames(boolean linkNames) {
            this.linkNames = linkNames;
            return this;
        }

        public ChatScheduleMessageRequestBuilder parse(String parse) {
            this.parse = parse;
            return this;
        }

        public ChatScheduleMessageRequestBuilder replyBroadcast(boolean replyBroadcast) {
            this.replyBroadcast = replyBroadcast;
            return this;
        }

        public ChatScheduleMessageRequestBuilder threadTs(String threadTs) {
            this.threadTs = threadTs;
            return this;
        }

        public ChatScheduleMessageRequestBuilder unfurlLinks(boolean unfurlLinks) {
            this.unfurlLinks = unfurlLinks;
            return this;
        }

        public ChatScheduleMessageRequestBuilder unfurlMedia(boolean unfurlMedia) {
            this.unfurlMedia = unfurlMedia;
            return this;
        }

        public ChatScheduleMessageRequest build() {
            return new ChatScheduleMessageRequest(token, channel, postAt, text, asUser, attachments, attachmentsAsString, blocks, blocksAsString, linkNames, parse, replyBroadcast, threadTs, unfurlLinks, unfurlMedia);
        }

        public String toString() {
            return "ChatScheduleMessageRequest.ChatScheduleMessageRequestBuilder(token=" + this.token + ", channel=" + this.channel + ", postAt=" + this.postAt + ", text=" + this.text + ", asUser=" + this.asUser + ", attachments=" + this.attachments + ", attachmentsAsString=" + this.attachmentsAsString + ", blocks=" + this.blocks + ", blocksAsString=" + this.blocksAsString + ", linkNames=" + this.linkNames + ", parse=" + this.parse + ", replyBroadcast=" + this.replyBroadcast + ", threadTs=" + this.threadTs + ", unfurlLinks=" + this.unfurlLinks + ", unfurlMedia=" + this.unfurlMedia + ")";
        }
    }
}