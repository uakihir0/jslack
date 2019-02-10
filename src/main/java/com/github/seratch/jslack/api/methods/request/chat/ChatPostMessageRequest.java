package com.github.seratch.jslack.api.methods.request.chat;

import com.github.seratch.jslack.api.methods.SlackApiRequest;
import com.github.seratch.jslack.api.model.Attachment;

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
     * A JSON-based array of structured attachments, presented as a URL-encoded string.
     */
    private List<Attachment> attachments;

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

    @java.beans.ConstructorProperties({"token", "username", "threadTs", "channel", "text", "parse", "linkNames", "attachments", "unfurlLinks", "unfurlMedia", "asUser", "mrkdwn", "iconUrl", "iconEmoji", "replyBroadcast"})
    ChatPostMessageRequest(String token, String username, String threadTs, String channel, String text, String parse, boolean linkNames, List<Attachment> attachments, boolean unfurlLinks, boolean unfurlMedia, Boolean asUser, boolean mrkdwn, String iconUrl, String iconEmoji, boolean replyBroadcast) {
        this.token = token;
        this.username = username;
        this.threadTs = threadTs;
        this.channel = channel;
        this.text = text;
        this.parse = parse;
        this.linkNames = linkNames;
        this.attachments = attachments;
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

    public List<Attachment> getAttachments() {
        return this.attachments;
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

    public void setAttachments(List<Attachment> attachments) {
        this.attachments = attachments;
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

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ChatPostMessageRequest)) return false;
        final ChatPostMessageRequest other = (ChatPostMessageRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$token = this.getToken();
        final Object other$token = other.getToken();
        if (this$token == null ? other$token != null : !this$token.equals(other$token)) return false;
        final Object this$username = this.getUsername();
        final Object other$username = other.getUsername();
        if (this$username == null ? other$username != null : !this$username.equals(other$username)) return false;
        final Object this$threadTs = this.getThreadTs();
        final Object other$threadTs = other.getThreadTs();
        if (this$threadTs == null ? other$threadTs != null : !this$threadTs.equals(other$threadTs)) return false;
        final Object this$channel = this.getChannel();
        final Object other$channel = other.getChannel();
        if (this$channel == null ? other$channel != null : !this$channel.equals(other$channel)) return false;
        final Object this$text = this.getText();
        final Object other$text = other.getText();
        if (this$text == null ? other$text != null : !this$text.equals(other$text)) return false;
        final Object this$parse = this.getParse();
        final Object other$parse = other.getParse();
        if (this$parse == null ? other$parse != null : !this$parse.equals(other$parse)) return false;
        if (this.isLinkNames() != other.isLinkNames()) return false;
        final Object this$attachments = this.getAttachments();
        final Object other$attachments = other.getAttachments();
        if (this$attachments == null ? other$attachments != null : !this$attachments.equals(other$attachments))
            return false;
        if (this.isUnfurlLinks() != other.isUnfurlLinks()) return false;
        if (this.isUnfurlMedia() != other.isUnfurlMedia()) return false;
        final Object this$asUser = this.isAsUser();
        final Object other$asUser = other.isAsUser();
        if (this$asUser == null ? other$asUser != null : !this$asUser.equals(other$asUser)) return false;
        if (this.isMrkdwn() != other.isMrkdwn()) return false;
        final Object this$iconUrl = this.getIconUrl();
        final Object other$iconUrl = other.getIconUrl();
        if (this$iconUrl == null ? other$iconUrl != null : !this$iconUrl.equals(other$iconUrl)) return false;
        final Object this$iconEmoji = this.getIconEmoji();
        final Object other$iconEmoji = other.getIconEmoji();
        if (this$iconEmoji == null ? other$iconEmoji != null : !this$iconEmoji.equals(other$iconEmoji)) return false;
        if (this.isReplyBroadcast() != other.isReplyBroadcast()) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ChatPostMessageRequest;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $token = this.getToken();
        result = result * PRIME + ($token == null ? 43 : $token.hashCode());
        final Object $username = this.getUsername();
        result = result * PRIME + ($username == null ? 43 : $username.hashCode());
        final Object $threadTs = this.getThreadTs();
        result = result * PRIME + ($threadTs == null ? 43 : $threadTs.hashCode());
        final Object $channel = this.getChannel();
        result = result * PRIME + ($channel == null ? 43 : $channel.hashCode());
        final Object $text = this.getText();
        result = result * PRIME + ($text == null ? 43 : $text.hashCode());
        final Object $parse = this.getParse();
        result = result * PRIME + ($parse == null ? 43 : $parse.hashCode());
        result = result * PRIME + (this.isLinkNames() ? 79 : 97);
        final Object $attachments = this.getAttachments();
        result = result * PRIME + ($attachments == null ? 43 : $attachments.hashCode());
        result = result * PRIME + (this.isUnfurlLinks() ? 79 : 97);
        result = result * PRIME + (this.isUnfurlMedia() ? 79 : 97);
        final Object $asUser = this.isAsUser();
        result = result * PRIME + ($asUser == null ? 43 : $asUser.hashCode());
        result = result * PRIME + (this.isMrkdwn() ? 79 : 97);
        final Object $iconUrl = this.getIconUrl();
        result = result * PRIME + ($iconUrl == null ? 43 : $iconUrl.hashCode());
        final Object $iconEmoji = this.getIconEmoji();
        result = result * PRIME + ($iconEmoji == null ? 43 : $iconEmoji.hashCode());
        result = result * PRIME + (this.isReplyBroadcast() ? 79 : 97);
        return result;
    }

    public String toString() {
        return "ChatPostMessageRequest(token=" + this.getToken() + ", username=" + this.getUsername() + ", threadTs=" + this.getThreadTs() + ", channel=" + this.getChannel() + ", text=" + this.getText() + ", parse=" + this.getParse() + ", linkNames=" + this.isLinkNames() + ", attachments=" + this.getAttachments() + ", unfurlLinks=" + this.isUnfurlLinks() + ", unfurlMedia=" + this.isUnfurlMedia() + ", asUser=" + this.isAsUser() + ", mrkdwn=" + this.isMrkdwn() + ", iconUrl=" + this.getIconUrl() + ", iconEmoji=" + this.getIconEmoji() + ", replyBroadcast=" + this.isReplyBroadcast() + ")";
    }

    public static class ChatPostMessageRequestBuilder {
        private String token;
        private String username;
        private String threadTs;
        private String channel;
        private String text;
        private String parse;
        private boolean linkNames;
        private List<Attachment> attachments;
        private boolean unfurlLinks;
        private boolean unfurlMedia;
        private Boolean asUser;
        private boolean mrkdwn;
        private String iconUrl;
        private String iconEmoji;
        private boolean replyBroadcast;

        ChatPostMessageRequestBuilder() {
        }

        public ChatPostMessageRequest.ChatPostMessageRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public ChatPostMessageRequest.ChatPostMessageRequestBuilder username(String username) {
            this.username = username;
            return this;
        }

        public ChatPostMessageRequest.ChatPostMessageRequestBuilder threadTs(String threadTs) {
            this.threadTs = threadTs;
            return this;
        }

        public ChatPostMessageRequest.ChatPostMessageRequestBuilder channel(String channel) {
            this.channel = channel;
            return this;
        }

        public ChatPostMessageRequest.ChatPostMessageRequestBuilder text(String text) {
            this.text = text;
            return this;
        }

        public ChatPostMessageRequest.ChatPostMessageRequestBuilder parse(String parse) {
            this.parse = parse;
            return this;
        }

        public ChatPostMessageRequest.ChatPostMessageRequestBuilder linkNames(boolean linkNames) {
            this.linkNames = linkNames;
            return this;
        }

        public ChatPostMessageRequest.ChatPostMessageRequestBuilder attachments(List<Attachment> attachments) {
            this.attachments = attachments;
            return this;
        }

        public ChatPostMessageRequest.ChatPostMessageRequestBuilder unfurlLinks(boolean unfurlLinks) {
            this.unfurlLinks = unfurlLinks;
            return this;
        }

        public ChatPostMessageRequest.ChatPostMessageRequestBuilder unfurlMedia(boolean unfurlMedia) {
            this.unfurlMedia = unfurlMedia;
            return this;
        }

        public ChatPostMessageRequest.ChatPostMessageRequestBuilder asUser(Boolean asUser) {
            this.asUser = asUser;
            return this;
        }

        public ChatPostMessageRequest.ChatPostMessageRequestBuilder mrkdwn(boolean mrkdwn) {
            this.mrkdwn = mrkdwn;
            return this;
        }

        public ChatPostMessageRequest.ChatPostMessageRequestBuilder iconUrl(String iconUrl) {
            this.iconUrl = iconUrl;
            return this;
        }

        public ChatPostMessageRequest.ChatPostMessageRequestBuilder iconEmoji(String iconEmoji) {
            this.iconEmoji = iconEmoji;
            return this;
        }

        public ChatPostMessageRequest.ChatPostMessageRequestBuilder replyBroadcast(boolean replyBroadcast) {
            this.replyBroadcast = replyBroadcast;
            return this;
        }

        public ChatPostMessageRequest build() {
            return new ChatPostMessageRequest(token, username, threadTs, channel, text, parse, linkNames, attachments, unfurlLinks, unfurlMedia, asUser, mrkdwn, iconUrl, iconEmoji, replyBroadcast);
        }

        public String toString() {
            return "ChatPostMessageRequest.ChatPostMessageRequestBuilder(token=" + this.token + ", username=" + this.username + ", threadTs=" + this.threadTs + ", channel=" + this.channel + ", text=" + this.text + ", parse=" + this.parse + ", linkNames=" + this.linkNames + ", attachments=" + this.attachments + ", unfurlLinks=" + this.unfurlLinks + ", unfurlMedia=" + this.unfurlMedia + ", asUser=" + this.asUser + ", mrkdwn=" + this.mrkdwn + ", iconUrl=" + this.iconUrl + ", iconEmoji=" + this.iconEmoji + ", replyBroadcast=" + this.replyBroadcast + ")";
        }
    }
}
