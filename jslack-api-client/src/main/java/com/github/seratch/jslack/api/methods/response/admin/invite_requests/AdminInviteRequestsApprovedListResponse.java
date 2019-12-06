package com.github.seratch.jslack.api.methods.response.admin.invite_requests;

import com.github.seratch.jslack.api.methods.SlackApiResponse;

import java.util.List;

public class AdminInviteRequestsApprovedListResponse implements SlackApiResponse {

    private boolean ok;
    private String warning;
    private String error;
    private String needed;
    private String provided;

    private List<String> approvedRequests;

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

    public List<String> getApprovedRequests() {
        return this.approvedRequests;
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

    public void setApprovedRequests(List<String> approvedRequests) {
        this.approvedRequests = approvedRequests;
    }
}