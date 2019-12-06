package com.github.seratch.jslack.api.methods.request.bots;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class BotsInfoRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `users:read`
     */
    private String token;

    /**
     * Bot user to get info on
     */
    private String bot;

    BotsInfoRequest(String token, String bot) {
        this.token = token;
        this.bot = bot;
    }

    public static BotsInfoRequestBuilder builder() {
        return new BotsInfoRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public String getBot() {
        return this.bot;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setBot(String bot) {
        this.bot = bot;
    }

    public static class BotsInfoRequestBuilder {
        private String token;
        private String bot;

        BotsInfoRequestBuilder() {
        }

        public BotsInfoRequest.BotsInfoRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public BotsInfoRequest.BotsInfoRequestBuilder bot(String bot) {
            this.bot = bot;
            return this;
        }

        public BotsInfoRequest build() {
            return new BotsInfoRequest(token, bot);
        }

        public String toString() {
            return "BotsInfoRequest.BotsInfoRequestBuilder(token=" + this.token + ", bot=" + this.bot + ")";
        }
    }
}