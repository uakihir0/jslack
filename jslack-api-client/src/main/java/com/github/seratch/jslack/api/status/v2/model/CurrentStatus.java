package com.github.seratch.jslack.api.status.v2.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class CurrentStatus {
    private String status;
    private String dateCreated;
    private String dateUpdated;
    private List<SlackIssue> activeIncidents;
}
