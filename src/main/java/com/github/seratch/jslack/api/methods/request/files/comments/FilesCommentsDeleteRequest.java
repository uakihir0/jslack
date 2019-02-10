package com.github.seratch.jslack.api.methods.request.files.comments;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class FilesCommentsDeleteRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `files:write:user`
     */
    private String token;

    /**
     * File to delete a comment from.
     */
    private String file;

    /**
     * The comment to delete.
     */
    private String id;

    @java.beans.ConstructorProperties({"token", "file", "id"})
    FilesCommentsDeleteRequest(String token, String file, String id) {
        this.token = token;
        this.file = file;
        this.id = id;
    }

    public static FilesCommentsDeleteRequestBuilder builder() {
        return new FilesCommentsDeleteRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public String getFile() {
        return this.file;
    }

    public String getId() {
        return this.id;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof FilesCommentsDeleteRequest))
            return false;
        final FilesCommentsDeleteRequest other = (FilesCommentsDeleteRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$token = this.getToken();
        final Object other$token = other.getToken();
        if (this$token == null ? other$token != null : !this$token.equals(other$token)) return false;
        final Object this$file = this.getFile();
        final Object other$file = other.getFile();
        if (this$file == null ? other$file != null : !this$file.equals(other$file)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof FilesCommentsDeleteRequest;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $token = this.getToken();
        result = result * PRIME + ($token == null ? 43 : $token.hashCode());
        final Object $file = this.getFile();
        result = result * PRIME + ($file == null ? 43 : $file.hashCode());
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        return result;
    }

    public String toString() {
        return "FilesCommentsDeleteRequest(token=" + this.getToken() + ", file=" + this.getFile() + ", id=" + this.getId() + ")";
    }

    public static class FilesCommentsDeleteRequestBuilder {
        private String token;
        private String file;
        private String id;

        FilesCommentsDeleteRequestBuilder() {
        }

        public FilesCommentsDeleteRequest.FilesCommentsDeleteRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public FilesCommentsDeleteRequest.FilesCommentsDeleteRequestBuilder file(String file) {
            this.file = file;
            return this;
        }

        public FilesCommentsDeleteRequest.FilesCommentsDeleteRequestBuilder id(String id) {
            this.id = id;
            return this;
        }

        public FilesCommentsDeleteRequest build() {
            return new FilesCommentsDeleteRequest(token, file, id);
        }

        public String toString() {
            return "FilesCommentsDeleteRequest.FilesCommentsDeleteRequestBuilder(token=" + this.token + ", file=" + this.file + ", id=" + this.id + ")";
        }
    }
}