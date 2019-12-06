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