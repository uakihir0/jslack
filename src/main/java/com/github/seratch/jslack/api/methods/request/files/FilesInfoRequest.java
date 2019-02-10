package com.github.seratch.jslack.api.methods.request.files;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

public class FilesInfoRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `files:read`
     */
    private String token;

    /**
     * Specify a file by providing its ID.
     */
    private String file;

    private Integer count;

    private Integer page;

    @java.beans.ConstructorProperties({"token", "file", "count", "page"})
    FilesInfoRequest(String token, String file, Integer count, Integer page) {
        this.token = token;
        this.file = file;
        this.count = count;
        this.page = page;
    }

    public static FilesInfoRequestBuilder builder() {
        return new FilesInfoRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public String getFile() {
        return this.file;
    }

    public Integer getCount() {
        return this.count;
    }

    public Integer getPage() {
        return this.page;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof FilesInfoRequest)) return false;
        final FilesInfoRequest other = (FilesInfoRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$token = this.getToken();
        final Object other$token = other.getToken();
        if (this$token == null ? other$token != null : !this$token.equals(other$token)) return false;
        final Object this$file = this.getFile();
        final Object other$file = other.getFile();
        if (this$file == null ? other$file != null : !this$file.equals(other$file)) return false;
        final Object this$count = this.getCount();
        final Object other$count = other.getCount();
        if (this$count == null ? other$count != null : !this$count.equals(other$count)) return false;
        final Object this$page = this.getPage();
        final Object other$page = other.getPage();
        if (this$page == null ? other$page != null : !this$page.equals(other$page)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof FilesInfoRequest;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $token = this.getToken();
        result = result * PRIME + ($token == null ? 43 : $token.hashCode());
        final Object $file = this.getFile();
        result = result * PRIME + ($file == null ? 43 : $file.hashCode());
        final Object $count = this.getCount();
        result = result * PRIME + ($count == null ? 43 : $count.hashCode());
        final Object $page = this.getPage();
        result = result * PRIME + ($page == null ? 43 : $page.hashCode());
        return result;
    }

    public String toString() {
        return "FilesInfoRequest(token=" + this.getToken() + ", file=" + this.getFile() + ", count=" + this.getCount() + ", page=" + this.getPage() + ")";
    }

    public static class FilesInfoRequestBuilder {
        private String token;
        private String file;
        private Integer count;
        private Integer page;

        FilesInfoRequestBuilder() {
        }

        public FilesInfoRequest.FilesInfoRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public FilesInfoRequest.FilesInfoRequestBuilder file(String file) {
            this.file = file;
            return this;
        }

        public FilesInfoRequest.FilesInfoRequestBuilder count(Integer count) {
            this.count = count;
            return this;
        }

        public FilesInfoRequest.FilesInfoRequestBuilder page(Integer page) {
            this.page = page;
            return this;
        }

        public FilesInfoRequest build() {
            return new FilesInfoRequest(token, file, count, page);
        }

        public String toString() {
            return "FilesInfoRequest.FilesInfoRequestBuilder(token=" + this.token + ", file=" + this.file + ", count=" + this.count + ", page=" + this.page + ")";
        }
    }
}