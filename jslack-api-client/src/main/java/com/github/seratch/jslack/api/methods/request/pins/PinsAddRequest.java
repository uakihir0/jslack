package com.github.seratch.jslack.api.methods.request.pins;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class PinsAddRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `pins:write`
     */
    private String token;

    /**
     * Channel to pin the item in.
     */
    private String channel;

    /**
     * File to pin.
     */
    private String file;

    /**
     * File comment to pin.
     */
    private String fileComment;

    /**
     * Timestamp of the message to pin.
     */
    private String timestamp;

    PinsAddRequest(String token, String channel, String file, String fileComment, String timestamp) {
        this.token = token;
        this.channel = channel;
        this.file = file;
        this.fileComment = fileComment;
        this.timestamp = timestamp;
    }

    public static PinsAddRequestBuilder builder() {
        return new PinsAddRequestBuilder();
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

    public static class PinsAddRequestBuilder {
        private String token;
        private String channel;
        private String file;
        private String fileComment;
        private String timestamp;

        PinsAddRequestBuilder() {
        }

        public PinsAddRequest.PinsAddRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public PinsAddRequest.PinsAddRequestBuilder channel(String channel) {
            this.channel = channel;
            return this;
        }

        public PinsAddRequest.PinsAddRequestBuilder file(String file) {
            this.file = file;
            return this;
        }

        public PinsAddRequest.PinsAddRequestBuilder fileComment(String fileComment) {
            this.fileComment = fileComment;
            return this;
        }

        public PinsAddRequest.PinsAddRequestBuilder timestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public PinsAddRequest build() {
            return new PinsAddRequest(token, channel, file, fileComment, timestamp);
        }

        public String toString() {
            return "PinsAddRequest.PinsAddRequestBuilder(token=" + this.token + ", channel=" + this.channel + ", file=" + this.file + ", fileComment=" + this.fileComment + ", timestamp=" + this.timestamp + ")";
        }
    }
}