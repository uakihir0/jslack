package com.github.seratch.jslack.api.model.event;

import lombok.Getter;
import lombok.Setter;

/**
 * The file_comment_added event is sent when a comment is added to file.
 * It is sent to all connected clients for users who can see the file.
 * Clients can use this notification to show comments in real-time for open files.
 * <p>
 * The file property includes the file ID, as well as a top-level file_id.
 * To obtain additional information about the file, use the files.info API method.
 * <p>
 * https://api.slack.com/events/file_comment_added
 */
@Deprecated // https://api.slack.com/changelog/2018-05-file-threads-soon-tread
@Getter
@Setter
public class FileCommentAddedEvent implements Event {

    public static final String TYPE_NAME = "file_comment_added";

    private final String type = TYPE_NAME;
    private FileComment comment;
    private String fileId;
    private File file;

    @Getter
@Setter
    public static class FileComment {
    }

    @Getter
@Setter
    public static class File {
        private String id;
    }
}