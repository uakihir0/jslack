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

    @java.beans.ConstructorProperties({"token", "file"})
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

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof FilesSharedPublicURLRequest))
            return false;
        final FilesSharedPublicURLRequest other = (FilesSharedPublicURLRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$token = this.getToken();
        final Object other$token = other.getToken();
        if (this$token == null ? other$token != null : !this$token.equals(other$token)) return false;
        final Object this$file = this.getFile();
        final Object other$file = other.getFile();
        if (this$file == null ? other$file != null : !this$file.equals(other$file)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof FilesSharedPublicURLRequest;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $token = this.getToken();
        result = result * PRIME + ($token == null ? 43 : $token.hashCode());
        final Object $file = this.getFile();
        result = result * PRIME + ($file == null ? 43 : $file.hashCode());
        return result;
    }

    public String toString() {
        return "FilesSharedPublicURLRequest(token=" + this.getToken() + ", file=" + this.getFile() + ")";
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