package com.github.seratch.jslack.api.webhook;

import com.github.seratch.jslack.api.model.Attachment;

import java.util.ArrayList;
import java.util.List;

/**
 * https://api.slack.com/incoming-webhooks
 */
public class Payload {

    /**
     * The first step is to prepare this message as a key/value pair in JSON.
     * For a simple message, your JSON payload only needs to define a text property, containing the text that will be posted to the channel.
     */
    private String text;

    /**
     * Incoming webhooks output to a default channel and can only send messages to a single channel at a time.
     * You can override a custom integration's configured channel by specifying the channel field in your JSON payload.
     * <p>
     * Specify a Slack channel by name with "channel": "#other-channel", or send a Slackbot message to a specific user with "channel": "@username".
     */
    private String channel;

    /**
     * Incoming webhooks originate from a default identity you configured when originally creating your webhook.
     * You can override a custom integration's configured name with the username field in your JSON payload.
     */
    private String username;

    /**
     * You can also override the bot icon either with icon_url or icon_emoji.
     */
    private String iconUrl;
    /**
     * You can also override the bot icon either with icon_url or icon_emoji.
     */
    private String iconEmoji;

    /**
     * You can use Slack's standard message markup to add simple formatting to your messages.
     * You can also use message attachments to display richly-formatted message blocks.
     */
    private List<Attachment> attachments = new ArrayList<>();

    @java.beans.ConstructorProperties({"text", "channel", "username", "iconUrl", "iconEmoji", "attachments"})
    Payload(String text, String channel, String username, String iconUrl, String iconEmoji, List<Attachment> attachments) {
        this.text = text;
        this.channel = channel;
        this.username = username;
        this.iconUrl = iconUrl;
        this.iconEmoji = iconEmoji;
        this.attachments = attachments;
    }

    public static PayloadBuilder builder() {
        return new PayloadBuilder();
    }

    public String getText() {
        return this.text;
    }

    public String getChannel() {
        return this.channel;
    }

    public String getUsername() {
        return this.username;
    }

    public String getIconUrl() {
        return this.iconUrl;
    }

    public String getIconEmoji() {
        return this.iconEmoji;
    }

    public List<Attachment> getAttachments() {
        return this.attachments;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public void setIconEmoji(String iconEmoji) {
        this.iconEmoji = iconEmoji;
    }

    public void setAttachments(List<Attachment> attachments) {
        this.attachments = attachments;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Payload)) return false;
        final Payload other = (Payload) o;
        if (!other.canEqual((Object) this)) return false;
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
        final Object this$attachments = this.getAttachments();
        final Object other$attachments = other.getAttachments();
        if (this$attachments == null ? other$attachments != null : !this$attachments.equals(other$attachments))
            return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
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
        final Object $attachments = this.getAttachments();
        result = result * PRIME + ($attachments == null ? 43 : $attachments.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof Payload;
    }

    public String toString() {
        return "Payload(text=" + this.getText() + ", channel=" + this.getChannel() + ", username=" + this.getUsername() + ", iconUrl=" + this.getIconUrl() + ", iconEmoji=" + this.getIconEmoji() + ", attachments=" + this.getAttachments() + ")";
    }

    public static class PayloadBuilder {
        private String text;
        private String channel;
        private String username;
        private String iconUrl;
        private String iconEmoji;
        private List<Attachment> attachments;

        PayloadBuilder() {
        }

        public Payload.PayloadBuilder text(String text) {
            this.text = text;
            return this;
        }

        public Payload.PayloadBuilder channel(String channel) {
            this.channel = channel;
            return this;
        }

        public Payload.PayloadBuilder username(String username) {
            this.username = username;
            return this;
        }

        public Payload.PayloadBuilder iconUrl(String iconUrl) {
            this.iconUrl = iconUrl;
            return this;
        }

        public Payload.PayloadBuilder iconEmoji(String iconEmoji) {
            this.iconEmoji = iconEmoji;
            return this;
        }

        public Payload.PayloadBuilder attachments(List<Attachment> attachments) {
            this.attachments = attachments;
            return this;
        }

        public Payload build() {
            return new Payload(text, channel, username, iconUrl, iconEmoji, attachments);
        }

        public String toString() {
            return "Payload.PayloadBuilder(text=" + this.text + ", channel=" + this.channel + ", username=" + this.username + ", iconUrl=" + this.iconUrl + ", iconEmoji=" + this.iconEmoji + ", attachments=" + this.attachments + ")";
        }
    }
}
