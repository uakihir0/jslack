package com.github.seratch.jslack.api.methods.response.files.remote;

import com.github.seratch.jslack.api.methods.SlackApiResponse;
import com.github.seratch.jslack.api.model.File;
import com.github.seratch.jslack.api.model.ResponseMetadata;

import java.util.List;

public class FilesRemoteListResponse implements SlackApiResponse {

    private boolean ok;
    private String warning;
    private String error;
    private String needed;
    private String provided;

    private List<File> files;
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

    public List<File> getFiles() {
        return this.files;
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

    public void setFiles(List<File> files) {
        this.files = files;
    }

    public void setResponseMetadata(ResponseMetadata responseMetadata) {
        this.responseMetadata = responseMetadata;
    }
}