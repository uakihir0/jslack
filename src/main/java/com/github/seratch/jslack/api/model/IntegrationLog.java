package com.github.seratch.jslack.api.model;

public class IntegrationLog {

    private String serviceId;
    private String serviceType;
    private String userId;
    private String userName;
    private String channel;
    private Integer date;
    private String changeType;
    private String scope;

    public IntegrationLog() {
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

    public String getScope() {
        return this.scope;
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

    public void setScope(String scope) {
        this.scope = scope;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof IntegrationLog)) return false;
        final IntegrationLog other = (IntegrationLog) o;
        if (!other.canEqual((Object) this)) return false;
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
        final Object this$scope = this.getScope();
        final Object other$scope = other.getScope();
        if (this$scope == null ? other$scope != null : !this$scope.equals(other$scope)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
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
        final Object $scope = this.getScope();
        result = result * PRIME + ($scope == null ? 43 : $scope.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof IntegrationLog;
    }

    public String toString() {
        return "IntegrationLog(serviceId=" + this.getServiceId() + ", serviceType=" + this.getServiceType() + ", userId=" + this.getUserId() + ", userName=" + this.getUserName() + ", channel=" + this.getChannel() + ", date=" + this.getDate() + ", changeType=" + this.getChangeType() + ", scope=" + this.getScope() + ")";
    }
}
