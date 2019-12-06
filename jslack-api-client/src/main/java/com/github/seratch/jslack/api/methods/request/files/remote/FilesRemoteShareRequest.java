package com.github.seratch.jslack.api.methods.request.files.remote;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

import java.util.List;

public class FilesRemoteShareRequest implements SlackApiRequest {

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

    /**
     * Comma-separated list of channel IDs where the file will be shared.
     */
    private List<String> channels;

    FilesRemoteShareRequest(String token, String externalId, String file, List<String> channels) {
        this.token = token;
        this.externalId = externalId;
        this.file = file;
        this.channels = channels;
    }

    public static FilesRemoteShareRequestBuilder builder() {
        return new FilesRemoteShareRequestBuilder();
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

    public List<String> getChannels() {
        return this.channels;
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

    public void setChannels(List<String> channels) {
        this.channels = channels;
    }

    public static class FilesRemoteShareRequestBuilder {
        private String token;
        private String externalId;
        private String file;
        private List<String> channels;

        FilesRemoteShareRequestBuilder() {
        }

        public FilesRemoteShareRequest.FilesRemoteShareRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public FilesRemoteShareRequest.FilesRemoteShareRequestBuilder externalId(String externalId) {
            this.externalId = externalId;
            return this;
        }

        public FilesRemoteShareRequest.FilesRemoteShareRequestBuilder file(String file) {
            this.file = file;
            return this;
        }

        public FilesRemoteShareRequest.FilesRemoteShareRequestBuilder channels(List<String> channels) {
            this.channels = channels;
            return this;
        }

        public FilesRemoteShareRequest build() {
            return new FilesRemoteShareRequest(token, externalId, file, channels);
        }

        public String toString() {
            return "FilesRemoteShareRequest.FilesRemoteShareRequestBuilder(token=" + this.token + ", externalId=" + this.externalId + ", file=" + this.file + ", channels=" + this.channels + ")";
        }
    }
}