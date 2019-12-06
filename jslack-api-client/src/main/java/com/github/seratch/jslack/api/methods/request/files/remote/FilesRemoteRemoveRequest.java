package com.github.seratch.jslack.api.methods.request.files.remote;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class FilesRemoteRemoveRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `remote_files:write`
     */
    private String token;

    /**
     * Creator defined GUID for the file.
     */
    private String externalId;

    /**
     * Specify a file by providing its ID.
     */
    private String file;

    FilesRemoteRemoveRequest(String token, String externalId, String file) {
        this.token = token;
        this.externalId = externalId;
        this.file = file;
    }

    public static FilesRemoteRemoveRequestBuilder builder() {
        return new FilesRemoteRemoveRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public String getExternalId() {
        return this.externalId;
    }

    public String getFile() {
        return this.file;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public static class FilesRemoteRemoveRequestBuilder {
        private String token;
        private String externalId;
        private String file;

        FilesRemoteRemoveRequestBuilder() {
        }

        public FilesRemoteRemoveRequest.FilesRemoteRemoveRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public FilesRemoteRemoveRequest.FilesRemoteRemoveRequestBuilder externalId(String externalId) {
            this.externalId = externalId;
            return this;
        }

        public FilesRemoteRemoveRequest.FilesRemoteRemoveRequestBuilder file(String file) {
            this.file = file;
            return this;
        }

        public FilesRemoteRemoveRequest build() {
            return new FilesRemoteRemoveRequest(token, externalId, file);
        }

        public String toString() {
            return "FilesRemoteRemoveRequest.FilesRemoteRemoveRequestBuilder(token=" + this.token + ", externalId=" + this.externalId + ", file=" + this.file + ")";
        }
    }
}