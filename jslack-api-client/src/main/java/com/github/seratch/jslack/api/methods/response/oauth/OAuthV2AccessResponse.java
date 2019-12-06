package com.github.seratch.jslack.api.methods.response.oauth;

import com.github.seratch.jslack.api.methods.SlackApiResponse;
import lombok.Getter;
import lombok.Setter;

/**
 * https://api.slack.com/methods/oauth.v2.access
 */
@Getter
@Setter
public class OAuthV2AccessResponse implements SlackApiResponse {

    private boolean ok;
    private String warning;
    private String error;
    private String needed;
    private String provided;

    private String appId;
    private AuthedUser authedUser;
    private String scope;
    private String tokenType; // "bot"
    private String accessToken; // xoxb-xxx-yyy
    private String botUserId;
    private Team team;
    private Enterprise enterprise;
    private IncomingWebhook incomingWebhook;

    @Getter
@Setter
    public static class AuthedUser {
        private String id;
        private String scope;
        private String tokenType; // "user"
        private String accessToken; // xoxp-xxx-yyy
    }

    @Getter
@Setter
    public static class Team {
        private String id;
        private String name;
    }

    @Getter
@Setter
    public static class Enterprise {
        private String id;
        private String name;
    }

    @Getter
@Setter
    public static class IncomingWebhook {
        private String url;
        private String channel;
        private String channelId;
        private String configurationUrl;
    }
}
