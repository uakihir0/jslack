package com.github.seratch.jslack.api.methods.request.im;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class ImOpenRequest implements SlackApiRequest {

    private String token;
    private String user;
    private boolean returnIm;

    ImOpenRequest(String token, String user, boolean returnIm) {
        this.token = token;
        this.user = user;
        this.returnIm = returnIm;
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

    public void setToken(String token) {
        this.token = token;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setReturnIm(boolean returnIm) {
        this.returnIm = returnIm;
    }

    public boolean equals(Object o) {
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
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $token = this.getToken();
        result = result * PRIME + ($token == null ? 43 : $token.hashCode());
        final Object $user = this.getUser();
        result = result * PRIME + ($user == null ? 43 : $user.hashCode());
        result = result * PRIME + (this.isReturnIm() ? 79 : 97);
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof ImOpenRequest;
    }

    public String toString() {
        return "ImOpenRequest(token=" + this.getToken() + ", user=" + this.getUser() + ", returnIm=" + this.isReturnIm() + ")";
    }

    public static class ImOpenRequestBuilder {
        private String token;
        private String user;
        private boolean returnIm;

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

        public ImOpenRequest build() {
            return new ImOpenRequest(token, user, returnIm);
        }

        public String toString() {
            return "ImOpenRequest.ImOpenRequestBuilder(token=" + this.token + ", user=" + this.user + ", returnIm=" + this.returnIm + ")";
        }
    }
}