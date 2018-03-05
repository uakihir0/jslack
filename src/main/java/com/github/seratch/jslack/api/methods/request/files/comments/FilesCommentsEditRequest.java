package com.github.seratch.jslack.api.methods.request.files.comments;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class FilesCommentsEditRequest implements SlackApiRequest {

    private String token;
    private String file;
    private String id;
    private String comment;

    FilesCommentsEditRequest(String token, String file, String id, String comment) {
        this.token = token;
        this.file = file;
        this.id = id;
        this.comment = comment;
    }

    public static FilesCommentsEditRequestBuilder builder() {
        return new FilesCommentsEditRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public String getFile() {
        return this.file;
    }

    public String getId() {
        return this.id;
    }

    public String getComment() {
        return this.comment;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof FilesCommentsEditRequest)) return false;
        final FilesCommentsEditRequest other = (FilesCommentsEditRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$token = this.getToken();
        final Object other$token = other.getToken();
        if (this$token == null ? other$token != null : !this$token.equals(other$token)) return false;
        final Object this$file = this.getFile();
        final Object other$file = other.getFile();
        if (this$file == null ? other$file != null : !this$file.equals(other$file)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$comment = this.getComment();
        final Object other$comment = other.getComment();
        if (this$comment == null ? other$comment != null : !this$comment.equals(other$comment)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $token = this.getToken();
        result = result * PRIME + ($token == null ? 43 : $token.hashCode());
        final Object $file = this.getFile();
        result = result * PRIME + ($file == null ? 43 : $file.hashCode());
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $comment = this.getComment();
        result = result * PRIME + ($comment == null ? 43 : $comment.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof FilesCommentsEditRequest;
    }

    public String toString() {
        return "FilesCommentsEditRequest(token=" + this.getToken() + ", file=" + this.getFile() + ", id=" + this.getId() + ", comment=" + this.getComment() + ")";
    }

    public static class FilesCommentsEditRequestBuilder {
        private String token;
        private String file;
        private String id;
        private String comment;

        FilesCommentsEditRequestBuilder() {
        }

        public FilesCommentsEditRequest.FilesCommentsEditRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public FilesCommentsEditRequest.FilesCommentsEditRequestBuilder file(String file) {
            this.file = file;
            return this;
        }

        public FilesCommentsEditRequest.FilesCommentsEditRequestBuilder id(String id) {
            this.id = id;
            return this;
        }

        public FilesCommentsEditRequest.FilesCommentsEditRequestBuilder comment(String comment) {
            this.comment = comment;
            return this;
        }

        public FilesCommentsEditRequest build() {
            return new FilesCommentsEditRequest(token, file, id, comment);
        }

        public String toString() {
            return "FilesCommentsEditRequest.FilesCommentsEditRequestBuilder(token=" + this.token + ", file=" + this.file + ", id=" + this.id + ", comment=" + this.comment + ")";
        }
    }
}