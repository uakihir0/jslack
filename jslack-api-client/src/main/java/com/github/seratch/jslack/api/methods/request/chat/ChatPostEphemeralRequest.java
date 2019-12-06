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
     * Find and link channel names and usernames.
     */
    private boolean linkNames;

    /**
     * Change how messages are treated. Defaults to `none`. See [below](#formatting).
     */
    private String parse;

    ChatPostEphemeralRequest(String token, String channel, String text, String user, boolean asUser, List<LayoutBlock> blocks, String blocksAsString, List<Attachment> attachments, String attachmentsAsString, boolean linkNames, String parse) {
        this.token = token;
        this.channel = channel;
        this.text = text;
        this.user = user;
        this.asUser = asUser;
        this.blocks = blocks;
        this.blocksAsString = blocksAsString;
        this.attachments = attachments;
        this.attachmentsAsString = attachmentsAsString;
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

    public String getBlocksAsString() {
        return this.blocksAsString;
    }

    public List<Attachment> getAttachments() {
        return this.attachments;
    }

    public String getAttachmentsAsString() {
        return this.attachmentsAsString;
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

    public void setBlocksAsString(String blocksAsString) {
        this.blocksAsString = blocksAsString;
    }

    public void setAttachments(List<Attachment> attachments) {
        this.attachments = attachments;
    }

    public void setAttachmentsAsString(String attachmentsAsString) {
        this.attachmentsAsString = attachmentsAsString;
    }

    public void setLinkNames(boolean linkNames) {
        this.linkNames = linkNames;
    }

    public void setParse(String parse) {
        this.parse = parse;
    }

    public static class ChatPostEphemeralRequestBuilder {
        private String token;
        private String channel;
        private String text;
        private String user;
        private boolean asUser;
        private List<LayoutBlock> blocks;
        private String blocksAsString;
        private List<Attachment> attachments;
        private String attachmentsAsString;
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

        public ChatPostEphemeralRequest.ChatPostEphemeralRequestBuilder blocksAsString(String blocksAsString) {
            this.blocksAsString = blocksAsString;
            return this;
        }

        public ChatPostEphemeralRequest.ChatPostEphemeralRequestBuilder attachments(List<Attachment> attachments) {
            this.attachments = attachments;
            return this;
        }

        public ChatPostEphemeralRequest.ChatPostEphemeralRequestBuilder attachmentsAsString(String attachmentsAsString) {
            this.attachmentsAsString = attachmentsAsString;
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
            return new ChatPostEphemeralRequest(token, channel, text, user, asUser, blocks, blocksAsString, attachments, attachmentsAsString, linkNames, parse);
        }

        public String toString() {
            return "ChatPostEphemeralRequest.ChatPostEphemeralRequestBuilder(token=" + this.token + ", channel=" + this.channel + ", text=" + this.text + ", user=" + this.user + ", asUser=" + this.asUser + ", blocks=" + this.blocks + ", blocksAsString=" + this.blocksAsString + ", attachments=" + this.attachments + ", attachmentsAsString=" + this.attachmentsAsString + ", linkNames=" + this.linkNames + ", parse=" + this.parse + ")";
        }
    }
}