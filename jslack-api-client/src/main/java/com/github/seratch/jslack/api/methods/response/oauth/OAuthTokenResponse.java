package com.github.seratch.jslack.api.methods.response.oauth;

import com.github.seratch.jslack.api.methods.SlackApiResponse;

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

    public boolean isOk() {
        return this.ok;
    }

    public String getWarning() {
        return this.warning;
    }

    public String getError() {
        return this.error;
    }

    public String getNeeded() {
        return this.needed;
    }

    public String getProvided() {
        return this.provided;
    }

    public String getAccessToken() {
        return this.accessToken;
    }

    public String getScope() {
        return this.scope;
    }

    public String getTeamName() {
        return this.teamName;
    }

    public String getTeamId() {
        return this.teamId;
    }

    public String getUserId() {
        return this.userId;
    }

    public IncomingWebhook getIncomingWebhook() {
        return this.incomingWebhook;
    }

    public Bot getBot() {
        return this.bot;
    }

    public void setOk(boolean ok) {
        this.ok = ok;
    }

    public void setWarning(String warning) {
        this.warning = warning;
    }

    public void setError(String error) {
        this.error = error;
    }

    public void setNeeded(String needed) {
        this.needed = needed;
    }

    public void setProvided(String provided) {
        this.provided = provided;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setIncomingWebhook(IncomingWebhook incomingWebhook) {
        this.incomingWebhook = incomingWebhook;
    }

    public void setBot(Bot bot) {
        this.bot = bot;
    }

    public static class IncomingWebhook {
        private String url;
        private String channel;
        private String channelId;
        private String configurationUrl;

        public String getUrl() {
            return this.url;
        }

        public String getChannel() {
            return this.channel;
        }

        public String getChannelId() {
            return this.channelId;
        }

        public String getConfigurationUrl() {
            return this.configurationUrl;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public void setChannel(String channel) {
            this.channel = channel;
        }

        public void setChannelId(String channelId) {
            this.channelId = channelId;
        }

        public void setConfigurationUrl(String configurationUrl) {
            this.configurationUrl = configurationUrl;
        }
    }

    public static class Bot {
        private String botUserId;
        private String botAccessToken;

        public String getBotUserId() {
            return this.botUserId;
        }

        public String getBotAccessToken() {
            return this.botAccessToken;
        }

        public void setBotUserId(String botUserId) {
            this.botUserId = botUserId;
        }

        public void setBotAccessToken(String botAccessToken) {
            this.botAccessToken = botAccessToken;
        }
    }
}
