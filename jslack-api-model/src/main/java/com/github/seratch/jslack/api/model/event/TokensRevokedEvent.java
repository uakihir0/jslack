package com.github.seratch.jslack.api.model.event;

import java.util.List;

/**
 * When your app's API tokens are revoked, the tokens_revoked event is sent via the Events API to your app if it is subscribed.
 * <p>
 * The example above details the complete Events API payload, including the event wrapper.
 * Use the team_id to identify the associated workspace.
 * <p>
 * The inner event's tokens field is a hash keyed with the types of revoked tokens.
 * oauth tokens are user-based tokens negotiated with OAuth or app installation,
 * typically beginning with xoxp-. bot tokens are also negotiated in that process,
 * but belong specifically to any bot user contained in your app and begin with xoxb-.
 * <p>
 * Each key contains an array of user IDs, not the actual token strings representing your revoked tokens.
 * To use this event most effectively, store your tokens along side user IDs and team IDs.
 * <p>
 * https://api.slack.com/events/tokens_revoked
 */
public class TokensRevokedEvent implements Event {

    public static final String TYPE_NAME = "tokens_revoked";

    private final String type = TYPE_NAME;
    private Tokens tokens;

    public TokensRevokedEvent() {
    }

    public String getType() {
        return this.type;
    }

    public Tokens getTokens() {
        return this.tokens;
    }

    public void setTokens(Tokens tokens) {
        this.tokens = tokens;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof TokensRevokedEvent)) return false;
        final TokensRevokedEvent other = (TokensRevokedEvent) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$type = this.getType();
        final Object other$type = other.getType();
        if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
        final Object this$tokens = this.getTokens();
        final Object other$tokens = other.getTokens();
        if (this$tokens == null ? other$tokens != null : !this$tokens.equals(other$tokens)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof TokensRevokedEvent;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $type = this.getType();
        result = result * PRIME + ($type == null ? 43 : $type.hashCode());
        final Object $tokens = this.getTokens();
        result = result * PRIME + ($tokens == null ? 43 : $tokens.hashCode());
        return result;
    }

    public String toString() {
        return "TokensRevokedEvent(type=" + this.getType() + ", tokens=" + this.getTokens() + ")";
    }

    public static class Tokens {
        private List<String> oauth;
        private List<String> bot;

        public Tokens() {
        }

        public List<String> getOauth() {
            return this.oauth;
        }

        public List<String> getBot() {
            return this.bot;
        }

        public void setOauth(List<String> oauth) {
            this.oauth = oauth;
        }

        public void setBot(List<String> bot) {
            this.bot = bot;
        }

        public boolean equals(final Object o) {
            if (o == this) return true;
            if (!(o instanceof Tokens)) return false;
            final Tokens other = (Tokens) o;
            if (!other.canEqual((Object) this)) return false;
            final Object this$oauth = this.getOauth();
            final Object other$oauth = other.getOauth();
            if (this$oauth == null ? other$oauth != null : !this$oauth.equals(other$oauth)) return false;
            final Object this$bot = this.getBot();
            final Object other$bot = other.getBot();
            if (this$bot == null ? other$bot != null : !this$bot.equals(other$bot)) return false;
            return true;
        }

        protected boolean canEqual(final Object other) {
            return other instanceof Tokens;
        }

        public int hashCode() {
            final int PRIME = 59;
            int result = 1;
            final Object $oauth = this.getOauth();
            result = result * PRIME + ($oauth == null ? 43 : $oauth.hashCode());
            final Object $bot = this.getBot();
            result = result * PRIME + ($bot == null ? 43 : $bot.hashCode());
            return result;
        }

        public String toString() {
            return "TokensRevokedEvent.Tokens(oauth=" + this.getOauth() + ", bot=" + this.getBot() + ")";
        }
    }
}