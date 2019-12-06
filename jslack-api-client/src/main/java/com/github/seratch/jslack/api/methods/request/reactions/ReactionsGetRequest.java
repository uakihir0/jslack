package com.github.seratch.jslack.api.methods.request.reactions;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class ReactionsGetRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `reactions:read`
     */
    private String token;

    /**
     * File to get reactions for.
     */
    private String file;

    /**
     * File comment to get reactions for.
     */
    private String fileComment;

    /**
     * Channel where the message to get reactions for was posted.
     */
    private String channel;

    /**
     * Timestamp of the message to get reactions for.
     */
    private String timestamp;

    /**
     * If true always return the complete reaction list.
     */
    private boolean full;

    ReactionsGetRequest(String token, String file, String fileComment, String channel, String timestamp, boolean full) {
        this.token = token;
        this.file = file;
        this.fileComment = fileComment;
        this.channel = channel;
        this.timestamp = timestamp;
        this.full = full;
    }

    public static ReactionsGetRequestBuilder builder() {
        return new ReactionsGetRequestBuilder();
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

    public boolean isFull() {
        return this.full;
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

    public void setFull(boolean full) {
        this.full = full;
    }

    public static class ReactionsGetRequestBuilder {
        private String token;
        private String file;
        private String fileComment;
        private String channel;
        private String timestamp;
        private boolean full;

        ReactionsGetRequestBuilder() {
        }

        public ReactionsGetRequest.ReactionsGetRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public ReactionsGetRequest.ReactionsGetRequestBuilder file(String file) {
            this.file = file;
            return this;
        }

        public ReactionsGetRequest.ReactionsGetRequestBuilder fileComment(String fileComment) {
            this.fileComment = fileComment;
            return this;
        }

        public ReactionsGetRequest.ReactionsGetRequestBuilder channel(String channel) {
            this.channel = channel;
            return this;
        }

        public ReactionsGetRequest.ReactionsGetRequestBuilder timestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public ReactionsGetRequest.ReactionsGetRequestBuilder full(boolean full) {
            this.full = full;
            return this;
        }

        public ReactionsGetRequest build() {
            return new ReactionsGetRequest(token, file, fileComment, channel, timestamp, full);
        }

        public String toString() {
            return "ReactionsGetRequest.ReactionsGetRequestBuilder(token=" + this.token + ", file=" + this.file + ", fileComment=" + this.fileComment + ", channel=" + this.channel + ", timestamp=" + this.timestamp + ", full=" + this.full + ")";
        }
    }
}