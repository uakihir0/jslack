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


    // https://api.slack.com/docs/message-link-unfurling#unfurls_parameter
    public static class UnfurlDetail {
        private String title;
        private String text;
        private String callbackId;
        private String attachmentType;
        private String fallback;
        private List<Action> actions;

        private List<LayoutBlock> blocks;

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
