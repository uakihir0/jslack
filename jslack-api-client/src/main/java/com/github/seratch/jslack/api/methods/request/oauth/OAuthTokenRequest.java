package com.github.seratch.jslack.api.methods.request.oauth;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

/**
 * Exchanges a temporary OAuth verifier code for a workspace token.
 * <p>
 * https://api.slack.com/docs/oauth
 */
public class OAuthTokenRequest implements SlackApiRequest {

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

    OAuthTokenRequest(String clientId, String clientSecret, String code, String redirectUri, boolean singleChannel) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.code = code;
        this.redirectUri = redirectUri;
        this.singleChannel = singleChannel;
    }

    public static OAuthTokenRequestBuilder builder() {
        return new OAuthTokenRequestBuilder();
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

    public static class OAuthTokenRequestBuilder {
        private String clientId;
        private String clientSecret;
        private String code;
        private String redirectUri;
        private boolean singleChannel;

        OAuthTokenRequestBuilder() {
        }

        public OAuthTokenRequest.OAuthTokenRequestBuilder clientId(String clientId) {
            this.clientId = clientId;
            return this;
        }

        public OAuthTokenRequest.OAuthTokenRequestBuilder clientSecret(String clientSecret) {
            this.clientSecret = clientSecret;
            return this;
        }

        public OAuthTokenRequest.OAuthTokenRequestBuilder code(String code) {
            this.code = code;
            return this;
        }

        public OAuthTokenRequest.OAuthTokenRequestBuilder redirectUri(String redirectUri) {
            this.redirectUri = redirectUri;
            return this;
        }

        public OAuthTokenRequest.OAuthTokenRequestBuilder singleChannel(boolean singleChannel) {
            this.singleChannel = singleChannel;
            return this;
        }

        public OAuthTokenRequest build() {
            return new OAuthTokenRequest(clientId, clientSecret, code, redirectUri, singleChannel);
        }

        public String toString() {
            return "OAuthTokenRequest.OAuthTokenRequestBuilder(clientId=" + this.clientId + ", clientSecret=" + this.clientSecret + ", code=" + this.code + ", redirectUri=" + this.redirectUri + ", singleChannel=" + this.singleChannel + ")";
        }
    }
}