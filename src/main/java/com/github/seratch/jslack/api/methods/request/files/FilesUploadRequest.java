package com.github.seratch.jslack.api.methods.request.files;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

import java.io.File;
import java.util.List;

public class FilesUploadRequest implements SlackApiRequest {

    private String token;
    private File file;
    private String content;
    private String filetype;
    private String filename;
    private String title;
    private String initialComment;
    private List<String> channels;

    @java.beans.ConstructorProperties({"token", "file", "content", "filetype", "filename", "title", "initialComment", "channels"})
    FilesUploadRequest(String token, File file, String content, String filetype, String filename, String title, String initialComment, List<String> channels) {
        this.token = token;
        this.file = file;
        this.content = content;
        this.filetype = filetype;
        this.filename = filename;
        this.title = title;
        this.initialComment = initialComment;
        this.channels = channels;
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

    public void setToken(String token) {
        this.token = token;
    }

    public void setFile(File file) {
        this.file = file;
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

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof FilesUploadRequest)) return false;
        final FilesUploadRequest other = (FilesUploadRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$token = this.getToken();
        final Object other$token = other.getToken();
        if (this$token == null ? other$token != null : !this$token.equals(other$token)) return false;
        final Object this$file = this.getFile();
        final Object other$file = other.getFile();
        if (this$file == null ? other$file != null : !this$file.equals(other$file)) return false;
        final Object this$content = this.getContent();
        final Object other$content = other.getContent();
        if (this$content == null ? other$content != null : !this$content.equals(other$content)) return false;
        final Object this$filetype = this.getFiletype();
        final Object other$filetype = other.getFiletype();
        if (this$filetype == null ? other$filetype != null : !this$filetype.equals(other$filetype)) return false;
        final Object this$filename = this.getFilename();
        final Object other$filename = other.getFilename();
        if (this$filename == null ? other$filename != null : !this$filename.equals(other$filename)) return false;
        final Object this$title = this.getTitle();
        final Object other$title = other.getTitle();
        if (this$title == null ? other$title != null : !this$title.equals(other$title)) return false;
        final Object this$initialComment = this.getInitialComment();
        final Object other$initialComment = other.getInitialComment();
        if (this$initialComment == null ? other$initialComment != null : !this$initialComment.equals(other$initialComment))
            return false;
        final Object this$channels = this.getChannels();
        final Object other$channels = other.getChannels();
        if (this$channels == null ? other$channels != null : !this$channels.equals(other$channels)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $token = this.getToken();
        result = result * PRIME + ($token == null ? 43 : $token.hashCode());
        final Object $file = this.getFile();
        result = result * PRIME + ($file == null ? 43 : $file.hashCode());
        final Object $content = this.getContent();
        result = result * PRIME + ($content == null ? 43 : $content.hashCode());
        final Object $filetype = this.getFiletype();
        result = result * PRIME + ($filetype == null ? 43 : $filetype.hashCode());
        final Object $filename = this.getFilename();
        result = result * PRIME + ($filename == null ? 43 : $filename.hashCode());
        final Object $title = this.getTitle();
        result = result * PRIME + ($title == null ? 43 : $title.hashCode());
        final Object $initialComment = this.getInitialComment();
        result = result * PRIME + ($initialComment == null ? 43 : $initialComment.hashCode());
        final Object $channels = this.getChannels();
        result = result * PRIME + ($channels == null ? 43 : $channels.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof FilesUploadRequest;
    }

    public String toString() {
        return "FilesUploadRequest(token=" + this.getToken() + ", file=" + this.getFile() + ", content=" + this.getContent() + ", filetype=" + this.getFiletype() + ", filename=" + this.getFilename() + ", title=" + this.getTitle() + ", initialComment=" + this.getInitialComment() + ", channels=" + this.getChannels() + ")";
    }

    public static class FilesUploadRequestBuilder {
        private String token;
        private File file;
        private String content;
        private String filetype;
        private String filename;
        private String title;
        private String initialComment;
        private List<String> channels;

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

        public FilesUploadRequest build() {
            return new FilesUploadRequest(token, file, content, filetype, filename, title, initialComment, channels);
        }

        public String toString() {
            return "FilesUploadRequest.FilesUploadRequestBuilder(token=" + this.token + ", file=" + this.file + ", content=" + this.content + ", filetype=" + this.filetype + ", filename=" + this.filename + ", title=" + this.title + ", initialComment=" + this.initialComment + ", channels=" + this.channels + ")";
        }
    }
}