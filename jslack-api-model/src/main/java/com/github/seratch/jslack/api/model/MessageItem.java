package com.github.seratch.jslack.api.model;

@Deprecated
public class MessageItem {

    private String type;
    private String channel;
    private Message message;
    private File file;
    private FileComment comment;
    private Integer created;

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
}
