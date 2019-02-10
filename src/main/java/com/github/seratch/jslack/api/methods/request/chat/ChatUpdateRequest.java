package com.github.seratch.jslack.api.methods.request.chat;

import com.github.seratch.jslack.api.methods.SlackApiRequest;
import com.github.seratch.jslack.api.model.Attachment;

import java.util.List;

public class ChatUpdateRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `chat:write`
     */
    private String token;

    /**
     * Channel, private group, or IM channel to send message to. Can be an encoded ID, or a name.
     */
    private String channel;

    /**
     * Timestamp of the message to be updated.
     */
    private String ts;

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

    ChatUpdateRequest(String token, String channel, String ts, String text, String user, boolean asUser, List<Attachment> attachments, boolean linkNames, String parse) {
        this.token = token;
        this.channel = channel;
        this.ts = ts;
        this.text = text;
        this.user = user;
        this.asUser = asUser;
        this.attachments = attachments;
        this.linkNames = linkNames;
        this.parse = parse;
    }

    public static ChatUpdateRequestBuilder builder() {
        return new ChatUpdateRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public String getChannel() {
        return this.channel;
    }

    public String getTs() {
        return this.ts;
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

    public void setTs(String ts) {
        this.ts = ts;
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
        if (!(o instanceof ChatUpdateRequest)) return false;
        final ChatUpdateRequest other = (ChatUpdateRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$token = this.getToken();
        final Object other$token = other.getToken();
        if (this$token == null ? other$token != null : !this$token.equals(other$token)) return false;
        final Object this$channel = this.getChannel();
        final Object other$channel = other.getChannel();
        if (this$channel == null ? other$channel != null : !this$channel.equals(other$channel)) return false;
        final Object this$ts = this.getTs();
        final Object other$ts = other.getTs();
        if (this$ts == null ? other$ts != null : !this$ts.equals(other$ts)) return false;
        final Object this$text = this.getText();
        final Object other$text = other.getText();
        if (this$text == null ? other$text != null : !this$text.equals(other$text)) return false;
        final Object this$user = this.getUser();
        final Object other$user = other.getUser();
        if (this$user == null ? other$user != null : !this$user.equals(other$user)) return false;
        if (this.isAsUser() != other.isAsUser()) return false;
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
        return other instanceof ChatUpdateRequest;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $token = this.getToken();
        result = result * PRIME + ($token == null ? 43 : $token.hashCode());
        final Object $channel = this.getChannel();
        result = result * PRIME + ($channel == null ? 43 : $channel.hashCode());
        final Object $ts = this.getTs();
        result = result * PRIME + ($ts == null ? 43 : $ts.hashCode());
        final Object $text = this.getText();
        result = result * PRIME + ($text == null ? 43 : $text.hashCode());
        final Object $user = this.getUser();
        result = result * PRIME + ($user == null ? 43 : $user.hashCode());
        result = result * PRIME + (this.isAsUser() ? 79 : 97);
        final Object $attachments = this.getAttachments();
        result = result * PRIME + ($attachments == null ? 43 : $attachments.hashCode());
        result = result * PRIME + (this.isLinkNames() ? 79 : 97);
        final Object $parse = this.getParse();
        result = result * PRIME + ($parse == null ? 43 : $parse.hashCode());
        return result;
    }

    public String toString() {
        return "ChatUpdateRequest(token=" + this.getToken() + ", channel=" + this.getChannel() + ", ts=" + this.getTs() + ", text=" + this.getText() + ", user=" + this.getUser() + ", asUser=" + this.isAsUser() + ", attachments=" + this.getAttachments() + ", linkNames=" + this.isLinkNames() + ", parse=" + this.getParse() + ")";
    }

    public static class ChatUpdateRequestBuilder {
        private String token;
        private String channel;
        private String ts;
        private String text;
        private String user;
        private boolean asUser;
        private List<Attachment> attachments;
        private boolean linkNames;
        private String parse;

        ChatUpdateRequestBuilder() {
        }

        public ChatUpdateRequest.ChatUpdateRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public ChatUpdateRequest.ChatUpdateRequestBuilder channel(String channel) {
            this.channel = channel;
            return this;
        }

        public ChatUpdateRequest.ChatUpdateRequestBuilder ts(String ts) {
            this.ts = ts;
            return this;
        }

        public ChatUpdateRequest.ChatUpdateRequestBuilder text(String text) {
            this.text = text;
            return this;
        }

        public ChatUpdateRequest.ChatUpdateRequestBuilder user(String user) {
            this.user = user;
            return this;
        }

        public ChatUpdateRequest.ChatUpdateRequestBuilder asUser(boolean asUser) {
            this.asUser = asUser;
            return this;
        }

        public ChatUpdateRequest.ChatUpdateRequestBuilder attachments(List<Attachment> attachments) {
            this.attachments = attachments;
            return this;
        }

        public ChatUpdateRequest.ChatUpdateRequestBuilder linkNames(boolean linkNames) {
            this.linkNames = linkNames;
            return this;
        }

        public ChatUpdateRequest.ChatUpdateRequestBuilder parse(String parse) {
            this.parse = parse;
            return this;
        }

        public ChatUpdateRequest build() {
            return new ChatUpdateRequest(token, channel, ts, text, user, asUser, attachments, linkNames, parse);
        }

        public String toString() {
            return "ChatUpdateRequest.ChatUpdateRequestBuilder(token=" + this.token + ", channel=" + this.channel + ", ts=" + this.ts + ", text=" + this.text + ", user=" + this.user + ", asUser=" + this.asUser + ", attachments=" + this.attachments + ", linkNames=" + this.linkNames + ", parse=" + this.parse + ")";
        }
    }
}