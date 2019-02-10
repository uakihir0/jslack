package com.github.seratch.jslack.api.methods.request.files.comments;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class FilesCommentsAddRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `files:write:user`
     */
    private String token;

    /**
     * File to add a comment to.
     */
    private String file;

    /**
     * Text of the comment to add.
     */
    private String comment;

    FilesCommentsAddRequest(String token, String file, String comment) {
        this.token = token;
        this.file = file;
        this.comment = comment;
    }

    public static FilesCommentsAddRequestBuilder builder() {
        return new FilesCommentsAddRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public String getFile() {
        return this.file;
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

    public void setComment(String comment) {
        this.comment = comment;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof FilesCommentsAddRequest))
            return false;
        final FilesCommentsAddRequest other = (FilesCommentsAddRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$token = this.getToken();
        final Object other$token = other.getToken();
        if (this$token == null ? other$token != null : !this$token.equals(other$token)) return false;
        final Object this$file = this.getFile();
        final Object other$file = other.getFile();
        if (this$file == null ? other$file != null : !this$file.equals(other$file)) return false;
        final Object this$comment = this.getComment();
        final Object other$comment = other.getComment();
        if (this$comment == null ? other$comment != null : !this$comment.equals(other$comment)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof FilesCommentsAddRequest;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $token = this.getToken();
        result = result * PRIME + ($token == null ? 43 : $token.hashCode());
        final Object $file = this.getFile();
        result = result * PRIME + ($file == null ? 43 : $file.hashCode());
        final Object $comment = this.getComment();
        result = result * PRIME + ($comment == null ? 43 : $comment.hashCode());
        return result;
    }

    public String toString() {
        return "FilesCommentsAddRequest(token=" + this.getToken() + ", file=" + this.getFile() + ", comment=" + this.getComment() + ")";
    }

    public static class FilesCommentsAddRequestBuilder {
        private String token;
        private String file;
        private String comment;

        FilesCommentsAddRequestBuilder() {
        }

        public FilesCommentsAddRequest.FilesCommentsAddRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public FilesCommentsAddRequest.FilesCommentsAddRequestBuilder file(String file) {
            this.file = file;
            return this;
        }

        public FilesCommentsAddRequest.FilesCommentsAddRequestBuilder comment(String comment) {
            this.comment = comment;
            return this;
        }

        public FilesCommentsAddRequest build() {
            return new FilesCommentsAddRequest(token, file, comment);
        }

        public String toString() {
            return "FilesCommentsAddRequest.FilesCommentsAddRequestBuilder(token=" + this.token + ", file=" + this.file + ", comment=" + this.comment + ")";
        }
    }
}