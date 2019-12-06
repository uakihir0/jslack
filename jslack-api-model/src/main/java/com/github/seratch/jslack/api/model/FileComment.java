package com.github.seratch.jslack.api.model;

import com.google.gson.annotations.SerializedName;

/**
 * https://api.slack.com/methods/files.comments.add
 */
public class FileComment {

    private String id;
    private Integer created;
    private Integer timestamp;
    private String user;
    private String comment;
    private String channel;

    @SerializedName("is_intro")
    private boolean intro;

    public FileComment(String id, Integer created, Integer timestamp, String user, String comment, String channel, boolean intro) {
        this.id = id;
        this.created = created;
        this.timestamp = timestamp;
        this.user = user;
        this.comment = comment;
        this.channel = channel;
        this.intro = intro;
    }

    public FileComment() {
    }

    public static FileCommentBuilder builder() {
        return new FileCommentBuilder();
    }

    public String getId() {
        return this.id;
    }

    public Integer getCreated() {
        return this.created;
    }

    public Integer getTimestamp() {
        return this.timestamp;
    }

    public String getUser() {
        return this.user;
    }

    public String getComment() {
        return this.comment;
    }

    public String getChannel() {
        return this.channel;
    }

    public boolean isIntro() {
        return this.intro;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setCreated(Integer created) {
        this.created = created;
    }

    public void setTimestamp(Integer timestamp) {
        this.timestamp = timestamp;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public void setIntro(boolean intro) {
        this.intro = intro;
    }

    public static class FileCommentBuilder {
        private String id;
        private Integer created;
        private Integer timestamp;
        private String user;
        private String comment;
        private String channel;
        private boolean intro;

        FileCommentBuilder() {
        }

        public FileComment.FileCommentBuilder id(String id) {
            this.id = id;
            return this;
        }

        public FileComment.FileCommentBuilder created(Integer created) {
            this.created = created;
            return this;
        }

        public FileComment.FileCommentBuilder timestamp(Integer timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public FileComment.FileCommentBuilder user(String user) {
            this.user = user;
            return this;
        }

        public FileComment.FileCommentBuilder comment(String comment) {
            this.comment = comment;
            return this;
        }

        public FileComment.FileCommentBuilder channel(String channel) {
            this.channel = channel;
            return this;
        }

        public FileComment.FileCommentBuilder intro(boolean intro) {
            this.intro = intro;
            return this;
        }

        public FileComment build() {
            return new FileComment(id, created, timestamp, user, comment, channel, intro);
        }

        public String toString() {
            return "FileComment.FileCommentBuilder(id=" + this.id + ", created=" + this.created + ", timestamp=" + this.timestamp + ", user=" + this.user + ", comment=" + this.comment + ", channel=" + this.channel + ", intro=" + this.intro + ")";
        }
    }
}