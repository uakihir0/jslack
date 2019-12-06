package com.github.seratch.jslack.api.methods.request.files;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

import java.io.File;
import java.io.InputStream;
import java.util.List;

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

    FilesUploadRequest(String token, File file, InputStream filestream, String content, String filetype, String filename, String title, String initialComment, List<String> channels, String threadTs) {
        this.token = token;
        this.file = file;
        this.filestream = filestream;
        this.content = content;
        this.filetype = filetype;
        this.filename = filename;
        this.title = title;
        this.initialComment = initialComment;
        this.channels = channels;
        this.threadTs = threadTs;
    }

    public static FilesUploadRequestBuilder builder() {
        return new FilesUploadRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public File getFile() {
        return this.file;
    }

    public InputStream getFilestream() {
        return this.filestream;
    }

    public String getContent() {
        return this.content;
    }

    public String getFiletype() {
        return this.filetype;
    }

    public String getFilename() {
        return this.filename;
    }

    public String getTitle() {
        return this.title;
    }

    public String getInitialComment() {
        return this.initialComment;
    }

    public List<String> getChannels() {
        return this.channels;
    }

    public String getThreadTs() {
        return this.threadTs;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public void setFilestream(InputStream filestream) {
        this.filestream = filestream;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setFiletype(String filetype) {
        this.filetype = filetype;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setInitialComment(String initialComment) {
        this.initialComment = initialComment;
    }

    public void setChannels(List<String> channels) {
        this.channels = channels;
    }

    public void setThreadTs(String threadTs) {
        this.threadTs = threadTs;
    }

    public static class FilesUploadRequestBuilder {
        private String token;
        private File file;
        private InputStream filestream;
        private String content;
        private String filetype;
        private String filename;
        private String title;
        private String initialComment;
        private List<String> channels;
        private String threadTs;

        FilesUploadRequestBuilder() {
        }

        public FilesUploadRequest.FilesUploadRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public FilesUploadRequest.FilesUploadRequestBuilder file(File file) {
            this.file = file;
            return this;
        }

        public FilesUploadRequest.FilesUploadRequestBuilder filestream(InputStream filestream) {
            this.filestream = filestream;
            return this;
        }

        public FilesUploadRequest.FilesUploadRequestBuilder content(String content) {
            this.content = content;
            return this;
        }

        public FilesUploadRequest.FilesUploadRequestBuilder filetype(String filetype) {
            this.filetype = filetype;
            return this;
        }

        public FilesUploadRequest.FilesUploadRequestBuilder filename(String filename) {
            this.filename = filename;
            return this;
        }

        public FilesUploadRequest.FilesUploadRequestBuilder title(String title) {
            this.title = title;
            return this;
        }

        public FilesUploadRequest.FilesUploadRequestBuilder initialComment(String initialComment) {
            this.initialComment = initialComment;
            return this;
        }

        public FilesUploadRequest.FilesUploadRequestBuilder channels(List<String> channels) {
            this.channels = channels;
            return this;
        }

        public FilesUploadRequest.FilesUploadRequestBuilder threadTs(String threadTs) {
            this.threadTs = threadTs;
            return this;
        }

        public FilesUploadRequest build() {
            return new FilesUploadRequest(token, file, filestream, content, filetype, filename, title, initialComment, channels, threadTs);
        }

        public String toString() {
            return "FilesUploadRequest.FilesUploadRequestBuilder(token=" + this.token + ", file=" + this.file + ", filestream=" + this.filestream + ", content=" + this.content + ", filetype=" + this.filetype + ", filename=" + this.filename + ", title=" + this.title + ", initialComment=" + this.initialComment + ", channels=" + this.channels + ", threadTs=" + this.threadTs + ")";
        }
    }
}