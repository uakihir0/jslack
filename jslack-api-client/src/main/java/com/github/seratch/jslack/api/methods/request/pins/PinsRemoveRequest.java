package com.github.seratch.jslack.api.methods.request.pins;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class PinsRemoveRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `pins:write`
     */
    private String token;

    /**
     * Channel where the item is pinned to.
     */
    private String channel;

    /**
     * File to un-pin.
     */
    private String file;

    /**
     * File comment to un-pin.
     */
    private String fileComment;

    /**
     * Timestamp of the message to un-pin.
     */
    private String timestamp;

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