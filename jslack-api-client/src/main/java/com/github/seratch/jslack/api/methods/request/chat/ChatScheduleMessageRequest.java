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

    ChatScheduleMessageRequest(String token, String channel, Integer postAt, String text, Boolean asUser, List<Attachment> attachments, List<LayoutBlock> blocks, boolean linkNames, String parse, boolean replyBroadcast, String threadTs, boolean unfurlLinks, boolean unfurlMedia) {
        this.token = token;
        this.channel = channel;
        this.postAt = postAt;
        this.text = text;
        this.asUser = asUser;
        this.attachments = attachments;
        this.blocks = blocks;
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
     * A JSON-based array of structured blocks, presented as a URL-encoded string.
     */
    private List<LayoutBlock> blocks;

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

    public List<LayoutBlock> getBlocks() {
        return this.blocks;
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

    public void setBlocks(List<LayoutBlock> blocks) {
        this.blocks = blocks;
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

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ChatScheduleMessageRequest)) return false;
        final ChatScheduleMessageRequest other = (ChatScheduleMessageRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$token = this.getToken();
        final Object other$token = other.getToken();
        if (this$token == null ? other$token != null : !this$token.equals(other$token)) return false;
        final Object this$channel = this.getChannel();
        final Object other$channel = other.getChannel();
        if (this$channel == null ? other$channel != null : !this$channel.equals(other$channel)) return false;
        final Object this$postAt = this.getPostAt();
        final Object other$postAt = other.getPostAt();
        if (this$postAt == null ? other$postAt != null : !this$postAt.equals(other$postAt)) return false;
        final Object this$text = this.getText();
        final Object other$text = other.getText();
        if (this$text == null ? other$text != null : !this$text.equals(other$text)) return false;
        final Object this$asUser = this.isAsUser();
        final Object other$asUser = other.isAsUser();
        if (this$asUser == null ? other$asUser != null : !this$asUser.equals(other$asUser)) return false;
        final Object this$attachments = this.getAttachments();
        final Object other$attachments = other.getAttachments();
        if (this$attachments == null ? other$attachments != null : !this$attachments.equals(other$attachments))
            return false;
        final Object this$blocks = this.getBlocks();
        final Object other$blocks = other.getBlocks();
        if (this$blocks == null ? other$blocks != null : !this$blocks.equals(other$blocks)) return false;
        if (this.isLinkNames() != other.isLinkNames()) return false;
        final Object this$parse = this.getParse();
        final Object other$parse = other.getParse();
        if (this$parse == null ? other$parse != null : !this$parse.equals(other$parse)) return false;
        if (this.isReplyBroadcast() != other.isReplyBroadcast()) return false;
        final Object this$threadTs = this.getThreadTs();
        final Object other$threadTs = other.getThreadTs();
        if (this$threadTs == null ? other$threadTs != null : !this$threadTs.equals(other$threadTs)) return false;
        if (this.isUnfurlLinks() != other.isUnfurlLinks()) return false;
        if (this.isUnfurlMedia() != other.isUnfurlMedia()) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ChatScheduleMessageRequest;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $token = this.getToken();
        result = result * PRIME + ($token == null ? 43 : $token.hashCode());
        final Object $channel = this.getChannel();
        result = result * PRIME + ($channel == null ? 43 : $channel.hashCode());
        final Object $postAt = this.getPostAt();
        result = result * PRIME + ($postAt == null ? 43 : $postAt.hashCode());
        final Object $text = this.getText();
        result = result * PRIME + ($text == null ? 43 : $text.hashCode());
        final Object $asUser = this.isAsUser();
        result = result * PRIME + ($asUser == null ? 43 : $asUser.hashCode());
        final Object $attachments = this.getAttachments();
        result = result * PRIME + ($attachments == null ? 43 : $attachments.hashCode());
        final Object $blocks = this.getBlocks();
        result = result * PRIME + ($blocks == null ? 43 : $blocks.hashCode());
        result = result * PRIME + (this.isLinkNames() ? 79 : 97);
        final Object $parse = this.getParse();
        result = result * PRIME + ($parse == null ? 43 : $parse.hashCode());
        result = result * PRIME + (this.isReplyBroadcast() ? 79 : 97);
        final Object $threadTs = this.getThreadTs();
        result = result * PRIME + ($threadTs == null ? 43 : $threadTs.hashCode());
        result = result * PRIME + (this.isUnfurlLinks() ? 79 : 97);
        result = result * PRIME + (this.isUnfurlMedia() ? 79 : 97);
        return result;
    }

    public String toString() {
        return "ChatScheduleMessageRequest(token=" + this.getToken() + ", channel=" + this.getChannel() + ", postAt=" + this.getPostAt() + ", text=" + this.getText() + ", asUser=" + this.isAsUser() + ", attachments=" + this.getAttachments() + ", blocks=" + this.getBlocks() + ", linkNames=" + this.isLinkNames() + ", parse=" + this.getParse() + ", replyBroadcast=" + this.isReplyBroadcast() + ", threadTs=" + this.getThreadTs() + ", unfurlLinks=" + this.isUnfurlLinks() + ", unfurlMedia=" + this.isUnfurlMedia() + ")";
    }

    public static class ChatScheduleMessageRequestBuilder {
        private String token;
        private String channel;
        private Integer postAt;
        private String text;
        private Boolean asUser;
        private List<Attachment> attachments;
        private List<LayoutBlock> blocks;
        private boolean linkNames;
        private String parse;
        private boolean replyBroadcast;
        private String threadTs;
        private boolean unfurlLinks;
        private boolean unfurlMedia;

        ChatScheduleMessageRequestBuilder() {
        }

        public ChatScheduleMessageRequest.ChatScheduleMessageRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public ChatScheduleMessageRequest.ChatScheduleMessageRequestBuilder channel(String channel) {
            this.channel = channel;
            return this;
        }

        public ChatScheduleMessageRequest.ChatScheduleMessageRequestBuilder postAt(Integer postAt) {
            this.postAt = postAt;
            return this;
        }

        public ChatScheduleMessageRequest.ChatScheduleMessageRequestBuilder text(String text) {
            this.text = text;
            return this;
        }

        public ChatScheduleMessageRequest.ChatScheduleMessageRequestBuilder asUser(Boolean asUser) {
            this.asUser = asUser;
            return this;
        }

        public ChatScheduleMessageRequest.ChatScheduleMessageRequestBuilder attachments(List<Attachment> attachments) {
            this.attachments = attachments;
            return this;
        }

        public ChatScheduleMessageRequest.ChatScheduleMessageRequestBuilder blocks(List<LayoutBlock> blocks) {
            this.blocks = blocks;
            return this;
        }

        public ChatScheduleMessageRequest.ChatScheduleMessageRequestBuilder linkNames(boolean linkNames) {
            this.linkNames = linkNames;
            return this;
        }

        public ChatScheduleMessageRequest.ChatScheduleMessageRequestBuilder parse(String parse) {
            this.parse = parse;
            return this;
        }

        public ChatScheduleMessageRequest.ChatScheduleMessageRequestBuilder replyBroadcast(boolean replyBroadcast) {
            this.replyBroadcast = replyBroadcast;
            return this;
        }

        public ChatScheduleMessageRequest.ChatScheduleMessageRequestBuilder threadTs(String threadTs) {
            this.threadTs = threadTs;
            return this;
        }

        public ChatScheduleMessageRequest.ChatScheduleMessageRequestBuilder unfurlLinks(boolean unfurlLinks) {
            this.unfurlLinks = unfurlLinks;
            return this;
        }

        public ChatScheduleMessageRequest.ChatScheduleMessageRequestBuilder unfurlMedia(boolean unfurlMedia) {
            this.unfurlMedia = unfurlMedia;
            return this;
        }

        public ChatScheduleMessageRequest build() {
            return new ChatScheduleMessageRequest(token, channel, postAt, text, asUser, attachments, blocks, linkNames, parse, replyBroadcast, threadTs, unfurlLinks, unfurlMedia);
        }

        public String toString() {
            return "ChatScheduleMessageRequest.ChatScheduleMessageRequestBuilder(token=" + this.token + ", channel=" + this.channel + ", postAt=" + this.postAt + ", text=" + this.text + ", asUser=" + this.asUser + ", attachments=" + this.attachments + ", blocks=" + this.blocks + ", linkNames=" + this.linkNames + ", parse=" + this.parse + ", replyBroadcast=" + this.replyBroadcast + ", threadTs=" + this.threadTs + ", unfurlLinks=" + this.unfurlLinks + ", unfurlMedia=" + this.unfurlMedia + ")";
        }
    }
}