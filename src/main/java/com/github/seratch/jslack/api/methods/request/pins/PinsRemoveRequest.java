package com.github.seratch.jslack.api.methods.request.pins;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class PinsRemoveRequest implements SlackApiRequest {

    private String token;
    private String channel;
    private String file;
    private String fileComment;
    private String timestamp;

    @java.beans.ConstructorProperties({"token", "channel", "file", "fileComment", "timestamp"})
    PinsRemoveRequest(String token, String channel, String file, String fileComment, String timestamp) {
        this.token = token;
        this.channel = channel;
        this.file = file;
        this.fileComment = fileComment;
        this.timestamp = timestamp;
    }

    public static PinsRemoveRequestBuilder builder() {
        return new PinsRemoveRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public String getChannel() {
        return this.channel;
    }

    public String getFile() {
        return this.file;
    }

    public String getFileComment() {
        return this.fileComment;
    }

    public String getTimestamp() {
        return this.timestamp;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public void setFileComment(String fileComment) {
        this.fileComment = fileComment;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof PinsRemoveRequest)) return false;
        final PinsRemoveRequest other = (PinsRemoveRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$token = this.getToken();
        final Object other$token = other.getToken();
        if (this$token == null ? other$token != null : !this$token.equals(other$token)) return false;
        final Object this$channel = this.getChannel();
        final Object other$channel = other.getChannel();
        if (this$channel == null ? other$channel != null : !this$channel.equals(other$channel)) return false;
        final Object this$file = this.getFile();
        final Object other$file = other.getFile();
        if (this$file == null ? other$file != null : !this$file.equals(other$file)) return false;
        final Object this$fileComment = this.getFileComment();
        final Object other$fileComment = other.getFileComment();
        if (this$fileComment == null ? other$fileComment != null : !this$fileComment.equals(other$fileComment))
            return false;
        final Object this$timestamp = this.getTimestamp();
        final Object other$timestamp = other.getTimestamp();
        if (this$timestamp == null ? other$timestamp != null : !this$timestamp.equals(other$timestamp)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $token = this.getToken();
        result = result * PRIME + ($token == null ? 43 : $token.hashCode());
        final Object $channel = this.getChannel();
        result = result * PRIME + ($channel == null ? 43 : $channel.hashCode());
        final Object $file = this.getFile();
        result = result * PRIME + ($file == null ? 43 : $file.hashCode());
        final Object $fileComment = this.getFileComment();
        result = result * PRIME + ($fileComment == null ? 43 : $fileComment.hashCode());
        final Object $timestamp = this.getTimestamp();
        result = result * PRIME + ($timestamp == null ? 43 : $timestamp.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof PinsRemoveRequest;
    }

    public String toString() {
        return "PinsRemoveRequest(token=" + this.getToken() + ", channel=" + this.getChannel() + ", file=" + this.getFile() + ", fileComment=" + this.getFileComment() + ", timestamp=" + this.getTimestamp() + ")";
    }

    public static class PinsRemoveRequestBuilder {
        private String token;
        private String channel;
        private String file;
        private String fileComment;
        private String timestamp;

        PinsRemoveRequestBuilder() {
        }

        public PinsRemoveRequest.PinsRemoveRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public PinsRemoveRequest.PinsRemoveRequestBuilder channel(String channel) {
            this.channel = channel;
            return this;
        }

        public PinsRemoveRequest.PinsRemoveRequestBuilder file(String file) {
            this.file = file;
            return this;
        }

        public PinsRemoveRequest.PinsRemoveRequestBuilder fileComment(String fileComment) {
            this.fileComment = fileComment;
            return this;
        }

        public PinsRemoveRequest.PinsRemoveRequestBuilder timestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public PinsRemoveRequest build() {
            return new PinsRemoveRequest(token, channel, file, fileComment, timestamp);
        }

        public String toString() {
            return "PinsRemoveRequest.PinsRemoveRequestBuilder(token=" + this.token + ", channel=" + this.channel + ", file=" + this.file + ", fileComment=" + this.fileComment + ", timestamp=" + this.timestamp + ")";
        }
    }
}