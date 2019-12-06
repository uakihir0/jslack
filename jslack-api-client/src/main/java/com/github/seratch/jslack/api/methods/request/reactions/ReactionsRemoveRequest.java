package com.github.seratch.jslack.api.methods.request.reactions;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class ReactionsRemoveRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `reactions:write`
     */
    private String token;

    /**
     * Reaction (emoji) name.
     */
    private String name;

    /**
     * File to remove reaction from.
     */
    private String file;

    /**
     * File comment to remove reaction from.
     */
    private String fileComment;

    /**
     * Channel where the message to remove reaction from was posted.
     */
    private String channel;

    /**
     * Timestamp of the message to remove reaction from.
     */
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