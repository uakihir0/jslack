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