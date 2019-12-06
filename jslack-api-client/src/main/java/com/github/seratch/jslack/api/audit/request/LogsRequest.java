package com.github.seratch.jslack.api.audit.request;

import com.github.seratch.jslack.api.audit.AuditApiRequest;

public class LogsRequest implements AuditApiRequest {
    private String token;

    /**
     * Unix timestamp of the most recent audit event to include (inclusive).
     */
    private Integer latest;

    /**
     * Unix timestamp of the least recent audit event to include (inclusive).
     * The earliest possible timestamp is when the Audit Logs feature was enabled for your Grid organization,
     * around mid-March 2018.
     */
    private Integer oldest;

    /**
     * Number of results to optimistically return, maximum 9999.
     */
    private Integer limit;

    /**
     * Name of the action.
     */
    private String action;

    /**
     * User ID who initiated the action.
     */
    private String actor;

    /**
     * ID of the target entity of the action (such as a channel, workspace, organization, file).
     */
    private String entity;

    LogsRequest(String token, Integer latest, Integer oldest, Integer limit, String action, String actor, String entity) {
        this.token = token;
        this.latest = latest;
        this.oldest = oldest;
        this.limit = limit;
        this.action = action;
        this.actor = actor;
        this.entity = entity;
    }

    public static LogsRequestBuilder builder() {
        return new LogsRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public Integer getLatest() {
        return this.latest;
    }

    public Integer getOldest() {
        return this.oldest;
    }

    public Integer getLimit() {
        return this.limit;
    }

    public String getAction() {
        return this.action;
    }

    public String getActor() {
        return this.actor;
    }

    public String getEntity() {
        return this.entity;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setLatest(Integer latest) {
        this.latest = latest;
    }

    public void setOldest(Integer oldest) {
        this.oldest = oldest;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public void setEntity(String entity) {
        this.entity = entity;
    }

    public static class LogsRequestBuilder {
        private String token;
        private Integer latest;
        private Integer oldest;
        private Integer limit;
        private String action;
        private String actor;
        private String entity;

        LogsRequestBuilder() {
        }

        public LogsRequest.LogsRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public LogsRequest.LogsRequestBuilder latest(Integer latest) {
            this.latest = latest;
            return this;
        }

        public LogsRequest.LogsRequestBuilder oldest(Integer oldest) {
            this.oldest = oldest;
            return this;
        }

        public LogsRequest.LogsRequestBuilder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        public LogsRequest.LogsRequestBuilder action(String action) {
            this.action = action;
            return this;
        }

        public LogsRequest.LogsRequestBuilder actor(String actor) {
            this.actor = actor;
            return this;
        }

        public LogsRequest.LogsRequestBuilder entity(String entity) {
            this.entity = entity;
            return this;
        }

        public LogsRequest build() {
            return new LogsRequest(token, latest, oldest, limit, action, actor, entity);
        }

        public String toString() {
            return "LogsRequest.LogsRequestBuilder(token=" + this.token + ", latest=" + this.latest + ", oldest=" + this.oldest + ", limit=" + this.limit + ", action=" + this.action + ", actor=" + this.actor + ", entity=" + this.entity + ")";
        }
    }
}
