package com.github.seratch.jslack.api.methods.request.oauth;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

/**
 * https://api.slack.com/docs/oauth
 */
public class OAuthAccessRequest implements SlackApiRequest {

    /**
     * Issued when you created your application.
     */
    private String clientId;

    /**
     * Issued when you created your application.
     */
    private String clientSecret;

    /**
     * The `code` param returned via the OAuth callback.
     */
    private String code;

    /**
     * This must match the originally submitted URI (if one was sent).
     */
    private String redirectUri;

    /**
     * Request the user to add your app only to a single channel.
     */
    private boolean singleChannel;

    OAuthAccessRequest(String clientId, String clientSecret, String code, String redirectUri, boolean singleChannel) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.code = code;
        this.redirectUri = redirectUri;
        this.singleChannel = singleChannel;
    }

    public static OAuthAccessRequestBuilder builder() {
        return new OAuthAccessRequestBuilder();
    }

    @Override
    public String getToken() {
        return null;
    }

    public String getClientId() {
        return this.clientId;
    }

    public String getClientSecret() {
        return this.clientSecret;
    }

    public String getCode() {
        return this.code;
    }

    public String getRedirectUri() {
        return this.redirectUri;
    }

    public boolean isSingleChannel() {
        return this.singleChannel;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setRedirectUri(String redirectUri) {
        this.redirectUri = redirectUri;
    }

    public void setSingleChannel(boolean singleChannel) {
        this.singleChannel = singleChannel;
    }

    public static class OAuthAccessRequestBuilder {
        private String clientId;
        private String clientSecret;
        private String code;
        private String redirectUri;
        private boolean singleChannel;

        OAuthAccessRequestBuilder() {
        }

        public OAuthAccessRequest.OAuthAccessRequestBuilder clientId(String clientId) {
            this.clientId = clientId;
            return this;
        }

        public OAuthAccessRequest.OAuthAccessRequestBuilder clientSecret(String clientSecret) {
            this.clientSecret = clientSecret;
            return this;
        }

        public OAuthAccessRequest.OAuthAccessRequestBuilder code(String code) {
            this.code = code;
            return this;
        }

        public OAuthAccessRequest.OAuthAccessRequestBuilder redirectUri(String redirectUri) {
            this.redirectUri = redirectUri;
            return this;
        }

        public OAuthAccessRequest.OAuthAccessRequestBuilder singleChannel(boolean singleChannel) {
            this.singleChannel = singleChannel;
            return this;
        }

        public OAuthAccessRequest build() {
            return new OAuthAccessRequest(clientId, clientSecret, code, redirectUri, singleChannel);
        }

        public String toString() {
            return "OAuthAccessRequest.OAuthAccessRequestBuilder(clientId=" + this.clientId + ", clientSecret=" + this.clientSecret + ", code=" + this.code + ", redirectUri=" + this.redirectUri + ", singleChannel=" + this.singleChannel + ")";
        }
    }
}