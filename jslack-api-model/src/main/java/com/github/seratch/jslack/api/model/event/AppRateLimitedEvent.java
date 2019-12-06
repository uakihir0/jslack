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
}
