package com.github.seratch.jslack.api.model;

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

    @java.beans.ConstructorProperties({"id", "created", "timestamp", "user", "comment", "channel"})
    FileComment(String id, Integer created, Integer timestamp, String user, String comment, String channel) {
        this.id = id;
        this.created = created;
        this.timestamp = timestamp;
        this.user = user;
        this.comment = comment;
        this.channel = channel;
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

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof FileComment)) return false;
        final FileComment other = (FileComment) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$created = this.getCreated();
        final Object other$created = other.getCreated();
        if (this$created == null ? other$created != null : !this$created.equals(other$created)) return false;
        final Object this$timestamp = this.getTimestamp();
        final Object other$timestamp = other.getTimestamp();
        if (this$timestamp == null ? other$timestamp != null : !this$timestamp.equals(other$timestamp)) return false;
        final Object this$user = this.getUser();
        final Object other$user = other.getUser();
        if (this$user == null ? other$user != null : !this$user.equals(other$user)) return false;
        final Object this$comment = this.getComment();
        final Object other$comment = other.getComment();
        if (this$comment == null ? other$comment != null : !this$comment.equals(other$comment)) return false;
        final Object this$channel = this.getChannel();
        final Object other$channel = other.getChannel();
        if (this$channel == null ? other$channel != null : !this$channel.equals(other$channel)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof FileComment;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $created = this.getCreated();
        result = result * PRIME + ($created == null ? 43 : $created.hashCode());
        final Object $timestamp = this.getTimestamp();
        result = result * PRIME + ($timestamp == null ? 43 : $timestamp.hashCode());
        final Object $user = this.getUser();
        result = result * PRIME + ($user == null ? 43 : $user.hashCode());
        final Object $comment = this.getComment();
        result = result * PRIME + ($comment == null ? 43 : $comment.hashCode());
        final Object $channel = this.getChannel();
        result = result * PRIME + ($channel == null ? 43 : $channel.hashCode());
        return result;
    }

    public String toString() {
        return "FileComment(id=" + this.getId() + ", created=" + this.getCreated() + ", timestamp=" + this.getTimestamp() + ", user=" + this.getUser() + ", comment=" + this.getComment() + ", channel=" + this.getChannel() + ")";
    }

    public static class FileCommentBuilder {
        private String id;
        private Integer created;
        private Integer timestamp;
        private String user;
        private String comment;
        private String channel;

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

        public FileComment build() {
            return new FileComment(id, created, timestamp, user, comment, channel);
        }

        public String toString() {
            return "FileComment.FileCommentBuilder(id=" + this.id + ", created=" + this.created + ", timestamp=" + this.timestamp + ", user=" + this.user + ", comment=" + this.comment + ", channel=" + this.channel + ")";
        }
    }
}