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