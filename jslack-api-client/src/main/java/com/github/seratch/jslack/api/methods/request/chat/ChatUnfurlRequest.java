package com.github.seratch.jslack.api.methods.request.chat;

import com.github.seratch.jslack.api.methods.SlackApiRequest;
import com.github.seratch.jslack.api.model.Action;
import com.github.seratch.jslack.api.model.block.LayoutBlock;

import java.util.List;
import java.util.Map;

/**
 * Provide custom unfurl behavior for user-posted URLs
 */
public class ChatUnfurlRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `links:write`
     */
    private String token;

    /**
     * Provide a simply-formatted string to send as an ephemeral message to the user
     * as invitation to authenticate further and enable full unfurling behavior
     */
    private String userAuthMessage;

    /**
     * Set to `true` or `1` to indicate the user must install your Slack app to trigger unfurls for this domain
     */
    private boolean userAuthRequired;

    /**
     * URL-encoded JSON map with keys set to URLs featured in the the message, pointing to their unfurl message attachments.
     */
    private String rawUnfurls;

    private Map<String, UnfurlDetail> unfurls;

    /**
     * Timestamp of the message to add unfurl behavior to.
     */
    private String ts;

    /**
     * Send users to this custom URL where they will complete authentication in your app to fully trigger unfurling.
     * Value should be properly URL-encoded.
     */
    private String userAuthUrl;

    /**
     * Channel ID of the message
     */
    private String channel;

    ChatUnfurlRequest(String token, String userAuthMessage, boolean userAuthRequired, String rawUnfurls, Map<String, UnfurlDetail> unfurls, String ts, String userAuthUrl, String channel) {
        this.token = token;
        this.userAuthMessage = userAuthMessage;
        this.userAuthRequired = userAuthRequired;
        this.rawUnfurls = rawUnfurls;
        this.unfurls = unfurls;
        this.ts = ts;
        this.userAuthUrl = userAuthUrl;
        this.channel = channel;
    }

    public static ChatUnfurlRequestBuilder builder() {
        return new ChatUnfurlRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public String getUserAuthMessage() {
        return this.userAuthMessage;
    }

    public boolean isUserAuthRequired() {
        return this.userAuthRequired;
    }

    public String getRawUnfurls() {
        return this.rawUnfurls;
    }

    public Map<String, UnfurlDetail> getUnfurls() {
        return this.unfurls;
    }

    public String getTs() {
        return this.ts;
    }

    public String getUserAuthUrl() {
        return this.userAuthUrl;
    }

    public String getChannel() {
        return this.channel;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setUserAuthMessage(String userAuthMessage) {
        this.userAuthMessage = userAuthMessage;
    }

    public void setUserAuthRequired(boolean userAuthRequired) {
        this.userAuthRequired = userAuthRequired;
    }

    public void setRawUnfurls(String rawUnfurls) {
        this.rawUnfurls = rawUnfurls;
    }

    public void setUnfurls(Map<String, UnfurlDetail> unfurls) {
        this.unfurls = unfurls;
    }

    public void setTs(String ts) {
        this.ts = ts;
    }

    public void setUserAuthUrl(String userAuthUrl) {
        this.userAuthUrl = userAuthUrl;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ChatUnfurlRequest)) return false;
        final ChatUnfurlRequest other = (ChatUnfurlRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$token = this.getToken();
        final Object other$token = other.getToken();
        if (this$token == null ? other$token != null : !this$token.equals(other$token)) return false;
        final Object this$userAuthMessage = this.getUserAuthMessage();
        final Object other$userAuthMessage = other.getUserAuthMessage();
        if (this$userAuthMessage == null ? other$userAuthMessage != null : !this$userAuthMessage.equals(other$userAuthMessage))
            return false;
        if (this.isUserAuthRequired() != other.isUserAuthRequired()) return false;
        final Object this$rawUnfurls = this.getRawUnfurls();
        final Object other$rawUnfurls = other.getRawUnfurls();
        if (this$rawUnfurls == null ? other$rawUnfurls != null : !this$rawUnfurls.equals(other$rawUnfurls))
            return false;
        final Object this$unfurls = this.getUnfurls();
        final Object other$unfurls = other.getUnfurls();
        if (this$unfurls == null ? other$unfurls != null : !this$unfurls.equals(other$unfurls)) return false;
        final Object this$ts = this.getTs();
        final Object other$ts = other.getTs();
        if (this$ts == null ? other$ts != null : !this$ts.equals(other$ts)) return false;
        final Object this$userAuthUrl = this.getUserAuthUrl();
        final Object other$userAuthUrl = other.getUserAuthUrl();
        if (this$userAuthUrl == null ? other$userAuthUrl != null : !this$userAuthUrl.equals(other$userAuthUrl))
            return false;
        final Object this$channel = this.getChannel();
        final Object other$channel = other.getChannel();
        if (this$channel == null ? other$channel != null : !this$channel.equals(other$channel)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ChatUnfurlRequest;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $token = this.getToken();
        result = result * PRIME + ($token == null ? 43 : $token.hashCode());
        final Object $userAuthMessage = this.getUserAuthMessage();
        result = result * PRIME + ($userAuthMessage == null ? 43 : $userAuthMessage.hashCode());
        result = result * PRIME + (this.isUserAuthRequired() ? 79 : 97);
        final Object $rawUnfurls = this.getRawUnfurls();
        result = result * PRIME + ($rawUnfurls == null ? 43 : $rawUnfurls.hashCode());
        final Object $unfurls = this.getUnfurls();
        result = result * PRIME + ($unfurls == null ? 43 : $unfurls.hashCode());
        final Object $ts = this.getTs();
        result = result * PRIME + ($ts == null ? 43 : $ts.hashCode());
        final Object $userAuthUrl = this.getUserAuthUrl();
        result = result * PRIME + ($userAuthUrl == null ? 43 : $userAuthUrl.hashCode());
        final Object $channel = this.getChannel();
        result = result * PRIME + ($channel == null ? 43 : $channel.hashCode());
        return result;
    }

    public String toString() {
        return "ChatUnfurlRequest(token=" + this.getToken() + ", userAuthMessage=" + this.getUserAuthMessage() + ", userAuthRequired=" + this.isUserAuthRequired() + ", rawUnfurls=" + this.getRawUnfurls() + ", unfurls=" + this.getUnfurls() + ", ts=" + this.getTs() + ", userAuthUrl=" + this.getUserAuthUrl() + ", channel=" + this.getChannel() + ")";
    }


    // https://api.slack.com/docs/message-link-unfurling#unfurls_parameter
    public static class UnfurlDetail {
        private String title;
        private String text;
        private String callbackId;
        private String attachmentType;
        private String fallback;
        private List<Action> actions;

        private List<LayoutBlock> blocks;

        public UnfurlDetail() {
        }

        public String getTitle() {
            return this.title;
        }

        public String getText() {
            return this.text;
        }

        public String getCallbackId() {
            return this.callbackId;
        }

        public String getAttachmentType() {
            return this.attachmentType;
        }

        public String getFallback() {
            return this.fallback;
        }

        public List<Action> getActions() {
            return this.actions;
        }

        public List<LayoutBlock> getBlocks() {
            return this.blocks;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public void setText(String text) {
            this.text = text;
        }

        public void setCallbackId(String callbackId) {
            this.callbackId = callbackId;
        }

        public void setAttachmentType(String attachmentType) {
            this.attachmentType = attachmentType;
        }

        public void setFallback(String fallback) {
            this.fallback = fallback;
        }

        public void setActions(List<Action> actions) {
            this.actions = actions;
        }

        public void setBlocks(List<LayoutBlock> blocks) {
            this.blocks = blocks;
        }

        public boolean equals(final Object o) {
            if (o == this) return true;
            if (!(o instanceof UnfurlDetail))
                return false;
            final UnfurlDetail other = (UnfurlDetail) o;
            if (!other.canEqual((Object) this)) return false;
            final Object this$title = this.getTitle();
            final Object other$title = other.getTitle();
            if (this$title == null ? other$title != null : !this$title.equals(other$title)) return false;
            final Object this$text = this.getText();
            final Object other$text = other.getText();
            if (this$text == null ? other$text != null : !this$text.equals(other$text)) return false;
            final Object this$callbackId = this.getCallbackId();
            final Object other$callbackId = other.getCallbackId();
            if (this$callbackId == null ? other$callbackId != null : !this$callbackId.equals(other$callbackId))
                return false;
            final Object this$attachmentType = this.getAttachmentType();
            final Object other$attachmentType = other.getAttachmentType();
            if (this$attachmentType == null ? other$attachmentType != null : !this$attachmentType.equals(other$attachmentType))
                return false;
            final Object this$fallback = this.getFallback();
            final Object other$fallback = other.getFallback();
            if (this$fallback == null ? other$fallback != null : !this$fallback.equals(other$fallback)) return false;
            final Object this$actions = this.getActions();
            final Object other$actions = other.getActions();
            if (this$actions == null ? other$actions != null : !this$actions.equals(other$actions)) return false;
            final Object this$blocks = this.getBlocks();
            final Object other$blocks = other.getBlocks();
            if (this$blocks == null ? other$blocks != null : !this$blocks.equals(other$blocks)) return false;
            return true;
        }

        protected boolean canEqual(final Object other) {
            return other instanceof UnfurlDetail;
        }

        public int hashCode() {
            final int PRIME = 59;
            int result = 1;
            final Object $title = this.getTitle();
            result = result * PRIME + ($title == null ? 43 : $title.hashCode());
            final Object $text = this.getText();
            result = result * PRIME + ($text == null ? 43 : $text.hashCode());
            final Object $callbackId = this.getCallbackId();
            result = result * PRIME + ($callbackId == null ? 43 : $callbackId.hashCode());
            final Object $attachmentType = this.getAttachmentType();
            result = result * PRIME + ($attachmentType == null ? 43 : $attachmentType.hashCode());
            final Object $fallback = this.getFallback();
            result = result * PRIME + ($fallback == null ? 43 : $fallback.hashCode());
            final Object $actions = this.getActions();
            result = result * PRIME + ($actions == null ? 43 : $actions.hashCode());
            final Object $blocks = this.getBlocks();
            result = result * PRIME + ($blocks == null ? 43 : $blocks.hashCode());
            return result;
        }

        public String toString() {
            return "ChatUnfurlRequest.UnfurlDetail(title=" + this.getTitle() + ", text=" + this.getText() + ", callbackId=" + this.getCallbackId() + ", attachmentType=" + this.getAttachmentType() + ", fallback=" + this.getFallback() + ", actions=" + this.getActions() + ", blocks=" + this.getBlocks() + ")";
        }
    }

    public static class ChatUnfurlRequestBuilder {
        private String token;
        private String userAuthMessage;
        private boolean userAuthRequired;
        private String rawUnfurls;
        private Map<String, UnfurlDetail> unfurls;
        private String ts;
        private String userAuthUrl;
        private String channel;

        ChatUnfurlRequestBuilder() {
        }

        public ChatUnfurlRequest.ChatUnfurlRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public ChatUnfurlRequest.ChatUnfurlRequestBuilder userAuthMessage(String userAuthMessage) {
            this.userAuthMessage = userAuthMessage;
            return this;
        }

        public ChatUnfurlRequest.ChatUnfurlRequestBuilder userAuthRequired(boolean userAuthRequired) {
            this.userAuthRequired = userAuthRequired;
            return this;
        }

        public ChatUnfurlRequest.ChatUnfurlRequestBuilder rawUnfurls(String rawUnfurls) {
            this.rawUnfurls = rawUnfurls;
            return this;
        }

        public ChatUnfurlRequest.ChatUnfurlRequestBuilder unfurls(Map<String, UnfurlDetail> unfurls) {
            this.unfurls = unfurls;
            return this;
        }

        public ChatUnfurlRequest.ChatUnfurlRequestBuilder ts(String ts) {
            this.ts = ts;
            return this;
        }

        public ChatUnfurlRequest.ChatUnfurlRequestBuilder userAuthUrl(String userAuthUrl) {
            this.userAuthUrl = userAuthUrl;
            return this;
        }

        public ChatUnfurlRequest.ChatUnfurlRequestBuilder channel(String channel) {
            this.channel = channel;
            return this;
        }

        public ChatUnfurlRequest build() {
            return new ChatUnfurlRequest(token, userAuthMessage, userAuthRequired, rawUnfurls, unfurls, ts, userAuthUrl, channel);
        }

        public String toString() {
            return "ChatUnfurlRequest.ChatUnfurlRequestBuilder(token=" + this.token + ", userAuthMessage=" + this.userAuthMessage + ", userAuthRequired=" + this.userAuthRequired + ", rawUnfurls=" + this.rawUnfurls + ", unfurls=" + this.unfurls + ", ts=" + this.ts + ", userAuthUrl=" + this.userAuthUrl + ", channel=" + this.channel + ")";
        }
    }
}
