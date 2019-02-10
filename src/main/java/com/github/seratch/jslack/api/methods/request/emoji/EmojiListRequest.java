package com.github.seratch.jslack.api.methods.request.emoji;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class EmojiListRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `emoji:read`
     */
    private String token;

    @java.beans.ConstructorProperties({"token"})
    EmojiListRequest(String token) {
        this.token = token;
    }

    public static EmojiListRequestBuilder builder() {
        return new EmojiListRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof EmojiListRequest)) return false;
        final EmojiListRequest other = (EmojiListRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$token = this.getToken();
        final Object other$token = other.getToken();
        if (this$token == null ? other$token != null : !this$token.equals(other$token)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof EmojiListRequest;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $token = this.getToken();
        result = result * PRIME + ($token == null ? 43 : $token.hashCode());
        return result;
    }

    public String toString() {
        return "EmojiListRequest(token=" + this.getToken() + ")";
    }

    public static class EmojiListRequestBuilder {
        private String token;

        EmojiListRequestBuilder() {
        }

        public EmojiListRequest.EmojiListRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public EmojiListRequest build() {
            return new EmojiListRequest(token);
        }

        public String toString() {
            return "EmojiListRequest.EmojiListRequestBuilder(token=" + this.token + ")";
        }
    }
}