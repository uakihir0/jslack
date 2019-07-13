package com.github.seratch.jslack.api.model.event;

/**
 * https://api.slack.com/events/app_rate_limited
 */
public class AppRateLimitedEvent implements Event {

    public static final String TYPE_NAME = "app_rate_limited";

    private final String type = TYPE_NAME;

    /**
     * the same shared token used to verify other events in the Events API
     */
    private String token;

    /**
     * subscriptions between your app and the workspace with this ID are being rate limited
     */
    private String teamId;

    /**
     * a rounded epoch time value indicating the minute
     * your application became rate limited for this workspace.
     * 1518467820 is at 2018-02-12 20:37:00 UTC.
     */
    private Integer minuteRateLimited;

    /**
     * your application's ID, especially useful
     * if you have multiple applications working with the Events API
     */
    private String apiAppId;

    public AppRateLimitedEvent() {
    }

    public String getType() {
        return this.type;
    }

    public String getToken() {
        return this.token;
    }

    public String getTeamId() {
        return this.teamId;
    }

    public Integer getMinuteRateLimited() {
        return this.minuteRateLimited;
    }

    public String getApiAppId() {
        return this.apiAppId;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    public void setMinuteRateLimited(Integer minuteRateLimited) {
        this.minuteRateLimited = minuteRateLimited;
    }

    public void setApiAppId(String apiAppId) {
        this.apiAppId = apiAppId;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof AppRateLimitedEvent)) return false;
        final AppRateLimitedEvent other = (AppRateLimitedEvent) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$type = this.getType();
        final Object other$type = other.getType();
        if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
        final Object this$token = this.getToken();
        final Object other$token = other.getToken();
        if (this$token == null ? other$token != null : !this$token.equals(other$token)) return false;
        final Object this$teamId = this.getTeamId();
        final Object other$teamId = other.getTeamId();
        if (this$teamId == null ? other$teamId != null : !this$teamId.equals(other$teamId)) return false;
        final Object this$minuteRateLimited = this.getMinuteRateLimited();
        final Object other$minuteRateLimited = other.getMinuteRateLimited();
        if (this$minuteRateLimited == null ? other$minuteRateLimited != null : !this$minuteRateLimited.equals(other$minuteRateLimited))
            return false;
        final Object this$apiAppId = this.getApiAppId();
        final Object other$apiAppId = other.getApiAppId();
        if (this$apiAppId == null ? other$apiAppId != null : !this$apiAppId.equals(other$apiAppId)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof AppRateLimitedEvent;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $type = this.getType();
        result = result * PRIME + ($type == null ? 43 : $type.hashCode());
        final Object $token = this.getToken();
        result = result * PRIME + ($token == null ? 43 : $token.hashCode());
        final Object $teamId = this.getTeamId();
        result = result * PRIME + ($teamId == null ? 43 : $teamId.hashCode());
        final Object $minuteRateLimited = this.getMinuteRateLimited();
        result = result * PRIME + ($minuteRateLimited == null ? 43 : $minuteRateLimited.hashCode());
        final Object $apiAppId = this.getApiAppId();
        result = result * PRIME + ($apiAppId == null ? 43 : $apiAppId.hashCode());
        return result;
    }

    public String toString() {
        return "AppRateLimitedEvent(type=" + this.getType() + ", token=" + this.getToken() + ", teamId=" + this.getTeamId() + ", minuteRateLimited=" + this.getMinuteRateLimited() + ", apiAppId=" + this.getApiAppId() + ")";
    }
}
