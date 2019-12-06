package com.github.seratch.jslack.api.model.event;

/**
 * The file_unshared event is sent when a file is unshared.
 * It is sent to all connected clients for all users that had permission to see the file.
 * The file property includes the file ID, as well as a top-level file_id.
 * To obtain additional information about the unshared file, use the files.info API method.
 * <p>
 * https://api.slack.com/events/file_unshared
 */
public class FileUnsharedEvent implements Event {

    public static final String TYPE_NAME = "file_unshared";

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