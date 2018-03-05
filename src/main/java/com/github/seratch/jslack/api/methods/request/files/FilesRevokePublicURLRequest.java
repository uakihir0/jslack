package com.github.seratch.jslack.api.methods.request.files;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class FilesRevokePublicURLRequest implements SlackApiRequest {

    private String token;
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

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof FilesRevokePublicURLRequest)) return false;
        final FilesRevokePublicURLRequest other = (FilesRevokePublicURLRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$token = this.getToken();
        final Object other$token = other.getToken();
        if (this$token == null ? other$token != null : !this$token.equals(other$token)) return false;
        final Object this$file = this.getFile();
        final Object other$file = other.getFile();
        if (this$file == null ? other$file != null : !this$file.equals(other$file)) return false;
        return true;
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

    protected boolean canEqual(Object other) {
        return other instanceof FilesRevokePublicURLRequest;
    }

    public String toString() {
        return "FilesRevokePublicURLRequest(token=" + this.getToken() + ", file=" + this.getFile() + ")";
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