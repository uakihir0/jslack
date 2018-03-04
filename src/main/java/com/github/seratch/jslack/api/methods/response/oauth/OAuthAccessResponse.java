package com.github.seratch.jslack.api.methods.response.oauth;

import com.github.seratch.jslack.api.methods.SlackApiResponse;

public class OAuthAccessResponse implements SlackApiResponse {

    private boolean ok;
    private String warning;
    private String error;

    private String accessToken;
    private String scope;
    private String teamName;
    private String teamId;
    private String userId;
    private IncomingWebhook incomingWebhook;
    private Bot bot;

    public OAuthAccessResponse() {
    }

    public boolean isOk() {
        return this.ok;
    }

    public String getWarning() {
        return this.warning;
    }

    public String getError() {
        return this.error;
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

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof OAuthAccessResponse)) return false;
        final OAuthAccessResponse other = (OAuthAccessResponse) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.isOk() != other.isOk()) return false;
        final Object this$warning = this.getWarning();
        final Object other$warning = other.getWarning();
        if (this$warning == null ? other$warning != null : !this$warning.equals(other$warning)) return false;
        final Object this$error = this.getError();
        final Object other$error = other.getError();
        if (this$error == null ? other$error != null : !this$error.equals(other$error)) return false;
        final Object this$accessToken = this.getAccessToken();
        final Object other$accessToken = other.getAccessToken();
        if (this$accessToken == null ? other$accessToken != null : !this$accessToken.equals(other$accessToken))
            return false;
        final Object this$scope = this.getScope();
        final Object other$scope = other.getScope();
        if (this$scope == null ? other$scope != null : !this$scope.equals(other$scope)) return false;
        final Object this$teamName = this.getTeamName();
        final Object other$teamName = other.getTeamName();
        if (this$teamName == null ? other$teamName != null : !this$teamName.equals(other$teamName)) return false;
        final Object this$teamId = this.getTeamId();
        final Object other$teamId = other.getTeamId();
        if (this$teamId == null ? other$teamId != null : !this$teamId.equals(other$teamId)) return false;
        final Object this$userId = this.getUserId();
        final Object other$userId = other.getUserId();
        if (this$userId == null ? other$userId != null : !this$userId.equals(other$userId)) return false;
        final Object this$incomingWebhook = this.getIncomingWebhook();
        final Object other$incomingWebhook = other.getIncomingWebhook();
        if (this$incomingWebhook == null ? other$incomingWebhook != null : !this$incomingWebhook.equals(other$incomingWebhook))
            return false;
        final Object this$bot = this.getBot();
        final Object other$bot = other.getBot();
        if (this$bot == null ? other$bot != null : !this$bot.equals(other$bot)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + (this.isOk() ? 79 : 97);
        final Object $warning = this.getWarning();
        result = result * PRIME + ($warning == null ? 43 : $warning.hashCode());
        final Object $error = this.getError();
        result = result * PRIME + ($error == null ? 43 : $error.hashCode());
        final Object $accessToken = this.getAccessToken();
        result = result * PRIME + ($accessToken == null ? 43 : $accessToken.hashCode());
        final Object $scope = this.getScope();
        result = result * PRIME + ($scope == null ? 43 : $scope.hashCode());
        final Object $teamName = this.getTeamName();
        result = result * PRIME + ($teamName == null ? 43 : $teamName.hashCode());
        final Object $teamId = this.getTeamId();
        result = result * PRIME + ($teamId == null ? 43 : $teamId.hashCode());
        final Object $userId = this.getUserId();
        result = result * PRIME + ($userId == null ? 43 : $userId.hashCode());
        final Object $incomingWebhook = this.getIncomingWebhook();
        result = result * PRIME + ($incomingWebhook == null ? 43 : $incomingWebhook.hashCode());
        final Object $bot = this.getBot();
        result = result * PRIME + ($bot == null ? 43 : $bot.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof OAuthAccessResponse;
    }

    public String toString() {
        return "OAuthAccessResponse(ok=" + this.isOk() + ", warning=" + this.getWarning() + ", error=" + this.getError() + ", accessToken=" + this.getAccessToken() + ", scope=" + this.getScope() + ", teamName=" + this.getTeamName() + ", teamId=" + this.getTeamId() + ", userId=" + this.getUserId() + ", incomingWebhook=" + this.getIncomingWebhook() + ", bot=" + this.getBot() + ")";
    }

    public static class IncomingWebhook {
        private String url;
        private String channel;
        private String channelId;
        private String configurationUrl;

        public IncomingWebhook() {
        }

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

        public boolean equals(Object o) {
            if (o == this) return true;
            if (!(o instanceof IncomingWebhook)) return false;
            final IncomingWebhook other = (IncomingWebhook) o;
            if (!other.canEqual((Object) this)) return false;
            final Object this$url = this.getUrl();
            final Object other$url = other.getUrl();
            if (this$url == null ? other$url != null : !this$url.equals(other$url)) return false;
            final Object this$channel = this.getChannel();
            final Object other$channel = other.getChannel();
            if (this$channel == null ? other$channel != null : !this$channel.equals(other$channel)) return false;
            final Object this$channelId = this.getChannelId();
            final Object other$channelId = other.getChannelId();
            if (this$channelId == null ? other$channelId != null : !this$channelId.equals(other$channelId))
                return false;
            final Object this$configurationUrl = this.getConfigurationUrl();
            final Object other$configurationUrl = other.getConfigurationUrl();
            if (this$configurationUrl == null ? other$configurationUrl != null : !this$configurationUrl.equals(other$configurationUrl))
                return false;
            return true;
        }

        public int hashCode() {
            final int PRIME = 59;
            int result = 1;
            final Object $url = this.getUrl();
            result = result * PRIME + ($url == null ? 43 : $url.hashCode());
            final Object $channel = this.getChannel();
            result = result * PRIME + ($channel == null ? 43 : $channel.hashCode());
            final Object $channelId = this.getChannelId();
            result = result * PRIME + ($channelId == null ? 43 : $channelId.hashCode());
            final Object $configurationUrl = this.getConfigurationUrl();
            result = result * PRIME + ($configurationUrl == null ? 43 : $configurationUrl.hashCode());
            return result;
        }

        protected boolean canEqual(Object other) {
            return other instanceof IncomingWebhook;
        }

        public String toString() {
            return "OAuthAccessResponse.IncomingWebhook(url=" + this.getUrl() + ", channel=" + this.getChannel() + ", channelId=" + this.getChannelId() + ", configurationUrl=" + this.getConfigurationUrl() + ")";
        }
    }

    public static class Bot {
        private String botUserId;
        private String botAccessToken;

        public Bot() {
        }

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

        public boolean equals(Object o) {
            if (o == this) return true;
            if (!(o instanceof Bot)) return false;
            final Bot other = (Bot) o;
            if (!other.canEqual((Object) this)) return false;
            final Object this$botUserId = this.getBotUserId();
            final Object other$botUserId = other.getBotUserId();
            if (this$botUserId == null ? other$botUserId != null : !this$botUserId.equals(other$botUserId))
                return false;
            final Object this$botAccessToken = this.getBotAccessToken();
            final Object other$botAccessToken = other.getBotAccessToken();
            if (this$botAccessToken == null ? other$botAccessToken != null : !this$botAccessToken.equals(other$botAccessToken))
                return false;
            return true;
        }

        public int hashCode() {
            final int PRIME = 59;
            int result = 1;
            final Object $botUserId = this.getBotUserId();
            result = result * PRIME + ($botUserId == null ? 43 : $botUserId.hashCode());
            final Object $botAccessToken = this.getBotAccessToken();
            result = result * PRIME + ($botAccessToken == null ? 43 : $botAccessToken.hashCode());
            return result;
        }

        protected boolean canEqual(Object other) {
            return other instanceof Bot;
        }

        public String toString() {
            return "OAuthAccessResponse.Bot(botUserId=" + this.getBotUserId() + ", botAccessToken=" + this.getBotAccessToken() + ")";
        }
    }
}
