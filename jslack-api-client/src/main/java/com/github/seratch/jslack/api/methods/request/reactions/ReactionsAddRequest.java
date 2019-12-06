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