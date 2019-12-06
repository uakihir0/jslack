package com.github.seratch.jslack.api.methods.request.files.comments;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class FilesCommentsDeleteRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `files:write:user`
     */
    private String token;

    /**
     * File to delete a comment from.
     */
    private String file;

    /**
     * The comment to delete.
     */
    private String id;

    FilesCommentsDeleteRequest(String token, String file, String id) {
        this.token = token;
        this.file = file;
        this.id = id;
    }

    public static FilesCommentsDeleteRequestBuilder builder() {
        return new FilesCommentsDeleteRequestBuilder();
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

    public void setToken(String token) {
        this.token = token;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public void setId(String id) {
        this.id = id;
    }

    public static class FilesCommentsDeleteRequestBuilder {
        private String token;
        private String file;
        private String id;

        FilesCommentsDeleteRequestBuilder() {
        }

        public FilesCommentsDeleteRequest.FilesCommentsDeleteRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public FilesCommentsDeleteRequest.FilesCommentsDeleteRequestBuilder file(String file) {
            this.file = file;
            return this;
        }

        public FilesCommentsDeleteRequest.FilesCommentsDeleteRequestBuilder id(String id) {
            this.id = id;
            return this;
        }

        public FilesCommentsDeleteRequest build() {
            return new FilesCommentsDeleteRequest(token, file, id);
        }

        public String toString() {
            return "FilesCommentsDeleteRequest.FilesCommentsDeleteRequestBuilder(token=" + this.token + ", file=" + this.file + ", id=" + this.id + ")";
        }
    }
}