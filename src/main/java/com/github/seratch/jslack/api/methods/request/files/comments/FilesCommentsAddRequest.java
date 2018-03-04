package com.github.seratch.jslack.api.methods.request.files.comments;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class FilesCommentsAddRequest implements SlackApiRequest {

    private String token;
    private String file;
    private String comment;
    private String channel;

    @java.beans.ConstructorProperties({"token", "file", "comment", "channel"})
    FilesCommentsAddRequest(String token, String file, String comment, String channel) {
        this.token = token;
        this.file = file;
        this.comment = comment;
        this.channel = channel;
    }

    public static FilesCommentsAddRequestBuilder builder() {
        return new FilesCommentsAddRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public String getFile() {
        return this.file;
    }

    public String getComment() {
        return this.comment;
    }

    public String getChannel() {
        return this.channel;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof FilesCommentsAddRequest)) return false;
        final FilesCommentsAddRequest other = (FilesCommentsAddRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$token = this.getToken();
        final Object other$token = other.getToken();
        if (this$token == null ? other$token != null : !this$token.equals(other$token)) return false;
        final Object this$file = this.getFile();
        final Object other$file = other.getFile();
        if (this$file == null ? other$file != null : !this$file.equals(other$file)) return false;
        final Object this$comment = this.getComment();
        final Object other$comment = other.getComment();
        if (this$comment == null ? other$comment != null : !this$comment.equals(other$comment)) return false;
        final Object this$channel = this.getChannel();
        final Object other$channel = other.getChannel();
        if (this$channel == null ? other$channel != null : !this$channel.equals(other$channel)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $token = this.getToken();
        result = result * PRIME + ($token == null ? 43 : $token.hashCode());
        final Object $file = this.getFile();
        result = result * PRIME + ($file == null ? 43 : $file.hashCode());
        final Object $comment = this.getComment();
        result = result * PRIME + ($comment == null ? 43 : $comment.hashCode());
        final Object $channel = this.getChannel();
        result = result * PRIME + ($channel == null ? 43 : $channel.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof FilesCommentsAddRequest;
    }

    public String toString() {
        return "FilesCommentsAddRequest(token=" + this.getToken() + ", file=" + this.getFile() + ", comment=" + this.getComment() + ", channel=" + this.getChannel() + ")";
    }

    public static class FilesCommentsAddRequestBuilder {
        private String token;
        private String file;
        private String comment;
        private String channel;

        FilesCommentsAddRequestBuilder() {
        }

        public FilesCommentsAddRequest.FilesCommentsAddRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public FilesCommentsAddRequest.FilesCommentsAddRequestBuilder file(String file) {
            this.file = file;
            return this;
        }

        public FilesCommentsAddRequest.FilesCommentsAddRequestBuilder comment(String comment) {
            this.comment = comment;
            return this;
        }

        public FilesCommentsAddRequest.FilesCommentsAddRequestBuilder channel(String channel) {
            this.channel = channel;
            return this;
        }

        public FilesCommentsAddRequest build() {
            return new FilesCommentsAddRequest(token, file, comment, channel);
        }

        public String toString() {
            return "FilesCommentsAddRequest.FilesCommentsAddRequestBuilder(token=" + this.token + ", file=" + this.file + ", comment=" + this.comment + ", channel=" + this.channel + ")";
        }
    }
}