package com.github.seratch.jslack.api.methods.request.files;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class FilesDeleteRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `files:write:user`
     */
    private String token;

    /**
     * ID of file to delete.
     */
    private String file;

    FilesDeleteRequest(String token, String file) {
        this.token = token;
        this.file = file;
    }

    public static FilesDeleteRequestBuilder builder() {
        return new FilesDeleteRequestBuilder();
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

    public static class FilesDeleteRequestBuilder {
        private String token;
        private String file;

        FilesDeleteRequestBuilder() {
        }

        public FilesDeleteRequest.FilesDeleteRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public FilesDeleteRequest.FilesDeleteRequestBuilder file(String file) {
            this.file = file;
            return this;
        }

        public FilesDeleteRequest build() {
            return new FilesDeleteRequest(token, file);
        }

        public String toString() {
            return "FilesDeleteRequest.FilesDeleteRequestBuilder(token=" + this.token + ", file=" + this.file + ")";
        }
    }
}