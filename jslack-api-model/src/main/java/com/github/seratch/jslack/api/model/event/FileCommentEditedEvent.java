package com.github.seratch.jslack.api.model.event;

/**
 * The file_comment_edited event is sent when a file comment is edited.
 * It is sent to all connected clients for users who can see the file.
 * Clients can use this notification to update comments in real-time for open files.
 * <p>
 * The file property includes the file ID, as well as a top-level file_id.
 * To obtain additional information about the file, use the files.info API method.
 * <p>
 * https://api.slack.com/events/file_comment_edited
 */
@Deprecated // https://api.slack.com/changelog/2018-05-file-threads-soon-tread
public class FileCommentEditedEvent implements Event {

    public static final String TYPE_NAME = "file_comment_edited";

    private final String type = TYPE_NAME;
    private FileComment comment;
    private String fileId;
    private File file;

    public FileCommentEditedEvent() {
    }

    public String getType() {
        return this.type;
    }

    public FileComment getComment() {
        return this.comment;
    }

    public String getFileId() {
        return this.fileId;
    }

    public File getFile() {
        return this.file;
    }

    public void setComment(FileComment comment) {
        this.comment = comment;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof FileCommentEditedEvent)) return false;
        final FileCommentEditedEvent other = (FileCommentEditedEvent) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$type = this.getType();
        final Object other$type = other.getType();
        if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
        final Object this$comment = this.getComment();
        final Object other$comment = other.getComment();
        if (this$comment == null ? other$comment != null : !this$comment.equals(other$comment)) return false;
        final Object this$fileId = this.getFileId();
        final Object other$fileId = other.getFileId();
        if (this$fileId == null ? other$fileId != null : !this$fileId.equals(other$fileId)) return false;
        final Object this$file = this.getFile();
        final Object other$file = other.getFile();
        if (this$file == null ? other$file != null : !this$file.equals(other$file)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof FileCommentEditedEvent;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $type = this.getType();
        result = result * PRIME + ($type == null ? 43 : $type.hashCode());
        final Object $comment = this.getComment();
        result = result * PRIME + ($comment == null ? 43 : $comment.hashCode());
        final Object $fileId = this.getFileId();
        result = result * PRIME + ($fileId == null ? 43 : $fileId.hashCode());
        final Object $file = this.getFile();
        result = result * PRIME + ($file == null ? 43 : $file.hashCode());
        return result;
    }

    public String toString() {
        return "FileCommentEditedEvent(type=" + this.getType() + ", comment=" + this.getComment() + ", fileId=" + this.getFileId() + ", file=" + this.getFile() + ")";
    }

    public static class FileComment {
        public FileComment() {
        }

        public boolean equals(final Object o) {
            if (o == this) return true;
            if (!(o instanceof FileComment)) return false;
            final FileComment other = (FileComment) o;
            if (!other.canEqual((Object) this)) return false;
            return true;
        }

        protected boolean canEqual(final Object other) {
            return other instanceof FileComment;
        }

        public int hashCode() {
            int result = 1;
            return result;
        }

        public String toString() {
            return "FileCommentEditedEvent.FileComment()";
        }
    }

    public static class File {
        private String id;

        public File() {
        }

        public String getId() {
            return this.id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public boolean equals(final Object o) {
            if (o == this) return true;
            if (!(o instanceof File)) return false;
            final File other = (File) o;
            if (!other.canEqual((Object) this)) return false;
            final Object this$id = this.getId();
            final Object other$id = other.getId();
            if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
            return true;
        }

        protected boolean canEqual(final Object other) {
            return other instanceof File;
        }

        public int hashCode() {
            final int PRIME = 59;
            int result = 1;
            final Object $id = this.getId();
            result = result * PRIME + ($id == null ? 43 : $id.hashCode());
            return result;
        }

        public String toString() {
            return "FileCommentEditedEvent.File(id=" + this.getId() + ")";
        }
    }
}