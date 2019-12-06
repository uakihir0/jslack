package com.github.seratch.jslack.api.methods.request.files;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class FilesRevokePublicURLRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `files:write:user`
     */
    private String token;

    /**
     * File to revoke
     */
    private String file;

    FilesRevokePublicURLRequest(String token, String file) {
        this.token = token;
        this.file = file;
    }

    public static FilesRevokePublicURLRequestBuilder builder() {
        return new FilesRevokePublicURLRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public String getFile() {
        return this.file;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public static class FilesRevokePublicURLRequestBuilder {
        private String token;
        private String file;

        FilesRevokePublicURLRequestBuilder() {
        }

        public FilesRevokePublicURLRequest.FilesRevokePublicURLRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public FilesRevokePublicURLRequest.FilesRevokePublicURLRequestBuilder file(String file) {
            this.file = file;
            return this;
        }

        public FilesRevokePublicURLRequest build() {
            return new FilesRevokePublicURLRequest(token, file);
        }

        public String toString() {
            return "FilesRevokePublicURLRequest.FilesRevokePublicURLRequestBuilder(token=" + this.token + ", file=" + this.file + ")";
        }
    }
}