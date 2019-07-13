package com.github.seratch.jslack.api.methods.request.apps;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

/**
 * This method uninstalls an app. Unlike auth.revoke, which revokes a single token,
 * this method revokes all tokens associated with a single installation of an app.
 */
public class AppsUninstallRequest implements SlackApiRequest {

    private String token;

    /**
     * Issued when you created your application.
     */
    private String clientId;

    /**
     * Issued when you created your application.
     */
    private String clientSecret;

    AppsUninstallRequest(String token, String clientId, String clientSecret) {
        this.token = token;
        this.clientId = clientId;
        this.clientSecret = clientSecret;
    }

    public static AppsUninstallRequestBuilder builder() {
        return new AppsUninstallRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public String getClientId() {
        return this.clientId;
    }

    public String getClientSecret() {
        return this.clientSecret;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof AppsUninstallRequest)) return false;
        final AppsUninstallRequest other = (AppsUninstallRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$token = this.getToken();
        final Object other$token = other.getToken();
        if (this$token == null ? other$token != null : !this$token.equals(other$token)) return false;
        final Object this$clientId = this.getClientId();
        final Object other$clientId = other.getClientId();
        if (this$clientId == null ? other$clientId != null : !this$clientId.equals(other$clientId)) return false;
        final Object this$clientSecret = this.getClientSecret();
        final Object other$clientSecret = other.getClientSecret();
        if (this$clientSecret == null ? other$clientSecret != null : !this$clientSecret.equals(other$clientSecret))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof AppsUninstallRequest;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $token = this.getToken();
        result = result * PRIME + ($token == null ? 43 : $token.hashCode());
        final Object $clientId = this.getClientId();
        result = result * PRIME + ($clientId == null ? 43 : $clientId.hashCode());
        final Object $clientSecret = this.getClientSecret();
        result = result * PRIME + ($clientSecret == null ? 43 : $clientSecret.hashCode());
        return result;
    }

    public String toString() {
        return "AppsUninstallRequest(token=" + this.getToken() + ", clientId=" + this.getClientId() + ", clientSecret=" + this.getClientSecret() + ")";
    }

    public static class AppsUninstallRequestBuilder {
        private String token;
        private String clientId;
        private String clientSecret;

        AppsUninstallRequestBuilder() {
        }

        public AppsUninstallRequest.AppsUninstallRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public AppsUninstallRequest.AppsUninstallRequestBuilder clientId(String clientId) {
            this.clientId = clientId;
            return this;
        }

        public AppsUninstallRequest.AppsUninstallRequestBuilder clientSecret(String clientSecret) {
            this.clientSecret = clientSecret;
            return this;
        }

        public AppsUninstallRequest build() {
            return new AppsUninstallRequest(token, clientId, clientSecret);
        }

        public String toString() {
            return "AppsUninstallRequest.AppsUninstallRequestBuilder(token=" + this.token + ", clientId=" + this.clientId + ", clientSecret=" + this.clientSecret + ")";
        }
    }
}