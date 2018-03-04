package com.github.seratch.jslack.api.methods.request.oauth;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

/**
 * https://api.slack.com/docs/oauth
 */
public class OAuthAccessRequest implements SlackApiRequest {

    private String clientId;
    private String clientSecret;
    private String code;
    private String redirectUri;

    @java.beans.ConstructorProperties({"clientId", "clientSecret", "code", "redirectUri"})
    OAuthAccessRequest(String clientId, String clientSecret, String code, String redirectUri) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.code = code;
        this.redirectUri = redirectUri;
    }

    public static OAuthAccessRequestBuilder builder() {
        return new OAuthAccessRequestBuilder();
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

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof OAuthAccessRequest)) return false;
        final OAuthAccessRequest other = (OAuthAccessRequest) o;
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
        return true;
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
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof OAuthAccessRequest;
    }

    public String toString() {
        return "OAuthAccessRequest(clientId=" + this.getClientId() + ", clientSecret=" + this.getClientSecret() + ", code=" + this.getCode() + ", redirectUri=" + this.getRedirectUri() + ")";
    }

    public static class OAuthAccessRequestBuilder {
        private String clientId;
        private String clientSecret;
        private String code;
        private String redirectUri;

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

        public OAuthAccessRequest build() {
            return new OAuthAccessRequest(clientId, clientSecret, code, redirectUri);
        }

        public String toString() {
            return "OAuthAccessRequest.OAuthAccessRequestBuilder(clientId=" + this.clientId + ", clientSecret=" + this.clientSecret + ", code=" + this.code + ", redirectUri=" + this.redirectUri + ")";
        }
    }
}