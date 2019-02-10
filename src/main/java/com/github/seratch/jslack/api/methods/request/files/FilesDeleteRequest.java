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

    @java.beans.ConstructorProperties({"token", "file"})
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

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof FilesDeleteRequest)) return false;
        final FilesDeleteRequest other = (FilesDeleteRequest) o;
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
        return other instanceof FilesDeleteRequest;
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
        return "FilesDeleteRequest(token=" + this.getToken() + ", file=" + this.getFile() + ")";
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