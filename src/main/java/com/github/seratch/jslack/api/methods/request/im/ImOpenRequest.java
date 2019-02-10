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

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ImOpenRequest)) return false;
        final ImOpenRequest other = (ImOpenRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$token = this.getToken();
        final Object other$token = other.getToken();
        if (this$token == null ? other$token != null : !this$token.equals(other$token)) return false;
        final Object this$user = this.getUser();
        final Object other$user = other.getUser();
        if (this$user == null ? other$user != null : !this$user.equals(other$user)) return false;
        if (this.isReturnIm() != other.isReturnIm()) return false;
        if (this.isIncludeLocale() != other.isIncludeLocale()) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ImOpenRequest;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $token = this.getToken();
        result = result * PRIME + ($token == null ? 43 : $token.hashCode());
        final Object $user = this.getUser();
        result = result * PRIME + ($user == null ? 43 : $user.hashCode());
        result = result * PRIME + (this.isReturnIm() ? 79 : 97);
        result = result * PRIME + (this.isIncludeLocale() ? 79 : 97);
        return result;
    }

    public String toString() {
        return "ImOpenRequest(token=" + this.getToken() + ", user=" + this.getUser() + ", returnIm=" + this.isReturnIm() + ", includeLocale=" + this.isIncludeLocale() + ")";
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