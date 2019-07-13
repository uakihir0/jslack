package com.github.seratch.jslack.api.webhook;

import com.github.seratch.jslack.api.model.Attachment;
import com.github.seratch.jslack.api.model.block.LayoutBlock;

import java.util.List;

/**
 * https://api.slack.com/incoming-webhooks
 * <p>
 * Implementation of <a href="https://api.slack.com/reference/messaging/payload">RTMMessage Payloads</a>
 */
public class Payload {

    /**
     * You can add the thread_ts parameter to your POST request
     * in order to make your message appear as a reply in a thread.
     */
    private String threadTs;

    /**
     * The first step is to prepare this message as a key/value pair in JSON.
     * For a simple message, your JSON payload only needs to define a text property, containing the text that will be posted to the channel.
     */
    private String text;

    /**
     * NOTE: No longer works if your webhook is managed in a Slack app
     * <p>
     * Incoming webhooks output to a default channel and can only send messages to a single channel at a time.
     * You can override a custom integration's configured channel by specifying the channel field in your JSON payload.
     * <p>
     * Specify a Slack channel by name with "channel": "#other-channel", or send a Slackbot message to a specific user with "channel": "@username".
     */
    @Deprecated
    private String channel;

    /**
     * NOTE: No longer works if your webhook is managed in a Slack app
     * <p>
     * Incoming webhooks originate from a default identity you configured when originally creating your webhook.
     * You can override a custom integration's configured name with the username field in your JSON payload.
     */
    @Deprecated
    private String username;

    /**
     * NOTE: No longer works if your webhook is managed in a Slack app
     * <p>
     * You can also override the bot icon either with icon_url or icon_emoji.
     */
    @Deprecated
    private String iconUrl;
    /**
     * NOTE: No longer works if your webhook is managed in a Slack app
     * <p>
     * You can also override the bot icon either with icon_url or icon_emoji.
     */
    @Deprecated
    private String iconEmoji;

    /**
     * An array of {@link LayoutBlock layout blocks} in the same format as described in the
     * <a href="https://api.slack.com/messaging/composing/layouts#getting-started">layout block guide</a>.
     */
    private List<LayoutBlock> blocks;

    /**
     * An array of legacy secondary attachments. We recommend you use {@link #blocks} instead.
     */
    private List<Attachment> attachments;

    Payload(String threadTs, String text, String channel, String username, String iconUrl, String iconEmoji, List<LayoutBlock> blocks, List<Attachment> attachments) {
        this.threadTs = threadTs;
        this.text = text;
        this.channel = channel;
        this.username = username;
        this.iconUrl = iconUrl;
        this.iconEmoji = iconEmoji;
        this.blocks = blocks;
        this.attachments = attachments;
    }

    public static PayloadBuilder builder() {
        return new PayloadBuilder();
    }

    public String getThreadTs() {
        return this.threadTs;
    }

    public String getText() {
        return this.text;
    }

    @Deprecated
    public String getChannel() {
        return this.channel;
    }

    @Deprecated
    public String getUsername() {
        return this.username;
    }

    @Deprecated
    public String getIconUrl() {
        return this.iconUrl;
    }

    @Deprecated
    public String getIconEmoji() {
        return this.iconEmoji;
    }

    public List<LayoutBlock> getBlocks() {
        return this.blocks;
    }

    public List<Attachment> getAttachments() {
        return this.attachments;
    }

    public void setThreadTs(String threadTs) {
        this.threadTs = threadTs;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Deprecated
    public void setChannel(String channel) {
        this.channel = channel;
    }

    @Deprecated
    public void setUsername(String username) {
        this.username = username;
    }

    @Deprecated
    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    @Deprecated
    public void setIconEmoji(String iconEmoji) {
        this.iconEmoji = iconEmoji;
    }

    public void setBlocks(List<LayoutBlock> blocks) {
        this.blocks = blocks;
    }

    public void setAttachments(List<Attachment> attachments) {
        this.attachments = attachments;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Payload)) return false;
        final Payload other = (Payload) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$threadTs = this.getThreadTs();
        final Object other$threadTs = other.getThreadTs();
        if (this$threadTs == null ? other$threadTs != null : !this$threadTs.equals(other$threadTs)) return false;
        final Object this$text = this.getText();
        final Object other$text = other.getText();
        if (this$text == null ? other$text != null : !this$text.equals(other$text)) return false;
        final Object this$channel = this.getChannel();
        final Object other$channel = other.getChannel();
        if (this$channel == null ? other$channel != null : !this$channel.equals(other$channel)) return false;
        final Object this$username = this.getUsername();
        final Object other$username = other.getUsername();
        if (this$username == null ? other$username != null : !this$username.equals(other$username)) return false;
        final Object this$iconUrl = this.getIconUrl();
        final Object other$iconUrl = other.getIconUrl();
        if (this$iconUrl == null ? other$iconUrl != null : !this$iconUrl.equals(other$iconUrl)) return false;
        final Object this$iconEmoji = this.getIconEmoji();
        final Object other$iconEmoji = other.getIconEmoji();
        if (this$iconEmoji == null ? other$iconEmoji != null : !this$iconEmoji.equals(other$iconEmoji)) return false;
        final Object this$blocks = this.getBlocks();
        final Object other$blocks = other.getBlocks();
        if (this$blocks == null ? other$blocks != null : !this$blocks.equals(other$blocks)) return false;
        final Object this$attachments = this.getAttachments();
        final Object other$attachments = other.getAttachments();
        if (this$attachments == null ? other$attachments != null : !this$attachments.equals(other$attachments))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Payload;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $threadTs = this.getThreadTs();
        result = result * PRIME + ($threadTs == null ? 43 : $threadTs.hashCode());
        final Object $text = this.getText();
        result = result * PRIME + ($text == null ? 43 : $text.hashCode());
        final Object $channel = this.getChannel();
        result = result * PRIME + ($channel == null ? 43 : $channel.hashCode());
        final Object $username = this.getUsername();
        result = result * PRIME + ($username == null ? 43 : $username.hashCode());
        final Object $iconUrl = this.getIconUrl();
        result = result * PRIME + ($iconUrl == null ? 43 : $iconUrl.hashCode());
        final Object $iconEmoji = this.getIconEmoji();
        result = result * PRIME + ($iconEmoji == null ? 43 : $iconEmoji.hashCode());
        final Object $blocks = this.getBlocks();
        result = result * PRIME + ($blocks == null ? 43 : $blocks.hashCode());
        final Object $attachments = this.getAttachments();
        result = result * PRIME + ($attachments == null ? 43 : $attachments.hashCode());
        return result;
    }

    public String toString() {
        return "Payload(threadTs=" + this.getThreadTs() + ", text=" + this.getText() + ", channel=" + this.getChannel() + ", username=" + this.getUsername() + ", iconUrl=" + this.getIconUrl() + ", iconEmoji=" + this.getIconEmoji() + ", blocks=" + this.getBlocks() + ", attachments=" + this.getAttachments() + ")";
    }

    public static class PayloadBuilder {
        private String threadTs;
        private String text;
        private String channel;
        private String username;
        private String iconUrl;
        private String iconEmoji;
        private List<LayoutBlock> blocks;
        private List<Attachment> attachments;

        PayloadBuilder() {
        }

        public Payload.PayloadBuilder threadTs(String threadTs) {
            this.threadTs = threadTs;
            return this;
        }

        public Payload.PayloadBuilder text(String text) {
            this.text = text;
            return this;
        }

        @Deprecated
        public Payload.PayloadBuilder channel(String channel) {
            this.channel = channel;
            return this;
        }

        @Deprecated
        public Payload.PayloadBuilder username(String username) {
            this.username = username;
            return this;
        }

        @Deprecated
        public Payload.PayloadBuilder iconUrl(String iconUrl) {
            this.iconUrl = iconUrl;
            return this;
        }

        @Deprecated
        public Payload.PayloadBuilder iconEmoji(String iconEmoji) {
            this.iconEmoji = iconEmoji;
            return this;
        }

        public Payload.PayloadBuilder blocks(List<LayoutBlock> blocks) {
            this.blocks = blocks;
            return this;
        }

        public Payload.PayloadBuilder attachments(List<Attachment> attachments) {
            this.attachments = attachments;
            return this;
        }

        public Payload build() {
            return new Payload(threadTs, text, channel, username, iconUrl, iconEmoji, blocks, attachments);
        }

        public String toString() {
            return "Payload.PayloadBuilder(threadTs=" + this.threadTs + ", text=" + this.text + ", channel=" + this.channel + ", username=" + this.username + ", iconUrl=" + this.iconUrl + ", iconEmoji=" + this.iconEmoji + ", blocks=" + this.blocks + ", attachments=" + this.attachments + ")";
        }
    }
}
