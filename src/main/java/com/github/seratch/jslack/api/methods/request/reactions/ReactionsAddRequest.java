package com.github.seratch.jslack.api.methods.request.reactions;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class ReactionsAddRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `reactions:write`
     */
    private String token;

    /**
     * Reaction (emoji) name.
     */
    private String name;

    /**
     * File to add reaction to.
     */
    private String file;

    /**
     * File comment to add reaction to.
     */
    private String fileComment;

    /**
     * Channel where the message to add reaction to was posted.
     */
    private String channel;

    /**
     * Timestamp of the message to add reaction to.
     */
    private String timestamp;

    ReactionsAddRequest(String token, String name, String file, String fileComment, String channel, String timestamp) {
        this.token = token;
        this.name = name;
        this.file = file;
        this.fileComment = fileComment;
        this.channel = channel;
        this.timestamp = timestamp;
    }

    public static ReactionsAddRequestBuilder builder() {
        return new ReactionsAddRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public String getName() {
        return this.name;
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

    public void setName(String name) {
        this.name = name;
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
        if (!(o instanceof ReactionsAddRequest)) return false;
        final ReactionsAddRequest other = (ReactionsAddRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$token = this.getToken();
        final Object other$token = other.getToken();
        if (this$token == null ? other$token != null : !this$token.equals(other$token)) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
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
        return other instanceof ReactionsAddRequest;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $token = this.getToken();
        result = result * PRIME + ($token == null ? 43 : $token.hashCode());
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
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
        return "ReactionsAddRequest(token=" + this.getToken() + ", name=" + this.getName() + ", file=" + this.getFile() + ", fileComment=" + this.getFileComment() + ", channel=" + this.getChannel() + ", timestamp=" + this.getTimestamp() + ")";
    }

    public static class ReactionsAddRequestBuilder {
        private String token;
        private String name;
        private String file;
        private String fileComment;
        private String channel;
        private String timestamp;

        ReactionsAddRequestBuilder() {
        }

        public ReactionsAddRequest.ReactionsAddRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public ReactionsAddRequest.ReactionsAddRequestBuilder name(String name) {
            this.name = name;
            return this;
        }

        public ReactionsAddRequest.ReactionsAddRequestBuilder file(String file) {
            this.file = file;
            return this;
        }

        public ReactionsAddRequest.ReactionsAddRequestBuilder fileComment(String fileComment) {
            this.fileComment = fileComment;
            return this;
        }

        public ReactionsAddRequest.ReactionsAddRequestBuilder channel(String channel) {
            this.channel = channel;
            return this;
        }

        public ReactionsAddRequest.ReactionsAddRequestBuilder timestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public ReactionsAddRequest build() {
            return new ReactionsAddRequest(token, name, file, fileComment, channel, timestamp);
        }

        public String toString() {
            return "ReactionsAddRequest.ReactionsAddRequestBuilder(token=" + this.token + ", name=" + this.name + ", file=" + this.file + ", fileComment=" + this.fileComment + ", channel=" + this.channel + ", timestamp=" + this.timestamp + ")";
        }
    }
}