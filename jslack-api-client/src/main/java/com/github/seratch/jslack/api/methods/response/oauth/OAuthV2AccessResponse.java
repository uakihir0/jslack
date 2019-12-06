package com.github.seratch.jslack.api.methods.response.oauth;

import com.github.seratch.jslack.api.methods.SlackApiResponse;

/**
 * https://api.slack.com/methods/oauth.v2.access
 */
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

    public String getAppId() {
        return this.appId;
    }

    public AuthedUser getAuthedUser() {
        return this.authedUser;
    }

    public String getScope() {
        return this.scope;
    }

    public String getTokenType() {
        return this.tokenType;
    }

    public String getAccessToken() {
        return this.accessToken;
    }

    public String getBotUserId() {
        return this.botUserId;
    }

    public Team getTeam() {
        return this.team;
    }

    public Enterprise getEnterprise() {
        return this.enterprise;
    }

    public IncomingWebhook getIncomingWebhook() {
        return this.incomingWebhook;
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

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public void setAuthedUser(AuthedUser authedUser) {
        this.authedUser = authedUser;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public void setBotUserId(String botUserId) {
        this.botUserId = botUserId;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    public void setIncomingWebhook(IncomingWebhook incomingWebhook) {
        this.incomingWebhook = incomingWebhook;
    }

    public static class AuthedUser {
        private String id;
        private String scope;
        private String tokenType; // "user"
        private String accessToken; // xoxp-xxx-yyy

        public String getId() {
            return this.id;
        }

        public String getScope() {
            return this.scope;
        }

        public String getTokenType() {
            return this.tokenType;
        }

        public String getAccessToken() {
            return this.accessToken;
        }

        public void setId(String id) {
            this.id = id;
        }

        public void setScope(String scope) {
            this.scope = scope;
        }

        public void setTokenType(String tokenType) {
            this.tokenType = tokenType;
        }

        public void setAccessToken(String accessToken) {
            this.accessToken = accessToken;
        }
    }

    public static class Team {
        private String id;
        private String name;

        public String getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }

        public void setId(String id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static class Enterprise {
        private String id;
        private String name;

        public String getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }

        public void setId(String id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }
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
}
