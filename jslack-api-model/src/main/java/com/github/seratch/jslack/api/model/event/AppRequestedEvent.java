package com.github.seratch.jslack.api.model.event;

import com.github.seratch.jslack.api.model.admin.AppRequest;

/**
 * https://api.slack.com/events/app_requested
 */
public class AppRequestedEvent implements Event {

    public static final String TYPE_NAME = "app_requested";

    private final String type = TYPE_NAME;
    private AppRequest appRequest;

    public String getType() {
        return this.type;
    }

    public AppRequest getAppRequest() {
        return this.appRequest;
    }

    public void setAppRequest(AppRequest appRequest) {
        this.appRequest = appRequest;
    }
}