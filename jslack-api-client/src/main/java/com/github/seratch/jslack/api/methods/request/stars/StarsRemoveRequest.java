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