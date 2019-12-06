package com.github.seratch.jslack.api.methods.request.files;

import com.github.seratch.jslack.api.methods.SlackApiRequest;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.io.File;
import java.io.InputStream;
import java.util.List;

@Getter
@Setter
@Builder
public class FilesUploadRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `files:write:user`
     */
    private String token;

    /**
     * File contents via `multipart/form-data`. If omitting this parameter, you must submit `content`.
     */
    private File file;
    private InputStream filestream;

    /**
     * File contents via a POST variable. If omitting this parameter, you must provide a `file`.
     */
    private String content;

    /**
     * A [file type](/types/file#file_types) identifier.
     */
    private String filetype;

    /**
     * Filename of file.
     */
    private String filename;

    /**
     * Title of file.
     */
    private String title;

    /**
     * Initial comment to add to file.
     */
    private String initialComment;

    /**
     * Comma-separated list of channel names or IDs where the file will be shared.
     */
    private List<String> channels;

    /**
     * Provide another message's ts value to upload this file as a reply. Never use a reply's ts value; use its parent instead.
     */
    private String threadTs;

}