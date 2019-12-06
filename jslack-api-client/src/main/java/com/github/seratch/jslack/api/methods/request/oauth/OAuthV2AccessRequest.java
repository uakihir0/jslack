package com.github.seratch.jslack.api.methods.request.oauth;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

/**
 * https://api.slack.com/authentication/basics
 * https://api.slack.com/methods/oauth.v2.access
 */
public class OAuthV2AccessRequest implements SlackApiRequest {

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

    OAuthV2AccessRequest(String clientId, String clientSecret, String code, String redirectUri) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.code = code;
        this.redirectUri = redirectUri;
    }

    public static OAuthV2AccessRequestBuilder builder() {
        return new OAuthV2AccessRequestBuilder();
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

    public static class OAuthV2AccessRequestBuilder {
        private String clientId;
        private String clientSecret;
        private String code;
        private String redirectUri;

        OAuthV2AccessRequestBuilder() {
        }

        public OAuthV2AccessRequest.OAuthV2AccessRequestBuilder clientId(String clientId) {
            this.clientId = clientId;
            return this;
        }

        public OAuthV2AccessRequest.OAuthV2AccessRequestBuilder clientSecret(String clientSecret) {
            this.clientSecret = clientSecret;
            return this;
        }

        public OAuthV2AccessRequest.OAuthV2AccessRequestBuilder code(String code) {
            this.code = code;
            return this;
        }

        public OAuthV2AccessRequest.OAuthV2AccessRequestBuilder redirectUri(String redirectUri) {
            this.redirectUri = redirectUri;
            return this;
        }

        public OAuthV2AccessRequest build() {
            return new OAuthV2AccessRequest(clientId, clientSecret, code, redirectUri);
        }

        public String toString() {
            return "OAuthV2AccessRequest.OAuthV2AccessRequestBuilder(clientId=" + this.clientId + ", clientSecret=" + this.clientSecret + ", code=" + this.code + ", redirectUri=" + this.redirectUri + ")";
        }
    }
}