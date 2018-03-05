package com.github.seratch.jslack.api.methods.request.team;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class TeamIntegrationLogsRequest implements SlackApiRequest {

    private String token;
    private String serviceId;
    private String user;
    private String changeType;
    private Integer count;
    private Integer page;

    TeamIntegrationLogsRequest(String token, String serviceId, String user, String changeType, Integer count, Integer page) {
        this.token = token;
        this.serviceId = serviceId;
        this.user = user;
        this.changeType = changeType;
        this.count = count;
        this.page = page;
    }

    public static TeamIntegrationLogsRequestBuilder builder() {
        return new TeamIntegrationLogsRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public String getServiceId() {
        return this.serviceId;
    }

    public String getUser() {
        return this.user;
    }

    public String getChangeType() {
        return this.changeType;
    }

    public Integer getCount() {
        return this.count;
    }

    public Integer getPage() {
        return this.page;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setChangeType(String changeType) {
        this.changeType = changeType;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof TeamIntegrationLogsRequest)) return false;
        final TeamIntegrationLogsRequest other = (TeamIntegrationLogsRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$token = this.getToken();
        final Object other$token = other.getToken();
        if (this$token == null ? other$token != null : !this$token.equals(other$token)) return false;
        final Object this$serviceId = this.getServiceId();
        final Object other$serviceId = other.getServiceId();
        if (this$serviceId == null ? other$serviceId != null : !this$serviceId.equals(other$serviceId)) return false;
        final Object this$user = this.getUser();
        final Object other$user = other.getUser();
        if (this$user == null ? other$user != null : !this$user.equals(other$user)) return false;
        final Object this$changeType = this.getChangeType();
        final Object other$changeType = other.getChangeType();
        if (this$changeType == null ? other$changeType != null : !this$changeType.equals(other$changeType))
            return false;
        final Object this$count = this.getCount();
        final Object other$count = other.getCount();
        if (this$count == null ? other$count != null : !this$count.equals(other$count)) return false;
        final Object this$page = this.getPage();
        final Object other$page = other.getPage();
        if (this$page == null ? other$page != null : !this$page.equals(other$page)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $token = this.getToken();
        result = result * PRIME + ($token == null ? 43 : $token.hashCode());
        final Object $serviceId = this.getServiceId();
        result = result * PRIME + ($serviceId == null ? 43 : $serviceId.hashCode());
        final Object $user = this.getUser();
        result = result * PRIME + ($user == null ? 43 : $user.hashCode());
        final Object $changeType = this.getChangeType();
        result = result * PRIME + ($changeType == null ? 43 : $changeType.hashCode());
        final Object $count = this.getCount();
        result = result * PRIME + ($count == null ? 43 : $count.hashCode());
        final Object $page = this.getPage();
        result = result * PRIME + ($page == null ? 43 : $page.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof TeamIntegrationLogsRequest;
    }

    public String toString() {
        return "TeamIntegrationLogsRequest(token=" + this.getToken() + ", serviceId=" + this.getServiceId() + ", user=" + this.getUser() + ", changeType=" + this.getChangeType() + ", count=" + this.getCount() + ", page=" + this.getPage() + ")";
    }

    public static class TeamIntegrationLogsRequestBuilder {
        private String token;
        private String serviceId;
        private String user;
        private String changeType;
        private Integer count;
        private Integer page;

        TeamIntegrationLogsRequestBuilder() {
        }

        public TeamIntegrationLogsRequest.TeamIntegrationLogsRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public TeamIntegrationLogsRequest.TeamIntegrationLogsRequestBuilder serviceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }

        public TeamIntegrationLogsRequest.TeamIntegrationLogsRequestBuilder user(String user) {
            this.user = user;
            return this;
        }

        public TeamIntegrationLogsRequest.TeamIntegrationLogsRequestBuilder changeType(String changeType) {
            this.changeType = changeType;
            return this;
        }

        public TeamIntegrationLogsRequest.TeamIntegrationLogsRequestBuilder count(Integer count) {
            this.count = count;
            return this;
        }

        public TeamIntegrationLogsRequest.TeamIntegrationLogsRequestBuilder page(Integer page) {
            this.page = page;
            return this;
        }

        public TeamIntegrationLogsRequest build() {
            return new TeamIntegrationLogsRequest(token, serviceId, user, changeType, count, page);
        }

        public String toString() {
            return "TeamIntegrationLogsRequest.TeamIntegrationLogsRequestBuilder(token=" + this.token + ", serviceId=" + this.serviceId + ", user=" + this.user + ", changeType=" + this.changeType + ", count=" + this.count + ", page=" + this.page + ")";
        }
    }
}