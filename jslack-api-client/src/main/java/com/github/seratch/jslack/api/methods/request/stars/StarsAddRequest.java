package com.github.seratch.jslack.api.methods.request.stars;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class StarsAddRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `stars:write`
     */
    private String token;

    /**
     * File to add star to.
     */
    private String file;

    /**
     * File comment to add star to.
     */
    private String fileComment;

    /**
     * Channel to add star to, or channel where the message to add star to was posted (used with `timestamp`).
     */
    private String channel;

    /**
     * Timestamp of the message to add star to.
     */
    private String timestamp;

    StarsAddRequest(String token, String file, String fileComment, String channel, String timestamp) {
        this.token = token;
        this.file = file;
        this.fileComment = fileComment;
        this.channel = channel;
        this.timestamp = timestamp;
    }

    public static StarsAddRequestBuilder builder() {
        return new StarsAddRequestBuilder();
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

    public static class StarsAddRequestBuilder {
        private String token;
        private String file;
        private String fileComment;
        private String channel;
        private String timestamp;

        StarsAddRequestBuilder() {
        }

        public StarsAddRequest.StarsAddRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public StarsAddRequest.StarsAddRequestBuilder file(String file) {
            this.file = file;
            return this;
        }

        public StarsAddRequest.StarsAddRequestBuilder fileComment(String fileComment) {
            this.fileComment = fileComment;
            return this;
        }

        public StarsAddRequest.StarsAddRequestBuilder channel(String channel) {
            this.channel = channel;
            return this;
        }

        public StarsAddRequest.StarsAddRequestBuilder timestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public StarsAddRequest build() {
            return new StarsAddRequest(token, file, fileComment, channel, timestamp);
        }

        public String toString() {
            return "StarsAddRequest.StarsAddRequestBuilder(token=" + this.token + ", file=" + this.file + ", fileComment=" + this.fileComment + ", channel=" + this.channel + ", timestamp=" + this.timestamp + ")";
        }
    }
}