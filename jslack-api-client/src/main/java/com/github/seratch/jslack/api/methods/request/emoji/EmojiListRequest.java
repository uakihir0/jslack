package com.github.seratch.jslack.api.methods.request.emoji;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class EmojiListRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `emoji:read`
     */
    private String token;

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