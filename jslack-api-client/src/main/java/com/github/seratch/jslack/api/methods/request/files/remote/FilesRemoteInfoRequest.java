package com.github.seratch.jslack.api.methods.request.files.remote;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

/**
 * https://api.slack.com/methods/files.remote.info
 */
public class FilesRemoteInfoRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `remote_files:read`
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

    FilesRemoteInfoRequest(String token, String externalId, String file) {
        this.token = token;
        this.externalId = externalId;
        this.file = file;
    }

    public static FilesRemoteInfoRequestBuilder builder() {
        return new FilesRemoteInfoRequestBuilder();
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

    public static class FilesRemoteInfoRequestBuilder {
        private String token;
        private String externalId;
        private String file;

        FilesRemoteInfoRequestBuilder() {
        }

        public FilesRemoteInfoRequest.FilesRemoteInfoRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public FilesRemoteInfoRequest.FilesRemoteInfoRequestBuilder externalId(String externalId) {
            this.externalId = externalId;
            return this;
        }

        public FilesRemoteInfoRequest.FilesRemoteInfoRequestBuilder file(String file) {
            this.file = file;
            return this;
        }

        public FilesRemoteInfoRequest build() {
            return new FilesRemoteInfoRequest(token, externalId, file);
        }

        public String toString() {
            return "FilesRemoteInfoRequest.FilesRemoteInfoRequestBuilder(token=" + this.token + ", externalId=" + this.externalId + ", file=" + this.file + ")";
        }
    }
}