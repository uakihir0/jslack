package com.github.seratch.jslack.api.model.event;

/**
 * The file_created event is sent to all connected clients for a user when that user uploads a file to Slack.
 * The file property includes the file ID, as well as a top-level file_id.
 * To obtain additional information about the file, use the files.info API method.
 * <p>
 * When a file is shared with other members of the workspace (which can happen at upload time)
 * a file_shared event will also be sent.
 * <p>
 * https://api.slack.com/events/file_created
 */
public class FileCreatedEvent implements Event {

    public static final String TYPE_NAME = "file_created";

    private final String type = TYPE_NAME;
    private String fileId;
    private File file;

    public String getType() {
        return this.type;
    }

    public String getFileId() {
        return this.fileId;
    }

    public File getFile() {
        return this.file;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public void setFile(File file) {
        this.file = file;
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