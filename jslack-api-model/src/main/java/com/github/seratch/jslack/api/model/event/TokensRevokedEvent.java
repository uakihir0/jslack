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

    public String getType() {
        return this.type;
    }

    public Tokens getTokens() {
        return this.tokens;
    }

    public void setTokens(Tokens tokens) {
        this.tokens = tokens;
    }

    public static class Tokens {
        private List<String> oauth;
        private List<String> bot;

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
    }
}