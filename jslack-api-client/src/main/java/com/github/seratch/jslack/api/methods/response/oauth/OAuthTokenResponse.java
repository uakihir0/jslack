package com.github.seratch.jslack.api.methods.response.oauth;

import com.github.seratch.jslack.api.methods.SlackApiResponse;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OAuthTokenResponse implements SlackApiResponse {

    private boolean ok;
    private String warning;
    private String error;
    private String needed;
    private String provided;

    private String accessToken;
    private String scope;
    private String teamName;
    private String teamId;
    private String userId;
    private IncomingWebhook incomingWebhook;
    private Bot bot;

    @Getter
@Setter
    public static class IncomingWebhook {
        private String url;
        private String channel;
        private String channelId;
        private String configurationUrl;
    }

    @Getter
@Setter
    public static class Bot {
        private String botUserId;
        private String botAccessToken;
    }
}
