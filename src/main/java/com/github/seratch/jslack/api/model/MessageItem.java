package com.github.seratch.jslack.api.model;

public class MessageItem {

    private String type;
    private String channel;
    private Message message;
    private File file;
    private FileComment comment;
    private Integer created;

    public MessageItem() {
    }

    public String getType() {
        return this.type;
    }

    public String getChannel() {
        return this.channel;
    }

    public Message getMessage() {
        return this.message;
    }

    public File getFile() {
        return this.file;
    }

    public FileComment getComment() {
        return this.comment;
    }

    public Integer getCreated() {
        return this.created;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public void setComment(FileComment comment) {
        this.comment = comment;
    }

    public void setCreated(Integer created) {
        this.created = created;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof MessageItem)) return false;
        final MessageItem other = (MessageItem) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$type = this.getType();
        final Object other$type = other.getType();
        if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
        final Object this$channel = this.getChannel();
        final Object other$channel = other.getChannel();
        if (this$channel == null ? other$channel != null : !this$channel.equals(other$channel)) return false;
        final Object this$message = this.getMessage();
        final Object other$message = other.getMessage();
        if (this$message == null ? other$message != null : !this$message.equals(other$message)) return false;
        final Object this$file = this.getFile();
        final Object other$file = other.getFile();
        if (this$file == null ? other$file != null : !this$file.equals(other$file)) return false;
        final Object this$comment = this.getComment();
        final Object other$comment = other.getComment();
        if (this$comment == null ? other$comment != null : !this$comment.equals(other$comment)) return false;
        final Object this$created = this.getCreated();
        final Object other$created = other.getCreated();
        if (this$created == null ? other$created != null : !this$created.equals(other$created)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof MessageItem;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $type = this.getType();
        result = result * PRIME + ($type == null ? 43 : $type.hashCode());
        final Object $channel = this.getChannel();
        result = result * PRIME + ($channel == null ? 43 : $channel.hashCode());
        final Object $message = this.getMessage();
        result = result * PRIME + ($message == null ? 43 : $message.hashCode());
        final Object $file = this.getFile();
        result = result * PRIME + ($file == null ? 43 : $file.hashCode());
        final Object $comment = this.getComment();
        result = result * PRIME + ($comment == null ? 43 : $comment.hashCode());
        final Object $created = this.getCreated();
        result = result * PRIME + ($created == null ? 43 : $created.hashCode());
        return result;
    }

    public String toString() {
        return "MessageItem(type=" + this.getType() + ", channel=" + this.getChannel() + ", message=" + this.getMessage() + ", file=" + this.getFile() + ", comment=" + this.getComment() + ", created=" + this.getCreated() + ")";
    }
}
