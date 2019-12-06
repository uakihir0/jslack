package com.github.seratch.jslack.api.methods.request.files.comments;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class FilesCommentsEditRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `files:write:user`
     */
    private String token;

    /**
     * File containing the comment to edit.
     */
    private String file;

    /**
     * The comment to edit.
     */
    private String id;

    /**
     * Text of the comment to edit.
     */
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