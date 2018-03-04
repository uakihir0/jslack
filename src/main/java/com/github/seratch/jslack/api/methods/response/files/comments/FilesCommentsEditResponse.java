package com.github.seratch.jslack.api.methods.response.files.comments;

import com.github.seratch.jslack.api.methods.SlackApiResponse;
import com.github.seratch.jslack.api.model.FileComment;

public class FilesCommentsEditResponse implements SlackApiResponse {

    private boolean ok;
    private String warning;
    private String error;

    private FileComment comment;

    public FilesCommentsEditResponse() {
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

    public FileComment getComment() {
        return this.comment;
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

    public void setComment(FileComment comment) {
        this.comment = comment;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof FilesCommentsEditResponse)) return false;
        final FilesCommentsEditResponse other = (FilesCommentsEditResponse) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.isOk() != other.isOk()) return false;
        final Object this$warning = this.getWarning();
        final Object other$warning = other.getWarning();
        if (this$warning == null ? other$warning != null : !this$warning.equals(other$warning)) return false;
        final Object this$error = this.getError();
        final Object other$error = other.getError();
        if (this$error == null ? other$error != null : !this$error.equals(other$error)) return false;
        final Object this$comment = this.getComment();
        final Object other$comment = other.getComment();
        if (this$comment == null ? other$comment != null : !this$comment.equals(other$comment)) return false;
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
        final Object $comment = this.getComment();
        result = result * PRIME + ($comment == null ? 43 : $comment.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof FilesCommentsEditResponse;
    }

    public String toString() {
        return "FilesCommentsEditResponse(ok=" + this.isOk() + ", warning=" + this.getWarning() + ", error=" + this.getError() + ", comment=" + this.getComment() + ")";
    }
}