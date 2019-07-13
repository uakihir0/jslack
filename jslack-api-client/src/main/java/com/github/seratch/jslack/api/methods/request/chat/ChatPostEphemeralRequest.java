package com.github.seratch.jslack.api.methods.request.chat;

import com.github.seratch.jslack.api.methods.SlackApiRequest;
import com.github.seratch.jslack.api.model.Attachment;
import com.github.seratch.jslack.api.model.block.LayoutBlock;

import java.util.List;

public class ChatPostEphemeralRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `chat:write`
     */
    private String token;

    /**
     * Channel, private group, or IM channel to send message to. Can be an encoded ID, or a name.
     */
    private String channel;

    /**
     * Text of the message to send.
     * See below for an explanation of [formatting](#formatting).
     * This field is usually required, unless you're providing only `attachments` instead.
     */
    private String text;

    /**
     * `id` of the user who will receive the ephemeral message. The user should be in the channel specified by the `channel` argument.
     */
    private String user;

    /**
     * Pass true to post the message as the authed bot. Defaults to false.
     */
    private boolean asUser;

    /**
     * A JSON-based array of structured blocks, presented as a URL-encoded string.
     */
    private List<LayoutBlock> blocks;

    /**
     * A JSON-based array of structured attachments, presented as a URL-encoded string.
     */
    private List<Attachment> attachments;

    /**
     * Find and link channel names and usernames.
     */
    private boolean linkNames;

    /**
     * Change how messages are treated. Defaults to `none`. See [below](#formatting).
     */
    private String parse;

    ChatPostEphemeralRequest(String token, String channel, String text, String user, boolean asUser, List<LayoutBlock> blocks, List<Attachment> attachments, boolean linkNames, String parse) {
        this.token = token;
        this.channel = channel;
        this.text = text;
        this.user = user;
        this.asUser = asUser;
        this.blocks = blocks;
        this.attachments = attachments;
        this.linkNames = linkNames;
        this.parse = parse;
    }

    public static ChatPostEphemeralRequestBuilder builder() {
        return new ChatPostEphemeralRequestBuilder();
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

    public String getUser() {
        return this.user;
    }

    public boolean isAsUser() {
        return this.asUser;
    }

    public List<LayoutBlock> getBlocks() {
        return this.blocks;
    }

    public List<Attachment> getAttachments() {
        return this.attachments;
    }

    public boolean isLinkNames() {
        return this.linkNames;
    }

    public String getParse() {
        return this.parse;
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

    public void setUser(String user) {
        this.user = user;
    }

    public void setAsUser(boolean asUser) {
        this.asUser = asUser;
    }

    public void setBlocks(List<LayoutBlock> blocks) {
        this.blocks = blocks;
    }

    public void setAttachments(List<Attachment> attachments) {
        this.attachments = attachments;
    }

    public void setLinkNames(boolean linkNames) {
        this.linkNames = linkNames;
    }

    public void setParse(String parse) {
        this.parse = parse;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ChatPostEphemeralRequest)) return false;
        final ChatPostEphemeralRequest other = (ChatPostEphemeralRequest) o;
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
        final Object this$user = this.getUser();
        final Object other$user = other.getUser();
        if (this$user == null ? other$user != null : !this$user.equals(other$user)) return false;
        if (this.isAsUser() != other.isAsUser()) return false;
        final Object this$blocks = this.getBlocks();
        final Object other$blocks = other.getBlocks();
        if (this$blocks == null ? other$blocks != null : !this$blocks.equals(other$blocks)) return false;
        final Object this$attachments = this.getAttachments();
        final Object other$attachments = other.getAttachments();
        if (this$attachments == null ? other$attachments != null : !this$attachments.equals(other$attachments))
            return false;
        if (this.isLinkNames() != other.isLinkNames()) return false;
        final Object this$parse = this.getParse();
        final Object other$parse = other.getParse();
        if (this$parse == null ? other$parse != null : !this$parse.equals(other$parse)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ChatPostEphemeralRequest;
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
        final Object $user = this.getUser();
        result = result * PRIME + ($user == null ? 43 : $user.hashCode());
        result = result * PRIME + (this.isAsUser() ? 79 : 97);
        final Object $blocks = this.getBlocks();
        result = result * PRIME + ($blocks == null ? 43 : $blocks.hashCode());
        final Object $attachments = this.getAttachments();
        result = result * PRIME + ($attachments == null ? 43 : $attachments.hashCode());
        result = result * PRIME + (this.isLinkNames() ? 79 : 97);
        final Object $parse = this.getParse();
        result = result * PRIME + ($parse == null ? 43 : $parse.hashCode());
        return result;
    }

    public String toString() {
        return "ChatPostEphemeralRequest(token=" + this.getToken() + ", channel=" + this.getChannel() + ", text=" + this.getText() + ", user=" + this.getUser() + ", asUser=" + this.isAsUser() + ", blocks=" + this.getBlocks() + ", attachments=" + this.getAttachments() + ", linkNames=" + this.isLinkNames() + ", parse=" + this.getParse() + ")";
    }

    public static class ChatPostEphemeralRequestBuilder {
        private String token;
        private String channel;
        private String text;
        private String user;
        private boolean asUser;
        private List<LayoutBlock> blocks;
        private List<Attachment> attachments;
        private boolean linkNames;
        private String parse;

        ChatPostEphemeralRequestBuilder() {
        }

        public ChatPostEphemeralRequest.ChatPostEphemeralRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public ChatPostEphemeralRequest.ChatPostEphemeralRequestBuilder channel(String channel) {
            this.channel = channel;
            return this;
        }

        public ChatPostEphemeralRequest.ChatPostEphemeralRequestBuilder text(String text) {
            this.text = text;
            return this;
        }

        public ChatPostEphemeralRequest.ChatPostEphemeralRequestBuilder user(String user) {
            this.user = user;
            return this;
        }

        public ChatPostEphemeralRequest.ChatPostEphemeralRequestBuilder asUser(boolean asUser) {
            this.asUser = asUser;
            return this;
        }

        public ChatPostEphemeralRequest.ChatPostEphemeralRequestBuilder blocks(List<LayoutBlock> blocks) {
            this.blocks = blocks;
            return this;
        }

        public ChatPostEphemeralRequest.ChatPostEphemeralRequestBuilder attachments(List<Attachment> attachments) {
            this.attachments = attachments;
            return this;
        }

        public ChatPostEphemeralRequest.ChatPostEphemeralRequestBuilder linkNames(boolean linkNames) {
            this.linkNames = linkNames;
            return this;
        }

        public ChatPostEphemeralRequest.ChatPostEphemeralRequestBuilder parse(String parse) {
            this.parse = parse;
            return this;
        }

        public ChatPostEphemeralRequest build() {
            return new ChatPostEphemeralRequest(token, channel, text, user, asUser, blocks, attachments, linkNames, parse);
        }

        public String toString() {
            return "ChatPostEphemeralRequest.ChatPostEphemeralRequestBuilder(token=" + this.token + ", channel=" + this.channel + ", text=" + this.text + ", user=" + this.user + ", asUser=" + this.asUser + ", blocks=" + this.blocks + ", attachments=" + this.attachments + ", linkNames=" + this.linkNames + ", parse=" + this.parse + ")";
        }
    }
}