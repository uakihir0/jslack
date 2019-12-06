package com.github.seratch.jslack.api.status.v2.model;

import java.util.List;

public class SlackIssue {
    private Integer id;
    private String dateCreated;
    private String dateUpdated;
    private String title;
    private String type;
    private String status;
    private String url;
    private List<String> services;
    private List<Note> notes;

    public Integer getId() {
        return this.id;
    }

    public String getDateCreated() {
        return this.dateCreated;
    }

    public String getDateUpdated() {
        return this.dateUpdated;
    }

    public String getTitle() {
        return this.title;
    }

    public String getType() {
        return this.type;
    }

    public String getStatus() {
        return this.status;
    }

    public String getUrl() {
        return this.url;
    }

    public List<String> getServices() {
        return this.services;
    }

    public List<Note> getNotes() {
        return this.notes;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    public void setDateUpdated(String dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setServices(List<String> services) {
        this.services = services;
    }

    public void setNotes(List<Note> notes) {
        this.notes = notes;
    }

    public static class Note {
        private String dateCreated;
        private String body;

        public String getDateCreated() {
            return this.dateCreated;
        }

        public String getBody() {
            return this.body;
        }

        public void setDateCreated(String dateCreated) {
            this.dateCreated = dateCreated;
        }

        public void setBody(String body) {
            this.body = body;
        }
    }
}
