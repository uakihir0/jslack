package com.github.seratch.jslack.api.methods.request.chat;

import com.github.seratch.jslack.api.methods.SlackApiRequest;
import com.github.seratch.jslack.api.model.Attachment;

import java.util.List;

/**
 * https://api.slack.com/methods/chat.postMessage
 */
public class ChatPostMessageRequest implements SlackApiRequest {

    private String token;
    private String channel;
    private String text;
    private String parse;
    private Integer linkNames;
    private List<Attachment> attachments;
    private boolean unfurlLinks;
    private boolean unfurlMedia;
    private String username;
    private boolean asUser;
    private boolean mrkdwn;
    private String iconUrl;
    private String iconEmoji;
    private String threadTs;
    private boolean replyBroadcast;

    ChatPostMessageRequest(String token, String channel, String text, String parse, Integer linkNames, List<Attachment> attachments, boolean unfurlLinks, boolean unfurlMedia, String username, boolean asUser, boolean mrkdwn, String iconUrl, String iconEmoji, String threadTs, boolean replyBroadcast) {
        this.token = token;
        this.channel = channel;
        this.text = text;
        this.parse = parse;
        this.linkNames = linkNames;
        this.attachments = attachments;
        this.unfurlLinks = unfurlLinks;
        this.unfurlMedia = unfurlMedia;
        this.username = username;
        this.asUser = asUser;
        this.mrkdwn = mrkdwn;
        this.iconUrl = iconUrl;
        this.iconEmoji = iconEmoji;
        this.threadTs = threadTs;
        this.replyBroadcast = replyBroadcast;
    }

    public static ChatPostMessageRequestBuilder builder() {
        return new ChatPostMessageRequestBuilder();
    }

    public String getToken() {
        return this.token;
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

    public Integer getLinkNames() {
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

    public String getUsername() {
        return this.username;
    }

    public boolean isAsUser() {
        return this.asUser;
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

    public String getThreadTs() {
        return this.threadTs;
    }

    public boolean isReplyBroadcast() {
        return this.replyBroadcast;
    }

    public void setToken(String token) {
        this.token = token;
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

    public void setLinkNames(Integer linkNames) {
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

    public void setUsername(String username) {
        this.username = username;
    }

    public void setAsUser(boolean asUser) {
        this.asUser = asUser;
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

    public void setThreadTs(String threadTs) {
        this.threadTs = threadTs;
    }

    public void setReplyBroadcast(boolean replyBroadcast) {
        this.replyBroadcast = replyBroadcast;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof ChatPostMessageRequest)) return false;
        final ChatPostMessageRequest other = (ChatPostMessageRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$token = this.getToken();
        final Object other$token = other.getToken();
        if (this$token == null ? other$token != null : !this$token.equals(other$token)) return false;
        final Object this$channel = this.getChannel();
        final Object other$channel = other.getChannel();
        if (this$channel == null ? other$channel != null : !this$channel.equals(other$channel)) return false;
        final Object this$text = this.getText();
        final Object other$text = other.getText();
        if (this$text == null ? other$text != null : !this$text.equals(other$text)) return false;
        final Object this$parse = this.getParse();
        final Object other$parse = other.getParse();
        if (this$parse == null ? other$parse != null : !this$parse.equals(other$parse)) return false;
        final Object this$linkNames = this.getLinkNames();
        final Object other$linkNames = other.getLinkNames();
        if (this$linkNames == null ? other$linkNames != null : !this$linkNames.equals(other$linkNames)) return false;
        final Object this$attachments = this.getAttachments();
        final Object other$attachments = other.getAttachments();
        if (this$attachments == null ? other$attachments != null : !this$attachments.equals(other$attachments))
            return false;
        if (this.isUnfurlLinks() != other.isUnfurlLinks()) return false;
        if (this.isUnfurlMedia() != other.isUnfurlMedia()) return false;
        final Object this$username = this.getUsername();
        final Object other$username = other.getUsername();
        if (this$username == null ? other$username != null : !this$username.equals(other$username)) return false;
        if (this.isAsUser() != other.isAsUser()) return false;
        if (this.isMrkdwn() != other.isMrkdwn()) return false;
        final Object this$iconUrl = this.getIconUrl();
        final Object other$iconUrl = other.getIconUrl();
        if (this$iconUrl == null ? other$iconUrl != null : !this$iconUrl.equals(other$iconUrl)) return false;
        final Object this$iconEmoji = this.getIconEmoji();
        final Object other$iconEmoji = other.getIconEmoji();
        if (this$iconEmoji == null ? other$iconEmoji != null : !this$iconEmoji.equals(other$iconEmoji)) return false;
        final Object this$threadTs = this.getThreadTs();
        final Object other$threadTs = other.getThreadTs();
        if (this$threadTs == null ? other$threadTs != null : !this$threadTs.equals(other$threadTs)) return false;
        if (this.isReplyBroadcast() != other.isReplyBroadcast()) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $token = this.getToken();
        result = result * PRIME + ($token == null ? 43 : $token.hashCode());
        final Object $channel = this.getChannel();
        result = result * PRIME + ($channel == null ? 43 : $channel.hashCode());
        final Object $text = this.getText();
        result = result * PRIME + ($text == null ? 43 : $text.hashCode());
        final Object $parse = this.getParse();
        result = result * PRIME + ($parse == null ? 43 : $parse.hashCode());
        final Object $linkNames = this.getLinkNames();
        result = result * PRIME + ($linkNames == null ? 43 : $linkNames.hashCode());
        final Object $attachments = this.getAttachments();
        result = result * PRIME + ($attachments == null ? 43 : $attachments.hashCode());
        result = result * PRIME + (this.isUnfurlLinks() ? 79 : 97);
        result = result * PRIME + (this.isUnfurlMedia() ? 79 : 97);
        final Object $username = this.getUsername();
        result = result * PRIME + ($username == null ? 43 : $username.hashCode());
        result = result * PRIME + (this.isAsUser() ? 79 : 97);
        result = result * PRIME + (this.isMrkdwn() ? 79 : 97);
        final Object $iconUrl = this.getIconUrl();
        result = result * PRIME + ($iconUrl == null ? 43 : $iconUrl.hashCode());
        final Object $iconEmoji = this.getIconEmoji();
        result = result * PRIME + ($iconEmoji == null ? 43 : $iconEmoji.hashCode());
        final Object $threadTs = this.getThreadTs();
        result = result * PRIME + ($threadTs == null ? 43 : $threadTs.hashCode());
        result = result * PRIME + (this.isReplyBroadcast() ? 79 : 97);
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof ChatPostMessageRequest;
    }

    public String toString() {
        return "ChatPostMessageRequest(token=" + this.getToken() + ", channel=" + this.getChannel() + ", text=" + this.getText() + ", parse=" + this.getParse() + ", linkNames=" + this.getLinkNames() + ", attachments=" + this.getAttachments() + ", unfurlLinks=" + this.isUnfurlLinks() + ", unfurlMedia=" + this.isUnfurlMedia() + ", username=" + this.getUsername() + ", asUser=" + this.isAsUser() + ", mrkdwn=" + this.isMrkdwn() + ", iconUrl=" + this.getIconUrl() + ", iconEmoji=" + this.getIconEmoji() + ", threadTs=" + this.getThreadTs() + ", replyBroadcast=" + this.isReplyBroadcast() + ")";
    }

    public static class ChatPostMessageRequestBuilder {
        private String token;
        private String channel;
        private String text;
        private String parse;
        private Integer linkNames;
        private List<Attachment> attachments;
        private boolean unfurlLinks;
        private boolean unfurlMedia;
        private String username;
        private boolean asUser;
        private boolean mrkdwn;
        private String iconUrl;
        private String iconEmoji;
        private String threadTs;
        private boolean replyBroadcast;

        ChatPostMessageRequestBuilder() {
        }

        public ChatPostMessageRequest.ChatPostMessageRequestBuilder token(String token) {
            this.token = token;
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

        public ChatPostMessageRequest.ChatPostMessageRequestBuilder linkNames(Integer linkNames) {
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

        public ChatPostMessageRequest.ChatPostMessageRequestBuilder username(String username) {
            this.username = username;
            return this;
        }

        public ChatPostMessageRequest.ChatPostMessageRequestBuilder asUser(boolean asUser) {
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

        public ChatPostMessageRequest.ChatPostMessageRequestBuilder threadTs(String threadTs) {
            this.threadTs = threadTs;
            return this;
        }

        public ChatPostMessageRequest.ChatPostMessageRequestBuilder replyBroadcast(boolean replyBroadcast) {
            this.replyBroadcast = replyBroadcast;
            return this;
        }

        public ChatPostMessageRequest build() {
            return new ChatPostMessageRequest(token, channel, text, parse, linkNames, attachments, unfurlLinks, unfurlMedia, username, asUser, mrkdwn, iconUrl, iconEmoji, threadTs, replyBroadcast);
        }

        public String toString() {
            return "ChatPostMessageRequest.ChatPostMessageRequestBuilder(token=" + this.token + ", channel=" + this.channel + ", text=" + this.text + ", parse=" + this.parse + ", linkNames=" + this.linkNames + ", attachments=" + this.attachments + ", unfurlLinks=" + this.unfurlLinks + ", unfurlMedia=" + this.unfurlMedia + ", username=" + this.username + ", asUser=" + this.asUser + ", mrkdwn=" + this.mrkdwn + ", iconUrl=" + this.iconUrl + ", iconEmoji=" + this.iconEmoji + ", threadTs=" + this.threadTs + ", replyBroadcast=" + this.replyBroadcast + ")";
        }
    }
}