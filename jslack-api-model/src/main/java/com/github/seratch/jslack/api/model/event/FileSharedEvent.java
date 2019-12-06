package com.github.seratch.jslack.api.model.event;

import lombok.Getter;
import lombok.Setter;

/**
 * The file_shared event is sent when a file is shared.
 * It is sent to all connected clients for all users that have permission to see the file.
 * The file property includes the file ID, as well as a top-level file_id.
 * To obtain additional information about the file, use the files.info API method.
 * <p>
 * https://api.slack.com/events/file_shared
 */
@Getter
@Setter
public class FileSharedEvent implements Event {

    public static final String TYPE_NAME = "file_shared";

    private final String type = TYPE_NAME;
    private String fileId;
    private File file;

    @Getter
@Setter
    public static class File {
        private String id;
    }
}