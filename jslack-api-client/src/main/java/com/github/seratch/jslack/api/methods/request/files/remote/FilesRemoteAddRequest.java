package com.github.seratch.jslack.api.methods.request.files.remote;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

/**
 * https://api.slack.com/methods/files.remote.add
 */
public class FilesRemoteAddRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `remote_files:write`
     */
    private String token;

    /**
     * Creator defined GUID for the file.
     */
    private String externalId;

    /**
     * URL of the remote file.
     */
    private String externalUrl;

    /**
     * Title of the file being shared.
     */
    private String title;

    /**
     * type of file
     */
    private String filetype;

    /**
     * File containing contents that can be used to improve searchability for the remote file.
     */
    private byte[] indexableFileContents;

    /**
     * Preview of the document via multipart/form-data.
     */
    private byte[] previewImage;

    FilesRemoteAddRequest(String token, String externalId, String externalUrl, String title, String filetype, byte[] indexableFileContents, byte[] previewImage) {
        this.token = token;
        this.externalId = externalId;
        this.externalUrl = externalUrl;
        this.title = title;
        this.filetype = filetype;
        this.indexableFileContents = indexableFileContents;
        this.previewImage = previewImage;
    }

    public static FilesRemoteAddRequestBuilder builder() {
        return new FilesRemoteAddRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public String getExternalId() {
        return this.externalId;
    }

    public String getExternalUrl() {
        return this.externalUrl;
    }

    public String getTitle() {
        return this.title;
    }

    public String getFiletype() {
        return this.filetype;
    }

    public byte[] getIndexableFileContents() {
        return this.indexableFileContents;
    }

    public byte[] getPreviewImage() {
        return this.previewImage;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public void setExternalUrl(String externalUrl) {
        this.externalUrl = externalUrl;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setFiletype(String filetype) {
        this.filetype = filetype;
    }

    public void setIndexableFileContents(byte[] indexableFileContents) {
        this.indexableFileContents = indexableFileContents;
    }

    public void setPreviewImage(byte[] previewImage) {
        this.previewImage = previewImage;
    }

    public static class FilesRemoteAddRequestBuilder {
        private String token;
        private String externalId;
        private String externalUrl;
        private String title;
        private String filetype;
        private byte[] indexableFileContents;
        private byte[] previewImage;

        FilesRemoteAddRequestBuilder() {
        }

        public FilesRemoteAddRequest.FilesRemoteAddRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public FilesRemoteAddRequest.FilesRemoteAddRequestBuilder externalId(String externalId) {
            this.externalId = externalId;
            return this;
        }

        public FilesRemoteAddRequest.FilesRemoteAddRequestBuilder externalUrl(String externalUrl) {
            this.externalUrl = externalUrl;
            return this;
        }

        public FilesRemoteAddRequest.FilesRemoteAddRequestBuilder title(String title) {
            this.title = title;
            return this;
        }

        public FilesRemoteAddRequest.FilesRemoteAddRequestBuilder filetype(String filetype) {
            this.filetype = filetype;
            return this;
        }

        public FilesRemoteAddRequest.FilesRemoteAddRequestBuilder indexableFileContents(byte[] indexableFileContents) {
            this.indexableFileContents = indexableFileContents;
            return this;
        }

        public FilesRemoteAddRequest.FilesRemoteAddRequestBuilder previewImage(byte[] previewImage) {
            this.previewImage = previewImage;
            return this;
        }

        public FilesRemoteAddRequest build() {
            return new FilesRemoteAddRequest(token, externalId, externalUrl, title, filetype, indexableFileContents, previewImage);
        }

        public String toString() {
            return "FilesRemoteAddRequest.FilesRemoteAddRequestBuilder(token=" + this.token + ", externalId=" + this.externalId + ", externalUrl=" + this.externalUrl + ", title=" + this.title + ", filetype=" + this.filetype + ", indexableFileContents=" + java.util.Arrays.toString(this.indexableFileContents) + ", previewImage=" + java.util.Arrays.toString(this.previewImage) + ")";
        }
    }
}