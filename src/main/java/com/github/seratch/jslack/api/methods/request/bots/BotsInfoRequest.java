package com.github.seratch.jslack.api.methods.request.bots;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class BotsInfoRequest implements SlackApiRequest {

    private String token;
    private String bot;

    @java.beans.ConstructorProperties({"token", "bot"})
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

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof BotsInfoRequest)) return false;
        final BotsInfoRequest other = (BotsInfoRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$token = this.getToken();
        final Object other$token = other.getToken();
        if (this$token == null ? other$token != null : !this$token.equals(other$token)) return false;
        final Object this$bot = this.getBot();
        final Object other$bot = other.getBot();
        if (this$bot == null ? other$bot != null : !this$bot.equals(other$bot)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $token = this.getToken();
        result = result * PRIME + ($token == null ? 43 : $token.hashCode());
        final Object $bot = this.getBot();
        result = result * PRIME + ($bot == null ? 43 : $bot.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof BotsInfoRequest;
    }

    public String toString() {
        return "BotsInfoRequest(token=" + this.getToken() + ", bot=" + this.getBot() + ")";
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