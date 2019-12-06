package com.github.seratch.jslack.api.methods.response.admin.apps;

import com.github.seratch.jslack.api.methods.SlackApiResponse;
import com.github.seratch.jslack.api.model.ResponseMetadata;
import com.github.seratch.jslack.api.model.admin.AppRequest;

import java.util.List;

public class AdminAppsRequestsListResponse implements SlackApiResponse {

    private boolean ok;
    private String warning;
    private String error;
    private String needed;
    private String provided;

    private List<AppRequest> appRequests;
    private ResponseMetadata responseMetadata;

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

    public List<AppRequest> getAppRequests() {
        return this.appRequests;
    }

    public ResponseMetadata getResponseMetadata() {
        return this.responseMetadata;
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

    public void setAppRequests(List<AppRequest> appRequests) {
        this.appRequests = appRequests;
    }

    public void setResponseMetadata(ResponseMetadata responseMetadata) {
        this.responseMetadata = responseMetadata;
    }
}