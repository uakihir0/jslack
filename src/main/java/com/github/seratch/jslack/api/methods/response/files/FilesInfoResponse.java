package com.github.seratch.jslack.api.methods.response.files;

import com.github.seratch.jslack.api.methods.SlackApiResponse;
import com.github.seratch.jslack.api.model.File;
import com.github.seratch.jslack.api.model.FileComment;
import com.github.seratch.jslack.api.model.Paging;

import java.util.List;

public class FilesInfoResponse implements SlackApiResponse {

    private boolean ok;
    private String warning;
    private String error;

    private File file;
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

    public File getFile() {
        return this.file;
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

    public void setFile(File file) {
        this.file = file;
    }

    public void setComments(List<FileComment> comments) {
        this.comments = comments;
    }

    public void setPaging(Paging paging) {
        this.paging = paging;
    }

    public boolean equals(Object o) {
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
        final Object this$file = this.getFile();
        final Object other$file = other.getFile();
        if (this$file == null ? other$file != null : !this$file.equals(other$file)) return false;
        final Object this$comments = this.getComments();
        final Object other$comments = other.getComments();
        if (this$comments == null ? other$comments != null : !this$comments.equals(other$comments)) return false;
        final Object this$paging = this.getPaging();
        final Object other$paging = other.getPaging();
        if (this$paging == null ? other$paging != null : !this$paging.equals(other$paging)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + (this.isOk() ? 79 : 97);
        final Object $warning = this.getWarning();
        result = result * PRIME + ($warning == null ? 43 : $warning.hashCode());
        final Object $error = this.getError();
        result = result * PRIME + ($error == null ? 43 : $error.hashCode());
        final Object $file = this.getFile();
        result = result * PRIME + ($file == null ? 43 : $file.hashCode());
        final Object $comments = this.getComments();
        result = result * PRIME + ($comments == null ? 43 : $comments.hashCode());
        final Object $paging = this.getPaging();
        result = result * PRIME + ($paging == null ? 43 : $paging.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof FilesInfoResponse;
    }

    public String toString() {
        return "FilesInfoResponse(ok=" + this.isOk() + ", warning=" + this.getWarning() + ", error=" + this.getError() + ", file=" + this.getFile() + ", comments=" + this.getComments() + ", paging=" + this.getPaging() + ")";
    }
}