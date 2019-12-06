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

    public static class FileComment {
    }

    public static class File {
        private String id;

        public String getId() {
            return this.id;
        }

        public void setId(String id) {
            this.id = id;
        }
    }
}