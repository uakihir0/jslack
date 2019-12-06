package com.github.seratch.jslack.api.model;

public class IntegrationLog {
    private String appType;
    private String appId;

    private String serviceId;
    private String serviceType;

    private String userId;
    private String userName;

    private String channel;

    private Integer date;
    private String changeType;
    private String reason;
    private String scope;

    private boolean rssFeed;
    private String rssFeedChangeType;
    private String rssFeedTitle;
    private String rssFeedUrl;

    public String getAppType() {
        return this.appType;
    }

    public String getAppId() {
        return this.appId;
    }

    public String getServiceId() {
        return this.serviceId;
    }

    public String getServiceType() {
        return this.serviceType;
    }

    public String getUserId() {
        return this.userId;
    }

    public String getUserName() {
        return this.userName;
    }

    public String getChannel() {
        return this.channel;
    }

    public Integer getDate() {
        return this.date;
    }

    public String getChangeType() {
        return this.changeType;
    }

    public String getReason() {
        return this.reason;
    }

    public String getScope() {
        return this.scope;
    }

    public boolean isRssFeed() {
        return this.rssFeed;
    }

    public String getRssFeedChangeType() {
        return this.rssFeedChangeType;
    }

    public String getRssFeedTitle() {
        return this.rssFeedTitle;
    }

    public String getRssFeedUrl() {
        return this.rssFeedUrl;
    }

    public void setAppType(String appType) {
        this.appType = appType;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public void setDate(Integer date) {
        this.date = date;
    }

    public void setChangeType(String changeType) {
        this.changeType = changeType;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public void setRssFeed(boolean rssFeed) {
        this.rssFeed = rssFeed;
    }

    public void setRssFeedChangeType(String rssFeedChangeType) {
        this.rssFeedChangeType = rssFeedChangeType;
    }

    public void setRssFeedTitle(String rssFeedTitle) {
        this.rssFeedTitle = rssFeedTitle;
    }

    public void setRssFeedUrl(String rssFeedUrl) {
        this.rssFeedUrl = rssFeedUrl;
    }
}
