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

    public FileDeletedEvent() {
    }

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

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof FileDeletedEvent)) return false;
        final FileDeletedEvent other = (FileDeletedEvent) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$type = this.getType();
        final Object other$type = other.getType();
        if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
        final Object this$fileId = this.getFileId();
        final Object other$fileId = other.getFileId();
        if (this$fileId == null ? other$fileId != null : !this$fileId.equals(other$fileId)) return false;
        final Object this$eventTs = this.getEventTs();
        final Object other$eventTs = other.getEventTs();
        if (this$eventTs == null ? other$eventTs != null : !this$eventTs.equals(other$eventTs)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof FileDeletedEvent;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $type = this.getType();
        result = result * PRIME + ($type == null ? 43 : $type.hashCode());
        final Object $fileId = this.getFileId();
        result = result * PRIME + ($fileId == null ? 43 : $fileId.hashCode());
        final Object $eventTs = this.getEventTs();
        result = result * PRIME + ($eventTs == null ? 43 : $eventTs.hashCode());
        return result;
    }

    public String toString() {
        return "FileDeletedEvent(type=" + this.getType() + ", fileId=" + this.getFileId() + ", eventTs=" + this.getEventTs() + ")";
    }
}