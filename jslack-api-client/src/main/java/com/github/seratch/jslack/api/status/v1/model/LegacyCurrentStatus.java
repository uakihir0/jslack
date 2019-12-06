package com.github.seratch.jslack.api.status.v1.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class LegacyCurrentStatus {
    private Integer id;
    private String dateCreated;
    private String dateUpdated;
    private String title;
    private String type;
    private String status;
    private String url;
    private List<String> services;
    private List<LegacySlackIssue.Note> notes;

    @Getter
@Setter
    public static class Note {
        private String dateCreated;
        private String body;
    }
}
