package com.github.seratch.jslack.api.methods.request.files;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class FilesSharedPublicURLRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `files:write:user`
     */
    private String token;

    /**
     * File to share
     */
    private String file;

    FilesSharedPublicURLRequest(String token, String file) {
        this.token = token;
        this.file = file;
    }

    public static FilesSharedPublicURLRequestBuilder builder() {
        return new FilesSharedPublicURLRequestBuilder();
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

    public static class FilesSharedPublicURLRequestBuilder {
        private String token;
        private String file;

        FilesSharedPublicURLRequestBuilder() {
        }

        public FilesSharedPublicURLRequest.FilesSharedPublicURLRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public FilesSharedPublicURLRequest.FilesSharedPublicURLRequestBuilder file(String file) {
            this.file = file;
            return this;
        }

        public FilesSharedPublicURLRequest build() {
            return new FilesSharedPublicURLRequest(token, file);
        }

        public String toString() {
            return "FilesSharedPublicURLRequest.FilesSharedPublicURLRequestBuilder(token=" + this.token + ", file=" + this.file + ")";
        }
    }
}