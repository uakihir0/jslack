package com.github.seratch.jslack.api.model.event;

/**
 * The file_deleted event is sent to all connected clients for a workspace when a file is deleted. Unlike most file events,
 * the file property contains a file ID and not a full file object.
 * <p>
 * https://api.slack.com/events/file_deleted
 */
public class FileDeletedEvent implements Event {

    public static final String TYPE_NAME = "file_deleted";

    private final String type = TYPE_NAME;
    private String fileId;
    private String eventTs;

    public String getType() {
        return this.type;
    }

    public String getFileId() {
        return this.fileId;
    }

    public String getEventTs() {
        return this.eventTs;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public void setEventTs(String eventTs) {
        this.eventTs = eventTs;
    }
}