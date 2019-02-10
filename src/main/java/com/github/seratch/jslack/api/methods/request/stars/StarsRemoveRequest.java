package com.github.seratch.jslack.api.methods.request.stars;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class StarsRemoveRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `stars:write`
     */
    private String token;

    /**
     * File to remove star from.
     */
    private String file;

    /**
     * File comment to remove star from.
     */
    private String fileComment;

    /**
     * Channel to remove star from, or channel where the message to remove star from was posted (used with `timestamp`).
     */
    private String channel;

    /**
     * Timestamp of the message to remove star from.
     */
    private String timestamp;

    @java.beans.ConstructorProperties({"token", "file", "fileComment", "channel", "timestamp"})
    StarsRemoveRequest(String token, String file, String fileComment, String channel, String timestamp) {
        this.token = token;
        this.file = file;
        this.fileComment = fileComment;
        this.channel = channel;
        this.timestamp = timestamp;
    }

    public static StarsRemoveRequestBuilder builder() {
        return new StarsRemoveRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public String getFile() {
        return this.file;
    }

    public String getFileComment() {
        return this.fileComment;
    }

    public String getChannel() {
        return this.channel;
    }

    public String getTimestamp() {
        return this.timestamp;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public void setFileComment(String fileComment) {
        this.fileComment = fileComment;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof StarsRemoveRequest)) return false;
        final StarsRemoveRequest other = (StarsRemoveRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$token = this.getToken();
        final Object other$token = other.getToken();
        if (this$token == null ? other$token != null : !this$token.equals(other$token)) return false;
        final Object this$file = this.getFile();
        final Object other$file = other.getFile();
        if (this$file == null ? other$file != null : !this$file.equals(other$file)) return false;
        final Object this$fileComment = this.getFileComment();
        final Object other$fileComment = other.getFileComment();
        if (this$fileComment == null ? other$fileComment != null : !this$fileComment.equals(other$fileComment))
            return false;
        final Object this$channel = this.getChannel();
        final Object other$channel = other.getChannel();
        if (this$channel == null ? other$channel != null : !this$channel.equals(other$channel)) return false;
        final Object this$timestamp = this.getTimestamp();
        final Object other$timestamp = other.getTimestamp();
        if (this$timestamp == null ? other$timestamp != null : !this$timestamp.equals(other$timestamp)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof StarsRemoveRequest;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $token = this.getToken();
        result = result * PRIME + ($token == null ? 43 : $token.hashCode());
        final Object $file = this.getFile();
        result = result * PRIME + ($file == null ? 43 : $file.hashCode());
        final Object $fileComment = this.getFileComment();
        result = result * PRIME + ($fileComment == null ? 43 : $fileComment.hashCode());
        final Object $channel = this.getChannel();
        result = result * PRIME + ($channel == null ? 43 : $channel.hashCode());
        final Object $timestamp = this.getTimestamp();
        result = result * PRIME + ($timestamp == null ? 43 : $timestamp.hashCode());
        return result;
    }

    public String toString() {
        return "StarsRemoveRequest(token=" + this.getToken() + ", file=" + this.getFile() + ", fileComment=" + this.getFileComment() + ", channel=" + this.getChannel() + ", timestamp=" + this.getTimestamp() + ")";
    }

    public static class StarsRemoveRequestBuilder {
        private String token;
        private String file;
        private String fileComment;
        private String channel;
        private String timestamp;

        StarsRemoveRequestBuilder() {
        }

        public StarsRemoveRequest.StarsRemoveRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public StarsRemoveRequest.StarsRemoveRequestBuilder file(String file) {
            this.file = file;
            return this;
        }

        public StarsRemoveRequest.StarsRemoveRequestBuilder fileComment(String fileComment) {
            this.fileComment = fileComment;
            return this;
        }

        public StarsRemoveRequest.StarsRemoveRequestBuilder channel(String channel) {
            this.channel = channel;
            return this;
        }

        public StarsRemoveRequest.StarsRemoveRequestBuilder timestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public StarsRemoveRequest build() {
            return new StarsRemoveRequest(token, file, fileComment, channel, timestamp);
        }

        public String toString() {
            return "StarsRemoveRequest.StarsRemoveRequestBuilder(token=" + this.token + ", file=" + this.file + ", fileComment=" + this.fileComment + ", channel=" + this.channel + ", timestamp=" + this.timestamp + ")";
        }
    }
}