package com.github.seratch.jslack.api.methods.response.oauth;

import com.github.seratch.jslack.api.methods.SlackApiResponse;

import java.util.List;

public class OAuthAccessResponse implements SlackApiResponse {

    private boolean ok;
    private String warning;
    private String error;
    private String needed;
    private String provided;

    private String tokenType;
    private String accessToken;
    private String scope;
    private String enterpriseId;
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

    public String getTokenType() {
        return this.tokenType;
    }

    public String getAccessToken() {
        return this.accessToken;
    }

    public String getScope() {
        return this.scope;
    }

    public String getEnterpriseId() {
        return this.enterpriseId;
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

    @Deprecated
    public AuthorizingUser getAuthorizingUser() {
        return this.authorizingUser;
    }

    @Deprecated
    public InstallerUser getInstallerUser() {
        return this.installerUser;
    }

    @Deprecated
    public Scopes getScopes() {
        return this.scopes;
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

    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public void setEnterpriseId(String enterpriseId) {
        this.enterpriseId = enterpriseId;
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

    @Deprecated
    public void setAuthorizingUser(AuthorizingUser authorizingUser) {
        this.authorizingUser = authorizingUser;
    }

    @Deprecated
    public void setInstallerUser(InstallerUser installerUser) {
        this.installerUser = installerUser;
    }

    @Deprecated
    public void setScopes(Scopes scopes) {
        this.scopes = scopes;
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

    @Deprecated // for workspace apps
    private AuthorizingUser authorizingUser;
    @Deprecated // for workspace apps
    private InstallerUser installerUser;
    @Deprecated // for workspace apps
    private Scopes scopes;

    @Deprecated
    public static class AuthorizingUser {
        private String userId;
        private String appHome;

        public String getUserId() {
            return this.userId;
        }

        public String getAppHome() {
            return this.appHome;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }

        public void setAppHome(String appHome) {
            this.appHome = appHome;
        }
    }

    @Deprecated
    public static class InstallerUser {
        private String userId;
        private String appHome;

        public String getUserId() {
            return this.userId;
        }

        public String getAppHome() {
            return this.appHome;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }

        public void setAppHome(String appHome) {
            this.appHome = appHome;
        }
    }

    @Deprecated
    public static class Scopes {
        private List<String> appHome;
        private List<String> team;
        private List<String> channel;
        private List<String> group;
        private List<String> mpim;
        private List<String> im;
        private List<String> user;

        public List<String> getAppHome() {
            return this.appHome;
        }

        public List<String> getTeam() {
            return this.team;
        }

        public List<String> getChannel() {
            return this.channel;
        }

        public List<String> getGroup() {
            return this.group;
        }

        public List<String> getMpim() {
            return this.mpim;
        }

        public List<String> getIm() {
            return this.im;
        }

        public List<String> getUser() {
            return this.user;
        }

        public void setAppHome(List<String> appHome) {
            this.appHome = appHome;
        }

        public void setTeam(List<String> team) {
            this.team = team;
        }

        public void setChannel(List<String> channel) {
            this.channel = channel;
        }

        public void setGroup(List<String> group) {
            this.group = group;
        }

        public void setMpim(List<String> mpim) {
            this.mpim = mpim;
        }

        public void setIm(List<String> im) {
            this.im = im;
        }

        public void setUser(List<String> user) {
            this.user = user;
        }
    }

}
