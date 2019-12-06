package com.github.seratch.jslack.api.methods.response.files;

import com.github.seratch.jslack.api.methods.SlackApiResponse;
import com.github.seratch.jslack.api.model.File;
import com.github.seratch.jslack.api.model.FileComment;
import com.github.seratch.jslack.api.model.Paging;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class FilesInfoResponse implements SlackApiResponse {

    private boolean ok;
    private String warning;
    private String error;
    private String needed;
    private String provided;

    private File file;
    private String content;
    private String contentHighlightHtml;
    private String contentHighlightCss;
    @SerializedName("is_truncated")
    private boolean truncated;
    private List<FileComment> comments;
    private Paging paging;

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

    public File getFile() {
        return this.file;
    }

    public String getContent() {
        return this.content;
    }

    public String getContentHighlightHtml() {
        return this.contentHighlightHtml;
    }

    public String getContentHighlightCss() {
        return this.contentHighlightCss;
    }

    public boolean isTruncated() {
        return this.truncated;
    }

    public List<FileComment> getComments() {
        return this.comments;
    }

    public Paging getPaging() {
        return this.paging;
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

    public void setFile(File file) {
        this.file = file;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setContentHighlightHtml(String contentHighlightHtml) {
        this.contentHighlightHtml = contentHighlightHtml;
    }

    public void setContentHighlightCss(String contentHighlightCss) {
        this.contentHighlightCss = contentHighlightCss;
    }

    public void setTruncated(boolean truncated) {
        this.truncated = truncated;
    }

    public void setComments(List<FileComment> comments) {
        this.comments = comments;
    }

    public void setPaging(Paging paging) {
        this.paging = paging;
    }
}