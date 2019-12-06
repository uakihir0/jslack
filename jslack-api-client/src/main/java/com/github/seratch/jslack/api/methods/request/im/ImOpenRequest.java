package com.github.seratch.jslack.api.methods.request.im;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class ImOpenRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `im:write`
     */
    private String token;

    /**
     * User to open a direct message channel with.
     */
    private String user;

    /**
     * Boolean, indicates you want the full IM channel definition in the response.
     */
    private boolean returnIm;

    /**
     * Set this to `true` to receive the locale for this im. Defaults to `false`
     */
    private boolean includeLocale;

    ImOpenRequest(String token, String user, boolean returnIm, boolean includeLocale) {
        this.token = token;
        this.user = user;
        this.returnIm = returnIm;
        this.includeLocale = includeLocale;
    }

    public static ImOpenRequestBuilder builder() {
        return new ImOpenRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public String getUser() {
        return this.user;
    }

    public boolean isReturnIm() {
        return this.returnIm;
    }

    public boolean isIncludeLocale() {
        return this.includeLocale;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setReturnIm(boolean returnIm) {
        this.returnIm = returnIm;
    }

    public void setIncludeLocale(boolean includeLocale) {
        this.includeLocale = includeLocale;
    }

    public static class ImOpenRequestBuilder {
        private String token;
        private String user;
        private boolean returnIm;
        private boolean includeLocale;

        ImOpenRequestBuilder() {
        }

        public ImOpenRequest.ImOpenRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public ImOpenRequest.ImOpenRequestBuilder user(String user) {
            this.user = user;
            return this;
        }

        public ImOpenRequest.ImOpenRequestBuilder returnIm(boolean returnIm) {
            this.returnIm = returnIm;
            return this;
        }

        public ImOpenRequest.ImOpenRequestBuilder includeLocale(boolean includeLocale) {
            this.includeLocale = includeLocale;
            return this;
        }

        public ImOpenRequest build() {
            return new ImOpenRequest(token, user, returnIm, includeLocale);
        }

        public String toString() {
            return "ImOpenRequest.ImOpenRequestBuilder(token=" + this.token + ", user=" + this.user + ", returnIm=" + this.returnIm + ", includeLocale=" + this.includeLocale + ")";
        }
    }
}