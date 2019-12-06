package com.github.seratch.jslack.api.status.v2.model;

import java.util.List;

public class CurrentStatus {
    private String status;
    private String dateCreated;
    private String dateUpdated;
    private List<SlackIssue> activeIncidents;

    public String getStatus() {
        return this.status;
    }

    public String getDateCreated() {
        return this.dateCreated;
    }

    public String getDateUpdated() {
        return this.dateUpdated;
    }

    public List<SlackIssue> getActiveIncidents() {
        return this.activeIncidents;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    public void setDateUpdated(String dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    public void setActiveIncidents(List<SlackIssue> activeIncidents) {
        this.activeIncidents = activeIncidents;
    }
}
