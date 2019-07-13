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

    public FilesInfoResponse() {
    }

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

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof FilesInfoResponse)) return false;
        final FilesInfoResponse other = (FilesInfoResponse) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.isOk() != other.isOk()) return false;
        final Object this$warning = this.getWarning();
        final Object other$warning = other.getWarning();
        if (this$warning == null ? other$warning != null : !this$warning.equals(other$warning)) return false;
        final Object this$error = this.getError();
        final Object other$error = other.getError();
        if (this$error == null ? other$error != null : !this$error.equals(other$error)) return false;
        final Object this$needed = this.getNeeded();
        final Object other$needed = other.getNeeded();
        if (this$needed == null ? other$needed != null : !this$needed.equals(other$needed)) return false;
        final Object this$provided = this.getProvided();
        final Object other$provided = other.getProvided();
        if (this$provided == null ? other$provided != null : !this$provided.equals(other$provided)) return false;
        final Object this$file = this.getFile();
        final Object other$file = other.getFile();
        if (this$file == null ? other$file != null : !this$file.equals(other$file)) return false;
        final Object this$content = this.getContent();
        final Object other$content = other.getContent();
        if (this$content == null ? other$content != null : !this$content.equals(other$content)) return false;
        final Object this$contentHighlightHtml = this.getContentHighlightHtml();
        final Object other$contentHighlightHtml = other.getContentHighlightHtml();
        if (this$contentHighlightHtml == null ? other$contentHighlightHtml != null : !this$contentHighlightHtml.equals(other$contentHighlightHtml))
            return false;
        final Object this$contentHighlightCss = this.getContentHighlightCss();
        final Object other$contentHighlightCss = other.getContentHighlightCss();
        if (this$contentHighlightCss == null ? other$contentHighlightCss != null : !this$contentHighlightCss.equals(other$contentHighlightCss))
            return false;
        if (this.isTruncated() != other.isTruncated()) return false;
        final Object this$comments = this.getComments();
        final Object other$comments = other.getComments();
        if (this$comments == null ? other$comments != null : !this$comments.equals(other$comments)) return false;
        final Object this$paging = this.getPaging();
        final Object other$paging = other.getPaging();
        if (this$paging == null ? other$paging != null : !this$paging.equals(other$paging)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof FilesInfoResponse;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + (this.isOk() ? 79 : 97);
        final Object $warning = this.getWarning();
        result = result * PRIME + ($warning == null ? 43 : $warning.hashCode());
        final Object $error = this.getError();
        result = result * PRIME + ($error == null ? 43 : $error.hashCode());
        final Object $needed = this.getNeeded();
        result = result * PRIME + ($needed == null ? 43 : $needed.hashCode());
        final Object $provided = this.getProvided();
        result = result * PRIME + ($provided == null ? 43 : $provided.hashCode());
        final Object $file = this.getFile();
        result = result * PRIME + ($file == null ? 43 : $file.hashCode());
        final Object $content = this.getContent();
        result = result * PRIME + ($content == null ? 43 : $content.hashCode());
        final Object $contentHighlightHtml = this.getContentHighlightHtml();
        result = result * PRIME + ($contentHighlightHtml == null ? 43 : $contentHighlightHtml.hashCode());
        final Object $contentHighlightCss = this.getContentHighlightCss();
        result = result * PRIME + ($contentHighlightCss == null ? 43 : $contentHighlightCss.hashCode());
        result = result * PRIME + (this.isTruncated() ? 79 : 97);
        final Object $comments = this.getComments();
        result = result * PRIME + ($comments == null ? 43 : $comments.hashCode());
        final Object $paging = this.getPaging();
        result = result * PRIME + ($paging == null ? 43 : $paging.hashCode());
        return result;
    }

    public String toString() {
        return "FilesInfoResponse(ok=" + this.isOk() + ", warning=" + this.getWarning() + ", error=" + this.getError() + ", needed=" + this.getNeeded() + ", provided=" + this.getProvided() + ", file=" + this.getFile() + ", content=" + this.getContent() + ", contentHighlightHtml=" + this.getContentHighlightHtml() + ", contentHighlightCss=" + this.getContentHighlightCss() + ", truncated=" + this.isTruncated() + ", comments=" + this.getComments() + ", paging=" + this.getPaging() + ")";
    }
}