package com.github.seratch.jslack.api.methods.request.chat;

import com.github.seratch.jslack.api.methods.SlackApiRequest;
import com.github.seratch.jslack.api.model.Attachment;
import com.github.seratch.jslack.api.model.block.LayoutBlock;

import java.util.List;

/**
 * https://api.slack.com/methods/chat.postMessage
 */
public class ChatPostMessageRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `chat:write`
     */
    private String token;

    /**
     * aSet your bot's user name.
     * Must be used in conjunction with `as_user` set to false, otherwise ignored. See [authorship](#authorship) below.
     */
    private String username;

    /**
     * Provide another message's `ts` value to make this message a reply. Avoid using a reply's `ts` value; use its parent instead.
     */
    private String threadTs;

    /**
     * Channel, private group, or IM channel to send message to.
     * Can be an encoded ID, or a name. See [below](#channels) for more details.
     */
    private String channel;

    /**
     * Text of the message to send. See below for an explanation of [formatting](#formatting).
     * This field is usually required, unless you're providing only `attachments` instead.
     */
    private String text;

    /**
     * Change how messages are treated. Defaults to `none`. See [below](#formatting).
     */
    private String parse;

    /**
     * Find and link channel names and usernames.
     */
    private boolean linkNames;

    /**
     * A JSON-based array of structured blocks, presented as a URL-encoded string.
     */
    private List<LayoutBlock> blocks;

    /**
     * A JSON-based array of structured blocks as a String, presented as a URL-encoded string.
     */
    private String blocksAsString;

    /**
     * A JSON-based array of structured attachments, presented as a URL-encoded string.
     */
    private List<Attachment> attachments;

    /**
     * A JSON-based array of structured attachments, presented as a URL-encoded string.
     */
    private String attachmentsAsString;

    /**
     * Pass true to enable unfurling of primarily text-based content.
     */
    private boolean unfurlLinks;

    /**
     * Pass false to disable unfurling of media content.
     */
    private boolean unfurlMedia;

    /**
     * Pass true to post the message as the authed user, instead of as a bot.
     * Defaults to false. See [authorship](#authorship) below.
     * <p>
     * NOTE: The default value is intentionally null to support workplace apps.
     */
    private Boolean asUser;

    ChatPostMessageRequest(String token, String username, String threadTs, String channel, String text, String parse, boolean linkNames, List<LayoutBlock> blocks, String blocksAsString, List<Attachment> attachments, String attachmentsAsString, boolean unfurlLinks, boolean unfurlMedia, Boolean asUser, boolean mrkdwn, String iconUrl, String iconEmoji, boolean replyBroadcast) {
        this.token = token;
        this.username = username;
        this.threadTs = threadTs;
        this.channel = channel;
        this.text = text;
        this.parse = parse;
        this.linkNames = linkNames;
        this.blocks = blocks;
        this.blocksAsString = blocksAsString;
        this.attachments = attachments;
        this.attachmentsAsString = attachmentsAsString;
        this.unfurlLinks = unfurlLinks;
        this.unfurlMedia = unfurlMedia;
        this.asUser = asUser;
        this.mrkdwn = mrkdwn;
        this.iconUrl = iconUrl;
        this.iconEmoji = iconEmoji;
        this.replyBroadcast = replyBroadcast;
    }

    public static ChatPostMessageRequestBuilder builder() {
        return new ChatPostMessageRequestBuilder();
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
     * Disable Slack markup parsing by setting to `false`. Enabled by default.
     */
    private boolean mrkdwn = true;

    /**
     * URL to an image to use as the icon for this message.
     * Must be used in conjunction with `as_user` set to false, otherwise ignored. See [authorship](#authorship) below.
     */
    private String iconUrl;

    /**
     * Emoji to use as the icon for this message. Overrides `icon_url`.
     * Must be used in conjunction with `as_user` set to `false`, otherwise ignored. See [authorship](#authorship) below.
     */
    private String iconEmoji;

    /**
     * Used in conjunction with `thread_ts` and indicates whether reply should be made visible to
     * everyone in the channel or conversation. Defaults to `false`.
     */
    private boolean replyBroadcast;

    public String getToken() {
        return this.token;
    }

    public String getUsername() {
        return this.username;
    }

    public String getThreadTs() {
        return this.threadTs;
    }

    public String getChannel() {
        return this.channel;
    }

    public String getText() {
        return this.text;
    }

    public String getParse() {
        return this.parse;
    }

    public boolean isLinkNames() {
        return this.linkNames;
    }

    public List<LayoutBlock> getBlocks() {
        return this.blocks;
    }

    public String getBlocksAsString() {
        return this.blocksAsString;
    }

    public List<Attachment> getAttachments() {
        return this.attachments;
    }

    public String getAttachmentsAsString() {
        return this.attachmentsAsString;
    }

    public boolean isUnfurlLinks() {
        return this.unfurlLinks;
    }

    public boolean isUnfurlMedia() {
        return this.unfurlMedia;
    }

    public boolean isMrkdwn() {
        return this.mrkdwn;
    }

    public String getIconUrl() {
        return this.iconUrl;
    }

    public String getIconEmoji() {
        return this.iconEmoji;
    }

    public boolean isReplyBroadcast() {
        return this.replyBroadcast;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setThreadTs(String threadTs) {
        this.threadTs = threadTs;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setParse(String parse) {
        this.parse = parse;
    }

    public void setLinkNames(boolean linkNames) {
        this.linkNames = linkNames;
    }

    public void setBlocks(List<LayoutBlock> blocks) {
        this.blocks = blocks;
    }

    public void setBlocksAsString(String blocksAsString) {
        this.blocksAsString = blocksAsString;
    }

    public void setAttachments(List<Attachment> attachments) {
        this.attachments = attachments;
    }

    public void setAttachmentsAsString(String attachmentsAsString) {
        this.attachmentsAsString = attachmentsAsString;
    }

    public void setUnfurlLinks(boolean unfurlLinks) {
        this.unfurlLinks = unfurlLinks;
    }

    public void setUnfurlMedia(boolean unfurlMedia) {
        this.unfurlMedia = unfurlMedia;
    }

    public void setMrkdwn(boolean mrkdwn) {
        this.mrkdwn = mrkdwn;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public void setIconEmoji(String iconEmoji) {
        this.iconEmoji = iconEmoji;
    }

    public void setReplyBroadcast(boolean replyBroadcast) {
        this.replyBroadcast = replyBroadcast;
    }

    public static class ChatPostMessageRequestBuilder {
        private String token;
        private String username;
        private String threadTs;
        private String channel;
        private String text;
        private String parse;
        private boolean linkNames;
        private List<LayoutBlock> blocks;
        private String blocksAsString;
        private List<Attachment> attachments;
        private String attachmentsAsString;
        private boolean unfurlLinks;
        private boolean unfurlMedia;
        private Boolean asUser;
        private boolean mrkdwn;
        private String iconUrl;
        private String iconEmoji;
        private boolean replyBroadcast;

        ChatPostMessageRequestBuilder() {
        }

        public ChatPostMessageRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public ChatPostMessageRequestBuilder username(String username) {
            this.username = username;
            return this;
        }

        public ChatPostMessageRequestBuilder threadTs(String threadTs) {
            this.threadTs = threadTs;
            return this;
        }

        public ChatPostMessageRequestBuilder channel(String channel) {
            this.channel = channel;
            return this;
        }

        public ChatPostMessageRequestBuilder text(String text) {
            this.text = text;
            return this;
        }

        public ChatPostMessageRequestBuilder parse(String parse) {
            this.parse = parse;
            return this;
        }

        public ChatPostMessageRequestBuilder linkNames(boolean linkNames) {
            this.linkNames = linkNames;
            return this;
        }

        public ChatPostMessageRequestBuilder blocks(List<LayoutBlock> blocks) {
            this.blocks = blocks;
            return this;
        }

        public ChatPostMessageRequestBuilder blocksAsString(String blocksAsString) {
            this.blocksAsString = blocksAsString;
            return this;
        }

        public ChatPostMessageRequestBuilder attachments(List<Attachment> attachments) {
            this.attachments = attachments;
            return this;
        }

        public ChatPostMessageRequestBuilder attachmentsAsString(String attachmentsAsString) {
            this.attachmentsAsString = attachmentsAsString;
            return this;
        }

        public ChatPostMessageRequestBuilder unfurlLinks(boolean unfurlLinks) {
            this.unfurlLinks = unfurlLinks;
            return this;
        }

        public ChatPostMessageRequestBuilder unfurlMedia(boolean unfurlMedia) {
            this.unfurlMedia = unfurlMedia;
            return this;
        }

        public ChatPostMessageRequestBuilder asUser(Boolean asUser) {
            this.asUser = asUser;
            return this;
        }

        public ChatPostMessageRequestBuilder mrkdwn(boolean mrkdwn) {
            this.mrkdwn = mrkdwn;
            return this;
        }

        public ChatPostMessageRequestBuilder iconUrl(String iconUrl) {
            this.iconUrl = iconUrl;
            return this;
        }

        public ChatPostMessageRequestBuilder iconEmoji(String iconEmoji) {
            this.iconEmoji = iconEmoji;
            return this;
        }

        public ChatPostMessageRequestBuilder replyBroadcast(boolean replyBroadcast) {
            this.replyBroadcast = replyBroadcast;
            return this;
        }

        public ChatPostMessageRequest build() {
            return new ChatPostMessageRequest(token, username, threadTs, channel, text, parse, linkNames, blocks, blocksAsString, attachments, attachmentsAsString, unfurlLinks, unfurlMedia, asUser, mrkdwn, iconUrl, iconEmoji, replyBroadcast);
        }

        public String toString() {
            return "ChatPostMessageRequest.ChatPostMessageRequestBuilder(token=" + this.token + ", username=" + this.username + ", threadTs=" + this.threadTs + ", channel=" + this.channel + ", text=" + this.text + ", parse=" + this.parse + ", linkNames=" + this.linkNames + ", blocks=" + this.blocks + ", blocksAsString=" + this.blocksAsString + ", attachments=" + this.attachments + ", attachmentsAsString=" + this.attachmentsAsString + ", unfurlLinks=" + this.unfurlLinks + ", unfurlMedia=" + this.unfurlMedia + ", asUser=" + this.asUser + ", mrkdwn=" + this.mrkdwn + ", iconUrl=" + this.iconUrl + ", iconEmoji=" + this.iconEmoji + ", replyBroadcast=" + this.replyBroadcast + ")";
        }
    }
}
