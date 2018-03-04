package com.github.seratch.jslack.api.methods.request.chat;

import com.github.seratch.jslack.api.methods.SlackApiRequest;
import com.github.seratch.jslack.api.model.Attachment;

import java.util.List;

public class ChatUpdateRequest implements SlackApiRequest {

    private String token;
    private String ts;
    private String channel;
    private String text;
    private List<Attachment> attachments;
    private String parse;
    private Integer linkNames;
    private boolean asUser;

    @java.beans.ConstructorProperties({"token", "ts", "channel", "text", "attachments", "parse", "linkNames", "asUser"})
    ChatUpdateRequest(String token, String ts, String channel, String text, List<Attachment> attachments, String parse, Integer linkNames, boolean asUser) {
        this.token = token;
        this.ts = ts;
        this.channel = channel;
        this.text = text;
        this.attachments = attachments;
        this.parse = parse;
        this.linkNames = linkNames;
        this.asUser = asUser;
    }

    public static ChatUpdateRequestBuilder builder() {
        return new ChatUpdateRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public String getTs() {
        return this.ts;
    }

    public String getChannel() {
        return this.channel;
    }

    public String getText() {
        return this.text;
    }

    public List<Attachment> getAttachments() {
        return this.attachments;
    }

    public String getParse() {
        return this.parse;
    }

    public Integer getLinkNames() {
        return this.linkNames;
    }

    public boolean isAsUser() {
        return this.asUser;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setTs(String ts) {
        this.ts = ts;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setAttachments(List<Attachment> attachments) {
        this.attachments = attachments;
    }

    public void setParse(String parse) {
        this.parse = parse;
    }

    public void setLinkNames(Integer linkNames) {
        this.linkNames = linkNames;
    }

    public void setAsUser(boolean asUser) {
        this.asUser = asUser;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof ChatUpdateRequest)) return false;
        final ChatUpdateRequest other = (ChatUpdateRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$token = this.getToken();
        final Object other$token = other.getToken();
        if (this$token == null ? other$token != null : !this$token.equals(other$token)) return false;
        final Object this$ts = this.getTs();
        final Object other$ts = other.getTs();
        if (this$ts == null ? other$ts != null : !this$ts.equals(other$ts)) return false;
        final Object this$channel = this.getChannel();
        final Object other$channel = other.getChannel();
        if (this$channel == null ? other$channel != null : !this$channel.equals(other$channel)) return false;
        final Object this$text = this.getText();
        final Object other$text = other.getText();
        if (this$text == null ? other$text != null : !this$text.equals(other$text)) return false;
        final Object this$attachments = this.getAttachments();
        final Object other$attachments = other.getAttachments();
        if (this$attachments == null ? other$attachments != null : !this$attachments.equals(other$attachments))
            return false;
        final Object this$parse = this.getParse();
        final Object other$parse = other.getParse();
        if (this$parse == null ? other$parse != null : !this$parse.equals(other$parse)) return false;
        final Object this$linkNames = this.getLinkNames();
        final Object other$linkNames = other.getLinkNames();
        if (this$linkNames == null ? other$linkNames != null : !this$linkNames.equals(other$linkNames)) return false;
        if (this.isAsUser() != other.isAsUser()) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $token = this.getToken();
        result = result * PRIME + ($token == null ? 43 : $token.hashCode());
        final Object $ts = this.getTs();
        result = result * PRIME + ($ts == null ? 43 : $ts.hashCode());
        final Object $channel = this.getChannel();
        result = result * PRIME + ($channel == null ? 43 : $channel.hashCode());
        final Object $text = this.getText();
        result = result * PRIME + ($text == null ? 43 : $text.hashCode());
        final Object $attachments = this.getAttachments();
        result = result * PRIME + ($attachments == null ? 43 : $attachments.hashCode());
        final Object $parse = this.getParse();
        result = result * PRIME + ($parse == null ? 43 : $parse.hashCode());
        final Object $linkNames = this.getLinkNames();
        result = result * PRIME + ($linkNames == null ? 43 : $linkNames.hashCode());
        result = result * PRIME + (this.isAsUser() ? 79 : 97);
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof ChatUpdateRequest;
    }

    public String toString() {
        return "ChatUpdateRequest(token=" + this.getToken() + ", ts=" + this.getTs() + ", channel=" + this.getChannel() + ", text=" + this.getText() + ", attachments=" + this.getAttachments() + ", parse=" + this.getParse() + ", linkNames=" + this.getLinkNames() + ", asUser=" + this.isAsUser() + ")";
    }

    public static class ChatUpdateRequestBuilder {
        private String token;
        private String ts;
        private String channel;
        private String text;
        private List<Attachment> attachments;
        private String parse;
        private Integer linkNames;
        private boolean asUser;

        ChatUpdateRequestBuilder() {
        }

        public ChatUpdateRequest.ChatUpdateRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public ChatUpdateRequest.ChatUpdateRequestBuilder ts(String ts) {
            this.ts = ts;
            return this;
        }

        public ChatUpdateRequest.ChatUpdateRequestBuilder channel(String channel) {
            this.channel = channel;
            return this;
        }

        public ChatUpdateRequest.ChatUpdateRequestBuilder text(String text) {
            this.text = text;
            return this;
        }

        public ChatUpdateRequest.ChatUpdateRequestBuilder attachments(List<Attachment> attachments) {
            this.attachments = attachments;
            return this;
        }

        public ChatUpdateRequest.ChatUpdateRequestBuilder parse(String parse) {
            this.parse = parse;
            return this;
        }

        public ChatUpdateRequest.ChatUpdateRequestBuilder linkNames(Integer linkNames) {
            this.linkNames = linkNames;
            return this;
        }

        public ChatUpdateRequest.ChatUpdateRequestBuilder asUser(boolean asUser) {
            this.asUser = asUser;
            return this;
        }

        public ChatUpdateRequest build() {
            return new ChatUpdateRequest(token, ts, channel, text, attachments, parse, linkNames, asUser);
        }

        public String toString() {
            return "ChatUpdateRequest.ChatUpdateRequestBuilder(token=" + this.token + ", ts=" + this.ts + ", channel=" + this.channel + ", text=" + this.text + ", attachments=" + this.attachments + ", parse=" + this.parse + ", linkNames=" + this.linkNames + ", asUser=" + this.asUser + ")";
        }
    }
}