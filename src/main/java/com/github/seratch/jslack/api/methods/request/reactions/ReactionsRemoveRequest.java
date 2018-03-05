package com.github.seratch.jslack.api.methods.request.reactions;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class ReactionsRemoveRequest implements SlackApiRequest {

    private String token;
    private String name;
    private String file;
    private String fileComment;
    private String channel;
    private String timestamp;

    ReactionsRemoveRequest(String token, String name, String file, String fileComment, String channel, String timestamp) {
        this.token = token;
        this.name = name;
        this.file = file;
        this.fileComment = fileComment;
        this.channel = channel;
        this.timestamp = timestamp;
    }

    public static ReactionsRemoveRequestBuilder builder() {
        return new ReactionsRemoveRequestBuilder();
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

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof ReactionsRemoveRequest)) return false;
        final ReactionsRemoveRequest other = (ReactionsRemoveRequest) o;
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

    protected boolean canEqual(Object other) {
        return other instanceof ReactionsRemoveRequest;
    }

    public String toString() {
        return "ReactionsRemoveRequest(token=" + this.getToken() + ", name=" + this.getName() + ", file=" + this.getFile() + ", fileComment=" + this.getFileComment() + ", channel=" + this.getChannel() + ", timestamp=" + this.getTimestamp() + ")";
    }

    public static class ReactionsRemoveRequestBuilder {
        private String token;
        private String name;
        private String file;
        private String fileComment;
        private String channel;
        private String timestamp;

        ReactionsRemoveRequestBuilder() {
        }

        public ReactionsRemoveRequest.ReactionsRemoveRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public ReactionsRemoveRequest.ReactionsRemoveRequestBuilder name(String name) {
            this.name = name;
            return this;
        }

        public ReactionsRemoveRequest.ReactionsRemoveRequestBuilder file(String file) {
            this.file = file;
            return this;
        }

        public ReactionsRemoveRequest.ReactionsRemoveRequestBuilder fileComment(String fileComment) {
            this.fileComment = fileComment;
            return this;
        }

        public ReactionsRemoveRequest.ReactionsRemoveRequestBuilder channel(String channel) {
            this.channel = channel;
            return this;
        }

        public ReactionsRemoveRequest.ReactionsRemoveRequestBuilder timestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public ReactionsRemoveRequest build() {
            return new ReactionsRemoveRequest(token, name, file, fileComment, channel, timestamp);
        }

        public String toString() {
            return "ReactionsRemoveRequest.ReactionsRemoveRequestBuilder(token=" + this.token + ", name=" + this.name + ", file=" + this.file + ", fileComment=" + this.fileComment + ", channel=" + this.channel + ", timestamp=" + this.timestamp + ")";
        }
    }
}