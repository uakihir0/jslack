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

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof OAuthTokenRequest)) return false;
        final OAuthTokenRequest other = (OAuthTokenRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$clientId = this.getClientId();
        final Object other$clientId = other.getClientId();
        if (this$clientId == null ? other$clientId != null : !this$clientId.equals(other$clientId)) return false;
        final Object this$clientSecret = this.getClientSecret();
        final Object other$clientSecret = other.getClientSecret();
        if (this$clientSecret == null ? other$clientSecret != null : !this$clientSecret.equals(other$clientSecret))
            return false;
        final Object this$code = this.getCode();
        final Object other$code = other.getCode();
        if (this$code == null ? other$code != null : !this$code.equals(other$code)) return false;
        final Object this$redirectUri = this.getRedirectUri();
        final Object other$redirectUri = other.getRedirectUri();
        if (this$redirectUri == null ? other$redirectUri != null : !this$redirectUri.equals(other$redirectUri))
            return false;
        if (this.isSingleChannel() != other.isSingleChannel()) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof OAuthTokenRequest;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $clientId = this.getClientId();
        result = result * PRIME + ($clientId == null ? 43 : $clientId.hashCode());
        final Object $clientSecret = this.getClientSecret();
        result = result * PRIME + ($clientSecret == null ? 43 : $clientSecret.hashCode());
        final Object $code = this.getCode();
        result = result * PRIME + ($code == null ? 43 : $code.hashCode());
        final Object $redirectUri = this.getRedirectUri();
        result = result * PRIME + ($redirectUri == null ? 43 : $redirectUri.hashCode());
        result = result * PRIME + (this.isSingleChannel() ? 79 : 97);
        return result;
    }

    public String toString() {
        return "OAuthTokenRequest(clientId=" + this.getClientId() + ", clientSecret=" + this.getClientSecret() + ", code=" + this.getCode() + ", redirectUri=" + this.getRedirectUri() + ", singleChannel=" + this.isSingleChannel() + ")";
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