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

    public IntegrationLog() {
    }

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

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof IntegrationLog)) return false;
        final IntegrationLog other = (IntegrationLog) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$appType = this.getAppType();
        final Object other$appType = other.getAppType();
        if (this$appType == null ? other$appType != null : !this$appType.equals(other$appType)) return false;
        final Object this$appId = this.getAppId();
        final Object other$appId = other.getAppId();
        if (this$appId == null ? other$appId != null : !this$appId.equals(other$appId)) return false;
        final Object this$serviceId = this.getServiceId();
        final Object other$serviceId = other.getServiceId();
        if (this$serviceId == null ? other$serviceId != null : !this$serviceId.equals(other$serviceId)) return false;
        final Object this$serviceType = this.getServiceType();
        final Object other$serviceType = other.getServiceType();
        if (this$serviceType == null ? other$serviceType != null : !this$serviceType.equals(other$serviceType))
            return false;
        final Object this$userId = this.getUserId();
        final Object other$userId = other.getUserId();
        if (this$userId == null ? other$userId != null : !this$userId.equals(other$userId)) return false;
        final Object this$userName = this.getUserName();
        final Object other$userName = other.getUserName();
        if (this$userName == null ? other$userName != null : !this$userName.equals(other$userName)) return false;
        final Object this$channel = this.getChannel();
        final Object other$channel = other.getChannel();
        if (this$channel == null ? other$channel != null : !this$channel.equals(other$channel)) return false;
        final Object this$date = this.getDate();
        final Object other$date = other.getDate();
        if (this$date == null ? other$date != null : !this$date.equals(other$date)) return false;
        final Object this$changeType = this.getChangeType();
        final Object other$changeType = other.getChangeType();
        if (this$changeType == null ? other$changeType != null : !this$changeType.equals(other$changeType))
            return false;
        final Object this$reason = this.getReason();
        final Object other$reason = other.getReason();
        if (this$reason == null ? other$reason != null : !this$reason.equals(other$reason)) return false;
        final Object this$scope = this.getScope();
        final Object other$scope = other.getScope();
        if (this$scope == null ? other$scope != null : !this$scope.equals(other$scope)) return false;
        if (this.isRssFeed() != other.isRssFeed()) return false;
        final Object this$rssFeedChangeType = this.getRssFeedChangeType();
        final Object other$rssFeedChangeType = other.getRssFeedChangeType();
        if (this$rssFeedChangeType == null ? other$rssFeedChangeType != null : !this$rssFeedChangeType.equals(other$rssFeedChangeType))
            return false;
        final Object this$rssFeedTitle = this.getRssFeedTitle();
        final Object other$rssFeedTitle = other.getRssFeedTitle();
        if (this$rssFeedTitle == null ? other$rssFeedTitle != null : !this$rssFeedTitle.equals(other$rssFeedTitle))
            return false;
        final Object this$rssFeedUrl = this.getRssFeedUrl();
        final Object other$rssFeedUrl = other.getRssFeedUrl();
        if (this$rssFeedUrl == null ? other$rssFeedUrl != null : !this$rssFeedUrl.equals(other$rssFeedUrl))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof IntegrationLog;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $appType = this.getAppType();
        result = result * PRIME + ($appType == null ? 43 : $appType.hashCode());
        final Object $appId = this.getAppId();
        result = result * PRIME + ($appId == null ? 43 : $appId.hashCode());
        final Object $serviceId = this.getServiceId();
        result = result * PRIME + ($serviceId == null ? 43 : $serviceId.hashCode());
        final Object $serviceType = this.getServiceType();
        result = result * PRIME + ($serviceType == null ? 43 : $serviceType.hashCode());
        final Object $userId = this.getUserId();
        result = result * PRIME + ($userId == null ? 43 : $userId.hashCode());
        final Object $userName = this.getUserName();
        result = result * PRIME + ($userName == null ? 43 : $userName.hashCode());
        final Object $channel = this.getChannel();
        result = result * PRIME + ($channel == null ? 43 : $channel.hashCode());
        final Object $date = this.getDate();
        result = result * PRIME + ($date == null ? 43 : $date.hashCode());
        final Object $changeType = this.getChangeType();
        result = result * PRIME + ($changeType == null ? 43 : $changeType.hashCode());
        final Object $reason = this.getReason();
        result = result * PRIME + ($reason == null ? 43 : $reason.hashCode());
        final Object $scope = this.getScope();
        result = result * PRIME + ($scope == null ? 43 : $scope.hashCode());
        result = result * PRIME + (this.isRssFeed() ? 79 : 97);
        final Object $rssFeedChangeType = this.getRssFeedChangeType();
        result = result * PRIME + ($rssFeedChangeType == null ? 43 : $rssFeedChangeType.hashCode());
        final Object $rssFeedTitle = this.getRssFeedTitle();
        result = result * PRIME + ($rssFeedTitle == null ? 43 : $rssFeedTitle.hashCode());
        final Object $rssFeedUrl = this.getRssFeedUrl();
        result = result * PRIME + ($rssFeedUrl == null ? 43 : $rssFeedUrl.hashCode());
        return result;
    }

    public String toString() {
        return "IntegrationLog(appType=" + this.getAppType() + ", appId=" + this.getAppId() + ", serviceId=" + this.getServiceId() + ", serviceType=" + this.getServiceType() + ", userId=" + this.getUserId() + ", userName=" + this.getUserName() + ", channel=" + this.getChannel() + ", date=" + this.getDate() + ", changeType=" + this.getChangeType() + ", reason=" + this.getReason() + ", scope=" + this.getScope() + ", rssFeed=" + this.isRssFeed() + ", rssFeedChangeType=" + this.getRssFeedChangeType() + ", rssFeedTitle=" + this.getRssFeedTitle() + ", rssFeedUrl=" + this.getRssFeedUrl() + ")";
    }
}
